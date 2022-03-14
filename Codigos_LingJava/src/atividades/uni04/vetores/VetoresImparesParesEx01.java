package atividades.uni04.vetores;

import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * Problema: 
 * Entrada: um conjunto de números inteiros informado pelo usuário
 * Saída: dividir o vetor em dois subvetores: pares e impares, exibir estes vetores na tela
 * @author paulo
 *
 */


public class VetoresImparesParesEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int tamanhoVet = Integer.parseInt(
				JOptionPane.showInputDialog("Entre com a quantidade de números que vc deseja iniciar: ")
		);
		
		var numVet = new int[tamanhoVet];
		
		int contpar=0, contimpar = 0;
		
		
		for(int i =0; i<numVet.length; i++) {
			numVet[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número inteiro: "));
			if(numVet[i] % 2 == 0) {
				contpar++;
			}else {
				contimpar++;
			}
		}
		
		int vetpar[] = new int[contpar];
		int vetimpar[] = new int[contimpar];
		int x =0, y=0;
		for(int i=0; i<numVet.length; i++) {
			
			if(numVet[i]%2==0) {
				vetpar[x] = numVet[i];
				x++;		
			}else {
				vetimpar[y] = numVet[i];
				y++;
			}
		}
		
		JOptionPane.showMessageDialog(null,"Números Pares: " + Arrays.toString(vetpar));
		JOptionPane.showMessageDialog(null,"Números Impares: " + Arrays.toString(vetimpar));
		
	}

}


