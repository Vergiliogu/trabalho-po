package view;

import javax.swing.*;
import java.awt.event.*;

public class Navigation extends JPanel {
    private JFrame parentFrame;

    public Navigation(JFrame parentFrame, JPanel mainPanel, JPanel addMovimentacao, JPanel consultarMovimentacao) {
        this.parentFrame = parentFrame;
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

        setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 10));
    
        add(btnPanel1);
        add(btnPanel2);
        add(new JSeparator());
    }

    private void switchPanel(JPanel mainPanel, JPanel newPanel) {
        mainPanel.removeAll();
        mainPanel.add(newPanel);
        mainPanel.revalidate();
        mainPanel.repaint();
        parentFrame.pack();
    }
}
