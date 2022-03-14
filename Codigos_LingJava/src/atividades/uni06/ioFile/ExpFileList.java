package atividades.uni06.ioFile;

import java.io.File;
import java.util.Scanner;

public class ExpFileList {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o caminho do diretório: ");
		var caminho = scan.nextLine();
		
		var arquivo = new File(caminho);
		
		// se o arquivo não exister termina o programa
		if(!arquivo.exists()) {
			System.out.println("O cmainho não existe: "+ caminho);
			
			System.exit(0);
		}
		
		
		
		
		
		// Para listar os arquivos o camimnho precisa ser um diretorio
		if(arquivo.isDirectory()) {
			
			var listaDeArquivos = arquivo.list(); // Dando o comando arquivo.list() eu vou 
												  // esta pegando todos os aquivos listados naquele diretorio
												  // assim eu vou passar para a variavel listaDeArquivos em forma de VETOR
			// Então listaDeArquivos é um VETOR
			
			
			// Vamos mostrar cada conteúdo que a listaDeArquvos recebeu
			System.out.println("\nlistando conteúdo de "+ caminho +": ");
			int indice=0;
			for(var UnidadeArquivo: listaDeArquivos) {  
				// Para cada unidade dentro do vetor listaDeArquivos
				// Eu vou rodar o for 1 vez
				// E cada vez que rodar UnidadeArquivo vai recever um indice de listaDeArquivos
				
				System.out.println("No indice "+ indice +": "+ UnidadeArquivo);
				indice++;
			}
			
		}else {
			System.out.println("O cmainho informado é um arquivo: "+ caminho);
		}
		
		
		
		
		scan.close();
		
		
	}

}

