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
public class pass {
    
    //Attributs
    protected int numero;
    protected String proprietaire;
    protected ArrayList<operation> liste_op = new ArrayList<>();
    
    public pass()
    {
        //
    }
    
    //Accesseurs
    
    public int get_zone()
    {
        return this.zone;
    }
}
