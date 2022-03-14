package provas.av1.exer;

/*

Entrada: um vetor de palavras previamente preenchido.

Saída: informar qual é a maior palavra do conjunto e seu tamanho.

 */

public class Exer01 {
	
	public static void main(String[] args) {
	    String [] palavras = {"the", "ABCDEFGH", "book", "table"};
	    
	    int tamanhoMaior=0;
	    var palavraMaior = "";
	    
	    for(int c=0; c<palavras.length; c++) {
	    	
	    	if(palavras[c].length() >= tamanhoMaior) {
	    		palavraMaior=palavras[c];
	    		tamanhoMaior = palavraMaior.length();
	    	}

	    }
	    

	    System.out.println("A maior palavra do conjunto é: " + palavraMaior);
	    System.out.println("Tamanho: " + tamanhoMaior);
	}
}
