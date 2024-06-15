/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.event.ActionEvent;
import model.lancamentos.Lancamentos;

public class ConsultarMovimentacao extends javax.swing.JFrame {

    
    public ConsultarMovimentacao() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ftfDataInicialConsulta = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        ftfDataFinalConsulta = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        rbConsultaEntradas = new javax.swing.JRadioButton();
        rbConsultaSaidas = new javax.swing.JRadioButton();
        rbConsultaExtrato = new javax.swing.JRadioButton();
        jbOK = new javax.swing.JButton();
        jbVoltarConsulta = new javax.swing.JButton();
        jbSairConsulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Consultar Movimentação");

        jLabel2.setText("Periodo da consulta: ");

        jLabel3.setText("Data Inicial: ");

        ftfDataInicialConsulta.setText("__/__/____");
        ftfDataInicialConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftfDataInicialConsultaActionPerformed(evt);
            }
        });

        jLabel4.setText("Data Final:");

        ftfDataFinalConsulta.setText("__/__/____");
        ftfDataFinalConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftfDataFinalConsultaActionPerformed(evt);
            }
        });

        jLabel5.setText("Tipo de Consulta: ");

        rbConsultaEntradas.setText("Entradas");
        rbConsultaEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbConsultaEntradasActionPerformed(evt);
            }
        });

        rbConsultaSaidas.setText("Saidas");

        rbConsultaExtrato.setText("ExtratoDetalhado");

        jbOK.setText("OK");
        jbOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOKActionPerformed(evt);
            }
        });

        jbVoltarConsulta.setText("VOLTAR");
        jbVoltarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarConsultaActionPerformed(evt);
            }
        });

        jbSairConsulta.setText("SAIR");
        jbSairConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbConsultaEntradas)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbConsultaSaidas)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbConsultaExtrato)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(ftfDataInicialConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ftfDataFinalConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jbOK)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbVoltarConsulta)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jbSairConsulta)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ftfDataInicialConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(ftfDataFinalConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbConsultaEntradas)
                    .addComponent(rbConsultaSaidas)
                    .addComponent(rbConsultaExtrato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbVoltarConsulta)
                    .addComponent(jbSairConsulta)
                    .addComponent(jbOK))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ftfDataInicialConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftfDataInicialConsultaActionPerformed
        addDataInicialConsulta(evt);
    }//GEN-LAST:event_ftfDataInicialConsultaActionPerformed

    private void ftfDataFinalConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftfDataFinalConsultaActionPerformed
          addDataFinalConsulta(evt);
    }//GEN-LAST:event_ftfDataFinalConsultaActionPerformed

    private void rbConsultaEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbConsultaEntradasActionPerformed
       consultarEntradas(evt);
    }//GEN-LAST:event_rbConsultaEntradasActionPerformed

    private void jbOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOKActionPerformed
        okLiberarResultado(evt);
    }//GEN-LAST:event_jbOKActionPerformed

    private void jbVoltarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarConsultaActionPerformed
        backControleFinanceiro(evt);
    }//GEN-LAST:event_jbVoltarConsultaActionPerformed

    private void jbSairConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairConsultaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbSairConsultaActionPerformed

    
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
            java.util.logging.Logger.getLogger(ConsultarMovimentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarMovimentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarMovimentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarMovimentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarMovimentacao().setVisible(true);
            }
        });
    } 
    
    private void addDataInicialConsulta(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    } 
    
    private void addDataFinalConsulta(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private void consultarEntradas(ActionEvent evt) {
                
           if(rbConsultaEntradas.isSelected()){
               for(Lancamentos lancamento : receita ){
                   System.out.println("Resultado Receitas");
               }               
               
           }
    }
    
    private void okLiberarResultado(ActionEvent evt) {
        System.out.println("Relatório: ");
    } 
    
    private void backControleFinanceiro(ActionEvent evt) {
            ControleFinanceiro cont = new ControleFinanceiro();
        cont.setVisible(true);   
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField ftfDataFinalConsulta;
    private javax.swing.JFormattedTextField ftfDataInicialConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbOK;
    private javax.swing.JButton jbSairConsulta;
    private javax.swing.JButton jbVoltarConsulta;
    private javax.swing.JRadioButton rbConsultaEntradas;
    private javax.swing.JRadioButton rbConsultaExtrato;
    private javax.swing.JRadioButton rbConsultaSaidas;
    // End of variables declaration//GEN-END:variables

    

   
    

    

   

  
}
