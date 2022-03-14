package laboratorios.lab07.Ex02;


import java.util.Arrays;

/*
 * Entrada: um vetor de chaves (inteiros) V previamente ordenado e uma chave de busca X
 * Sa�da: informar se X ocorre em V
 * Obs: Implementar a pesquisa bin�ria por itera��o e por recurs�o 
 * 
 */
public class Main {
	
	static int cadeInteracao(int vet[], int num) {
		
		Arrays.sort(vet);//ordenando 
		int l=0, r=vet.length-1, x;
		
		while(l<=r) {
			x = l + ((r-l) / 2); //buscando n�mero do meio 
			
			if(vet[x] == num ) return x; //encontro o n�mero
			
			if(num < vet[x]) {	//n�mero � menor
				r = x-1; 
			}
			else l = x+1;	//n�mero � maior 
		}
		
		return -1; //n�o acho
	}
	
	
	static int cadeRecursao(int vet[], int l, int r, int num) {
		
		Arrays.sort(vet); //ordenando 
		
		if(l<=r) {
			int x = l + ((r-l) / 2); //buscando n�mero do meio 
			
			if(num == vet[x]) return x; //encontro o n�mero
			
			if(num < vet[x] ) {			//n�mero � menor
				return cadeRecursao(vet, l, x-1, num); 
			}

			return cadeRecursao(vet, x+1, r, num); //n�mero � maior 
		}
		return -1; //n�o acho
	}
	
	
	public static void main(String[] args) {
		
		int vet[] = {8, 48, 15, 33, 10, 2, 1, 17, 26, 9};
		
		int num = 0; 
		
		// Interacao
		int buscaInt = cadeInteracao(vet, num);
		System.out.println("\nIntera��o: ");
		System.out.println((buscaInt != -1 ) ? "O n�mero foi encontrado na posi��o: "+ buscaInt :"O n�mero n�o foi encontrado!!!");
		
		
		// Recurs�o
		int buscaRec = cadeRecursao(vet, 0, vet.length-1, num);
		System.out.println("\nRecurs�o: ");
		System.out.println((buscaRec != -1 ) ? "O n�mero foi encontrado na posi��o: "+ buscaRec :"O n�mero n�o foi encontrado!!!");
		
	}

}


