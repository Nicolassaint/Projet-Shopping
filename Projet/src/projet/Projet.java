/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projet;

import java.sql.*;


/**
 *
 * @author Azouz
 */
public class Projet {

    public static void main(String[] args) throws SQLException{
    
    Connection con = null;

    // db parameters
    String url       = "jdbc:mysql://localhost:3306/projet";
    String user      = "root";
    String password  = "";
	
    
    // create a connection to the database
    con = DriverManager.getConnection(url, user, password);
   	
    //Requete test
    String requete="INSERT INTO projet.emp VALUES(13,'test','test','test','test')";
            
    try{
        Statement stm = con.createStatement();
        int nbMaj = stm.executeUpdate(requete);
        System.out.println("nb de modifs BDD = " + nbMaj);
        
    }catch(SQLException e){
        e.printStackTrace();
        
    }
    
  }
}
