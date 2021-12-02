package atividades.uni07.Exer;


// Problema:
// entrada: n�mero inteiro positivo N
// sa�da: informar o somat�rio de N
// ex: R = N + (N-1) + (N-2) + (N-3) . . . + 1
//
// implementar utilizando recurs�o E itera��o

public class Exer01_Somatorio {
	
	 static int somaRecursao(int n)  { // recur��o   (MELHOR modo para se fazer)
	    if (n == 1) return 1;	
		return n + (somaRecursao(n-1));
	}
	 
	 static int somaIteracao(int n)  { // itera��o, la�o
		 int r = 0;
		 for(int i=0; i<=n; i++) {
			  r = r + i;
		 }
		 return r;
	}
	
	public static void main(String[] args) {
		int x = 6;
		
		System.out.println("Recursao \nSomatorio de "+ x + " = "+ somaRecursao(x));

		System.out.println("\nIteracao \nSomatorio de "+ x + " = "+ somaIteracao(x));
	}

}
