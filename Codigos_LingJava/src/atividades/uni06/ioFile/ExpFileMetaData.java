package atividades.uni06.ioFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Date;

public class ExpFileMetaData {

	public static void main(String[] args) throws IOException {
		
		var arquivo = new File("./src/atividades/uni06/testeLeitura.txt");

		
		System.out.println("Existe: " + arquivo.exists());
		
		System.out.println("Tamanho (Bytes): "+ arquivo.length()); 
		
		// lastModified volta o n�mero em segundos desde 1970, 
		// usa o Date para converter esse n�mero no formato data como conhecemos
		var dataModificacao = new Date(arquivo.lastModified()); 
		System.out.println("�ltima modifica��o: " + dataModificacao);
	
		
		System.out.println("\n** Permiss�es **");
		System.out.println("Read: " + arquivo.canRead()); //se pode LER o arquivo
		System.out.println("Write: " + arquivo.canWrite()); //se pode ESCREVER no arquivo
		System.out.println("Execute: " + arquivo.canExecute()); //se pode EXECUTAR o arquivo
		
		
		// Ver a data de cria��o 
		// Waldir usou um metodo um pouco diferente
		Path file = Paths.get("./src/atividades/uni06/testeLeitura.txt");
		
		BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);
		
		System.out.println("\n** Metodo2 **");
		System.out.println("Cria��o: "+ attr.creationTime()); // Data de cria��o
		System.out.println("Modifica��o: "+ attr.lastModifiedTime());// Ver a data de modifica��o por esse metodo
	}

}

