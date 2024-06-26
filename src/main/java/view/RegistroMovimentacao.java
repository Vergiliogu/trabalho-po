/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import model.enums.CategoriasReceitas;
import model.enums.CategoriasDespesas;
import model.lancamentos.LancamentosDespesa;
import model.lancamentos.LancamentosReceita;

import java.awt.event.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import javax.swing.JLabel;

public class RegistroMovimentacao extends javax.swing.JPanel {

    private LancamentosReceita lancamentosReceita = new LancamentosReceita();
    private LancamentosDespesa lancamentosDespesa = new LancamentosDespesa();

    /**
     * Creates new form RegistroMovimentacao
     */
    public RegistroMovimentacao() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        chooseCategorias = new java.awt.Choice();
        jLabel2 = new javax.swing.JLabel();
        jRadioEntradas = new javax.swing.JRadioButton();
        jRadioSaidas = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        successLabel = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setPreferredSize(null);

        jLabel1.setText("Tipo de movimentação:");

        jLabel2.setText("Categoria:");

        buttonGroup1.add(jRadioEntradas);
        jRadioEntradas.setText("Entrada");
        jRadioEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioEntradasActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioSaidas);
        jRadioSaidas.setText("Saída");
        jRadioSaidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioSaidasActionPerformed(evt);
            }
        });

        jLabel3.setText("Valor (R$):");

        jTextField2.setText("0");
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jLabel4.setText("Data");

        jDateChooser1.setDateFormatString("dd/MM/yyyy");

        jButton1.setText("Adicionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        successLabel.setText("Inserido com sucesso!");
        successLabel.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2)
                                        .addComponent(chooseCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, 141,
                                                Short.MAX_VALUE)
                                        .addComponent(jRadioEntradas)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jRadioSaidas))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131,
                                        Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 141,
                                                Short.MAX_VALUE)
                                        .addComponent(jLabel3)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 137,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 206,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(160, 160, 160))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(197, 197, 197)
                                .addComponent(successLabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jRadioEntradas)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jRadioSaidas))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(14, 14, 14)
                                                .addComponent(chooseCategorias, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36,
                                        Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(successLabel)
                                .addGap(10, 10, 10)));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jTextField2KeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == '.' || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }// GEN-LAST:event_jTextField2KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        String rawValor = jTextField2.getText();
        Date rawData = jDateChooser1.getDate();
        String categoria = chooseCategorias.getSelectedItem();

        String error = null;

        if (rawData == null) {
            error = "O campo de 'Data' deve ser preenchido.";
        } else if (categoria == null) {
            error = "O campo de 'Categoria' deve ter uma opção selecionada.";
        } else if (rawValor.isEmpty()) {
            error = "O campo de 'Valor' deve ser preenchido.";
        }

        int count = 0;
        for (int i = 0; i < rawValor.length(); i++) {
            if (rawValor.charAt(i) == '.') {
                count++;
                if (count > 1) {
                    error = "O campo de 'Valor' não deve conter mais de um ponto de separação.";
                    break;
                }
            }
        }

        if (error != null) {
            JLabel label = new JLabel(error);
            label.setFont(new java.awt.Font("Dialog", 0, 12));
            javax.swing.JOptionPane.showMessageDialog(this, label);
            return;
        }

        double valor = Double.parseDouble(rawValor);
        LocalDate data = rawData.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        if (jRadioEntradas.isSelected()) {
            lancamentosReceita.cadastrar(CategoriasReceitas.valueOf(categoria), valor, data);
        } else {
            lancamentosDespesa.cadastrar(CategoriasDespesas.valueOf(categoria), valor, data);
        }

        successLabel.setVisible(true);
        buttonGroup1.clearSelection();
        chooseCategorias.removeAll();
        jTextField2.setText("0");
        jDateChooser1.setDate(null);
    }// GEN-LAST:event_jButton1ActionPerformeded

    private void jRadioEntradasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jRadioEntradasActionPerformed
        chooseCategorias.removeAll();
        for (CategoriasReceitas categoria : CategoriasReceitas.values()) {
            chooseCategorias.add(categoria.toString());
        }
    }// GEN-LAST:event_jRadioEntradasActionPerformed

    private void jRadioSaidasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jRadioButton2ActionPerformed
        chooseCategorias.removeAll();
        for (CategoriasDespesas categoria : CategoriasDespesas.values()) {
            chooseCategorias.add(categoria.toString());
        }
    }// GEN-LAST:event_jRadioButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private java.awt.Choice chooseCategorias;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioEntradas;
    private javax.swing.JRadioButton jRadioSaidas;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel successLabel;
    // End of variables declaration//GEN-END:variables
}
