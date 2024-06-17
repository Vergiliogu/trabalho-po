package view;

import javax.swing.*;
import java.awt.event.*;

public class Navigation extends JPanel {

    public Navigation(JPanel mainPanel, JPanel addMovimentacao, JPanel consultarMovimentacao) {
        JButton btnPanel1 = new JButton("Adicionar Movimentação");
        JButton btnPanel2 = new JButton("Consultar Movimentação");

        btnPanel1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPanel(mainPanel, addMovimentacao);
            }
        });

        btnPanel2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPanel(mainPanel, consultarMovimentacao);
            }
        });

        add(btnPanel1);
        add(btnPanel2);
    }

    private void switchPanel(JPanel mainPanel, JPanel newPanel) {
        mainPanel.removeAll();
        mainPanel.add(newPanel);
        mainPanel.revalidate();
        mainPanel.repaint();
    }
}
