package atividades.uni02;

import javax.swing.JOptionPane;

/**
 * Problema
 * 
 * Entrada; n�mero inteiro N digitado pelo usu�rio
 * S�ida: informar TODOS os divisores de N na tela
 * 
 * Ex: n = 6
 * 
 * Divisores: 1, 2, 3
 * 
 * @author paulo
 *
 */


public class Exer02Divisores {

	public static void main(String[] args) {
		
		// Delcara��o de vari�veis
		int resultado = 0;
		
		
		// Entrada
		int n = Integer.parseInt(      										//Declaro a v�riavel 
				JOptionPane.showInputDialog("Digite um n�mero inteiro: ")   // Caixa pedinmdo para digitar o n�mero
		);
		
		
		// Processamento
		for(int div = 1; div <= n; div++) {			
			if(n % div == 0) {
				resultado++;
			}
		}
		
		
		// Sa�da
		JOptionPane.showMessageDialog(null, "O n�meor � divis�vel por: " + resultado);
		
		
	}

}

