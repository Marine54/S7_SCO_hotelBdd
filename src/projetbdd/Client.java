/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbdd;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Emeline
 */
public class Client {

    ConnexionBDD c = new ConnexionBDD();
    Connection connexion = c.Connexion();

    public void creerClient(String nom, String prenom, String ville, String date_naissance) {
        try {
            Statement statement = connexion.createStatement();
            statement.executeUpdate("INSERT INTO client (Nom_client, Prenom_client, Ville_client, DateNaissance) VALUES ('" + nom + "','" + prenom + "','" + ville + "','" + date_naissance + "')");
            System.out.println("Le client "+nom+" "+prenom+" a bien été ajouté");
            connexion.close();
        } catch (Exception e) {
            System.out.println("La tentative de connexion a échoué");
            e.printStackTrace();
        }
    }

}
