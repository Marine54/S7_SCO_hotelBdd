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
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Emeline
 */
public class Chambre {
    
    
    public void arriveesJour(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
        // Aujourd'hui
        Date jour = new Date();
        String dateJour = dateFormat.format(jour);

        try {
         Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection connexion = DriverManager.getConnection("jdbc:mysql://localhost/hotelsbdd","root","");
            Statement statement = connexion.createStatement();
            ResultSet resultatChambre = statement.executeQuery( "SELECT num_chambre, reserve.num_client, nom FROM reserve INNER JOIN client ON reserve.num_client = client.num_client WHERE date_deb_reserv = '"+dateJour+"';" );
            System.out.println("Pour cette journée du "+ dateJour+", la/les chambre(s) réservée(s) est/sont :");
            while (resultatChambre.next()){
                String numChambre = resultatChambre.getString("num_chambre");
                String numClient = resultatChambre.getString("num_client");
                String nomClient = resultatChambre.getString("nom");
                System.out.println("La chambre n°"+numChambre+ " réservée par le client n°"+numClient+" du nom de "+nomClient);
            }
            connexion.close();
            } catch (Exception e){
                System.out.println("La tentative de connexion a échoué");    
                e.printStackTrace();
                }
    }
        
    }
    
    

