package atividades.uni06.iochars;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex02PesquisaArqTexto {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome do arquivo: ");
		var arq = scan.nextLine();
		System.out.println("Digite a palavra: ");
		var palavra = scan.next();
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(arq));
			
			String linha = null;
			
			while((linha = br.readLine()) != null) {
				if(linha.contains(palavra)) {
					System.out.println("INFO: palavrar encontrada no arquivo");
				}
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(br != null) {
				br.close();
			}
		}
		scan.close();
	}

}

