package atividades.uni04.list;

import java.util.ArrayList;


public class ArrayListExemplo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		var estados = new ArrayList<String>();
		
		System.out.print("lista: "+estados);
		
		estados.add("Minas Gerais");
		System.out.print("lista: "+estados);
		
		estados.add("São Paulo");
		System.out.print("lista: "+estados);
		
		estados.add("Santa Catarina");
		System.out.print("lista: "+estados);
		
		estados.remove("São Paulo");
		System.out.print("lista: "+estados);
		
		//for-each avançado
		for(var estado: estados) {
			System.out.print("Estado: " + estado);
		}
		
		//for-each classico
		for(int i =0; i < estados.size(); i++) {
			var estado = estados.get(i); 
			System.out.println("Estado: " + estado);
		}
		
		
		System.out.println("Minas Gerais: " + estados.indexOf("Minas Gerais"));
		
		
		estados.clear();
		for (var estado: estados) {
			System.out.println("Estado: " + estado);
		}
		
		
		
		
		
	}

}


