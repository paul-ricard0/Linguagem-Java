package atividades.uni04.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
	
	public static void main(String[] args) {
		Set<String> nomes = new HashSet<String>();
		
		//NAO PODE ENTRA COISA REPETIDA
		nomes.add("Maria");
		nomes.add("Maria");
		nomes.add("Josue");
		System.out.println("Maria".hashCode());
		nomes.add("Jose");
		nomes.add("Josue");
		nomes.add("Alexandre");
		System.out.println("Maria".hashCode());
		
		System.out.println("Conjunto:" + nomes);
	}
}

