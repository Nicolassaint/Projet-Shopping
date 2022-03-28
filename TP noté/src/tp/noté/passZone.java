/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.noté;

/**
 *
 * @author Azouz
 */
public class passZone extends pass{
    
    //Attributs
    private boolean acces_Zone_1;
    private boolean acces_Zone_2;
    private boolean Activ = false;
    
    //Constructeur
    passZone(){}
    
    //Accesseurs
    public boolean get_acces_Zone_1()
    {
        return this.acces_Zone_1;
    }
    
    public boolean get_acces_Zone_2()
    {
        return this.acces_Zone_2;
    }
    
    public boolean get_Activ()
    {
        return this.Activ;
    }
    
    public String toString() {
        return new String("Zone 1 : " + acces_Zone_1 + " Zone 2 " + acces_Zone_2 + " | Pass actif : " + Activ); 
    }
    
}
