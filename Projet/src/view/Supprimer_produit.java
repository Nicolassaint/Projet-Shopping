/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.net.URL;
import java.net.MalformedURLException;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
import javax.swing.*;


/**
 *
 * @author Azouz
 */
public class Supprimer_produit extends javax.swing.JFrame {

    /**
     * Creates new form Supprimer_produit
     */
    public Supprimer_produit() {
        
        initComponents();
        
                Connection con = null;

    String url       = "jdbc:mysql://localhost:3306/projet?useSSL=false";
    String user      = "root";
    String password  = "";
	
    try{
    // create a connection to the database
    con = DriverManager.getConnection(url, user, password);
   	
    //Requete test
    String requete="Select nom from produit";
            
    
        Statement stm = con.createStatement();
       
        ResultSet resultat = stm.executeQuery(requete);
        
        while(resultat.next())
        {
            jComboBox1.addItem(resultat.getString("nom"));
        }
        
        con.close();
        
        
    }catch(SQLException e){
        e.printStackTrace();
        
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1235, 720));

        jPanel2.setPreferredSize(new java.awt.Dimension(1220, 685));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 330, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOUTTON RETOUR.png"))); // NOI18N
        jButton2.setPreferredSize(new java.awt.Dimension(93, 35));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 600, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SUPPRIMER UN PRODUIT BOUTON SUPPRIMER.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(93, 35));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 600, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(500, 400));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 440, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SUPPRIMER UN PRODUIT FOND.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 642, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Connection con = null;

    // db parameters
    String url       = "jdbc:mysql://localhost:3306/projet?useSSL=false";
    String user      = "root";
    String password  = "";
	
    try{
    // create a connection to the database
    con = DriverManager.getConnection(url, user, password);
   	
    //Requete test
    String produit = jComboBox1.getSelectedItem().toString();
    
    String requete="Delete from produit where nom = '"+produit+"'";
            
        Statement stm = con.createStatement();
        stm.executeUpdate(requete);
                
    
        JOptionPane.showMessageDialog(null,"Supression réussie !");        
        
        con.close();
        
        admin_pannel pannel = new admin_pannel();
        pannel.show();
        dispose();
        
    }catch(SQLException e){
        e.printStackTrace();
        
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        admin_pannel pannel = new admin_pannel();
        pannel.show();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        Connection con = null;

    String url       = "jdbc:mysql://localhost:3306/projet?useSSL=false";
    String user      = "root";
    String password  = "";
	
    try{
    // create a connection to the database
    con = DriverManager.getConnection(url, user, password);
   	
    //Requete test
        
       String produit = jComboBox1.getSelectedItem().toString();
       
       String requete = "Select url_image from produit where nom='"+produit+"'";
       
       Statement stm = con.createStatement();
       ResultSet lien = stm.executeQuery(requete);
       
       String lien_image = "";
       
       while(lien.next())
        {
            lien_image = lien.getString("url_image");
        }
       
       if (lien_image.length()>0)
       {
       try{
       
       jLabel3.setText("");
       URL image = new URL(lien_image);
       BufferedImage b = ImageIO.read(image);
       Image image_recadre = b.getScaledInstance(250, 250, Image.SCALE_DEFAULT);

       ImageIcon icon = new ImageIcon(image_recadre);
       jLabel3.setIcon(icon);
       }
       catch(MalformedURLException e){
           e.printStackTrace();
       }
       catch (IOException e){
           e.printStackTrace();

       }}
       else{jLabel3.setIcon(null);}
       
       lien.close();
       con.close();
        
    }catch(SQLException e){
        e.printStackTrace();
        
    }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Supprimer_produit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supprimer_produit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supprimer_produit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supprimer_produit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supprimer_produit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
