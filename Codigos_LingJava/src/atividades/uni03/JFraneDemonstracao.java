package atividades.uni03;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class JFraneDemonstracao {

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("FrameDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel emptyLabel = new JLabel("Olä");
        
        emptyLabel.setPreferredSize(new Dimension(175, 100));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

        JButton botao = new JButton("Clicar");
        frame.getContentPane().add(botao, BorderLayout.SOUTH);
        
        JTextField texto = new JTextField(30);
        frame.getContentPane().add(texto, BorderLayout.WEST);
        
        frame.pack();
        frame.setVisible(true);
    }

    // A CLASSE MAIN Ö ESSA AQUI!!!!!!!
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}


