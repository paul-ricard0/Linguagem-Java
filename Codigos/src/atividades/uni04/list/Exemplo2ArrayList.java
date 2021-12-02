package atividades.uni04.list;

import java.util.ArrayList;


/**
 * Problema:
 * Implementar um método que permite buscar por um determinado estado dentro
 * da lista de estados
 * Se o estado for encontrado, retornar o indice onde ele foi encontrado no vetor
 * 
 * @author paulo
 *
 */
public class Exemplo2ArrayList {
	
	
private static int buscaSequencial(ArrayList<String> estados, String estado) {
		
		for(int i = 0; i < estados.size(); i++) {
			var item = estados.get(i);
			
			if(item.equals(estado)) {//achei
				return i;
			}
		}
		
		
		return -1; //não achei
	}
	

	public static void main(String[] args) {
		
		var estados = new ArrayList<String>();
		
		estados.add("Minas Gerais");
		estados.add("Goias");
		estados.add("Tocantins");
		estados.add("Alagoas");
		
		System.out.println(
				buscaSequencial(estados, "Paraná")
				);
		

	}

}

