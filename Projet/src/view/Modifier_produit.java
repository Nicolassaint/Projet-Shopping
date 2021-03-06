/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Azouz
 */
public class Modifier_produit extends javax.swing.JFrame {

    /**
     * Creates new form Modifier_produit
     */
    public Modifier_produit() {
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

        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField8 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1235, 720));

        jPanel1.setPreferredSize(new java.awt.Dimension(1220, 685));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 330, 40));

        jTextField3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 330, 40));

        jTextField4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 330, 40));

        jTextField5.setBackground(new java.awt.Color(255, 204, 204));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 330, 40));

        jTextField6.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, 330, 40));

        jTextField7.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, 330, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOUTON MODIFIER.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(93, 35));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 630, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOUTTON RETOUR.png"))); // NOI18N
        jButton2.setPreferredSize(new java.awt.Dimension(93, 35));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 630, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(255, 204, 204));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 340, 30));

        jTextField8.setBackground(new java.awt.Color(255, 204, 204));
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 550, 330, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MODIFIER UN PRODUIT FOND.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(282, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        admin_pannel pannel = new admin_pannel();
        pannel.show();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
    
    PreparedStatement pstm = con.prepareStatement("UPDATE produit SET nom = ?, categorie = ?, quantite = ?, prix_unitaire = ?, prix_vrac = ?, quantite_vrac = ?,url_image = ? WHERE nom = ?");
    pstm.setString(1, jTextField3.getText());
    pstm.setString(2, jTextField4.getText());
    pstm.setString(3, jTextField5.getText());
    pstm.setString(4, jTextField7.getText());
    pstm.setString(5, jTextField6.getText());
    pstm.setString(6, jTextField8.getText());
    pstm.setString(7, jTextField2.getText());
    pstm.setString(8, jComboBox1.getSelectedItem().toString());
    
    pstm.executeUpdate();
       
                
        JOptionPane.showMessageDialog(null,"Modification r??ussie !");        
        
        con.close();
        
        admin_pannel pannel = new admin_pannel();
        pannel.show();
        dispose();
        
    }catch(SQLException e){
        e.printStackTrace();
        
    }
    }//GEN-LAST:event_jButton1ActionPerformed

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
       
       String requete = "Select * from produit where nom='"+produit+"'";
       
       Statement stm = con.createStatement();
       ResultSet affichage = stm.executeQuery(requete);
       
       while(affichage.next())
        {
       jTextField3.setText(affichage.getString("nom"));
       jTextField4.setText(affichage.getString("categorie"));
       jTextField5.setText(affichage.getString("quantite"));
       jTextField7.setText(affichage.getString("prix_unitaire"));
       jTextField6.setText(affichage.getString("prix_vrac"));
       jTextField8.setText(affichage.getString("quantite_vrac"));
       jTextField2.setText(affichage.getString("url_image"));
       
        }
       
       affichage.close();
       con.close();
        
    }catch(SQLException e){
        e.printStackTrace();
        
    }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

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
            java.util.logging.Logger.getLogger(Modifier_produit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modifier_produit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modifier_produit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modifier_produit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modifier_produit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
