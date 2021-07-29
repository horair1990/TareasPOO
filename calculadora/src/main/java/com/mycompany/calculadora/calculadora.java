/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadora;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;


/**
 *
 * @author Horair
 */
public class calculadora extends javax.swing.JFrame {

    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript"); 
    
    public calculadora() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtResultado = new javax.swing.JLabel();
        txtOperacion = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnDiv = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnPosNeg = new javax.swing.JButton();
        btnPorce = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnUno = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnCero = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Horair");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(55, 62, 71));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 320, 38));

        txtOperacion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(55, 62, 71));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 320, 38));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 120));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDiv.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDiv.setText("÷");
        btnDiv.setBorder(new javax.swing.border.MatteBorder(null));
        btnDiv.setFocusPainted(false);
        btnDiv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });
        jPanel2.add(btnDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 50, 50));

        btnC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnC.setText("C");
        btnC.setBorder(new javax.swing.border.MatteBorder(null));
        btnC.setFocusPainted(false);
        btnC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        jPanel2.add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 50, 50));

        btnPosNeg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPosNeg.setText("<-");
        btnPosNeg.setBorder(new javax.swing.border.MatteBorder(null));
        btnPosNeg.setFocusPainted(false);
        btnPosNeg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPosNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosNegActionPerformed(evt);
            }
        });
        jPanel2.add(btnPosNeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 50, 50));

        btnPorce.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPorce.setText("%");
        btnPorce.setBorder(new javax.swing.border.MatteBorder(null));
        btnPorce.setFocusPainted(false);
        btnPorce.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPorce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorceActionPerformed(evt);
            }
        });
        jPanel2.add(btnPorce, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 50, 50));

        btnMulti.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMulti.setText("X");
        btnMulti.setBorder(new javax.swing.border.MatteBorder(null));
        btnMulti.setFocusPainted(false);
        btnMulti.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });
        jPanel2.add(btnMulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 50, 50));

        btnNueve.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNueve.setText("9");
        btnNueve.setBorder(new javax.swing.border.MatteBorder(null));
        btnNueve.setFocusPainted(false);
        btnNueve.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });
        jPanel2.add(btnNueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 50, 50));

        btnOcho.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOcho.setText("8");
        btnOcho.setBorder(new javax.swing.border.MatteBorder(null));
        btnOcho.setFocusPainted(false);
        btnOcho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });
        jPanel2.add(btnOcho, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 50, 50));

        btnSiete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSiete.setText("7");
        btnSiete.setBorder(new javax.swing.border.MatteBorder(null));
        btnSiete.setFocusPainted(false);
        btnSiete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });
        jPanel2.add(btnSiete, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 50, 50));

        btnResta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnResta.setText("-");
        btnResta.setBorder(new javax.swing.border.MatteBorder(null));
        btnResta.setFocusPainted(false);
        btnResta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });
        jPanel2.add(btnResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 50, 50));

        btnSeis.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSeis.setText("6");
        btnSeis.setBorder(new javax.swing.border.MatteBorder(null));
        btnSeis.setFocusPainted(false);
        btnSeis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });
        jPanel2.add(btnSeis, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 50, 50));

        btnCinco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCinco.setText("5");
        btnCinco.setBorder(new javax.swing.border.MatteBorder(null));
        btnCinco.setFocusPainted(false);
        btnCinco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });
        jPanel2.add(btnCinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 50, 50));

        btnCuatro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCuatro.setText("4");
        btnCuatro.setBorder(new javax.swing.border.MatteBorder(null));
        btnCuatro.setFocusPainted(false);
        btnCuatro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });
        jPanel2.add(btnCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 50, 50));

        btnSuma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSuma.setText("+");
        btnSuma.setBorder(new javax.swing.border.MatteBorder(null));
        btnSuma.setFocusPainted(false);
        btnSuma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        jPanel2.add(btnSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 50, 50));

        btnTres.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTres.setText("3");
        btnTres.setBorder(new javax.swing.border.MatteBorder(null));
        btnTres.setFocusPainted(false);
        btnTres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });
        jPanel2.add(btnTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 50, 50));

        btnDos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDos.setText("2");
        btnDos.setBorder(new javax.swing.border.MatteBorder(null));
        btnDos.setFocusPainted(false);
        btnDos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });
        jPanel2.add(btnDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 50, 50));

        btnUno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUno.setText("1");
        btnUno.setBorder(new javax.swing.border.MatteBorder(null));
        btnUno.setFocusPainted(false);
        btnUno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });
        jPanel2.add(btnUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 50, 50));

        btnIgual.setBackground(new java.awt.Color(255, 204, 102));
        btnIgual.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnIgual.setText("=");
        btnIgual.setBorder(null);
        btnIgual.setFocusPainted(false);
        btnIgual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        jPanel2.add(btnIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 110, 50));

        btnPunto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPunto.setText(".");
        btnPunto.setBorder(new javax.swing.border.MatteBorder(null));
        btnPunto.setFocusPainted(false);
        btnPunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });
        jPanel2.add(btnPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 50, 50));

        btnCero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCero.setText("0");
        btnCero.setBorder(new javax.swing.border.MatteBorder(null));
        btnCero.setFocusPainted(false);
        btnCero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeroActionPerformed(evt);
            }
        });
        jPanel2.add(btnCero, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 340, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        // TODO add your handling code here:
        txtOperacion.setText("");
        txtResultado.setText("");
    }//GEN-LAST:event_btnCActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
        // TODO add your handling code here:
        addNumber("7");
    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed
        // TODO add your handling code here:
        addNumber("8");
    }//GEN-LAST:event_btnOchoActionPerformed

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed
        // TODO add your handling code here:
        addNumber("9");
    }//GEN-LAST:event_btnNueveActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
        // TODO add your handling code here:
        addNumber("4");
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        // TODO add your handling code here:
        addNumber("5");
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        // TODO add your handling code here:
        addNumber("6");
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
        // TODO add your handling code here:
        addNumber("1");
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
        // TODO add your handling code here:
        addNumber("2");
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        // TODO add your handling code here:
        addNumber("3");
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeroActionPerformed
        // TODO add your handling code here:
        addNumber("0");
    }//GEN-LAST:event_btnCeroActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        // TODO add your handling code here:
        addNumber("/");
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnPorceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorceActionPerformed
        // TODO add your handling code here:
        addNumber("%");
    }//GEN-LAST:event_btnPorceActionPerformed

    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiActionPerformed
       addNumber("*");
    }//GEN-LAST:event_btnMultiActionPerformed

    private void btnPosNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosNegActionPerformed
        String texto = txtOperacion.getText().substring(0,txtOperacion.getText().length()-1);
        txtOperacion.setText(texto);
    }//GEN-LAST:event_btnPosNegActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        // TODO add your handling code here:
        addNumber("-");
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        // TODO add your handling code here:
        addNumber("+");
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        // TODO add your handling code here:
        addNumber(".");
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
         try{
             String resultado = se.eval(txtOperacion.getText()).toString();
             txtResultado.setText(resultado);
         }catch(Exception e){
             txtOperacion.setText("Error");
             
         }
             
    }//GEN-LAST:event_btnIgualActionPerformed

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
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadora().setVisible(true);
            }
        });
    }
    
    public void addNumber(String digito){
        txtOperacion.setText(txtOperacion.getText()+digito);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnPorce;
    private javax.swing.JButton btnPosNeg;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnSuma;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
