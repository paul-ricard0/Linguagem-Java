package teste_treino.exp_layout;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Swing_Layout {

    public static JButton createButton(String label, ActionListener al) {
        JButton button = new JButton(label);
        button.addActionListener(al);

        return button;
    }

}
