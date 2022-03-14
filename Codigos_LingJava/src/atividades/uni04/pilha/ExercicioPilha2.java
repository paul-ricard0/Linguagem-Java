package atividades.uni04.pilha;

import java.util.Stack;

public class ExercicioPilha2 {

	private static void imprimirPilha(Stack<Character> pilha) {
		var temp = new Stack<Character>();
		temp.addAll(pilha);
		
		System.out.println("PILHA - tamanho: "+ temp.size());
		System.out.print("\nTopo: ");
		while (!temp.isEmpty()) {
			System.out.print(temp.pop() + " ");
		}
		System.out.println("Fundo\n");		
	}
	
	/**
	 * Problema
	 * Entrada:  um conjunto de dados em pilha (1) predefinido de caracteres
	 * Saída: criar uma nova pilha (2) invertida da anterior
	 * 
	 * bonus: ler do usuário uma frase e colocar na pilha 1
	 * 
	 * ex: Topo C A S A Fundo
	 *     Topo A S A C Fundo
	 * @param args
	 */
	public static void main(String[] args) {
		var pilha = new Stack<Character>();
		
		pilha.push('C');
		pilha.push('A');
		pilha.push('S');		
		pilha.push('A');
		
		imprimirPilha(pilha);

		var pilha2 = new Stack<Character>();
		
		while (!pilha.isEmpty()) {
			pilha2.push(pilha.pop());
		}
		
		imprimirPilha(pilha2);
	}
}

