package projetbdd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Emeline
 */
public class Facture {

    ConnexionBDD c = new ConnexionBDD();
    Connection connexion = c.Connexion();

    public void editeFacture(int numSejour) {

        int prixChambre = 0;
        int totalConso = 0;
        int prixTotal = 0;

        try {
            Statement statement = connexion.createStatement();
            ResultSet sej = statement.executeQuery("SELECT date_debut, date_fin, periode, nb_personnes, num_conso, num_chambre, sejour.num_client, Nom_client, Prenom_client FROM sejour INNER JOIN occupe ON sejour.num_client = occupe.num_client INNER JOIN client ON client.num_client = sejour.num_client WHERE num_sejour = '" + numSejour + "';");
            if (sej.next()) {
                String nom = sej.getString("Nom_client");
                String prenom = sej.getString("Prenom_client");
                String numClient = sej.getString("num_client");
                String deb = sej.getString("date_debut");
                String fin = sej.getString("date_fin");
                int periode = Integer.parseInt(sej.getString("periode"));
                int nbPersonnes = Integer.parseInt(sej.getString("nb_personnes"));
                int numConso = Integer.parseInt(sej.getString("num_conso"));
                int numChambre = Integer.parseInt(sej.getString("num_chambre"));
                
                DateFormat formatinput = new SimpleDateFormat("dd/MM/yyyy");
                DateFormat formatoutput = new SimpleDateFormat("yyyy-MM-dd");
                Date ddeb = formatinput.parse(deb);
                String ddebut = formatoutput.format(ddeb);
                Date df = formatinput.parse(fin);
                String dfin = formatoutput.format(df);

                Statement stmt = connexion.createStatement();
                ResultSet nb = stmt.executeQuery("SELECT DATEDIFF('" + dfin + "','" + ddebut + "') as nbj;");
                if (nb.next()) {
                    int nbJours = Integer.parseInt(nb.getString("nbj"));
                    Chambre c = new Chambre();
                    prixChambre = c.prixChambre(numChambre, periode, nbPersonnes);
                    System.out.println("Le client " + nom + " " + prenom + " (n°" + numClient + ") a consommé :");
                    System.out.println(" - La chambre n°" + numChambre);
                    System.out.println("  - La chambre était occupée par " + nbPersonnes + " personne(s), elle coûte donc " + prixChambre + "€ la nuit");
                    System.out.println("  - Il y est resté " + nbJours + " nuit(s)");
                    System.out.println("  - Cela lui revient à : " + prixChambre + "€ * " + nbJours + " jours = " + prixChambre * nbJours + "€");

                    ResultSet conso = statement.executeQuery("SELECT nom_prestation, prestation.num_prestation FROM prestation INNER JOIN contenir_conso_presta ON contenir_conso_presta.num_prestation = prestation.num_prestation WHERE num_conso = '" + numConso + "';");
                    while (conso.next()) {
                        int numPrestation = Integer.parseInt(conso.getString("num_prestation"));
                        Prestation p = new Prestation();
                        int prixPrestation = p.prixPrestation(numChambre, numPrestation);
                        String nomPrestation = conso.getString("nom_prestation");
                        System.out.println(" - La prestation : " + nomPrestation + " au prix de " + prixPrestation + "€");
                        totalConso = totalConso + prixPrestation;
                    }
                    prixTotal = prixChambre * nbJours + totalConso;
                    statement.executeUpdate("UPDATE consommation SET total_conso = '" + totalConso + "' WHERE num_conso ='" + numConso + "';");
                    statement.executeUpdate("UPDATE facture SET montant = '" + prixTotal + "' WHERE Num_facture ='" + numSejour + "';");
                    System.out.println("  - Ce qui fait un total de consommations à : " + totalConso + "€");
                    System.out.println("La facture du client " + nom + " " + prenom + " s'élève donc à : " + prixTotal + "€");
                }
            }
            connexion.close();
        } catch (Exception e) {
            System.out.println("La tentative de connexion a échoué");
            e.printStackTrace();
        }

    }

}
