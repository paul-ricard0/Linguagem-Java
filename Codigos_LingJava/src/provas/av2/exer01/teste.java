package provas.av2.exer01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JOptionPane;

public class teste {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream entrada =null;

		try {
			
			String caminho = JOptionPane.showInputDialog("Digite apenas o caminho (a pasta que se encontra: ");
			String nome = JOptionPane.showInputDialog("Digite o nome do arquivo: ");
			
			var arquivo = new File(caminho+nome);
		
			if(!arquivo.exists()) {
				System.out.println("O caminho não existe: "+ caminho);
				
				System.exit(0);
			}
			
			if(!arquivo.isDirectory()) {
				System.out.println("Isso não é um diretorio: "+ caminho);
				
				System.exit(0);
			}
			
			entrada = new FileInputStream(caminho+nome);
			
			int c;
			
			int bytes = 0;
			while ((c = entrada.read()) != -1) { 
				
				System.out.print((char)c);
				bytes++;
			}
			System.out.println("Total de bytes: " + bytes);
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}

	}
}
