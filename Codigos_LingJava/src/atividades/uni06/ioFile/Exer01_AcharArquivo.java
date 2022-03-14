package atividades.uni06.ioFile;

import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Entrada: um caminho de diretório (path) e um nome de arquvi informados pelo usuário
 * Saída: informar se o arquivo informado existe ou não dentro do diretório
 *
 * Notas:
 * - se o diretório não existir, infformar para o usuário que ele não existe
 * - se o caminho informado for um arquivo, informar que não é possível pesquisar
 */

public class Exer01_AcharArquivo {

	public static void main(String[] args) {
		
		boolean arqEncontrado = false;
		
		//Entrada
		var caminho = JOptionPane.showInputDialog("Entre com o caminho do diretorio: ");
		var diretorio = new File(caminho);
		
		var nomeArquivo = JOptionPane.showInputDialog("Nome do arquivo: ");
		
		//Processamento
		
		if(!diretorio.exists()) { // conferindo se o caminho existe 
			JOptionPane.showMessageDialog(null, "O caminho informado NÃO existe: "+ caminho);
			System.exit(0);
		}
		
		if(!diretorio.isDirectory()) { // conferindo se é um diretorio
			JOptionPane.showMessageDialog(null, "O caminho informado NÃO é um diretorio: "+ caminho);
			System.exit(0);
		}
		
		
		for(var arquivo: diretorio.list()) {
			if(arquivo.equals(nomeArquivo)) {
				arqEncontrado = true;
			}
		}
		
		//Saída
		
		
		if(arqEncontrado) {
			JOptionPane.showMessageDialog(null, "Arquivo "+ nomeArquivo +" existe no diretorio "+ caminho);
			
			
			/** Adendo ao Exercicio **/
			var arquivo = new File(caminho + '/' + nomeArquivo);
			JOptionPane.showMessageDialog(null, "Tamanho: " + arquivo.length() + " bytes\n" +
												"Caminho absoluto:" + arquivo.getAbsolutePath());
			
		}else {
			JOptionPane.showMessageDialog(null, "Arquivo "+ nomeArquivo +" NÃO existe no diretorio "+ caminho);
		}
		
		

	}

}

