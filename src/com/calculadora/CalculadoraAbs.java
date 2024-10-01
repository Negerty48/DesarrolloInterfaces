/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.calculadora;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author tarde
 */
public class CalculadoraAbs extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public CalculadoraAbs() {
        super("Calculadora");
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

        jButtonClear = new javax.swing.JButton();
        jButtonIgual = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButtonSumar = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButtonDiv = new javax.swing.JButton();
        jButtonMulti = new javax.swing.JButton();
        jButtonRestar = new javax.swing.JButton();
        jLabelRes = new javax.swing.JLabel();
        jButtonPunto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(420, 400));
        setPreferredSize(new java.awt.Dimension(420, 400));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonClear.setText("C");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 140, 50));

        jButtonIgual.setText("=");
        jButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 140, 50));

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 60, 50));

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 60, 50));

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 60, 50));

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 60, 50));

        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 60, 50));

        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 140, 50));

        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 60, 50));

        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 60, 50));

        jButtonSumar.setText("+");
        jButtonSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSumarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 60, 50));

        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 60, 50));

        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 60, 50));

        jButtonDiv.setText("/");
        jButtonDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 60, 50));

        jButtonMulti.setText("x");
        jButtonMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 60, 50));

        jButtonRestar.setText("-");
        jButtonRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 60, 50));

        jLabelRes.setBackground(new java.awt.Color(255, 255, 255));
        jLabelRes.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabelRes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelRes.setText("0");
        jLabelRes.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 10));
        jLabelRes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelRes.setInheritsPopupMenu(false);
        jLabelRes.setOpaque(true);
        getContentPane().add(jLabelRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 380, 50));

        jButtonPunto.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jButtonPunto.setText("·");
        jButtonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPuntoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 60, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String res;
        res = this.jLabelRes.getText();
        if (this.comprobarJLabel(res)) {
            this.jLabelRes.setText("2");
        } else {            
            this.jLabelRes.setText(res + "2");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String res;
        res = this.jLabelRes.getText();
        if (this.comprobarJLabel(res)) {
            this.jLabelRes.setText("4");
        } else {            
            this.jLabelRes.setText(res + "4");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String res;
        res = this.jLabelRes.getText();
        if (this.comprobarJLabel(res)) {
            this.jLabelRes.setText("1");
        } else {            
            this.jLabelRes.setText(res + "1");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String res;
        res = this.jLabelRes.getText();
        if (this.comprobarJLabel(res)) {
            this.jLabelRes.setText("3");
        } else {            
            this.jLabelRes.setText(res + "3");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String res;
        res = this.jLabelRes.getText();
        if (this.comprobarJLabel(res)) {
            this.jLabelRes.setText("5");
        } else {            
            this.jLabelRes.setText(res + "5");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String res;
        res = this.jLabelRes.getText();
        if (this.comprobarJLabel(res)) {
            this.jLabelRes.setText("6");
        } else {            
            this.jLabelRes.setText(res + "6");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String res;
        res = this.jLabelRes.getText();
        if (this.comprobarJLabel(res)) {
            this.jLabelRes.setText("7");
        } else {            
            this.jLabelRes.setText(res + "7");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        String res;
        res = this.jLabelRes.getText();
        if (this.comprobarJLabel(res)) {
            this.jLabelRes.setText("8");
        } else {            
            this.jLabelRes.setText(res + "8");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        String res;
        res = this.jLabelRes.getText();
        if (this.comprobarJLabel(res)) {
            this.jLabelRes.setText("9");
        } else {            
            this.jLabelRes.setText(res + "9");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        // TODO add your handling code here:
        String res;
        res = this.jLabelRes.getText();
        if (this.comprobarJLabel(res)) {
            this.jLabelRes.setText("0");
        } else {            
            this.jLabelRes.setText(res + "0");
        }
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButtonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSumarActionPerformed
        // TODO add your handling code here:
        String res;
        res = this.jLabelRes.getText();     
        if (this.comprobarJLabel(res)) {                        
        } else { 
            if (!this.comprobarSimbolos(res.trim())) {
                this.jLabelRes.setText(res + "+");
            }            
        }
    }//GEN-LAST:event_jButtonSumarActionPerformed

    private void jButtonRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestarActionPerformed
        // TODO add your handling code here:
        String res;
        res = this.jLabelRes.getText();
        if (this.comprobarJLabel(res)) {                        
        } else { 
            if (!this.comprobarSimbolos(res.trim())) {
                this.jLabelRes.setText(res + "-");
            }            
        }
    }//GEN-LAST:event_jButtonRestarActionPerformed

    private void jButtonMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiActionPerformed
        // TODO add your handling code here:
        String res;
        res = this.jLabelRes.getText();
        if (this.comprobarJLabel(res)) {                        
        } else { 
            if (!this.comprobarSimbolos(res.trim())) {
                this.jLabelRes.setText(res + "*");
            }            
        }
    }//GEN-LAST:event_jButtonMultiActionPerformed

    private void jButtonDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivActionPerformed
        // TODO add your handling code here:
        String res;
        res = this.jLabelRes.getText();
        if (this.comprobarJLabel(res)) {                        
        } else { 
            if (!this.comprobarSimbolos(res.trim())) {
                this.jLabelRes.setText(res + "/");
            }            
        }
    }//GEN-LAST:event_jButtonDivActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // TODO add your handling code here:
        this.jLabelRes.setText("0");
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIgualActionPerformed
        // TODO add your handling code here:        
        String linea = this.jLabelRes.getText();  
        String[] o = linea.split("[\\d\\.]");
        String[] n = linea.split("[\\+\\-\\/\\*]");
        ArrayList<String> operadores = new ArrayList<>();
        ArrayList<String> numeros = new ArrayList<>(Arrays.asList(n));  
        for (String op : o) {
            if (!op.isBlank()) {
                operadores.add(op);
            }
        }
        while (operadores.contains("*")) {
            int i = operadores.indexOf("*");
            double n1 = Double.parseDouble(numeros.get(i));
            double n2 = Double.parseDouble(numeros.get(i + 1));
            double res = n1 * n2;
            numeros.set(i, Double.toString(res));
            operadores.remove(i);           
            numeros.remove(i + 1);           
        }        
        while (operadores.contains("/")) {
            int i = operadores.indexOf("/");
            double n1 = Double.parseDouble(numeros.get(i));
            double n2 = Double.parseDouble(numeros.get(i + 1));
            double res = n1 / n2;
            numeros.set(i, Double.toString(res));
            operadores.remove(i);           
            numeros.remove(i + 1);
        }        
        while (operadores.size() > 0) {
            if (operadores.get(0).equals("+")) {
                int i = operadores.indexOf("+");
                double n1 = Double.parseDouble(numeros.get(i));
                double n2 = Double.parseDouble(numeros.get(i + 1));
                double res = n1 + n2;
                numeros.set(i, Double.toString(res));
                operadores.remove(i);           
                numeros.remove(i + 1);
            } else {
                int i = operadores.indexOf("-");
                double n1 = Double.parseDouble(numeros.get(i));
                double n2 = Double.parseDouble(numeros.get(i + 1));
                double res = n1 - n2;
                numeros.set(i, Double.toString(res));
                operadores.remove(i);           
                numeros.remove(i + 1);
            }
        }        
        this.jLabelRes.setText(numeros.getFirst());
    }//GEN-LAST:event_jButtonIgualActionPerformed

    private void jButtonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPuntoActionPerformed
        // TODO add your handling code here:
        String res;
        res = this.jLabelRes.getText();     
        if (this.comprobarJLabel(res)) {                        
        } else { 
            if (!this.comprobarSimbolos(res.trim())) {
                this.jLabelRes.setText(res + ".");
            }            
        }
    }//GEN-LAST:event_jButtonPuntoActionPerformed

    public boolean comprobarJLabel(String res) {
        if (res.equals("0")) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean comprobarSimbolos(String res) {  
        char c = res.charAt(res.length() - 1);
        if (c == '+' || c == '-' || c == '*' || c == '/') {
            return true;
        } else {
            return false;
        }
    }
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
            java.util.logging.Logger.getLogger(CalculadoraAbs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraAbs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraAbs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraAbs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraAbs().setVisible(true);
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
    private javax.swing.JButton jButtonPunto;
    private javax.swing.JButton jButtonRestar;
    private javax.swing.JButton jButtonSumar;
    private javax.swing.JLabel jLabelRes;
    // End of variables declaration//GEN-END:variables
}
