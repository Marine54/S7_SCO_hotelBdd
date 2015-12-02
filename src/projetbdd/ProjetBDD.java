/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Emeline
 */
public class ProjetBDD {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws SQLException, ParseException {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        instructions();
        String rep = in.nextLine();
        while(!rep.equals("end")){
         //Reservation c = new Reservation();
         //c.arriveesJour();
         //c.arriveesJour("16/11/2015");
            choix(rep);
         instructions();
         rep = in.nextLine();
        }
     }
    
    public static void instructions(){
        System.out.println();
        //System.out.println("Veuillez saisir votre choix :");
        System.out.println(" * cr - Création d'une réservation");
        System.out.println(" * ajj - Arrivées prévues pour un hôtel aujourd'hui");
        System.out.println(" * aj - Arrivées prévues pour un hôtel et une date donnée");
        System.out.println(" * dj - Disponibilités pour un hôtel et une date donnée");
        System.out.println(" * dp - Disponibilités pour un hôtel et une période donnée");
        System.out.println(" * ojj - Occupations pour un hôtel aujourd'hui");
        System.out.println(" * oj - Occupations pour un hôtel et une date donnée");
        System.out.println(" * end - Quitter l'application");
        System.out.println();
    }
    
    public static void choix(String c) throws SQLException, ParseException{
        if (c.equals("ajj")){
            Reservation r = new Reservation();
            System.out.println("Pour quel hôtel ? Son nom est attendu");
            Scanner in = new Scanner(System.in);
            String hotel = in.nextLine();
            r.arriveesJour(hotel);
        }else if (c.equals("aj")){
            Reservation r = new Reservation();
            System.out.println("Pour quelle date ? La date est attendue au format jj/mm/aa comme 20/11/2015 par exemple");
            Scanner in = new Scanner(System.in);
            String date = in.nextLine();
            System.out.println("Pour quel hôtel ? Son nom est attendu");
            in = new Scanner(System.in);
            String hotel = in.nextLine();
            r.arriveesJour(date, hotel);
        }else if (c.equals("cr")){
            Reservation r = new Reservation();
            System.out.println("Quelle est la date du début de la réservation ? La date est attendue au format jj/mm/aa comme 20/11/2015 par exemple");
            Scanner in = new Scanner(System.in);
            String deb = in.nextLine();
            System.out.println("Quelle est la date de fin de la réservation ? La date est attendue au format jj/mm/aa comme 20/11/2015 par exemple");
            in = new Scanner(System.in);
            String fin = in.nextLine();
            System.out.println("Dans quel hôtel voulez-vous faire cette réservation ? Merci de donner son nom");
            in = new Scanner(System.in);
            String numhotel = in.nextLine();
            System.out.println("Dans quelle chambre voulez-vous faire cette réservation ? Merci de donner son numéro");
            in = new Scanner(System.in);
            String numchambre = in.nextLine();
            System.out.println("Pour quel client voulez-vous faire cette réservation ? Merci de donner son nom");
            in = new Scanner(System.in);
            String numclient = in.nextLine();
            //r.creerReservation(deb, fin, num_chambre, num_client);
        }else if (c.equals("dj")){
            Occupation o = new Occupation();
            System.out.println("Pour quelle date voulez-vous consulter les disponibilités ? La date est attendue au format jj/mm/aa comme 20/11/2015 par exemple");
            Scanner in = new Scanner(System.in);
            String date = in.nextLine();
            System.out.println("Pour quel hôtel voulez-vous consulter les disponibilités ? Son nom est attendu");
            in = new Scanner(System.in);
            String hotel = in.nextLine();
            o.disponibilitesJour(hotel, date);
        }else if (c.equals("dp")){
            Occupation o = new Occupation();
            System.out.println("A partir de quelle date voulez-vous consulter les disponibilités ? La date est attendue au format jj/mm/aa comme 20/11/2015 par exemple");
            Scanner in = new Scanner(System.in);
            String debut = in.nextLine();
            System.out.println("Jusqu'à quelle date voulez-vous consulter les disponibilités ? La date est attendue au format jj/mm/aa comme 20/11/2015 par exemple");
            in = new Scanner(System.in);
            String fin = in.nextLine();
            System.out.println("Pour quel hôtel voulez-vous consulter les disponibilités ? Son nom est attendu");
            in = new Scanner(System.in);
            String hotel = in.nextLine();
            o.disponibilitesPeriode(debut, fin, hotel);
        }else if (c.equals("ojj")){
            Occupation o = new Occupation();
            System.out.println("Pour quel hôtel souhaitez-vous consulter les occupations ? Son nom est attendu");
            Scanner in = new Scanner(System.in);
            String hotel = in.nextLine();
            o.chambresOccupeesJour(hotel);
        }else if (c.equals("oj")){
            Occupation o = new Occupation();
            System.out.println("Pour quelle date voulez-vous consulter les occupations ? La date est attendue au format jj/mm/aa comme 20/11/2015 par exemple");
            Scanner in = new Scanner(System.in);
            String date = in.nextLine();
            System.out.println("Pour quel hôtel souhaitez-vous consulter les occupations ? Son nom est attendu");
            in = new Scanner(System.in);
            String hotel = in.nextLine();
            o.chambresOccupees(date, hotel);
        }
    }
}
