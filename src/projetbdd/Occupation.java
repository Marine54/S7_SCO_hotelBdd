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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Emeline
 */
public class Occupation {
    
    ConnexionBDD c = new ConnexionBDD();
    Connection connexion = c.Connexion();
    
    public void chambresOccupeesJour(String nomHotel){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date jour = new Date();
        String dateJour = dateFormat.format(jour);
        try {
            Statement statement = connexion.createStatement();
            ResultSet resultatChambre = statement.executeQuery("SELECT occupe.num_chambre, occupe.num_client, client.nom, date_debut_occupation, date_fin_occupation FROM occupe INNER JOIN client ON occupe.num_client = client.num_client INNER JOIN chambre ON occupe.num_chambre = chambre.num_chambre INNER JOIN hotel ON chambre.num_hotel = hotel.num_hotel WHERE date_debut_occupation <= '"+dateJour+"'AND date_fin_occupation >='"+dateJour+"' AND hotel.nom = '"+nomHotel+"';" );
             //ResultSet resultatChambre = statement.executeQuery( "SELECT num_chambre, occupe.num_client, nom FROM occupe INNER JOIN client ON occupe.num_client = client.num_client WHERE date_debut_occupation <= '"+dateJour+"'AND date_fin_occupation >='"+dateJour+"';" );
            System.out.println("Pour cette journée du "+ dateJour+", la/les chambre(s) occupéée(s) est/sont :");
            while (resultatChambre.next()){
                String numChambre = resultatChambre.getString("num_chambre");
                String numClient = resultatChambre.getString("num_client");
                String nomClient = resultatChambre.getString("nom");
                System.out.println(" La chambre n°"+numChambre+ " occupée par le client n°"+numClient+" du nom de "+nomClient);
            }
            connexion.close();
            } catch (Exception e){
                System.out.println("La tentative de connexion a échoué");    
                e.printStackTrace();
            }
    }
    
    public void chambresOccupees(String dateDonnee, String nomHotel) throws ParseException{
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date d = dateFormat.parse(dateDonnee);
        String date = dateFormat.format(d);
        try {
            Statement statement = connexion.createStatement();
            ResultSet resultatChambre = statement.executeQuery("SELECT occupe.num_chambre, occupe.num_client, client.nom, date_debut_occupation, date_fin_occupation FROM occupe INNER JOIN client ON occupe.num_client = client.num_client INNER JOIN chambre ON occupe.num_chambre = chambre.num_chambre INNER JOIN hotel ON chambre.num_hotel = hotel.num_hotel WHERE date_debut_occupation <= '"+date+"'AND date_fin_occupation >='"+date+"' AND hotel.nom = '"+nomHotel+"';" );
             //ResultSet resultatChambre = statement.executeQuery( "SELECT num_chambre, occupe.num_client, nom FROM occupe INNER JOIN client ON occupe.num_client = client.num_client WHERE date_debut_occupation <= '"+date+"'AND date_fin_occupation >='"+date+"';" );
            System.out.println("Pour cette journée du "+ date+", la/les chambre(s) occupéée(s) est/sont :");
            while (resultatChambre.next()){
                String numChambre = resultatChambre.getString("num_chambre");
                String numClient = resultatChambre.getString("num_client");
                String nomClient = resultatChambre.getString("nom");
                System.out.println(" La chambre n°"+numChambre+ " occupée par le client n°"+numClient+" du nom de "+nomClient);
            }
            connexion.close();
            } catch (Exception e){
                System.out.println("La tentative de connexion a échoué");    
                e.printStackTrace();
            }
        
    }
    
    public void disponibilitesJour(String nomHotel, String date) throws ParseException{
        
         DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        // Aujourd'hui
        Date jour = dateFormat.parse(date);
        String dateJour = dateFormat.format(jour);

        try {
            Statement statement = connexion.createStatement();
            String requete1 = "SELECT num_chambre FROM chambre";
            String requete2 = "SELECT num_chambre FROM reserve2 WHERE date_deb_reserv = '"+dateJour+"'; ";
            //ResultSet resultatChambre = statement.executeQuery("SELECT num_chambre FROM ('"+requete1+"' MINUS '"+requete2+"');" );
            //ResultSet resultatChambre = statement.executeQuery("SELECT reserve2.num_chambre, reserve2.num_client, client.nom, date_deb_reserv, date_fin_reserv FROM reserve2 INNER JOIN client ON reserve2.num_client = client.num_client INNER JOIN chambre ON reserve2.num_chambre = chambre.num_chambre INNER JOIN hotel ON chambre.num_hotel = hotel.num_hotel WHERE date_deb_reserv = '"+dateJour+"' AND hotel.nom = '"+nomHotel+"';" );
            ResultSet resultatChambre = statement.executeQuery("SELECT occupe.num_chambre FROM occupe INNER JOIN client ON occupe.num_client = client.num_client INNER JOIN chambre ON occupe.num_chambre = chambre.num_chambre INNER JOIN hotel ON chambre.num_hotel = hotel.num_hotel WHERE hotel.nom = '"+nomHotel+"' AND occupe.num_chambre NOT IN( SELECT occupe.num_chambre FROM occupe INNER JOIN client ON occupe.num_client = client.num_client INNER JOIN chambre ON occupe.num_chambre = chambre.num_chambre INNER JOIN hotel ON chambre.num_hotel = hotel.num_hotel WHERE date_debut_occupation <= '"+dateJour+"' AND date_fin_occupation >= '"+dateJour+"' AND hotel.nom = '"+nomHotel+"');");
            System.out.println("Pour cette journée du "+ dateJour+", la/les chambre(s) disponible(s) est/sont :");
            while (resultatChambre.next()){
                String numChambre = resultatChambre.getString("num_chambre");
                System.out.println(numChambre);
            }
            connexion.close();
            } catch (Exception e){
                System.out.println("La tentative de connexion a échoué");    
                e.printStackTrace();
            }
        
    }
    
    public void disponibilitesPeriode(String datedeb, String datefin, String nomHotel) throws ParseException{
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        // Aujourd'hui
        Date date_deb = dateFormat.parse(datedeb);
        String debut = dateFormat.format(date_deb);
        Date date_fin = dateFormat.parse(datefin);
        String fin = dateFormat.format(date_fin);


        try {
            Statement statement = connexion.createStatement();
            ResultSet resultatChambre = statement.executeQuery("SELECT occupe.num_chambre FROM occupe INNER JOIN client ON occupe.num_client = client.num_client INNER JOIN chambre ON occupe.num_chambre = chambre.num_chambre INNER JOIN hotel ON chambre.num_hotel = hotel.num_hotel WHERE hotel.nom = '"+nomHotel+"' AND occupe.num_chambre NOT IN( SELECT occupe.num_chambre FROM occupe INNER JOIN client ON occupe.num_client = client.num_client INNER JOIN chambre ON occupe.num_chambre = chambre.num_chambre INNER JOIN hotel ON chambre.num_hotel = hotel.num_hotel WHERE date_debut_occupation <= '"+debut+"' AND date_fin_occupation >= '"+fin+"' AND hotel.nom = '"+nomHotel+"');");
            System.out.println("Pour cette préiode du "+ datedeb+" au "+datefin+", la/les chambre(s) disponible(s) est/sont :");
            while (resultatChambre.next()){
                String numChambre = resultatChambre.getString("num_chambre");
                System.out.println(numChambre);
            }
            connexion.close();
            } catch (Exception e){
                System.out.println("La tentative de connexion a échoué");    
                e.printStackTrace();
            }
        
    }
    
    
    public void creerOccupation(String debut, String fin, int num_chambre, int num_client){
        
        try{
            Statement statement = connexion.createStatement();
            ResultSet resultat = statement.executeQuery("INSERT INTO occupe(Date_debut_occupation, Date_fin_occupaion, num_chambre, num_chambre, num_client VALUES VALUES ");
        }catch (Exception e){
                System.out.println("La tentative de connexion a échoué");    
                e.printStackTrace();
            }
        
    }
    
    
    
}
