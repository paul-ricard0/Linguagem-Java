package atividades.uni06.ioBytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExpLeituraBytes {
	
	public static void main(String[] args) throws IOException {

		FileInputStream fis = null;

		try {
			// 1. abrir um fluxo de entrada para o arquivo
			fis = new FileInputStream("./teste.txt");

			// 2. realizar a leitura dos bytes (um de cada vez)
			int c;
			// enquanto não for fim de arquivo . . .
			int numBytes = 0;
			while ((c = fis.read()) != -1) { // byte a byte
				// 3. exibir na saída padrão o byte lido
				System.out.println(c + " = " + (char)c);
				numBytes++;
			}

			System.out.println("Bytes lidos: " + numBytes);
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		} finally {
			if (fis != null) {
				// 4. encerrar o fluxo
				fis.close();
			}
		}
	}
}
