/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.*;
import modele.JavaMailUtil.*;
import view.membre_login.*;
import java.sql.ResultSet;
import java.sql.Statement;
import modele.JavaMailUtil;
import view.membre_login.*;
import view.Catalogue.*;

/**
 *
 * @author Azouz
 */
public class Paiement extends javax.swing.JFrame {

    /**
     * Creates new form Paiement
     */
    public Paiement() {
        initComponents();

        Connection con = null;

        // db parameters
        String url = "jdbc:mysql://localhost:3306/projet?useSSL=false";
        String user = "root";
        String password = "";

        int numero = Catalogue.nombre_panier_actuel;
        String login = membre_login.getTextField();
        String mdp = membre_login.getPasswordField();
        String nom = "";
        String prenom = "";
        String numero_carte = "";
        String date_exp = "";
        String CVV = "";
        double total_panier = 0;
        String prix = "";

        try {
            // create a connection to the database
            con = DriverManager.getConnection(url, user, password);

            //Requete test
            String requete = "Select nom, prenom, numero_carte, date_exp, CVV from acheteur where mail = '" + login + "' and mdp = '" + mdp + "'";
            String requete2 = "select sum(total) as total_panier from panier where numero_panier='" + numero + "'";

            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery(requete2);

            while (res.next()) {
                total_panier = res.getDouble("total_panier");
            }

            prix = String.valueOf(total_panier) + " €";
            jLabel3.setText(prix);

            try ( ResultSet resultat = stm.executeQuery(requete)) {
                while (resultat.next()) {

                    nom = resultat.getString("nom");
                    prenom = resultat.getString("prenom");
                    date_exp = resultat.getString("date_exp");
                    numero_carte = resultat.getString("numero_carte");
                    CVV = resultat.getString("CVV");

                }

                if (numero_carte.length() > 1) {
                    int b = JOptionPane.showConfirmDialog(null, "Voulez-vous utiliser la carte bancaire enregistrée sur votre compte ?");
                    if (b == 0) {
                        jTextField1.setText(numero_carte);
                        jTextField2.setText(date_exp);
                        jTextField3.setText(CVV);
                        jTextField5.setText(prenom);
                        jTextField6.setText(nom);

                    }
                }
            }
            con.close();

        } catch (SQLException e) {
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

        jTextField4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1235, 720));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOUTON VALIDER.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(173, 37));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 520, -1, -1));

        jTextField1.setBackground(new java.awt.Color(255, 204, 204));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 330, 40));

        jTextField2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 330, 40));

        jTextField3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 330, 40));

        jTextField5.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 330, 40));

        jTextField6.setBackground(new java.awt.Color(255, 204, 204));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 330, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("prix");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 100, 80, 20));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOUTTON RETOUR.png"))); // NOI18N
        jButton2.setText("Retour");
        jButton2.setMinimumSize(new java.awt.Dimension(93, 35));
        jButton2.setPreferredSize(new java.awt.Dimension(93, 35));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 590, 80, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PAIEMENT FOND.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Connection con = null;

        // db parameters
        String url = "jdbc:mysql://localhost:3306/projet?useSSL=false";
        String user = "root";
        String password = "";

        int panier = Catalogue.nombre_panier_actuel;
        String login = membre_login.getTextField();
        String mdp = membre_login.getPasswordField();
        String nom = "";
        String prenom = "";
        String numero_carte = "";
        String date_exp = "";
        String CVV = "";
        String mail = "";

        try {
            // create a connection to the database
            con = DriverManager.getConnection(url, user, password);
            String requete = "Select nom, prenom, mail, numero_carte, date_exp, CVV from acheteur where mail = '" + login + "' and mdp = '" + mdp + "'";
            String requete2 = "Select produit.nom, produit.quantite - panier.nombre_produit from produit, panier where produit.nom = panier.nom_produit and panier.numero_panier = '" + panier + "'";
            String requete3 = "Select produit.nom, produit.nb_ventes + panier.nombre_produit from produit, panier where produit.nom = panier.nom_produit and panier.numero_panier = '" + panier + "'";
            String requete4 ="Select sum(total) as prix from panier where numero_panier = '"+panier+"'";
            
            Statement stm = con.createStatement();
            ResultSet resultat = stm.executeQuery(requete);

            while (resultat.next()) {

                nom = resultat.getString("nom");
                prenom = resultat.getString("prenom");
                date_exp = resultat.getString("date_exp");
                numero_carte = resultat.getString("numero_carte");
                CVV = resultat.getString("CVV");
                mail = resultat.getString("mail");

            }
            resultat.close();

            ResultSet resultat2 = stm.executeQuery(requete2);

            while (resultat2.next()) {

                PreparedStatement pstm = con.prepareStatement("UPDATE produit SET quantite = ? WHERE nom = ?");
                pstm.setInt(1, resultat2.getInt("produit.quantite - panier.nombre_produit"));
                pstm.setString(2, resultat2.getString("nom"));

                pstm.executeUpdate();
            }
             
            resultat2.close();
            
            ResultSet resultat3 = stm.executeQuery(requete3);

            while (resultat3.next()) {

                PreparedStatement pstm = con.prepareStatement("UPDATE produit SET nb_ventes = ? WHERE nom = ?");
                pstm.setInt(1, resultat3.getInt("produit.nb_ventes + panier.nombre_produit"));
                pstm.setString(2, resultat3.getString("nom"));

                pstm.executeUpdate();
            }
             
            resultat3.close();
            
            ResultSet resultat4 = stm.executeQuery(requete4);
            
            double total = 0;
            
            while(resultat4.next())
            {
                total = resultat4.getDouble("prix");
            }
            
            String prixTotal = String.valueOf(total);
            
            resultat4.close();
            
            int b = 1;

            if (numero_carte.length() == 0) {
                //Requete test
                b = JOptionPane.showConfirmDialog(null, "Voulez-vous enregistrer votre carte bancaire ?");
            }

            if (b == 0) {

                PreparedStatement pstm = con.prepareStatement("UPDATE acheteur SET numero_carte = ?, CVV = ?, date_exp = ? WHERE nom = ? and prenom = ?");
                pstm.setString(1, jTextField1.getText());
                pstm.setString(2, jTextField2.getText());
                pstm.setString(3, jTextField3.getText());
                pstm.setString(4, jTextField6.getText());
                pstm.setString(5, jTextField5.getText());

                pstm.executeUpdate();
            }

            JOptionPane.showMessageDialog(null, "Paiement accepté !");
            int a = JOptionPane.showConfirmDialog(null, "Voulez-vous recevoir une facture par email ?");

            if (a == 0) {

                String contenu_mail = "Merci beaucoup pour votre commande sur Love to Love Flowers Paris ! \n\n\n Votre commande vous a couté " + prixTotal + " €";
                JavaMailUtil.sendEmail(mail,contenu_mail);
                
            }

            con.close();

            dispose();

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Panier panier = new Panier();
        panier.show();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Paiement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paiement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paiement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paiement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paiement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
