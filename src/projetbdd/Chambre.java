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
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Emeline
 */
public class Chambre {

    ConnexionBDD c = new ConnexionBDD();
    Connection connexion = c.Connexion();
    
    public void modifierChambre(int num_chambre, int categorie) {
        try {
            Statement state = connexion.createStatement();
            state.executeUpdate("UPDATE chambre SET categorie='" + categorie + "' WHERE num_chambre=" + num_chambre);
            System.out.println("La catégorie de la chambre "+num_chambre+" a bien été modifiée");
        } catch (SQLException e) {
            System.err.println("la mise à jour a échoué ");

        }

    }
    
// methode pour supprimer chambre
    public void suprimmerChambre(int num_chambre) {
        try {
            // Création et exécution de la requête.
            Statement state = connexion.createStatement();
            state.executeUpdate("DELETE FROM chambre WHERE num_chambre=" + num_chambre);
            // Affichage d'un message de confirmation
            System.out.println("La chambre n °" + num_chambre + " a bien été supprimée.");
        } catch (SQLException ex) {
            // Affichage d'un message d'erreur
            System.err.println("Erreur lors de la suppression de la chambre n°" + num_chambre);
        }
    }


    public int prixChambre(int numChambre, int periode, int nbPersonnes) {

        int prix = 0;
        int classe = 0;
        int categorie = 0;

        try {
            Statement statement = connexion.createStatement();
            ResultSet catHotel = statement.executeQuery("SELECT classe, categorie FROM hotel INNER JOIN chambre ON hotel.num_hotel = chambre.num_hotel WHERE num_chambre = '" + numChambre + "';");
            if (catHotel.next()) {
                classe = Integer.parseInt(catHotel.getString("classe"));
                categorie = Integer.parseInt(catHotel.getString("categorie"));
            }
            connexion.close();
        } catch (Exception e) {
            System.out.println("La tentative de connexion a échoué");
            e.printStackTrace();
        }

        if (periode == 1) {

            if (nbPersonnes == 1) {

                if (classe == 2) {

                    if (categorie == 1) {

                        prix = 55;

                    } else if (categorie == 2) {

                        prix = 55;

                    }

                } else if (classe == 3) {

                    if (categorie == 1) {

                        prix = 65;

                    } else if (categorie == 2) {

                        prix = 65;

                    } else if (categorie == 3) {

                        prix = 80;

                    } else if (categorie == 4) {

                        prix = 100;

                    }

                } else if (classe == 4) {

                    if (categorie == 1) {

                        prix = 70;

                    } else if (categorie == 2) {

                        prix = 70;

                    } else if (categorie == 3) {

                        prix = 90;

                    } else if (categorie == 4) {

                        prix = 110;

                    } else if (categorie == 5) {

                        prix = 145;

                    }

                }
            } else if (nbPersonnes == 2) {

                if (classe == 2) {

                    if (categorie == 1) {

                        prix = 100;

                    } else if (categorie == 2) {

                        prix = 100;

                    }

                } else if (classe == 3) {

                    if (categorie == 1) {

                        prix = 115;

                    } else if (categorie == 2) {

                        prix = 115;

                    } else if (categorie == 3) {

                        prix = 125;

                    } else if (categorie == 4) {

                        prix = 120;

                    }

                } else if (classe == 4) {

                    if (categorie == 1) {

                        prix = 120;

                    } else if (categorie == 2) {

                        prix = 120;

                    } else if (categorie == 3) {

                        prix = 140;

                    } else if (categorie == 4) {

                        prix = 190;

                    } else if (categorie == 5) {

                        prix = 220;

                    }

                }
            }
        } else if (periode == 2) {

            if (nbPersonnes == 1) {

                if (classe == 2) {

                    if (categorie == 1) {

                        prix = 65;

                    } else if (categorie == 2) {

                        prix = 65;

                    }

                } else if (classe == 3) {

                    if (categorie == 1) {

                        prix = 80;

                    } else if (categorie == 2) {

                        prix = 80;

                    } else if (categorie == 3) {

                        prix = 90;

                    } else if (categorie == 4) {

                        prix = 120;

                    }

                } else if (classe == 4) {

                    if (categorie == 1) {

                        prix = 90;

                    } else if (categorie == 2) {

                        prix = 90;

                    } else if (categorie == 3) {

                        prix = 115;

                    } else if (categorie == 4) {

                        prix = 130;

                    } else if (categorie == 5) {

                        prix = 170;

                    }

                }
            } else if (nbPersonnes == 2) {

                if (classe == 2) {

                    if (categorie == 1) {

                        prix = 110;

                    } else if (categorie == 2) {

                        prix = 110;

                    }

                } else if (classe == 3) {

                    if (categorie == 1) {

                        prix = 140;

                    } else if (categorie == 2) {

                        prix = 140;

                    } else if (categorie == 3) {

                        prix = 165;

                    } else if (categorie == 4) {

                        prix = 190;

                    }

                } else if (classe == 4) {

                    if (categorie == 1) {

                        prix = 165;

                    } else if (categorie == 2) {

                        prix = 165;

                    } else if (categorie == 3) {

                        prix = 200;

                    } else if (categorie == 4) {

                        prix = 210;

                    } else if (categorie == 5) {

                        prix = 300;

                    }

                }
            }

        }
    
        return prix;

    }

}
