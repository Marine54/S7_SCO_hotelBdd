/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Emeline
 */
public class ConnexionBDD {
    
    public Connection Connexion(){
        
    try {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection connexion = DriverManager.getConnection("jdbc:mysql://localhost/hotelsbdd","root","");
        return connexion;
    } catch (Exception e){
        System.out.println("La tentative de connexion a échoué");    
        e.printStackTrace();
        return null;
       }
    }
    
}
