package atividades.uni04.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ExerFila03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> fila = new LinkedList<>();

		var pilha = new Stack<String>();
		
		fila.offer("A");
		fila.offer("B");
		fila.offer("C");
		fila.offer("D");
		fila.offer("E");
		
		for(var item: fila) {
			System.out.print(" "+item);
			pilha.push(item);;
		}
		
		System.out.print("\n");
		
		for(var item: pilha) {
			System.out.print(" "+item);
		}
		
	}

}

