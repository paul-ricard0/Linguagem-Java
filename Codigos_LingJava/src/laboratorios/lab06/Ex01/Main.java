package laboratorios.lab06.Ex01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import javax.swing.JOptionPane;

/*
 * O comando MV é responsável por mover um arquivo A de um diretório D1 para um diretório D2. 
 * Escreva um programa que lê do usuário o nome de um arquivo existente (A) e um diretório de destino (D2) e realiza o movimento do arquivo de D1 para D2.
 *	
 *	Notas:
 *	Se o arquivo não existir, uma mensagem de erro deverá ser exibida para o usuário.
 *	Se o diretório de destino não existir, o programa deverá informar ao usuário e perguntar se ele/ela deseja criar o diretório. 
 *	Se sim, o caminho deverá ser criado e o arquivo movido para D2. 
 *	Se não, o programa encerrará a operação sem mover o arquivo.
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
				JOptionPane.showMessageDialog(null, "O diretorio ou o arquvio informado não existe: \n\n"+ caminho+"/"+nomeArquivo);
				System.exit(0);
			}
			
			
			if(!newDiretorio.exists()) { // conferindo se o novo diretorio existe
				var res = JOptionPane.showInputDialog("O diretorio para o qual quer mover não existe \n"+
														"Deseja criar o novo diretorio? \n " +
														"[S] para sim e [N] para não");
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

