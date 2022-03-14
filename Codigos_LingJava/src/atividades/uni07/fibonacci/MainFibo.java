package atividades.uni07.fibonacci;

public class MainFibo {
	
	
	static int fiboRecursao(int n) {         //NÃO É BOM FAZER RECURSÃO COM FIBONACCI 
		//caso base						 			//VC NÃO REAPROVEITA O VALOR, FICA CAULCULANDO A MESMA COISA VÁRIAS VEZES	
		if(n<=1) {
			return n;
		}
		
		System.out.println(String.format("Fibo(%d) = Fibo(%d) + Fibo(%d)", n, n-1, n-2));
		//passo recursivo
		int x = fiboRecursao(n-1) + fiboRecursao(n-2);

		return x;	
	}
	
	
	static int fiboInterativo(int n) {		// MELHOR FORMA DE SE FAZER
		// caso vase
		var fn1 = 1;
		var fn0 = 0;
		var fn = 0;
		
		for(int i = 0; i<=n-2/*menos dois pq o valor de 0 e 1 vc á tem*/; i++) {
			fn = fn1 + fn0; //fn = (fn-1) + (fn-2)
			fn0= fn1;
			fn1= fn;
		}
		
		return fn;
	}
	
	
	
	
	public static void main(String[] args) {

		int num = 12;
		//System.out.println("Recursão: "+fiboRecursao(num));
		System.out.println("Interatico: "+fiboInterativo(num));
	}

}
