/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.*;
import java.io.*;
import java.sql.DriverManager;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.ChartPanel;
import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.text.DecimalFormat;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Azouz
 */
public class Examen_ventes extends javax.swing.JFrame {

    /**
     * Creates new form Examen_ventes
     */
    public Examen_ventes() {
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1235, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(240, 226, 218));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 356, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOUTON VISU VENTES.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(365, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOUTON ENREGISTRER DONNEES.png"))); // NOI18N
        jButton2.setPreferredSize(new java.awt.Dimension(179, 37));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 620, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOUTTON RETOUR.png"))); // NOI18N
        jButton3.setPreferredSize(new java.awt.Dimension(93, 35));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 610, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/EXAM VENTES FOND.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Connection con = null;

        // db parameters
        String url = "jdbc:mysql://localhost:3306/projet?useSSL=false";
        String user = "root";
        String password = "";

        DefaultPieDataset pie_chart_dataset = new DefaultPieDataset();

        try {

            // create a connection to the database
            con = (Connection) DriverManager.getConnection(url, user, password);

            String requete = "Select nom,nb_ventes from produit";

            Statement stm = con.createStatement();
            ResultSet resultat = stm.executeQuery(requete);

            while (resultat.next()) {
                String nom = resultat.getString("nom");
                int nombre_ventes = resultat.getInt("nb_ventes");
                pie_chart_dataset.setValue(nom, nombre_ventes);
            }

            JFreeChart PieChartObject = ChartFactory.createPieChart(null, pie_chart_dataset, true, false, false);

            PiePlot illegalLegalRestPiePlot4 = (PiePlot) PieChartObject.getPlot();
            illegalLegalRestPiePlot4.setSectionPaint("some data 1", new Color(0, 255, 0));
            illegalLegalRestPiePlot4.setSectionPaint("some data 2",
                    new Color(255, 0, 0));
            PiePlot plot4 = (PiePlot) PieChartObject.getPlot();
            plot4.setExplodePercent("some data 1", 0.4);

            PieSectionLabelGenerator gen = new StandardPieSectionLabelGenerator(
                    "{0}: {1} ({2})", new DecimalFormat("0"), new DecimalFormat("0%"));
            plot4.setLabelGenerator(gen);

            resultat.close();
            stm.close();
            con.close();


            ChartPanel chartPanel = new ChartPanel(PieChartObject, false);
            jPanel1.setLayout(new java.awt.BorderLayout());
            jPanel1.add(chartPanel, BorderLayout.CENTER);
            jPanel1.validate();

        } catch (Exception i) {
            System.out.println(i);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Connection con = null;

        // db parameters
        String url = "jdbc:mysql://localhost:3306/projet?useSSL=false";
        String user = "root";
        String password = "";

        DefaultPieDataset pie_chart_dataset = new DefaultPieDataset();

        try {

            // create a connection to the database
            con = (Connection) DriverManager.getConnection(url, user, password);

            String requete = "Select nom,nb_ventes from produit";

            JFreeChart PieChartObject;
            try ( Statement stm = con.createStatement();  ResultSet resultat = stm.executeQuery(requete)) {
                while (resultat.next()) {
                    String nom = resultat.getString("nom");
                    int nombre_ventes = resultat.getInt("nb_ventes");
                    pie_chart_dataset.setValue(nom, nombre_ventes);
                }
                PieChartObject = ChartFactory.createPieChart(null, pie_chart_dataset, true, false, false);
                PiePlot illegalLegalRestPiePlot4 = (PiePlot) PieChartObject.getPlot();
                illegalLegalRestPiePlot4.setSectionPaint("some data 1", new Color(0, 255, 0));
                illegalLegalRestPiePlot4.setSectionPaint("some data 2",
                        new Color(255, 0, 0));
                PiePlot plot4 = (PiePlot) PieChartObject.getPlot();
                plot4.setExplodePercent("some data 1", 0.4);
                PieSectionLabelGenerator gen = new StandardPieSectionLabelGenerator(
                        "{0}: {1} ({2})", new DecimalFormat("0"), new DecimalFormat("0%"));
                plot4.setLabelGenerator(gen);
            }
            con.close();

            int width = 1000;
            int height = 480;

            String name = JOptionPane.showInputDialog(null, "Nom du fichier");
            String nom_fichier = name + ".png";
            File BarChart = new File(nom_fichier);
            ChartUtilities.saveChartAsPNG(BarChart, PieChartObject, width, height);

            JOptionPane.showMessageDialog(null, "Le graphique à bien été enregistré !");

        } catch (Exception i) {
            System.out.println(i);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        admin_pannel admin = new admin_pannel();
        admin.show();
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Examen_ventes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Examen_ventes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Examen_ventes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Examen_ventes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Examen_ventes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
