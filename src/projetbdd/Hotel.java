/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class Hotel {
    
    ConnexionBDD c = new ConnexionBDD();
    Connection connexion = c.Connexion();
    
    public void creationHotel(String nom_hotel, int nb_chambre){
        
    }
    
    public void modificationHotel(String nom_hotel, int nb_chambre){
        
    }
    
    public void suppressionHotel(String nom_hotel, int nb_chambre){
        
    }
    /*
    public void chiffreMensuel(String nom_hotel, int mois, int annee){
        
        
        try {
            Statement statement = connexion.createStatement();
            ResultSet test = statement.executeQuery("SELECT date_fin FROM sejour");
            while (test.next()){
                String fin = test.getString("date_fin");
                DateFormat formatinput = new SimpleDateFormat("dd/MM/yyyy");
                DateFormat formatoutput = new SimpleDateFormat("yyyy-MM-dd");
                Date d = formatinput.parse(fin);
                String date = formatoutput.format(d);
                Statement stt = connexion.createStatement();
                ResultSet r = stt.executeQuery("SELECT MONTH('"+date+"') AS m FROM sejour INNER JOIN occupe ON sejour.num_client = occupe.num_client INNER JOIN chambre ON occupe.num_chambre = chambre.num_chambre INNER JOIN hotel ON chambre.num_hotel = hotel.num_hotel WHERE MONTH('"+date+"')=12 AND hotel.Nom = '"+nom_hotel+"';");
                while (r.next()){
                    String m = r.getString("m");
                    System.out.println(m+" "+ date);
                }
            }*/
            /*
            ResultSet resultat = statement.executeQuery("SELECT num_sejour, sejour.num_client, date_fin FROM sejour INNER JOIN occupe ON sejour.num_client = occupe.num_client INNER JOIN chambre ON occupe.num_chambre = chambre.num_chambre INNER JOIN hotel ON hotel.num_hotel = chambre.num_hotel WHERE hotel.Nom = '"+nom_hotel+"';");
            //System.out.println("Pour cette journée du " + date + ", la/les chambre(s) réservée(s) dans l'hôtel " + nomHotel + " est/sont :");
            while (resultat.next()) {
                //String numChambre = resultatChambre.getString("num_chambre");
                //String numClient = resultatChambre.getString("num_client");
                //String nomClient = resultatChambre.getString("nom_client");
                //String prenomClient = resultatChambre.getString("Prenom_client");
                String fin = resultat.getString("date_fin");
                
                DateFormat formatinput = new SimpleDateFormat("dd/MM/yyyy");
                DateFormat formatoutput = new SimpleDateFormat("yyyy-MM-dd");
                Date d = formatinput.parse(fin);
                String date = formatoutput.format(d);
                
                Statement stt = connexion.createStatement();
                ResultSet res = stt.executeQuery("SELECT num_client, date_debut, date_fin, MONTH('"+date+"') AS mois FROM sejour WHERE MONTH('"+date+"') = 12 ;");
                while (res.next()){
                    String mmois = res.getString("mois");
                    String numcl = res.getString("num_client");
                    String deb = res.getString("date_debut");
                    String dfin = res.getString("date_fin");
                    System.out.println("deb : "+deb+" fin : "+dfin+ " mois : "+mmois);
                }
                //System.out.println(" La chambre n°" + numChambre + " réservée par le client n°" + numClient + " du nom de " + prenomClient + " " + nomClient + " jusqu'au " + fin);
            }
                   
            connexion.close();
        } catch (Exception e) {
            System.out.println("La tentative de connexion a échoué");
            e.printStackTrace();
        }

        
    } */
    
}
