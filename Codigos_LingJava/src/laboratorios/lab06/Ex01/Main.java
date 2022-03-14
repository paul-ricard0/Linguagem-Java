package laboratorios.lab06.Ex01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import javax.swing.JOptionPane;

/*
 * O comando MV � respons�vel por mover um arquivo A de um diret�rio D1 para um diret�rio D2. 
 * Escreva um programa que l� do usu�rio o nome de um arquivo existente (A) e um diret�rio de destino (D2) e realiza o movimento do arquivo de D1 para D2.
 *	
 *	Notas:
 *	Se o arquivo n�o existir, uma mensagem de erro dever� ser exibida para o usu�rio.
 *	Se o diret�rio de destino n�o existir, o programa dever� informar ao usu�rio e perguntar se ele/ela deseja criar o diret�rio. 
 *	Se sim, o caminho dever� ser criado e o arquivo movido para D2. 
 *	Se n�o, o programa encerrar� a opera��o sem mover o arquivo.
 *
 */
public class Main {

	public static void main(String[] args) throws  IOException{

		FileInputStream entrada =null;
		FileOutputStream saida = null;
		int chave = 0;
		
		
		do {
			//recebendo nome das coisas
			var caminho =  JOptionPane.showInputDialog("Qual o diretorio? "); 	 			
			var nomeArquivo = JOptionPane.showInputDialog("Qual o nome do arquivo? ");  						
			var newCaminho = JOptionPane.showInputDialog("Para onde deseja mover?  ");	
			
			// transformando em arquivo
			var arquivo =  new File(caminho+"/"+nomeArquivo);
			var newDiretorio = new File(newCaminho);
			var newArquivo = new File(nomeArquivo);
			
			
			if(!arquivo.exists()) { // conferindo se o caminho existe
				JOptionPane.showMessageDialog(null, "O diretorio ou o arquvio informado n�o existe: \n\n"+ caminho+"/"+nomeArquivo);
				System.exit(0);
			}
			
			
			if(!newDiretorio.exists()) { // conferindo se o novo diretorio existe
				var res = JOptionPane.showInputDialog("O diretorio para o qual quer mover n�o existe \n"+
														"Deseja criar o novo diretorio? \n " +
														"[S] para sim e [N] para n�o");
				if(res.toLowerCase().equals("s")) {
					newDiretorio.mkdirs();
					System.out.println("Novo diretorio criado");
				}else {
					System.exit(0);
				}
			}
			
			
			try {
				
				entrada = new FileInputStream(arquivo);
				saida = new FileOutputStream(newDiretorio + "/"+ newArquivo);
					
				int c;
				
				while((c = entrada.read()) != -1) {
					
					saida.write(c);
		
				}
				
				saida.flush();  //salvando
				entrada.close(); 
				saida.close();
				arquivo.delete(); //deletando arquivo antigo
				
				JOptionPane.showMessageDialog(null, "Arquivo salvo com sucesso");
				chave = 1;
			
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}while(chave != 1);
		
		
	}

}

