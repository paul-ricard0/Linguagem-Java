package atividades.uni06.iochars;

import java.io.FileReader;
import java.io.IOException;

public class LeituraChar {

	public static void main(String[] args) throws IOException{	
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("./src/atividades/uni06/testeLeitura.txt");
			
			int c;
			int numChars = 0;
			while((c = fr.read()) != -1) {
				System.out.println(c+" = "+ (char)c);
				numChars++;
			}
			
			System.out.println("Caracteres lidos: "+numChars);
		} catch (Exception ex) {
			// TODO: handle exception
		}finally {
			if(fr!= null) {
				fr.close();
			}
		}
		
		
	}

}

