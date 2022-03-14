package atividades.uni06.ioFile;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
public class ExepFileListRoots {
	
	public static void main(String[] args) {
		
		
		var raizes = File.listRoots(); // essa raizes vai ser um vetor com todos 
									   //as pastas e arquvios na raiz do meu pc

		System.out.println("Raizes do sistema de arquivos: ");
		for (var raiz : raizes) {
			System.out.println(" - " + raiz.getAbsolutePath());
		}

		
		
		System.out.println("\n\nFormar - 02");
		Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
		for (Path name : dirs) {
			System.err.println(name);
		}
	}
}

