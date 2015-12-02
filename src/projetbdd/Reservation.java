/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbdd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
            Statement stmt = connexion.createStatement();
            Statement sttmt = connexion.createStatement();
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
                stmt.executeUpdate("INSERT INTO occupe(date_debut_occupation, date_fin_occupation, num_chambre, num_client) VALUES ('" + dateJour + "','" + fin + "','" + numChambre + "','" + numClient + "')");
                sttmt.executeUpdate("DELETE FROM reserve WHERE num_reservation ='" + numReserv + "'");
                Sejour s = new Sejour();
                //s.creerSejour(debut, fin, nomClient, nbPersonnes, periode);
            }
            connexion.close();
        } catch (Exception e) {
            System.out.println("La tentative de connexion a échoué");
            e.printStackTrace();
        }
    }

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

    public void afficherReservations() {
        try {
            Statement state = connexion.createStatement();
            ResultSet res = state.executeQuery("SELECT * FROM reserve");
            while (res.next()) {
                int num_reservation = res.getInt("num_reservation");
                int num_client = res.getInt("num_reservation");
                String date_debut = res.getString("date_debut");
                String date_fin = res.getString("date_fin");
                int num_chambre = res.getInt("num_chambre");
                System.out.println("Réversation n°" + num_reservation + " du client n°" + num_client + " du " + date_debut + " au " + date_fin + " pour la chambre n°" + num_chambre);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Reservation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void creerReservation(String date_debut, String date_fin, int num_chambre, int num_client) {

    }

    public void modifierReservation(String date_debut, String date_fin, int num_chambre, int num_client) {

    }

    public void supprimerReservation(String date_debut, String date_fin, int num_chambre, int num_client) {

    }

    public static void main(String[] args) {
        Reservation r = new Reservation();
        r.afficherReservations();
    }
}
