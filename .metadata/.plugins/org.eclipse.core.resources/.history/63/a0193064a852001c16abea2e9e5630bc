package atividades.uni01;

import javax.swing.JOptionPane;

/**
 * Problema
 * 
 * Entrada: uma frase digitada pelo usuário
 * Saída: informar a quantidade de vogais na frase
 * @author paulo
 *
 */

public class Exer03VogaisEmFrase {
	
	public static void main(String[] args) {
			
			/*
			// Delcaração de variáveis
			int vog = 0;
			Scanner scan = new Scanner (System.in);
			
			// Entrada
			System.out.println("Digite uma frase: ");
			String frase = scan.nextLine();
			
			// Processamento
			for(var cont = 0; cont < frase.length(); cont++ ) {
				var Carac = frase.charAt(cont); // para pegar uma letra especifica
				
				if("aeiou".contains(""+Carac)) {
					vog++;
				}
			}
			
			
			// Saída
			System.out.println("\nNa frase: " + frase + "\nTemos "+vog+" vogais");
			
			scan.close();
			*/
			
			int vog = 0;
			
			String frase = JOptionPane.showInputDialog("Digite uma frase: ");
			
			for(var c = 0; c < frase.length(); c++) {
				var Caracter = frase.charAt(c);
				
				if("aeiou".contains("" + Caracter)) {
					vog++;
				}
			}
			
			JOptionPane.showMessageDialog(null, "\nNa frase: " + frase + "\nTemos "+vog+" vogais");
			
			
			
			 
		}

}

