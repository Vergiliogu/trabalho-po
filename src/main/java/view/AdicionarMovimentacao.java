package view;

import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.lancamentos.Lancamentos;
import model.lancamentos.LancamentosDespesa;
import model.lancamentos.LancamentosReceita;

public class AdicionarMovimentacao extends JPanel {
    public AdicionarMovimentacao() {

        // jLabel1 = new javax.swing.JLabel();
        // jSeparator1 = new javax.swing.JSeparator();
        // tpMovimentacaoTitulo = new javax.swing.JLabel();
        // rbEntradaReceitas = new javax.swing.JRadioButton();
        // rbSaidaDespesas = new javax.swing.JRadioButton();
        // jbVoltarAddMovimentacao = new javax.swing.JButton();
        // SelecionarCatDespesa = new javax.swing.JLabel();
        // rbAlimentacao = new javax.swing.JRadioButton();
        // rbTransporte = new javax.swing.JRadioButton();
        // rbAluguel = new javax.swing.JRadioButton();
        // rbSaude = new javax.swing.JRadioButton();
        // rbEducacao = new javax.swing.JRadioButton();
        // rbEntretenimento = new javax.swing.JRadioButton();
        // SelecionarCatReceita = new javax.swing.JLabel();
        // rbSalario = new javax.swing.JRadioButton();
        // rbDecimoTerceiro = new javax.swing.JRadioButton();
        // rbFerias = new javax.swing.JRadioButton();
        // addBotao = new javax.swing.JButton();
        // tfValormovimentacao = new javax.swing.JTextField();
        // jLabel5 = new javax.swing.JLabel();
        // tfData = new javax.swing.JFormattedTextField();
        // jLabel6 = new javax.swing.JLabel();

        // setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // jLabel1.setText("Adicionar Movimentacao");

        // tpMovimentacaoTitulo.setText("Tipo da Movimentacao:");

        // rbEntradaReceitas.setText("Entrada de Receita");
        // rbEntradaReceitas.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         rbEntradaReceitasActionPerformed(evt);
        //     }
        // });

        // rbSaidaDespesas.setText("Saida de Despesas");
        // rbSaidaDespesas.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         rbSaidaDespesasActionPerformed(evt);
        //     }
        // });

        // jbVoltarAddMovimentacao.setText("VOLTAR");
        // jbVoltarAddMovimentacao.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         jbVoltarAddMovimentacaoActionPerformed(evt);
        //     }
        // });

        // SelecionarCatDespesa.setText("Selecione a categoria: ");

        // rbAlimentacao.setText("Alimentação");

        // rbTransporte.setText("Transporte");

        // rbAluguel.setText("Aluguel");

        // rbSaude.setText("Saude");

        // rbEducacao.setText("Educação");

        // rbEntretenimento.setText("Entretenimento");

        // SelecionarCatReceita.setText("Selecione a categoria: ");

        // rbSalario.setText("Salario");

        // rbDecimoTerceiro.setText("Décimo Terceiro");

        // rbFerias.setText("Férias");

        // addBotao.setText("ADICIONAR");
        // addBotao.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         addBotaoActionPerformed(evt);
        //     }
        // });

        // tfValormovimentacao.setText("R$______");
        // tfValormovimentacao.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         tfValormovimentacaoActionPerformed(evt);
        //     }
        // });

        // jLabel5.setText("Valor:");

        // tfData.setText("__/__/___");
        // tfData.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         tfDataActionPerformed(evt);
        //     }
        // });

        // jLabel6.setText("Data:");

        // javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        // getContentPane().setLayout(layout);
        // layout.setHorizontalGroup(
        //         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        //                 .addGroup(layout.createSequentialGroup()
        //                         .addContainerGap()
        //                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        //                                 .addComponent(jSeparator1)
        //                                 .addGroup(layout.createSequentialGroup()
        //                                         .addGap(6, 6, 6)
        //                                         .addGroup(layout
        //                                                 .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        //                                                 .addComponent(tpMovimentacaoTitulo)
        //                                                 .addGroup(layout.createSequentialGroup()
        //                                                         .addGap(6, 6, 6)
        //                                                         .addGroup(layout.createParallelGroup(
        //                                                                 javax.swing.GroupLayout.Alignment.LEADING)
        //                                                                 .addGroup(layout.createSequentialGroup()
        //                                                                         .addGroup(layout.createParallelGroup(
        //                                                                                 javax.swing.GroupLayout.Alignment.LEADING)
        //                                                                                 .addGroup(layout
        //                                                                                         .createSequentialGroup()
        //                                                                                         .addGroup(layout
        //                                                                                                 .createParallelGroup(
        //                                                                                                         javax.swing.GroupLayout.Alignment.LEADING)
        //                                                                                                 .addComponent(
        //                                                                                                         SelecionarCatReceita)
        //                                                                                                 .addComponent(
        //                                                                                                         rbSalario)
        //                                                                                                 .addComponent(
        //                                                                                                         rbDecimoTerceiro))
        //                                                                                         .addPreferredGap(
        //                                                                                                 javax.swing.LayoutStyle.ComponentPlacement.RELATED,
        //                                                                                                 javax.swing.GroupLayout.DEFAULT_SIZE,
        //                                                                                                 Short.MAX_VALUE))
        //                                                                                 .addGroup(
        //                                                                                         javax.swing.GroupLayout.Alignment.TRAILING,
        //                                                                                         layout.createSequentialGroup()
        //                                                                                                 .addComponent(
        //                                                                                                         rbEntradaReceitas)
        //                                                                                                 .addGap(152,
        //                                                                                                         152,
        //                                                                                                         152)))
        //                                                                         .addGroup(layout.createParallelGroup(
        //                                                                                 javax.swing.GroupLayout.Alignment.LEADING)
        //                                                                                 .addComponent(
        //                                                                                         SelecionarCatDespesa)
        //                                                                                 .addGroup(layout
        //                                                                                         .createSequentialGroup()
        //                                                                                         .addGroup(layout
        //                                                                                                 .createParallelGroup(
        //                                                                                                         javax.swing.GroupLayout.Alignment.LEADING)
        //                                                                                                 .addComponent(
        //                                                                                                         rbAlimentacao)
        //                                                                                                 .addComponent(
        //                                                                                                         rbSaude))
        //                                                                                         .addGap(18, 18, 18)
        //                                                                                         .addGroup(layout
        //                                                                                                 .createParallelGroup(
        //                                                                                                         javax.swing.GroupLayout.Alignment.LEADING)
        //                                                                                                 .addComponent(
        //                                                                                                         rbTransporte)
        //                                                                                                 .addComponent(
        //                                                                                                         rbEducacao))
        //                                                                                         .addGroup(layout
        //                                                                                                 .createParallelGroup(
        //                                                                                                         javax.swing.GroupLayout.Alignment.LEADING)
        //                                                                                                 .addGroup(layout
        //                                                                                                         .createSequentialGroup()
        //                                                                                                         .addGap(26,
        //                                                                                                                 26,
        //                                                                                                                 26)
        //                                                                                                         .addComponent(
        //                                                                                                                 rbAluguel))
        //                                                                                                 .addGroup(layout
        //                                                                                                         .createSequentialGroup()
        //                                                                                                         .addPreferredGap(
        //                                                                                                                 javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        //                                                                                                         .addComponent(
        //                                                                                                                 rbEntretenimento))))
        //                                                                                 .addComponent(rbSaidaDespesas))
        //                                                                         .addGap(93, 93, 93))
        //                                                                 .addGroup(layout.createSequentialGroup()
        //                                                                         .addGroup(layout.createParallelGroup(
        //                                                                                 javax.swing.GroupLayout.Alignment.LEADING)
        //                                                                                 .addGroup(layout
        //                                                                                         .createSequentialGroup()
        //                                                                                         .addComponent(jLabel5,
        //                                                                                                 javax.swing.GroupLayout.PREFERRED_SIZE,
        //                                                                                                 35,
        //                                                                                                 javax.swing.GroupLayout.PREFERRED_SIZE)
        //                                                                                         .addGap(18, 18, 18)
        //                                                                                         .addComponent(
        //                                                                                                 tfValormovimentacao,
        //                                                                                                 javax.swing.GroupLayout.PREFERRED_SIZE,
        //                                                                                                 javax.swing.GroupLayout.DEFAULT_SIZE,
        //                                                                                                 javax.swing.GroupLayout.PREFERRED_SIZE)
        //                                                                                         .addGap(18, 18, 18)
        //                                                                                         .addComponent(jLabel6,
        //                                                                                                 javax.swing.GroupLayout.PREFERRED_SIZE,
        //                                                                                                 35,
        //                                                                                                 javax.swing.GroupLayout.PREFERRED_SIZE)
        //                                                                                         .addGap(18, 18, 18)
        //                                                                                         .addComponent(tfData,
        //                                                                                                 javax.swing.GroupLayout.PREFERRED_SIZE,
        //                                                                                                 javax.swing.GroupLayout.DEFAULT_SIZE,
        //                                                                                                 javax.swing.GroupLayout.PREFERRED_SIZE))
        //                                                                                 .addComponent(rbFerias))
        //                                                                         .addPreferredGap(
        //                                                                                 javax.swing.LayoutStyle.ComponentPlacement.RELATED,
        //                                                                                 javax.swing.GroupLayout.DEFAULT_SIZE,
        //                                                                                 Short.MAX_VALUE)
        //                                                                         .addComponent(jbVoltarAddMovimentacao)
        //                                                                         .addGap(18, 18, 18)
        //                                                                         .addComponent(addBotao)
        //                                                                         .addGap(28, 28, 28)))))))
        //                         .addContainerGap())
        //                 .addGroup(layout.createSequentialGroup()
        //                         .addGap(267, 267, 267)
        //                         .addComponent(jLabel1)
        //                         .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        // layout.setVerticalGroup(
        //         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        //                 .addGroup(layout.createSequentialGroup()
        //                         .addContainerGap()
        //                         .addComponent(jLabel1)
        //                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        //                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
        //                                 .addGroup(layout.createSequentialGroup()
        //                                         .addGap(56, 56, 56)
        //                                         .addComponent(rbEntradaReceitas)
        //                                         .addGap(18, 18, 18)
        //                                         .addComponent(SelecionarCatReceita)
        //                                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        //                                         .addComponent(rbSalario)
        //                                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        //                                         .addComponent(rbDecimoTerceiro))
        //                                 .addGroup(layout.createSequentialGroup()
        //                                         .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
        //                                                 javax.swing.GroupLayout.PREFERRED_SIZE)
        //                                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        //                                         .addComponent(tpMovimentacaoTitulo)
        //                                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
        //                                                 javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        //                                         .addComponent(rbSaidaDespesas)
        //                                         .addGap(18, 18, 18)
        //                                         .addComponent(SelecionarCatDespesa)
        //                                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        //                                         .addGroup(layout
        //                                                 .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        //                                                 .addComponent(rbAlimentacao)
        //                                                 .addComponent(rbTransporte)
        //                                                 .addComponent(rbAluguel))
        //                                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        //                                         .addGroup(layout
        //                                                 .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        //                                                 .addComponent(rbSaude)
        //                                                 .addComponent(rbEducacao)
        //                                                 .addComponent(rbEntretenimento))))
        //                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
        //                                 .addGroup(layout.createSequentialGroup()
        //                                         .addGap(12, 12, 12)
        //                                         .addComponent(rbFerias)
        //                                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14,
        //                                                 Short.MAX_VALUE)
        //                                         .addGroup(layout
        //                                                 .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        //                                                 .addComponent(tfValormovimentacao,
        //                                                         javax.swing.GroupLayout.PREFERRED_SIZE,
        //                                                         javax.swing.GroupLayout.DEFAULT_SIZE,
        //                                                         javax.swing.GroupLayout.PREFERRED_SIZE)
        //                                                 .addComponent(jLabel5)
        //                                                 .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE,
        //                                                         javax.swing.GroupLayout.DEFAULT_SIZE,
        //                                                         javax.swing.GroupLayout.PREFERRED_SIZE)
        //                                                 .addComponent(jLabel6))
        //                                         .addGap(21, 21, 21))
        //                                 .addGroup(layout.createSequentialGroup()
        //                                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
        //                                                 javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        //                                         .addGroup(layout
        //                                                 .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        //                                                 .addComponent(jbVoltarAddMovimentacao)
        //                                                 .addComponent(addBotao))
        //                                         .addGap(18, 18, 18)))));

        // pack();
    }// </editor-fold>//GEN-END:initComponents

//     private void rbEntradaReceitasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rbEntradaReceitasActionPerformed
//         entradasInserir(evt);
//     }// GEN-LAST:event_rbEntradaReceitasActionPerformed

//     private void rbSaidaDespesasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rbSaidaDespesasActionPerformed
//         saidasInserir(evt);
//     }// GEN-LAST:event_rbSaidaDespesasActionPerformed

//     private void tfValormovimentacaoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tfValormovimentacaoActionPerformed
//         addValorMovimentacao(evt);
//     }// GEN-LAST:event_tfValormovimentacaoActionPerformed

//     private void tfDataActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tfDataActionPerformed
//         addDataMovimentacao(evt);
//     }// GEN-LAST:event_tfDataActionPerformed

//     private void jbVoltarAddMovimentacaoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbVoltarAddMovimentacaoActionPerformed
//         backControleFinanceiro(evt);
//     }// GEN-LAST:event_jbVoltarAddMovimentacaoActionPerformed

//     private void addBotaoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addBotaoActionPerformed
//         addToArray(evt);
//     }// GEN-LAST:event_addBotaoActionPerformed

//     public void setTfData(JFormattedTextField tfData) {
//         this.tfData = tfData;
//     }

//     public void setTfValormovimentacao(JTextField tfValormovimentacao) {
//         this.tfValormovimentacao = tfValormovimentacao;
//     }

//     public static void main(String args[]) {
//         /* Set the Nimbus look and feel */
//         // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
//         // (optional) ">
//         /*
//          * If Nimbus (introduced in Java SE 6) is not available, stay with the default
//          * look and feel.
//          * For details see
//          * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//          */
//         try {
//             for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                 if ("Nimbus".equals(info.getName())) {
//                     javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                     break;
//                 }
//             }
//         } catch (ClassNotFoundException ex) {
//             java.util.logging.Logger.getLogger(AdicionarMovimentacao.class.getName())
//                     .log(java.util.logging.Level.SEVERE, null, ex);
//         } catch (InstantiationException ex) {
//             java.util.logging.Logger.getLogger(AdicionarMovimentacao.class.getName())
//                     .log(java.util.logging.Level.SEVERE, null, ex);
//         } catch (IllegalAccessException ex) {
//             java.util.logging.Logger.getLogger(AdicionarMovimentacao.class.getName())
//                     .log(java.util.logging.Level.SEVERE, null, ex);
//         } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//             java.util.logging.Logger.getLogger(AdicionarMovimentacao.class.getName())
//                     .log(java.util.logging.Level.SEVERE, null, ex);
//         }
//         // </editor-fold>

//         /* Create and display the form */
//         java.awt.EventQueue.invokeLater(new Runnable() {
//             public void run() {
//                 new AdicionarMovimentacao().setVisible(true);
//             }
//         });
//     }

//     private void entradasInserir(ActionEvent evt) {
//         if (rbEntradaReceitas.isSelected() && rbSalario.isSelected()) {
//             if (rbEntradaReceitas.isSelected() && rbDecimoTerceiro.isSelected()) {
//                 if (rbEntradaReceitas.isSelected() && rbFerias.isSelected()) {

//                 }
//             }
//         } else if (rbEntradaReceitas.isSelected() && rbSaidaDespesas.isSelected()) {
//             throw new IllegalArgumentException("Selecione apenas um tipo de movimentação");

//         }
//     }

//     private void saidasInserir(ActionEvent evt) {
//         if (rbSaidaDespesas.isSelected() && rbAlimentacao.isSelected())
//             if (rbSaidaDespesas.isSelected() && rbAluguel.isSelected()) {
//                 if (rbSaidaDespesas.isSelected() && rbEducacao.isSelected()) {
//                     if (rbSaidaDespesas.isSelected() && rbSaude.isSelected()) {
//                         if (rbSaidaDespesas.isSelected() && rbEntretenimento.isSelected()) {
//                             if (rbSaidaDespesas.isSelected() && rbTransporte.isSelected()) {
//                                 LancamentosDespesa lanca = new LancamentosDespesa();
//                                 lanca.getAll();
//                             }
//                         }
//                     }
//                 }
//             }
//     }

//     // adiciona o valor da movimentacao
//     private void addValorMovimentacao(JTextField evt) {
//         if (rbEntradaReceitas.isSelected() || rbSaidaDespesas.isSelected()) {
//             AdicionarMovimentacao valor = new AdicionarMovimentacao();
//             valor.setTfValormovimentacao(0); // não sei porque não está reconhecendo
//         }
//     }

//     // adiciona a data que está sendo realizada a movimentação
//     // Não sei como faz isso
//     private void addDataMovimentacao(ActionEvent evt) {

//     }

//     private void backControleFinanceiro(ActionEvent evt) {
//         Navigation cont = new Navigation();
//         cont.setVisible(true);
//     }

//     // fazer os dados adicionarem dentro do arquivo CSV já exitente.
//     private void addToArray(ActionEvent evt) {

//     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SelecionarCatDespesa;
    private javax.swing.JLabel SelecionarCatReceita;
    private javax.swing.JButton addBotao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbVoltarAddMovimentacao;
    private javax.swing.JRadioButton rbAlimentacao;
    private javax.swing.JRadioButton rbAluguel;
    private javax.swing.JRadioButton rbDecimoTerceiro;
    private javax.swing.JRadioButton rbEducacao;
    private javax.swing.JRadioButton rbEntradaReceitas;
    private javax.swing.JRadioButton rbEntretenimento;
    private javax.swing.JRadioButton rbFerias;
    private javax.swing.JRadioButton rbSaidaDespesas;
    private javax.swing.JRadioButton rbSalario;
    private javax.swing.JRadioButton rbSaude;
    private javax.swing.JRadioButton rbTransporte;
    private javax.swing.JFormattedTextField tfData;
    private javax.swing.JTextField tfValormovimentacao;
    private javax.swing.JLabel tpMovimentacaoTitulo;
    // End of variables declaration//GEN-END:variables

}
