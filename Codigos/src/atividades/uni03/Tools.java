package atividades.uni03;

import javax.swing.JOptionPane;

public class Tools {
	
	// Ler String
	public static String inputString (String pedidoString) {
		
		return JOptionPane.showInputDialog(pedidoString);
	}
	
	// Ler Inteiro
	public static int inputInt (String pedidoInt) {
		
		return Integer.parseInt(   JOptionPane.showInputDialog(pedidoInt)	);
	}
	
	
}

