package atividades.uni04.list;

import java.util.LinkedList;

import javax.swing.JOptionPane;


public class Exercicio2LinkedList {

	public static void main(String[] args) {
		
		
		var lista = new LinkedList<Integer>();
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		
		
		for(int i = lista.size()-1; i >= 0 ; i--) {
			System.out.println(lista.get(i));
		}
		
	}

}

