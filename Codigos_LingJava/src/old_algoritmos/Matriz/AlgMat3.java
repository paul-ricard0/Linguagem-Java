import java.util.Random;
public class AlgMat3{
    public static void main(String[] args) {

    	int[][] matrizNum = new int[2][3];
    	int[] vetorNum = new int[6];

		Random leitura = new Random();
        int aux = 0;

		//entrada
  		for(int i=0;i<=1;i++){
  			for(int j=0;j<=2;j++){
			matrizNum[i][j]=leitura.nextInt(100); // gerar números aleatórios de 0 a 99
  		    }
  	    }

 		System.out.println();
 		for(int i=0;i<=1;i++){
  			for(int j=0;j<=2;j++){
             	System.out.print(matrizNum[i][j]+ " ");
  		    }
 	     	System.out.println();
  	    }

        //processamento  - passar da matriz para o vetor
 		for(int i=0;i<=1;i++){
  			for(int j=0;j<=2;j++){
    			vetorNum[aux] = matrizNum[i][j];
    			aux ++;
  		    }
  	    }

		//saída  - impressão do vetor
 		System.out.println();
	    for(int i=0;i<vetorNum.length;i++){
            System.out.print(vetorNum[i]+ " ");
  	    }
     }
}