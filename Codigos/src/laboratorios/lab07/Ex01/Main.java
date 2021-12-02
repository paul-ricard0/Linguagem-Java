package laboratorios.lab07.Ex01;


import java.io.File;

import javax.swing.JOptionPane;

/*
 * Entrada: um caminho de diretório informado pelo usuário
 * Saída: exibir todos os arquivos do diretório e sub-diretoŕios (usando recursão)
 */

public class Main {
	
	
	static void listarDi(String caminho,boolean caminho01) {
		
		var arquivo = new File(caminho);
		
		if(caminho01) {
			System.out.println(caminho+"\n");
			
			if(!arquivo.exists()) {
				System.out.println("O caminho não existe: "+ caminho);
				
				System.exit(0);
			}
			
			if(!arquivo.isDirectory()) {
				System.out.println("Isso não é um diretorio: "+ caminho);
				
				System.exit(0);
			}
			
		}
		
		var lista = arquivo.list();
		
		try {
		
			for(var unidadeArquivo: lista) {
				var x = new File(caminho+"/"+unidadeArquivo);
				
				if(!x.isDirectory()) {
					
					System.out.println("  * "+unidadeArquivo);	
				}
				else {
					System.out.println(unidadeArquivo + "  <");
					listarDi(caminho+"/"+unidadeArquivo, false);
				}
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println(">");
		}	
			
	}
	
	
	public static void main(String[] args) {
		
		String caminho = JOptionPane.showInputDialog("Entre com o caminho: ");
		
		listarDi(caminho, true);
	}

}


