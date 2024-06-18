package view;

import javax.swing.*;
import java.awt.*;
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

        // setLayout(new CustomFlowLayout());
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    
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

    // class CustomFlowLayout implements LayoutManager {

    //     @Override
    //     public void addLayoutComponent(String name, Component comp) {
    //     }

    //     @Override
    //     public void removeLayoutComponent(Component comp) {
    //     }

    //     @Override
    //     public Dimension preferredLayoutSize(Container parent) {
    //         return calculateSize(parent);
    //     }

    //     @Override
    //     public Dimension minimumLayoutSize(Container parent) {
    //         return calculateSize(parent);
    //     }

    //     @Override
    //     public void layoutContainer(Container parent) {
    //         Insets insets = parent.getInsets();
    //         int maxWidth = parent.getWidth() - (insets.left + insets.right);
    //         int x = insets.left;
    //         int y = insets.top;
    //         int rowHeight = 0;

    //         for (Component comp : parent.getComponents()) {
    //             Dimension preferredSize = comp.getPreferredSize();
    //             if (x + preferredSize.width > maxWidth) {
    //                 x = insets.left;
    //                 y += rowHeight;
    //                 rowHeight = 0;
    //             }
    //             comp.setBounds(x, y, preferredSize.width, preferredSize.height);
    //             x += preferredSize.width;
    //             rowHeight = Math.max(rowHeight, preferredSize.height);
    //         }
    //     }

    //     private Dimension calculateSize(Container parent) {
    //         int width = 0;
    //         int height = 0;
    //         for (Component comp : parent.getComponents()) {
    //             Dimension preferredSize = comp.getPreferredSize();
    //             width = Math.max(width, preferredSize.width);
    //             height += preferredSize.height;
    //         }
    //         Insets insets = parent.getInsets();
    //         width += insets.left + insets.right;
    //         height += insets.top + insets.bottom;
    //         return new Dimension(width, height);
    //     }
    // }
}
