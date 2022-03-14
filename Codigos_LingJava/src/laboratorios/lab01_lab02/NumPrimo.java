package laboratorios.lab01_lab02;

import javax.swing.JOptionPane;


/**
 * Descobrindo se o número é PRIMO
 * 
 * @author Paulo Ricardo
 * Data: 03/09/2021
 * Bibliboteca Tools
 * 
 */

public class NumPrimo {
	
	public static void main(String[] args) {
		
		int num = Tools.inputInt("Entre com um número inteiro? ");
		
		if (Tools.numPrimo(num)) {
			JOptionPane.showMessageDialog(null, num + " é um número PRIMO");
		}
		else {
			JOptionPane.showMessageDialog(null, num + " NÃO é primo");
		}
		
	}

}
