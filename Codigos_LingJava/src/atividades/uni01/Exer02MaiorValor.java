package atividades.uni01;

import javax.swing.JOptionPane;

/**
 *Problema  
 * 
 *Entrada: Três números inteiros digitados pelo usuário(x, y,z)
 *Saída: Informar qual é o maior valor dos números digitados
 *
 */

public class Exer02MaiorValor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaração de variáveis
		int maior = 0;
		
		
		// Processamento
		
		/**  ---- FORMA COMO EU FIZ ----
		int x = Integer.parseInt(
			JOptionPane.showInputDialog("Entre com o primeiro número")
		);

		int y = Integer.parseInt(
			JOptionPane.showInputDialog("Entre com o primeiro número")
		);

		int z = Integer.parseInt(
			JOptionPane.showInputDialog("Entre com o primeiro número")
		);

		maior = x;
		if(y > maior){
			maior =y;
		}
		if (z > maior){
			maior = z;
		}

		*/
		
		
		//Forma como professor fez
		int x= lerNumeroInteiro();
		int y= lerNumeroInteiro();
		int z= lerNumeroInteiro();
		
		maior = x;
		if(y > maior){
			maior =y;
		}
		if (z > maior){
			maior = z;
		}
		
		
		//Saída
		JOptionPane.showMessageDialog(null, "O maior número é: " + maior);
		
		
		
		
	}

	static int lerNumeroInteiro() {
		return Integer.parseInt(
		JOptionPane.showInputDialog("Digite um número inteiro: ")
		);
	}

}

