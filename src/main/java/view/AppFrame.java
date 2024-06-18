package view;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AppFrame extends javax.swing.JFrame {
    private RegistroMovimentacao registroMovimentacao;
    private Extrato extrato;
    private Navigation navigation;

    public AppFrame() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Controle de Finanças");
        setPreferredSize(new Dimension(545, 350));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());

        registroMovimentacao = new RegistroMovimentacao();
        extrato = new Extrato();
        navigation = new Navigation(
                this,
                mainPanel,
                registroMovimentacao,
                extrato);

        mainPanel.add(extrato, BorderLayout.CENTER);
        getContentPane().add(navigation, BorderLayout.NORTH);
        getContentPane().add(mainPanel, BorderLayout.CENTER);

        pack();
    }
}
