package atividades.uni02;

import javax.swing.JOptionPane;

/**
 * Problema
 * 
 * Entrada; número inteiro N digitado pelo usuário
 * Sáida: informar TODOS os divisores de N na tela
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
		
		// Delcaração de variáveis
		int resultado = 0;
		
		
		// Entrada
		int n = Integer.parseInt(      										//Declaro a váriavel 
				JOptionPane.showInputDialog("Digite um número inteiro: ")   // Caixa pedinmdo para digitar o número
		);
		
		
		// Processamento
		for(int div = 1; div <= n; div++) {			
			if(n % div == 0) {
				resultado++;
			}
		}
		
		
		// Saída
		JOptionPane.showMessageDialog(null, "O númeor é divisível por: " + resultado);
		
		
	}

}

