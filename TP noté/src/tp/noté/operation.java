/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.noté;
import java.util.*;

/**
 *
 * @author Azouz
 */
public class operation {
    
    //Attributs encapsulés
    private String date;
    private String heure;
    private int zone;
    
    //Constructeur surchargé
    public operation(String date, String heure, int zone)
    {
        this.date = date;
        this.heure = heure;
        this.zone = zone;
    }
    //Accesseurs
    
    public String get_date()
    {
        return this.date;
    }
    
    public String get_heure()
    {
        return this.heure;
    }
    
    public int get_zone()
    {
        return this.zone;
    }
    
    
    
    //Méthode permettant l'affichage des informations
    public String toString() {
        return new String("Operation : " + date + " " + heure +" | " + zone); 
    }
    
}
