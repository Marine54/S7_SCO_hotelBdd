/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Emeline
 */
public class Reservation {

    ConnexionBDD c = new ConnexionBDD();
    Connection connexion = c.Connexion();

    public void arriveesJour(String nomHotel) throws SQLException {

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        // Aujourd'hui
        Date jour = new Date();
        String dateJour = dateFormat.format(jour);
        System.out.println(dateJour);

        try {
            Statement statement = connexion.createStatement();
            ResultSet resultatChambre = statement.executeQuery("SELECT num_reservation, reserve.num_chambre, reserve.num_client, client.Nom_client, Prenom_client, date_fin FROM reserve INNER JOIN client ON reserve.num_client = client.num_client INNER JOIN chambre ON reserve.num_chambre = chambre.num_chambre INNER JOIN hotel ON chambre.num_hotel = hotel.num_hotel WHERE date_debut = '" + dateJour + "' AND hotel.Nom = '" + nomHotel + "';");
            //ResultSet resultatHotel = statement.executeQuery("SELECT hotel.num_hotel FROM hotel INNER JOIN chambre ON hotel.num_hotel = chambre.num_hotel WHERE Nom = '"+nomHotel+"';");
            System.out.println("Pour cette journée du " + dateJour + ", la/les chambre(s) réservée(s) pour l'hôtel " + nomHotel + " est/sont :");
            while (resultatChambre.next()) {
                int numChambre = Integer.parseInt(resultatChambre.getString("num_chambre"));
                int numReserv = Integer.parseInt(resultatChambre.getString("num_reservation"));
                String numClient = resultatChambre.getString("num_client");
                String nomClient = resultatChambre.getString("nom_client");
                String prenomClient = resultatChambre.getString("Prenom_client");
                String fin = resultatChambre.getString("date_fin");
                System.out.println("La chambre n°" + numChambre + " réservée par le client n°" + numClient + " du nom de " + prenomClient + " " + nomClient + " jusqu'au " + fin);
                Occupation o = new Occupation();
                o.creerOccupation(dateJour, fin, numChambre, numReserv);
                supprimerReservation(numReserv);
                Sejour s = new Sejour();
                //s.creerSejour(debut, fin, nomClient, nbPersonnes, periode);
            }
            connexion.close();
        } catch (Exception e) {
            System.out.println("La tentative de connexion a échoué");
            e.printStackTrace();
        }
    }
    
    /*
    public void reservationToOccupation(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        // Aujourd'hui
        Date jour = new Date();
        String dateJour = dateFormat.format(jour);
        System.out.println(dateJour);

        try {
            Statement statement = connexion.createStatement();
            ResultSet resultatChambre = statement.executeQuery("SELECT num_reservation, reserve.num_chambre, reserve.num_client, client.Nom_client, Prenom_client, date_debut, date_fin FROM reserve INNER JOIN client ON reserve.num_client = client.num_client INNER JOIN chambre ON reserve.num_chambre = chambre.num_chambre INNER JOIN hotel ON chambre.num_hotel = hotel.num_hotel WHERE date_debut < '" + dateJour + "';");
            //ResultSet resultatHotel = statement.executeQuery("SELECT hotel.num_hotel FROM hotel INNER JOIN chambre ON hotel.num_hotel = chambre.num_hotel WHERE Nom = '"+nomHotel+"';");
            System.out.println("Les chambres réservées avant aujourd'hui sont :");
            while (resultatChambre.next()) {
                int numChambre = Integer.parseInt(resultatChambre.getString("num_chambre"));
                int numReserv = Integer.parseInt(resultatChambre.getString("num_reservation"));
                String numClient = resultatChambre.getString("num_client");
                String nomClient = resultatChambre.getString("nom_client");
                String prenomClient = resultatChambre.getString("Prenom_client");
                String deb = resultatChambre.getString("date_debut");
                String fin = resultatChambre.getString("date_fin");
                System.out.println("La chambre n°" + numChambre + " réservée par le client n°" + numClient + " du nom de " + prenomClient + " " + nomClient + "du "+deb+" jusqu'au " + fin);
                Statement stt = connexion.createStatement();
                ResultSet res = stt.executeQuery("SELECT * FROM occupe WHERE Date_debut_occupation ='"+dateJour+"' AND Date_fin_occupation = '"+fin+"' AND num_client = '"+numClient+"'");
                if (!res.next()){
                Occupation o = new Occupation();
                o.creerOccupation(deb, fin, numChambre, numReserv);
                }
                //supprimerReservation(numReserv);
                Sejour s = new Sejour();
                //s.creerSejour(debut, fin, nomClient, nbPersonnes, periode);
            }
            connexion.close();
        } catch (Exception e) {
            System.out.println("La tentative de connexion a échoué");
            e.printStackTrace();
        }
    }
    */

    public void arriveesJour(String dateDonnee, String nomHotel) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date d = dateFormat.parse(dateDonnee);
        String date = dateFormat.format(d);
        try {
            Statement statement = connexion.createStatement();
            //ResultSet resultatChambre = statement.executeQuery( "SELECT num_chambre, reserve.num_client, nom_client FROM reserve INNER JOIN client ON reserve.num_client = client.num_client WHERE date_debut <= '"+date+"'AND date_fin >='"+date+"';" );
            ResultSet resultatChambre = statement.executeQuery("SELECT reserve.num_chambre, reserve.num_client, client.Nom_client, Prenom_client, date_fin FROM reserve INNER JOIN client ON reserve.num_client = client.num_client INNER JOIN chambre ON reserve.num_chambre = chambre.num_chambre INNER JOIN hotel ON chambre.num_hotel = hotel.num_hotel WHERE date_debut = '" + date + "' AND hotel.Nom = '" + nomHotel + "';");
            System.out.println("Pour cette journée du " + date + ", la/les chambre(s) réservée(s) dans l'hôtel " + nomHotel + " est/sont :");
            while (resultatChambre.next()) {
                String numChambre = resultatChambre.getString("num_chambre");
                String numClient = resultatChambre.getString("num_client");
                String nomClient = resultatChambre.getString("nom_client");
                String prenomClient = resultatChambre.getString("Prenom_client");
                String fin = resultatChambre.getString("date_fin");
                System.out.println(" La chambre n°" + numChambre + " réservée par le client n°" + numClient + " du nom de " + prenomClient + " " + nomClient + " jusqu'au " + fin);
            }
            connexion.close();
        } catch (Exception e) {
            System.out.println("La tentative de connexion a échoué");
            e.printStackTrace();
        }

    }

    /**
     * Affiche toutes les réservations dans la console.
     */
    public void afficherReservations(String nomHotel) {
        try {
            // Création et exécution de la requête
            Statement state = connexion.createStatement();
            ResultSet res = state.executeQuery("SELECT * FROM reserve INNER JOIN chambre ON reserve.num_chambre = chambre.num_chambre INNER JOIN hotel ON chambre.num_hotel = hotel.num_hotel WHERE hotel.Nom = '" + nomHotel + "'");
            System.out.println("Les réservations pour l'hôtel " + nomHotel + " sont : ");
            // Parcours des résultats
            while (res.next()) {
                // Récupération des attributs
                int num_reservation = res.getInt("num_reservation");
                int num_client = res.getInt("num_reservation");
                String date_debut = res.getString("date_debut");
                String date_fin = res.getString("date_fin");
                int num_chambre = res.getInt("num_chambre");
                // Affichage
                System.out.println(" La réservation n°" + num_reservation + " du client n°" + num_client + " du " + date_debut + " au " + date_fin + " pour la chambre n°" + num_chambre);
            }
            connexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(Reservation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //On appelle créer réservation on demande au client si il existe déjà si oui on apelle créer resa si non on apelle créer client
    public void creerReservation(String date_debut, String date_fin, int num_chambre, int num_client) throws SQLException {

        if (num_client != 0) {
            try {
                Statement statement = connexion.createStatement();
                statement.executeUpdate("INSERT INTO reserve (num_client, date_debut, date_fin, num_chambre) VALUES ('" + num_client + "','" + date_debut + "','" + date_fin + "','" + num_chambre + "')");
                connexion.close();
            } catch (Exception e) {
                System.out.println("La tentative de connexion a échoué");
                e.printStackTrace();
            }
        } //On crée un scanner pour avoir le nom, le prénom, et la ville du client
        else {
            System.out.println("Quel est le nom de famille du client ?");
            Scanner in = new Scanner(System.in);
            String nom = in.nextLine();
            System.out.println("Quel est le prénom du client ?");
            in = new Scanner(System.in);
            String prenom = in.nextLine();
            System.out.println("Dans quelle ville habite le client ?");
            in = new Scanner(System.in);
            String ville = in.nextLine();
            System.out.println("Quelle est la date de naissance du client ? La date est attendue au format jj/mm/aaaa (comme 03/12/2015 par exemple)");
            in = new Scanner(System.in);
            String date_naissance = in.nextLine();

            Client cl = new Client();
            cl.creerClient(nom, prenom, ville, date_naissance);

            try {
                Statement st = connexion.createStatement();
                ResultSet num = st.executeQuery("SELECT num_client FROM client WHERE Nom_client='" + nom + "' AND Prenom_client='" + prenom + "' AND Ville_client='" + ville + "' AND DateNaissance='" + date_naissance + "'");
                if (num.next()) {
                    int numClient = Integer.parseInt(num.getString("num_client"));
                    Statement statement = connexion.createStatement();
                    statement.executeUpdate("INSERT INTO reserve (num_client, date_debut, date_fin, num_chambre) VALUES ('" + numClient + "','" + date_debut + "','" + date_fin + "','" + num_chambre + "')");
                }
                connexion.close();
            } catch (Exception e) {
                System.out.println("La tentative de connexion a échoué");
                e.printStackTrace();
            }
        }

    }

    /**
     * Méthode qui modifie une réservation.
     *
     * @param num_reservation integer
     * @param date_debut Date de début de réservation.
     * @param date_fin Date de fin de réservation.
     * @param num_chambre Numéro de la chambre réservé.
     * @param num_client Numéro du client réservé.
     */
    public void modifierReservation(int num_reservation, String date_debut, String date_fin, int num_chambre) {
        try {
            Statement state = connexion.createStatement();
            state.executeUpdate("UPDATE reserve SET date_debut='" + date_debut + "', date_fin='" + date_fin + "' WHERE num_reservation=" + num_reservation);
            System.out.println("La réservation a bien été modifiée. Date de début: " + date_debut + " date de fin : " + date_fin + " N° de chambre : " + num_chambre);
        } catch (SQLException ex) {
            System.err.println("Problème lors de la modification");
        }

    }

    /**
     * Méthode qui supprime une réservation en fonction de son numéro.
     *
     * @param num_reservation integer
     */
    public void supprimerReservation(int num_reservation) {
        try {
            // Création et exécution de la requête.
            Statement state = connexion.createStatement();
            state.executeUpdate("DELETE FROM reserve WHERE num_reservation=" + num_reservation);
            // Affichage d'un message de confirmation
            System.out.println("La réservation n°" + num_reservation + " a bien été supprimée.");
        } catch (SQLException ex) {
            // Affichage d'un message d'erreur
            System.err.println("Erreur lors de la suppression de la réservation n°" + num_reservation);
        }
    }
    

}
