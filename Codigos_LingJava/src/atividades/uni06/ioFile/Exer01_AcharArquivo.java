package atividades.uni06.ioFile;

import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Entrada: um caminho de diret�rio (path) e um nome de arquvi informados pelo usu�rio
 * Sa�da: informar se o arquivo informado existe ou n�o dentro do diret�rio
 *
 * Notas:
 * - se o diret�rio n�o existir, infformar para o usu�rio que ele n�o existe
 * - se o caminho informado for um arquivo, informar que n�o � poss�vel pesquisar
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
			JOptionPane.showMessageDialog(null, "O caminho informado N�O existe: "+ caminho);
			System.exit(0);
		}
		
		if(!diretorio.isDirectory()) { // conferindo se � um diretorio
			JOptionPane.showMessageDialog(null, "O caminho informado N�O � um diretorio: "+ caminho);
			System.exit(0);
		}
		
		
		for(var arquivo: diretorio.list()) {
			if(arquivo.equals(nomeArquivo)) {
				arqEncontrado = true;
			}
		}
		
		//Sa�da
		
		
		if(arqEncontrado) {
			JOptionPane.showMessageDialog(null, "Arquivo "+ nomeArquivo +" existe no diretorio "+ caminho);
			
			
			/** Adendo ao Exercicio **/
			var arquivo = new File(caminho + '/' + nomeArquivo);
			JOptionPane.showMessageDialog(null, "Tamanho: " + arquivo.length() + " bytes\n" +
												"Caminho absoluto:" + arquivo.getAbsolutePath());
			
		}else {
			JOptionPane.showMessageDialog(null, "Arquivo "+ nomeArquivo +" N�O existe no diretorio "+ caminho);
		}
		
		

	}

}

