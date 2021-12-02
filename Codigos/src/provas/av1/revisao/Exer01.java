package provas.av1.revisao;

import java.util.ArrayList;

/**
 * Entrada: Uma sequ�ncia de n�meros pares de 0 a 100
 * Saida: Armazenar estes n�meros numa lista din�mica (ArrayList), calcular e exibir a soma destes n�meros
 * 			(som�torio de todos os pares)
 *
 */

public class Exer01 {

	public static void main(String[] args) {
		
		var lista = new ArrayList<Integer>();
		int soma=0;
		
		for(int c=0; c <= 100; c+=2) {
			lista.add(c);
		}
			
		
		for(int c=0; c < lista.size();c++) {
			
			System.out.print(soma +" + " + lista.get(c) + " = ");
			soma += lista.get(c);
			System.out.println(soma);
			
		}
		
		System.out.println("total: " + soma);
	}

}
