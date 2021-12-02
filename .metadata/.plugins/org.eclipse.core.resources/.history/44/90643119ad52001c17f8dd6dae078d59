package laboratorios.lab07.Ex02;


import java.util.Arrays;

/*
 * Entrada: um vetor de chaves (inteiros) V previamente ordenado e uma chave de busca X
 * Saída: informar se X ocorre em V
 * Obs: Implementar a pesquisa binária por iteração e por recursão 
 * 
 */
public class Main {
	
	static int cadeInteracao(int vet[], int num) {
		
		Arrays.sort(vet);//ordenando 
		int l=0, r=vet.length-1, x;
		
		while(l<=r) {
			x = l + ((r-l) / 2); //buscando número do meio 
			
			if(vet[x] == num ) return x; //encontro o número
			
			if(num < vet[x]) {	//número é menor
				r = x-1; 
			}
			else l = x+1;	//número é maior 
		}
		
		return -1; //não acho
	}
	
	
	static int cadeRecursao(int vet[], int l, int r, int num) {
		
		Arrays.sort(vet); //ordenando 
		
		if(l<=r) {
			int x = l + ((r-l) / 2); //buscando número do meio 
			
			if(num == vet[x]) return x; //encontro o número
			
			if(num < vet[x] ) {			//número é menor
				return cadeRecursao(vet, l, x-1, num); 
			}

			return cadeRecursao(vet, x+1, r, num); //número é maior 
		}
		return -1; //não acho
	}
	
	
	public static void main(String[] args) {
		
		int vet[] = {8, 48, 15, 33, 10, 2, 1, 17, 26, 9};
		
		int num = 0; 
		
		// Interacao
		int buscaInt = cadeInteracao(vet, num);
		System.out.println("\nInteração: ");
		System.out.println((buscaInt != -1 ) ? "O número foi encontrado na posição: "+ buscaInt :"O número não foi encontrado!!!");
		
		
		// Recursão
		int buscaRec = cadeRecursao(vet, 0, vet.length-1, num);
		System.out.println("\nRecursão: ");
		System.out.println((buscaRec != -1 ) ? "O número foi encontrado na posição: "+ buscaRec :"O número não foi encontrado!!!");
		
	}

}


