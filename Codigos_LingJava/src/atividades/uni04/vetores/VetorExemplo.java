package atividades.uni04.vetores;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class VetorExemplo {
	
	private static String[] dobrarCapacidade(String[] vetor) {
		
		var vetorMaior = new String[vetor.length * 2];
		
		for(int i = 0; i < vetor.length; i++) {
			vetorMaior[i] = vetor[i];
		}
		
		return vetorMaior;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tamanho = Integer.parseInt(
			JOptionPane.showInputDialog("Digite a quantidade de nomes a ser informada: ")
		);
		
		
		var nomes = new String[tamanho];
		
		for(int i=0; i<tamanho; i++) {
			nomes[i] = JOptionPane.showInputDialog("Digite um nome: ");
		}
		
		
		System.out.println("Enderešo antes: " + nomes);
		JOptionPane.showMessageDialog(null,"Tamanho: " + nomes.length + "\n" + Arrays.toString(nomes));
		
		nomes = dobrarCapacidade(nomes);
		
		System.out.println("Enderešo depois: " + nomes);
		JOptionPane.showMessageDialog(null,"Tamanho: " + nomes.length + "\n" + Arrays.toString(nomes));
		
		
		
	}

}

