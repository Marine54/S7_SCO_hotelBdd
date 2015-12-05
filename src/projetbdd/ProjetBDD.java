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
        Hotel h = new Hotel();
       // h.chiffreMensuel("lEffet_mer", 12, 2015);
        Scanner in = new Scanner(System.in);
        instructions();
        String rep = in.nextLine();
        while (!rep.equals("end")) {
            choix(rep);
            instructions();
            rep = in.nextLine();
        }
    }

    public static void instructions() {
        System.out.println();
        System.out.println("Veuillez saisir votre choix :");
        System.out.println(" * ccl - Création d'un client");
        System.out.println(" * cr - Création d'une réservation");
        System.out.println(" * mr - Modification d'une réservation");
        System.out.println(" * sr - Suppression d'une réservation");
        System.out.println(" * arh - Afficher toutes les réservations pour un hôtel donné");
        System.out.println(" * ajj - Arrivées prévues pour un hôtel aujourd'hui");
        System.out.println(" * aj - Arrivées prévues pour un hôtel et une date donnée");
        System.out.println(" * dj - Disponibilités pour un hôtel et une date donnée");
        System.out.println(" * dp - Disponibilités pour un hôtel et une période donnée");
        System.out.println(" * ojj - Occupations pour un hôtel aujourd'hui");
        System.out.println(" * oj - Occupations pour un hôtel et une date donnée");
        System.out.println(" * mc - Modifications de la catégorie de la chambre");
        System.out.println(" * sc - Suppression d'une chambre");
        System.out.println(" * fs - Facture pour un séjour donné");
        System.out.println(" * end - Quitter l'application");
        System.out.println();
    }

    public static void choix(String c) throws SQLException, ParseException {
        if (c.equals("ajj")) {
            Reservation r = new Reservation();
            System.out.println("Pour quel hôtel ? Son nom est attendu");
            Scanner in = new Scanner(System.in);
            String hotel = in.nextLine();
            r.arriveesJour(hotel);
        } else if (c.equals("aj")) {
            Reservation r = new Reservation();
            System.out.println("Pour quelle date ? La date est attendue au format jj/mm/aa comme 20/11/2015 par exemple");
            Scanner in = new Scanner(System.in);
            String date = in.nextLine();
            System.out.println("Pour quel hôtel ? Son nom est attendu");
            in = new Scanner(System.in);
            String hotel = in.nextLine();
            r.arriveesJour(date, hotel);
        } else if (c.equals("arh")) {
            Reservation r = new Reservation();
            System.out.println("Pour quel hôtel voulez-vous connaître les réservations ? Son nom est attendu");
            Scanner in = new Scanner(System.in);
            String nomHotel = in.nextLine();
            r.afficherReservations(nomHotel);
        } else if (c.equals("cr")) {
            Reservation r = new Reservation();
            System.out.println("Quelle est la date du début de la réservation ? La date est attendue au format jj/mm/aa comme 20/11/2015 par exemple");
            Scanner in = new Scanner(System.in);
            String deb = in.nextLine();
            System.out.println("Quelle est la date de fin de la réservation ? La date est attendue au format jj/mm/aa comme 20/11/2015 par exemple");
            in = new Scanner(System.in);
            String fin = in.nextLine();
            System.out.println("Dans quelle chambre voulez-vous faire cette réservation ? Merci de donner son numéro");
            in = new Scanner(System.in);
            int numchambre = Integer.parseInt(in.nextLine());
            System.out.println("Pour quel client voulez-vous faire cette réservation ? Merci de donner son num�ro (s'il n'existe pas taper 0)");
            in = new Scanner(System.in);
            int numclient = Integer.parseInt(in.nextLine());
            Reservation reserv = new Reservation();
            reserv.creerReservation(deb, fin, numchambre, numclient);
        } else if (c.equals("mr")) {
            Reservation r = new Reservation();
            System.out.println("Quelle réservation voulez-vous modifier ? Son numéro est attendu");
            Scanner in = new Scanner(System.in);
            int numReserv = Integer.parseInt(in.nextLine());
            System.out.println("Quelle est la nouvelle date de début de réservation ? La date est attendue au format jj/mm/aa comme 03/12/2015 par exemple");
            in = new Scanner(System.in);
            String datedeb = in.nextLine();
            System.out.println("Quelle est la nouvelle date de fin ? La date est attendue au format jj/mm/aaaa come 03/12/2015 par exemple");
            in = new Scanner(System.in);
            String datefin = in.nextLine();
            System.out.println("Quelle est la nouvelle chambre ? Son numéro est attendu");
            in = new Scanner(System.in);
            int numChambre = Integer.parseInt(in.nextLine());
            r.modifierReservation(numReserv, datedeb, datefin, numChambre);
        } else if (c.equals("sr")) {
            Reservation r = new Reservation();
            System.out.println("Quelle réservation voulez-vous supprimer ? Son numéro est attendu");
            Scanner in = new Scanner(System.in);
            int numReserv = Integer.parseInt(in.nextLine());
            r.supprimerReservation(numReserv);
        } else if (c.equals("dj")) {
            Occupation o = new Occupation();
            System.out.println("Pour quelle date voulez-vous consulter les disponibilités ? La date est attendue au format jj/mm/aa comme 20/11/2015 par exemple");
            Scanner in = new Scanner(System.in);
            String date = in.nextLine();
            System.out.println("Pour quel hôtel voulez-vous consulter les disponibilités ? Son nom est attendu");
            in = new Scanner(System.in);
            String hotel = in.nextLine();
            o.disponibilitesJour(hotel, date);
        } else if (c.equals("dp")) {
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
        } else if (c.equals("ojj")) {
            Occupation o = new Occupation();
            System.out.println("Pour quel hôtel souhaitez-vous consulter les occupations ? Son nom est attendu");
            Scanner in = new Scanner(System.in);
            String hotel = in.nextLine();
            System.out.println("Pour quelle catégorie de chambre ? Son numéro est attendu");
            in = new Scanner(System.in);
            int numCat = Integer.parseInt(in.nextLine());
            o.chambresOccupeesJour(numCat, hotel);
        } else if (c.equals("oj")) {
            Occupation o = new Occupation();
            System.out.println("Pour quelle date voulez-vous consulter les occupations ? La date est attendue au format jj/mm/aa comme 20/11/2015 par exemple");
            Scanner in = new Scanner(System.in);
            String date = in.nextLine();
            System.out.println("Pour quel hôtel souhaitez-vous consulter les occupations ? Son nom est attendu");
            in = new Scanner(System.in);
            String hotel = in.nextLine();
            System.out.println("Pour quelle catégorie de chambre ? Son numéro est attendu");
            in = new Scanner(System.in);
            int numCat = Integer.parseInt(in.nextLine());
            o.chambresOccupees(numCat, date, hotel);
        } else if (c.equals("mc")) {
            Chambre ch = new Chambre();
            System.out.println("Pour quelle chambre voulez-vous modifier la catégorie ? Son numéro est attendu");
            Scanner in = new Scanner(System.in);
            int chambre = Integer.parseInt(in.nextLine());
            System.out.println("Quelle nouvelle catagérie voulez-vous ?");
            in = new Scanner(System.in);
            int categorie = Integer.parseInt(in.nextLine());
            ch.modifierChambre(chambre, categorie);
        } else if (c.equals("sc")) {
            System.out.println("Quelle chambre voulez-vous supprimer ? Son numéro est attendu");
            Scanner in = new Scanner(System.in);
            int num_chambre = Integer.parseInt(in.nextLine());
            Chambre ch = new Chambre();
            ch.suprimmerChambre(num_chambre);
        } else if (c.equals("fs")) {
            System.out.println("Pour quel séjour voulez-vous connaître la facture ? Son numéro est attendu");
            Scanner in = new Scanner(System.in);
            int num_sejour = Integer.parseInt(in.nextLine());
            Facture f = new Facture();
            f.editeFacture(num_sejour);
        }else if (c.equals("ccl")){
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
        }
    }
}
