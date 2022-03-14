package laboratorios.lab07.Ex03;


import javax.swing.JOptionPane;

/*
 * Entrada: uma frase digitada pelo usuário
 * Saída: exibir a frase invertida usando recursão
 */


public class Main {
	static String inverter(String frase, String invertida) {
		
		if(frase.length()<1) {
			return invertida;
		}
	
		String sub = frase.substring(1);
		String invertendo = frase.charAt(0)+invertida;
		return inverter(sub, invertendo);
		
		//Se quiser resumir -> return inverter(frase.substring(1), frase.charAt(0)+invertida);		
	}
	
	
	public static void main(String[] args) {
		
		
		String frase = JOptionPane.showInputDialog("Escreva a palavra: ");
		
		System.out.println("frase: "+frase);
		System.out.println("\nInvertida: "+inverter(frase, ""));

	}

}

