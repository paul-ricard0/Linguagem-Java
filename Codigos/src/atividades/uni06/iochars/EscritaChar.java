package atividades.uni06.iochars;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class EscritaChar {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		FileWriter fw = null;
		
		 try {
			
			fw = new FileWriter("./src/atividades/uni06/testeEscritaChar.txt");
			 
			var dateTime = LocalDateTime.now();
			
			System.out.println(dateTime);
			 
			fw.write(dateTime.toString());
			 
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if(fw != null) {
				fw.close();
			}
		}
			
	}

}

