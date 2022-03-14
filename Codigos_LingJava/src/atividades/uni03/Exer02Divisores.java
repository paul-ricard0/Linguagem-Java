package atividades.uni03;

import javax.swing.JOptionPane;

/**
 * Problema
 * Entrada: Ler do usuário um número inteiro positivo M 
 * Saída: Informar todos os divisores de N
 * 
 * Obs:implementar com tratamento de erro de entrada
 * 
 * @author paulo
 *
 */
public class Exer02Divisores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num = Tools.inputInt("Entre com um número Inteiro: ");
		
		
		String out = "";
		int resto;
		for(int i = 1; i <= num; i++ ) {
			
			resto = num % i;
			if(resto == 0) {
				out = out + i + ", ";
			}
		}
		
		JOptionPane.showMessageDialog(null, out);
		
	}

}


