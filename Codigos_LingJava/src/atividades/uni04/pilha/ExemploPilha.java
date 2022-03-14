package atividades.uni04.pilha;

import java.util.Stack;

public class ExemploPilha {

	public static void main(String[] args) {
		var pilha = new Stack<Integer>();
		
		pilha.push(16);
		pilha.push(12);
		pilha.push(22);		
		pilha.push(30);
		pilha.push(9);
		pilha.push(25);
		pilha.push(8);
		
		// quem está no topo da pilha?
		System.out.println("Topo:" + pilha.peek());
		
		// fundo?
		if (!pilha.empty()) {
			System.out.println("Fundo:" + pilha.get(0));
		}
		
		
		// imprimir a pilha
//		for (var item: pilha) {
//			System.out.println(item);
//		}
		
		// imprimir pilha do topo para o fundo  (sem usar índice)
		System.out.print("Topo: ");
		while (!pilha.isEmpty()) {
			System.out.print(pilha.pop() + " ");
		}
		System.out.println("Fundo");
		
	}
}


