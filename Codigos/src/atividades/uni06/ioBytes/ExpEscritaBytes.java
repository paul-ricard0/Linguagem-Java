package atividades.uni06.ioBytes;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExpEscritaBytes {
	public static void main(String[] args) throws IOException {
		var frase = "the book is on the table.";

		FileOutputStream fos = null;

		try {
			// 1. abrir um fluxo de escrita de bytes
			fos = new FileOutputStream("./teste2.txt");

			int numBytes = 0;
			// 2. escrever byte a byte to arquivo
			for (char c : frase.toCharArray()) {
				fos.write(c);
				numBytes++;
			}
			
			fos.flush(); // comitar os dados escritos da memória para o disco
			
			System.out.println("Bytes escritos: " + numBytes);

		} catch (IOException ex) {
			System.out.println(ex.getMessage());

		} finally {
			// 3. encerrar o fluxo de escrita no arquivo.
			if (fos != null) {
				fos.close();
			}
		}
	}
}

