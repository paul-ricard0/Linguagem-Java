package provas.av1.revisao;

import java.util.Stack;

public class Exer03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int[] valores = {5, 2, 9, 13, 7, 3, 1, 20, 18, 6, 65, 34};
	    
	    var pilha = new Stack<Integer>();

	    for (int i = 0; i < valores.length; i++) {
	      pilha.push(valores[i]);
	    }
	    System.out.println("Pilha: " + pilha);

	    System.out.print("TOPO: ");
	    for (int i = pilha.size() - 1; i >= 0; i--) {
	      System.out.print(pilha.get(i) + "  ");
	    }
	    System.out.println(": FUNDO");
	}

}

