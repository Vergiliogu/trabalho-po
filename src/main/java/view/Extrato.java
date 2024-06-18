/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

import model.lancamentos.Lancamentos;
import model.lancamentos.LancamentosDespesa;
import model.lancamentos.LancamentosReceita;

public class Extrato extends javax.swing.JPanel {

    private Lancamentos lancamentos = new Lancamentos();
    private LancamentosReceita lancamentosReceita = new LancamentosReceita();
    private LancamentosDespesa lancamentosDespesa = new LancamentosDespesa();
    private DefaultTableModel tableModel = new javax.swing.table.DefaultTableModel(
            new Object[][] {},
            new String[] {
                    "Valor", "Categoria", "Data"
            });

    /**
     * Creates new form AddLayout
     */
    public Extrato() {
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        consultaGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRadioEntradas = new javax.swing.JRadioButton();
        jRadioSaidas = new javax.swing.JRadioButton();
        jRadioExtratoCompleto = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelSaldoTitle = new javax.swing.JLabel();
        jLabelSaldoPeriodo = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setPreferredSize(null);

        jLabel1.setText("Período da consulta");

        jLabel2.setText("Data inicial:");

        jLabel3.setText("Data final:");

        jLabel4.setText("Tipo de consulta:");

        consultaGroup.add(jRadioEntradas);
        jRadioEntradas.setText("Entradas");

        consultaGroup.add(jRadioSaidas);
        jRadioSaidas.setText("Saídas");

        consultaGroup.add(jRadioExtratoCompleto);
        jRadioExtratoCompleto.setSelected(true);
        jRadioExtratoCompleto.setText("Extrato completo");

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("dd/MM/yy");

        jDateChooser2.setDateFormatString("dd/MM/yy");

        jTable1.setModel(tableModel);
        jScrollPane2.setViewportView(jTable1);

        jLabelSaldoTitle.setText("Saldo do período:");

        jLabelSaldoPeriodo.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jRadioEntradas)
                    .addComponent(jRadioSaidas)
                    .addComponent(jRadioExtratoCompleto)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelSaldoTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSaldoPeriodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelSaldoTitle)
                    .addComponent(jLabelSaldoPeriodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioExtratoCompleto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioEntradas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioSaidas)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        tableModel.setRowCount(0);

        Date dataInicial = jDateChooser1.getDate();
        Date dataFinal = jDateChooser2.getDate();

        String error = null;
        Boolean areBothDatesFilled = dataInicial != null && dataFinal != null;
        Boolean areBothDatesFilledOrNull = (dataInicial != null && dataFinal != null)
                || (dataInicial == null && dataFinal == null);

        if (!areBothDatesFilledOrNull) {
            error = "Nenhuma ou ambas das datas devem ser preenchidas.";
        } else if (dataInicial != null && dataInicial.after(dataFinal)) {
            error = "Data inicial não pode ser maior que a data final.";
        }

        if (error != null) {
            JLabel label = new JLabel(error);
            label.setFont(new java.awt.Font("Dialog", 0, 10));
            javax.swing.JOptionPane.showMessageDialog(this, label);
            return;
        }

        LocalDate formatedDataInicial = null;
        LocalDate formatedDataFinal = null;

        if (areBothDatesFilled) {
            formatedDataInicial = dataInicial.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            formatedDataFinal = dataFinal.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        }

        ArrayList<Map<String, String>> foundLancamentos = new ArrayList<>();

        if (jRadioEntradas.isSelected()) {
            foundLancamentos = formatedDataInicial == null && formatedDataFinal == null
                    ? lancamentosReceita.getAll()
                    : lancamentosReceita.getPorPeriodo(formatedDataInicial, formatedDataFinal);
        } else if (jRadioSaidas.isSelected()) {
            foundLancamentos = formatedDataInicial == null && formatedDataFinal == null
                    ? lancamentosDespesa.getAll()
                    : lancamentosDespesa.getPorPeriodo(formatedDataInicial, formatedDataFinal);
        } else if (jRadioExtratoCompleto.isSelected()) {
            foundLancamentos = formatedDataInicial == null && formatedDataFinal == null
                    ? lancamentos.getAll()
                    : lancamentos.getPorPeriodo(formatedDataInicial, formatedDataFinal);
        }

        foundLancamentos.sort((lancamento1, lancamento2) -> {
            LocalDate data1 = LocalDate.parse(lancamento1.get("data"));
            LocalDate data2 = LocalDate.parse(lancamento2.get("data"));
            return data2.compareTo(data1);
        });

        double saldoPeriodo = 0;

        for (Map<String, String> lancamento: foundLancamentos) {
            saldoPeriodo += Double.parseDouble(lancamento.get("valor"));

            tableModel.addRow(new Object[] {
                    lancamento.get("valor"),
                    lancamento.get("categoria"),
                    LocalDate.parse(lancamento.get("data"))
                            .format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
            });
        }

        jLabelSaldoPeriodo.setText(String.valueOf(saldoPeriodo));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup consultaGroup;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelSaldoPeriodo;
    private javax.swing.JLabel jLabelSaldoTitle;
    private javax.swing.JRadioButton jRadioEntradas;
    private javax.swing.JRadioButton jRadioExtratoCompleto;
    private javax.swing.JRadioButton jRadioSaidas;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
