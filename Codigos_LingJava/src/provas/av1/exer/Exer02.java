package provas.av1.exer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/*
Entrada: um conjunto de valores predefinidos (inteiro) num vetor.

Saída:

a) Gerar um novo vetor que NÃO permite valores duplicados.

b) Exibir o novo vetor na ordem invertida do original.

 */
public class Exer02 {

	public static void main(String[] args) {
		

		var limpo = new ArrayList<Integer>();
		var duplicado = new ArrayList<Integer>();
		
		int [] valores = {3, 8, 2, 6, 4, 1, 9, 8, 4};

		for(int c=0; c<valores.length; c++) {
			if(!limpo.contains(valores[c])) {
				limpo.add(valores[c]);
			}else {
				duplicado.add(valores[c]);
			}
		}
		
		System.out.println(limpo+" ");
		
		for(int c=limpo.size()-1; c >=0; c--) {
			System.out.print(limpo.get(c)+", ");
		}
		
		
		
		
	}

}
