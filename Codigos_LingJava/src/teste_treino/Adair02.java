package teste_treino;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Adair02 {

	public static void main(String[] args) {
	

		Scanner s = new Scanner(System.in);
		boolean vf = false;
		
		System.out.println("Digite o nome do arquivo: ");
	    String arq1 = s.nextLine();
			try {
				try (BufferedReader f1 = new BufferedReader(new FileReader(arq1))) {
			} catch (FileNotFoundException e) {
				extracted(e);
			} catch (IOException e) {
				e.printStackTrace();
			}
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			
			System.out.println("Digite o nome do arquivo: ");
	        String arq2 = s.nextLine();
	        s.close();
	        try {
				try (BufferedReader f2 = new BufferedReader(new FileReader(arq2))) {
			} catch (FileNotFoundException e) {
				extracted(e);
			} catch (IOException e) {
					e.printStackTrace();
			}
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
	        byte[] f1_buf = new byte[1048576];
	        byte[] f2_buf = new byte[1048576];
	        int len;
			if (arq1.length() == arq2.length()) {
				vf  = true;
	            try {
					InputStream ehf1 = new FileInputStream(arq1);
	                
					InputStream ehf2 = new FileInputStream(arq2);
	                try {
	                    while (ehf1.read(f1_buf) >= 0) {
	                        len = ehf2.read(f2_buf);
	                        for (int j = 0; j < len; j++) {
	                            if (f1_buf[j] != f2_buf[j]) {
	                            	vf = false; // tamanho igual e conteudo diferente
	                            	System.out.println("Tamanho igual e conteudo diferente... ");
	                            	ehf1.close();
	                            	ehf2.close();
	                            }
	                        }
	                    }
	                } catch (IOException e) {
	                }
	            } catch (FileNotFoundException e) {
	            }
	        } else {
	        	vf = false; // tamanho e conteudo diferente
	        	System.out.println("Tamanho e conteudo diferente... ");
	       }
	        vf = true; // arquivos iguais
	        System.out.println("Arquivos IGUAIS... ");
	    	return;
			}
	private static void extracted(FileNotFoundException e) throws FileNotFoundException {
		throw e;
	}

}


