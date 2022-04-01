/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author louis
 */
public class Catalogue extends javax.swing.JFrame {

    /**
     * Creates new form Catalogue
     */
    public Catalogue() {
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
        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1235, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(240, 220, 216));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 1153, Short.MAX_VALUE)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 1170, 420));

        jPanel1.setPreferredSize(new java.awt.Dimension(1220, 685));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOUTON MON PANIER .png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(179, 37));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 50, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(255, 102, 102));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 130, 140, -1));

        jComboBox2.setBackground(new java.awt.Color(255, 102, 102));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prix croissant", "Prix décroissant", "Ordre alphabétique", "Bonne affaire en vrac", " " }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 130, 140, -1));

        jLabel2.setText("Produit");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 60, 30));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 246, 170, 170));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOUTTON RETOUR.png"))); // NOI18N
        jButton3.setPreferredSize(new java.awt.Dimension(93, 35));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 620, -1, -1));

        jLabel4.setText("Nom : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, -1));

        jLabel5.setText("Prix unitaire :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, -1, -1));

        jLabel6.setText("Prix en vrac : ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, -1, -1));

        jLabel7.setText("Quantité vrac :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, -1, -1));

        jLabel8.setText("Quantité souhaitée");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 220, -1, -1));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 250, 60, -1));

        jLabel10.setText("PrixCalculé");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 340, -1, -1));

        jLabel11.setText("nom");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, -1, -1));

        jLabel12.setText("PrixU");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 270, -1, -1));

        jLabel13.setText("PrixV");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, -1, -1));

        jLabel14.setText("QuantitéV");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, -1, -1));

        jButton2.setText("Calcul Prix");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 300, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CATALOGUE FOND.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTextField6.setText("jTextField6");
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 340, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Panier panier = new Panier();
        panier.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Menu_entree menu = new Menu_entree();
        menu.show();
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
       
       String requete = "Select url_image,nom,prix_unitaire,prix_vrac,quantite_vrac from produit where nom='"+produit+"'";
       
       Statement stm = con.createStatement();
       ResultSet lien = stm.executeQuery(requete);
       
       String lien_image = "";
       String nom = "";
       String prix_unitaire = "";
       String prix_vrac = "";
       String quantite_vrac = "";
       
       while(lien.next())
        {
            lien_image = lien.getString("url_image");
            nom = lien.getString("nom");
            prix_unitaire = lien.getString("prix_unitaire");
            prix_vrac = lien.getString("prix_vrac");
            quantite_vrac = lien.getString("quantite_vrac");

        }
       
         jLabel11.setText(nom);
         jLabel12.setText(prix_unitaire);
         jLabel13.setText(prix_vrac);
         jLabel14.setText(quantite_vrac);
         
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
            java.util.logging.Logger.getLogger(Catalogue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Catalogue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Catalogue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Catalogue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Catalogue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
