package provas.av2.exer03;

import javax.swing.JOptionPane;

public class ExcepNaoNumero extends Exception {
	
	public ExcepNaoNumero(String num) {
		super("Isso n�o � n�mero: " + num);
	}
}

