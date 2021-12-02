package atividades.uni01;

import javax.swing.JOptionPane;

public class Exer04ExibirConsoantes {
	
	private static final String VOGAIS = "aeiou";
	
	public static String digiteFrase(String pedido){
		
		String frase = JOptionPane.showInputDialog(pedido);
		return frase;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase = digiteFrase("Digite uma frase: ");
		
		for(int cont=0; cont<=frase.length(); cont++) {
			char carac = frase.charAt(cont);
		}

		
	}

}

