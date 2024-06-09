
package view;

public class ControleFinanceiro extends javax.swing.JFrame {

    public ControleFinanceiro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloControleFinanceiro = new javax.swing.JLabel();
        separadorLayout = new javax.swing.JSeparator();
        rbAddMovimentacao = new javax.swing.JRadioButton();
        rbConsultarMovimentacao = new javax.swing.JRadioButton();
        jbSair = new javax.swing.JButton();
        jbProximoControleFinanceiro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloControleFinanceiro.setText("Controle Financeiro");

        rbAddMovimentacao.setText("Adicionar Movimentação");
        rbAddMovimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAddMovimentacaoActionPerformed(evt);
            }
        });

        rbConsultarMovimentacao.setText("Consultar Movimentação");
        rbConsultarMovimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbConsultarMovimentacaoActionPerformed(evt);
            }
        });

        jbSair.setText("SAIR");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        jbProximoControleFinanceiro.setText("PRÓXIMO");
        jbProximoControleFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProximoControleFinanceiroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separadorLayout, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbProximoControleFinanceiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbAddMovimentacao)
                            .addComponent(rbConsultarMovimentacao))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 92, Short.MAX_VALUE)
                .addComponent(tituloControleFinanceiro)
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloControleFinanceiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separadorLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbAddMovimentacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbConsultarMovimentacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSair)
                    .addComponent(jbProximoControleFinanceiro))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // botão adicionar movimentação acionado
    private void rbAddMovimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAddMovimentacaoActionPerformed
        
    }//GEN-LAST:event_rbAddMovimentacaoActionPerformed
    // botão consultar movimentação selecionado
    
    private void rbConsultarMovimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbConsultarMovimentacaoActionPerformed
        
    }//GEN-LAST:event_rbConsultarMovimentacaoActionPerformed
    // botão sair acionado
    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        
    }//GEN-LAST:event_jbSairActionPerformed
    // botão próximo acionado
    private void jbProximoControleFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProximoControleFinanceiroActionPerformed
      
    }//GEN-LAST:event_jbProximoControleFinanceiroActionPerformed

    
    
  
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
            java.util.logging.Logger.getLogger(ControleFinanceiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControleFinanceiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControleFinanceiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControleFinanceiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControleFinanceiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbProximoControleFinanceiro;
    private javax.swing.JButton jbSair;
    private javax.swing.JRadioButton rbAddMovimentacao;
    private javax.swing.JRadioButton rbConsultarMovimentacao;
    private javax.swing.JSeparator separadorLayout;
    private javax.swing.JLabel tituloControleFinanceiro;
    // End of variables declaration//GEN-END:variables
}
