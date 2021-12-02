package atividades.uni03;

import javax.swing.JOptionPane;

/**
 * Problema
 * Entrada: Ler do usuário uma frase 
 * Saída: Exibir a frase invertida
 * 
 * Obs:implementar com tratamento de erro de entrada
 * 
 * @author paulo
 *
 */
public class Exer01FraseInvertida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String frase = Tools.inputString("Entre com um frase: ");
		
		String invertida = "";
		for(int i = frase.length() - 1; i >= 0; i--) {
			invertida = invertida + frase.charAt(i);
		}
		
		JOptionPane.showMessageDialog(null, invertida);
	}

}
