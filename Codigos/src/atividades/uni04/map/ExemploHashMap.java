package atividades.uni04.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

	private static void inserirNaTabela(int chave, String valor, Map<Integer, String> tabela) {
		if (!tabela.containsKey(chave)) {
			tabela.put(chave, valor);
			System.out.println("INFO: " + valor + " inserido na posição " + chave + " com sucesso.");
		} else  {
			System.out.println("ALERTA: Espaço " + chave+ " já está ocupado!");
		}		
	}
	
	public static void main(String[] args) {
		Map<Integer, String> tabela = new HashMap<Integer, String>();
		
		tabela.put(201, "Waldir");
		tabela.put(203, "Jorge");
		tabela.put(701, "Manuel");
		tabela.put(202, "Janete");
		tabela.put(601, "Ana");
		tabela.put(603, "Roberto");
		
		System.out.println("Tabela: " + tabela + "\n\n");
		
		inserirNaTabela(201, "Etevaldo", tabela);

		inserirNaTabela(204, "Etevaldo", tabela);
		
		System.out.println("Tabela: " + tabela + "\n\n");

	}
}

