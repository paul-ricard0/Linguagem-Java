package atividades.uni01;

import javax.swing.JOptionPane;

/**
 *Problema  
 * 
 *Entrada: Tr�s n�meros inteiros digitados pelo usu�rio(x, y,z)
 *Sa�da: Informar qual � o maior valor dos n�meros digitados
 *
 */

public class Exer02MaiorValor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declara��o de vari�veis
		int maior = 0;
		
		
		// Processamento
		
		/**  ---- FORMA COMO EU FIZ ----
		int x = Integer.parseInt(
			JOptionPane.showInputDialog("Entre com o primeiro n�mero")
		);

		int y = Integer.parseInt(
			JOptionPane.showInputDialog("Entre com o primeiro n�mero")
		);

		int z = Integer.parseInt(
			JOptionPane.showInputDialog("Entre com o primeiro n�mero")
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
		
		
		//Sa�da
		JOptionPane.showMessageDialog(null, "O maior n�mero �: " + maior);
		
		
		
		
	}

	static int lerNumeroInteiro() {
		return Integer.parseInt(
		JOptionPane.showInputDialog("Digite um n�mero inteiro: ")
		);
	}

}

