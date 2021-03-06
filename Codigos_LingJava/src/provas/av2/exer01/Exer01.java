package provas.av2.exer01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Exer01 {
	
	public static void main(String[] args) throws IOException{
		
		FileInputStream entrada =null;

		String caminho = JOptionPane.showInputDialog("Digite apenas o caminho (a pasta que se encontra: ");
		String nome = JOptionPane.showInputDialog("Digite o nome do arquivo: ");
		
		try {
			
			entrada = new FileInputStream(caminho+nome);
			
			int c;
			
			int bytes = 0;
			while ((c = entrada.read()) != -1) { 
				
				System.out.println(c + " = " + (char)c);
				bytes++;
			}
			System.out.println("Total de bytes: " + bytes);
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
