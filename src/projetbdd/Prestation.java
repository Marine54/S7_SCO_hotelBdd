/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbdd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Emeline
 */
public class Prestation {
    
    ConnexionBDD c = new ConnexionBDD();
    Connection connexion = c.Connexion();
    
    public int prixPrestation(int numChambre, int numPrestation){
        
        int prix = 0;
        int classe = 0;
        int categorie = 0;
        
        try {
            Statement statement = connexion.createStatement();
            ResultSet catHotel = statement.executeQuery("SELECT classe, categorie FROM chambre INNER JOIN hotel ON hotel.num_hotel = chambre.num_hotel WHERE num_chambre = '" + numChambre + "';");
            if (catHotel.next()) {
                classe = Integer.parseInt(catHotel.getString("classe"));
                categorie = Integer.parseInt(catHotel.getString("categorie"));
            }
            connexion.close();
        } catch (Exception e) {
            System.out.println("La tentative de connexion a échoué");
            e.printStackTrace();
        }
        
        
        if (numPrestation == 1){
            
            if (classe == 2){
                
                if (categorie == 1){
                    
                    prix = 5;
                    
                }else if (categorie == 2){
                    
                    prix = 5;
                    
                }
                
            }else if (classe == 3){
                
                if (categorie == 1){
                    
                    prix = 5;
                    
                }else if (categorie == 2){
                    
                    prix = 5;
                    
                }else if (categorie == 3){
                    
                    prix = 5;
                    
                }else if (categorie == 4){
                    
                    prix = 5;
                    
                }
                
            }else if (classe == 4){
                
                if (categorie == 1){
                    
                    prix = 0;
                    
                }else if (categorie == 2){
                    
                    prix = 0;
                    
                }else if (categorie == 3){
                    
                    prix = 0;
                    
                }else if (categorie == 4){
                    
                    prix = 0;
                    
                }else if (categorie == 5){
                    
                    prix = 0;
                    
                }
                
            }
            
        }else if(numPrestation == 2){
            
            if (classe == 2){
                
                if (categorie == 1){
                    
                    prix = 2;
                    
                }else if (categorie == 2){
                    
                    prix = 2;
                    
                }
                
            }else if (classe == 3){
                
                if (categorie == 1){
                    
                    prix = 2;
                    
                }else if (categorie == 2){
                    
                    prix = 2;
                    
                }else if (categorie == 3){
                    
                    prix = 2;
                    
                }else if (categorie == 4){
                    
                    prix = 2;
                    
                }
                
            }else if (classe == 4){
                
                if (categorie == 1){
                    
                    prix = 0;
                    
                }else if (categorie == 2){
                    
                    prix = 0;
                    
                }else if (categorie == 3){
                    
                    prix = 0;
                    
                }else if (categorie == 4){
                    
                    prix = 0;
                    
                }else if (categorie == 5){
                    
                    prix = 0;
                    
                }
                
            }
            
        }else if(numPrestation == 3){
            
            if (classe == 2){
                
                if (categorie == 1){
                    
                    prix = 2;
                    
                }else if (categorie == 2){
                    
                    prix = 2;
                    
                }
                
            }else if (classe == 3){
                
                if (categorie == 1){
                    
                    prix = 2;
                    
                }else if (categorie == 2){
                    
                    prix = 2;
                    
                }else if (categorie == 3){
                    
                    prix = 2;
                    
                }else if (categorie == 4){
                    
                    prix = 2;
                    
                }
                
            }else if (classe == 4){
                
                if (categorie == 1){
                    
                    prix = 2;
                    
                }else if (categorie == 2){
                    
                    prix = 2;
                    
                }else if (categorie == 3){
                    
                    prix = 2;
                    
                }else if (categorie == 4){
                    
                    prix = 0;
                    
                }else if (categorie == 5){
                    
                    prix = 0;
                    
                }
                
            }
            
        }else if(numPrestation == 4){
            
            if (classe == 2){
                
                if (categorie == 1){
                    
                    prix = 3;
                    
                }else if (categorie == 2){
                    
                    prix = 3;
                    
                }
                
            }else if (classe == 3){
                
                if (categorie == 1){
                    
                    prix = 3;
                    
                }else if (categorie == 2){
                    
                    prix = 3;
                    
                }else if (categorie == 3){
                    
                    prix = 3;
                    
                }else if (categorie == 4){
                    
                    prix = 3;
                    
                }
                
            }else if (classe == 4){
                
                if (categorie == 1){
                    
                    prix = 3;
                    
                }else if (categorie == 2){
                    
                    prix = 3;
                    
                }else if (categorie == 3){
                    
                    prix = 3;
                    
                }else if (categorie == 4){
                    
                    prix = 3;
                    
                }else if (categorie == 5){
                    
                    prix = 0;
                    
                }
                
            }
            
        }else if(numPrestation == 5){
            
            if (classe == 4){
                
                if (categorie == 1){
                    
                    prix = 30;
                    
                }else if (categorie == 2){
                    
                    prix = 30;
                    
                }else if (categorie == 3){
                    
                    prix = 30;
                    
                }else if (categorie == 4){
                    
                    prix = 30;
                    
                }else if (categorie == 5){
                    
                    prix = 30;
                    
                }
                
            }
            
        }else if(numPrestation == 6){
            
            if (classe == 4){
                
                if (categorie == 1){
                    
                    prix = 20;
                    
                }else if (categorie == 2){
                    
                    prix = 20;
                    
                }else if (categorie == 3){
                    
                    prix = 20;
                    
                }else if (categorie == 4){
                    
                    prix = 20;
                    
                }else if (categorie == 5){
                    
                    prix = 20;
                    
                }
                
            }
            
        }
        
        
        return prix;
    }
    
}
