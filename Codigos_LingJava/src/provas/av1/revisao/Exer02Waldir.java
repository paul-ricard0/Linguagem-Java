package provas.av1.revisao;

import java.util.HashSet;

public class Exer02Waldir {

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
		
		var conjunto = new HashSet<String>();

		
		for(int c=0; c<vetor.length; c++) {	
			var palavra = vetor[c];
		
			if(conjunto.contains(palavra)) {
				System.out.println("Palavra repetida: " + palavra);
			}else {
				conjunto.add(palavra);
			}

		}

		System.out.println("\nConjunto: " + conjunto);
	}

}
