package provas.av1.revisao;

import java.util.ArrayList;


public class Exer02 {
	
	
	/**
	  * Problema 2:
	  * Entrada: um conjunto de palavras definidas dentro de um vetor/arranjo
	  * Saída: Informar as palavras que se repetem dentro do vetor
	  *
	  */
	
	public static void main(String[] args) {
			
		var vetor = new String[10];
		vetor[0] = "book";
		vetor[1] = "table";
		vetor[2] = "sky";
		vetor[3] = "house";
		vetor[4] = "sunday";
		vetor[5] = "car";
		vetor[6] = "sky";
		vetor[7] = "house";
		vetor[8] = "tablet";
		vetor[9] = "monitor";
		
		var listaLimpa = new ArrayList<String>();
		var listaSuja = new ArrayList<String>();

		
		for(int c=0; c<vetor.length; c++) {	
			var palavra = vetor[c];
		
			if(listaSuja.contains(palavra)) {
				listaLimpa.add(palavra);
			}else {
				listaSuja.add(palavra);
			}

		}

		System.out.println("\n\n"+listaLimpa);

		
		
		
		


	}

}
