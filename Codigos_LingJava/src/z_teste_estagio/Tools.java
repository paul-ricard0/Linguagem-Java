package z_teste_estagio;

import javax.swing.JOptionPane;

public class Tools {
	
	public static Float nota (String num) {
		Float nota = Float.parseFloat( JOptionPane.showInputDialog("Digite a " + num + " nota do aluno; " ));
		return nota;
	}
	

	

}
