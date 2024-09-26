/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.calculadora;

/**
 *
 * @author tarde
 */
public class CalculadoraGrid extends javax.swing.JFrame {

    /**
     * Creates new form CalculadoraGrid
     */
    public CalculadoraGrid() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jLabelRes = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonIgual = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonSumar = new javax.swing.JButton();
        jButtonRestar = new javax.swing.JButton();
        jButtonMulti = new javax.swing.JButton();
        jButtonDiv = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 420));
        setPreferredSize(new java.awt.Dimension(400, 420));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabelRes.setBackground(new java.awt.Color(255, 255, 255));
        jLabelRes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelRes.setText("0");
        jLabelRes.setToolTipText("");
        jLabelRes.setMaximumSize(new java.awt.Dimension(20, 28));
        jLabelRes.setMinimumSize(new java.awt.Dimension(20, 28));
        jLabelRes.setPreferredSize(new java.awt.Dimension(20, 28));
        getContentPane().add(jLabelRes, new java.awt.GridBagConstraints());

        jButton1.setText("1");
        getContentPane().add(jButton1, new java.awt.GridBagConstraints());

        jButton2.setText("2");
        getContentPane().add(jButton2, new java.awt.GridBagConstraints());

        jButton3.setText("3");
        getContentPane().add(jButton3, new java.awt.GridBagConstraints());

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new java.awt.GridBagConstraints());

        jButton5.setText("5");
        getContentPane().add(jButton5, new java.awt.GridBagConstraints());

        jButton6.setText("6");
        getContentPane().add(jButton6, new java.awt.GridBagConstraints());

        jButton7.setText("7");
        getContentPane().add(jButton7, new java.awt.GridBagConstraints());

        jButton8.setText("8");
        getContentPane().add(jButton8, new java.awt.GridBagConstraints());

        jButton9.setText("9");
        getContentPane().add(jButton9, new java.awt.GridBagConstraints());

        jButton0.setText("0");
        getContentPane().add(jButton0, new java.awt.GridBagConstraints());

        jButtonIgual.setText("=");
        getContentPane().add(jButtonIgual, new java.awt.GridBagConstraints());

        jButtonClear.setText("C");
        getContentPane().add(jButtonClear, new java.awt.GridBagConstraints());

        jButtonSumar.setText("+");
        getContentPane().add(jButtonSumar, new java.awt.GridBagConstraints());

        jButtonRestar.setText("-");
        getContentPane().add(jButtonRestar, new java.awt.GridBagConstraints());

        jButtonMulti.setText("x");
        getContentPane().add(jButtonMulti, new java.awt.GridBagConstraints());

        jButtonDiv.setText("/");
        getContentPane().add(jButtonDiv, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraGrid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGrid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGrid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGrid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraGrid().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDiv;
    private javax.swing.JButton jButtonIgual;
    private javax.swing.JButton jButtonMulti;
    private javax.swing.JButton jButtonRestar;
    private javax.swing.JButton jButtonSumar;
    private javax.swing.JLabel jLabelRes;
    // End of variables declaration//GEN-END:variables
}
