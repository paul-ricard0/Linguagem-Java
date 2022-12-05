import java.util.Random;
public class AlgMat4{
    public static void main(String[] args) {

    	int[][] matrizNum = new int[3][3];
    	int[] vetorNum = new int[9];

		Random leitura = new Random();
        int aux = 0;

		//entrada
  		for(int i=0;i<vetorNum.length;i++){
			vetorNum[i] = leitura.nextInt(1000); // gerar números aleatórios de 0 a 999
  	    }

  	    // impressão do vetor
 		System.out.println();
	    for(int i=0;i<vetorNum.length;i++){
            System.out.print(vetorNum[i]+ " ");
  	    }

       //processamento  - passar do vetor para a matriz
 		for(int i=0;i<=2;i++){
  			for(int j=0;j<=2;j++){
    			matrizNum[i][j] = vetorNum[aux];
    			aux ++;
  		    }
  	    }

 		System.out.println();
 		for(int i=0;i<=2;i++){
  			for(int j=0;j<=2;j++){
             	System.out.print(matrizNum[i][j]+ " ");
  		    }
 	     	System.out.println();
  	    }

     }
}