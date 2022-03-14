package atividades.uni01;

import javax.swing.JOptionPane;

/**		
 * Problema
 * 
 * Entrada: um número inteiro digitado pelo usuário
 * Saída: informar se o número é impar ou par 
 *
 */

public class Exer01ParOuImpar {
	public static void main(String[] args) {

		// Delcaração de variáveis
		int n, r;
		boolean ehPar = false; //Assumindo que o número é impar
		
		
		// Entrada
		String valor  = JOptionPane.showInputDialog("Digite um número inteiro");
		
		n = Integer.parseInt(valor); // Transformando de String para inteiro 
		
		
		// Processamento
		r = n % 2; // Caulculando o Resto da divisão  
		
		if(r == 0) { // Se o resto for igual a zero
			ehPar = true;
		}
		
		
		// Saída
		JOptionPane.showMessageDialog(null, "O número é " + (ehPar?"PAR":"IMPAR"));
		
		
		
	}

}

