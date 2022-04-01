/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.*;
import java.io.*;
import java.sql.DriverManager;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.JFreeChart;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartUtilities; 
import org.jfree.chart.ChartPanel;

/**
 *
 * @author Azouz
 */
public class Statistiques extends javax.swing.JFrame {

    /**
     * Creates new form Statistiques
     */
    public Statistiques() {
        initComponents();
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
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1220, 685));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOUTTON RETOUR.png"))); // NOI18N
        jButton2.setPreferredSize(new java.awt.Dimension(93, 35));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 590, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/STATISTIQUES 1 VISUALISER LES STOCKS.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(293, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOUTON ENREGISTRER DONNEES.png"))); // NOI18N
        jButton4.setPreferredSize(new java.awt.Dimension(179, 37));
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/STATISTIQUES 1 FOND.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1340, 770));

        jPanel3.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 1220, 380));

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jButton3.setText("Enregistrer le graphique");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Connection con = null;

        // db parameters
        String url = "jdbc:mysql://localhost:3306/projet?useSSL=false";
        String user = "root";
        String password = "";

        DefaultCategoryDataset bar_chart_dataset = new DefaultCategoryDataset();

        try {
            // create a connection to the database
            con = DriverManager.getConnection(url, user, password);

            String requete = "Select nom,quantite from produit";

            Statement stm = con.createStatement();
            ResultSet resultat = stm.executeQuery(requete);

            while (resultat.next()) {
                String nom = resultat.getString("nom");
                int quantite = resultat.getInt("quantite");
                bar_chart_dataset.addValue(quantite, "Quantite", nom);
            }
            JFreeChart BarChartObject = ChartFactory.createBarChart("Quantite en stock pour chaque fleur", "Fleur", "Quantite", bar_chart_dataset, PlotOrientation.VERTICAL, true, true, false);
            resultat.close();
            stm.close();
            con.close();
            
            int width = 1000;
            int height = 480;
            
            String name=JOptionPane.showInputDialog(null,"Nom du fichier");      
            String nom_fichier = name + ".png";
            File BarChart = new File(nom_fichier);
            ChartUtilities.saveChartAsPNG(BarChart, BarChartObject, width, height);
            
            JOptionPane.showMessageDialog(null,"Le graphique à bien été enregistré !");        

        } catch (Exception i) {
            System.out.println(i);
        }
            
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Connection con = null;

        // db parameters
        String url = "jdbc:mysql://localhost:3306/projet?useSSL=false";
        String user = "root";
        String password = "";

        DefaultCategoryDataset bar_chart_dataset = new DefaultCategoryDataset();

        try {
            // create a connection to the database
            con = DriverManager.getConnection(url, user, password);

            String requete = "Select nom,quantite from produit";

            Statement stm = con.createStatement();
            ResultSet resultat = stm.executeQuery(requete);

            while (resultat.next()) {
                String nom = resultat.getString("nom");
                int quantite = resultat.getInt("quantite");
                bar_chart_dataset.addValue(quantite, "Quantite", nom);
            }
            JFreeChart BarChartObject = ChartFactory.createBarChart("Quantite en stock pour chaque fleur", "Fleur", "Quantite", bar_chart_dataset, PlotOrientation.VERTICAL, true, true, false);
            resultat.close();
            stm.close();
            con.close();

            ChartPanel chartPanel = new ChartPanel(BarChartObject,false);
            jPanel3.setLayout(new java.awt.BorderLayout()); 
            jPanel3.add(chartPanel, BorderLayout.CENTER);
            jPanel3.validate();


        } catch (Exception i) {
            System.out.println(i);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        admin_pannel pannel = new admin_pannel();
        pannel.show();
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
            java.util.logging.Logger.getLogger(Statistiques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Statistiques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Statistiques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Statistiques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Statistiques().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
