package view;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AppFrame extends javax.swing.JFrame {
    public AppFrame() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Controle de Finanças");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel addMovimentacao = new AdicionarMovimentacao();
        JPanel consultarMovimentacao = new Extrato();
        JPanel navigation = new Navigation(
                mainPanel,
                addMovimentacao,
                consultarMovimentacao);

        mainPanel.add(consultarMovimentacao, BorderLayout.CENTER);
        getContentPane().add(navigation, BorderLayout.NORTH);
        getContentPane().add(mainPanel, BorderLayout.CENTER);

        pack();
    }

    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppFrame().setVisible(true);
            }
        });
    }
}
