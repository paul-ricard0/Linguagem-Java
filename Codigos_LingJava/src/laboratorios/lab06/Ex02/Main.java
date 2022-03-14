package laboratorios.lab06.Ex02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

/*
 * Entrada: dois nomes de arquivos existentes (A1 e A2)
 * Saída: informar se os arquivos são idênticos (i.e. o conteúdo dos dois arquivos é o mesmo).
 * 
 */

public class Main {
	
	static void validarArquivo(String file) {
		var f =  new File(file);
		
		if(!f.exists()) { // conferindo se o caminho existe
			JOptionPane.showMessageDialog(null, "O diretorio ou arquvio não existe: \n\n"+ file);
			System.exit(0);
		}
		
		return;
	}
	
	public static void main(String[] args) throws  IOException{
		
		
		FileInputStream entrada1 =null;
		FileInputStream entrada2 = null;
		boolean igual = true;
		
		String nome1 = JOptionPane.showInputDialog("Qual o Diretorio e Nome do primeiro arquivo? ");
		String nome2 = JOptionPane.showInputDialog("Qual o Diretorio e Nome do segundo arquivo? ");
		
		validarArquivo(nome1);
		validarArquivo(nome2);
		
		var f1 =  new File(nome1);
		var f2 =  new File(nome2);
		
		try {
			entrada1 = new FileInputStream(f1);
			entrada2 = new FileInputStream(f2);
			
			int c1, c2;
			
			while((c1 = entrada1.read()) != -1) {
					c2 = entrada2.read();
					if(c1 != c2) igual = false;
			}
			
			if(f1.length() != f2.length()) igual = false; 
			
			if(igual) {
				JOptionPane.showMessageDialog(null, "Os arquivos são iguais");
			}else {
				JOptionPane.showMessageDialog(null, "Os arquivos são diferentes");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			entrada1.close();
			entrada2.close();
		}

		
	}

}

