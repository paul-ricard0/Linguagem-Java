package atividades.uni01;

import javax.swing.JOptionPane;

/**		
 * Problema
 * 
 * Entrada: um n�mero inteiro digitado pelo usu�rio
 * Sa�da: informar se o n�mero � impar ou par 
 *
 */

public class Exer01ParOuImpar {
	public static void main(String[] args) {

		// Delcara��o de vari�veis
		int n, r;
		boolean ehPar = false; //Assumindo que o n�mero � impar
		
		
		// Entrada
		String valor  = JOptionPane.showInputDialog("Digite um n�mero inteiro");
		
		n = Integer.parseInt(valor); // Transformando de String para inteiro 
		
		
		// Processamento
		r = n % 2; // Caulculando o Resto da divis�o  
		
		if(r == 0) { // Se o resto for igual a zero
			ehPar = true;
		}
		
		
		// Sa�da
		JOptionPane.showMessageDialog(null, "O n�mero � " + (ehPar?"PAR":"IMPAR"));
		
		
		
	}

}

