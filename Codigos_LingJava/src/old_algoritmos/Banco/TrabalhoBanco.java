import java.util.Scanner;

public class TrabalhoBanco {

    public static void main (String[]args){

    	Scanner scan = new Scanner (System.in);


    	/* ------------------------------------------------ */
    	String nome =" ";
    	int cntCorrente, cntPoupanca, count=99, x=0;
    	float saldoCorrente=0, saldoPoupanca=0, op=0;
    	/* ------------------------------------------------ */




    	/* ------------------------------------------------ */
    	System.out.println("Entre com o nome do cliente: ");
    	nome = scan.nextLine();

    	System.out.println("Entre com o número da Conta Corrente: ");
    	cntCorrente = scan.nextInt();

    	System.out.printf("Entre com o saldo inicial da Conta Corrente %d:\n", cntCorrente);
    	saldoCorrente = scan.nextFloat();

    	System.out.println("Entre com o número da Conta Poupança: ");
    	cntPoupanca = scan.nextInt();

    	System.out.printf("Entre com seu saldo inicial da Conta Poupança %d: \n", cntPoupanca);
    	saldoPoupanca = scan.nextFloat();
    	/* ------------------------------------------------ */




    	do{

			System.out.print("\n \n#------------------------------------------------#");
    		System.out.println("\nQual operação deseja realizar: ");
    		System.out.println("1 - Creditar \n2 - Debitar \n3 - Transfeirr \n4 - Saldo \n5 - Sair");
    		System.out.print("\nOpção -> ");
    		x = scan.nextInt();

			scan = new Scanner (System.in);

    		if(x == 1){


    			System.out.print("Qual conta: \n1 - Corrente \n2 - Poupança \nOpção -> ");
    			x = scan.nextInt();
    			if(x == 1){
    				System.out.printf("Qual valor a creditar na conta corrente %d -> ", cntCorrente);
    				op = scan.nextFloat();
					saldoCorrente += op;
    				System.out.printf("\n*** \nNovo saldo da Conta Corrente %.2f \n*** \n", saldoCorrente);
    			}
    			else if (x == 2){
    				System.out.printf("Qual valor a creditar na conta Poupança %d -> ", cntPoupanca);
    				op = scan.nextFloat();
    				saldoPoupanca += op;
    				System.out.printf("\n*** \nNovo saldo da Conta Poupança %.2f \n*** \n", saldoPoupanca);
    			}
    			else{
    				System.out.println("-----------Número Inválido-------------");
    			}


    		}
    		else if(x == 2){


    			System.out.print("Qual conta: \n1 - Corrente \n2 - Poupança \nOpção -> ");
    			x = scan.nextInt();
    			if(x == 1){
    				System.out.printf("Qual valor a debitar na conta corrente %d -> ", cntCorrente);
    				op = scan.nextFloat();
					saldoCorrente -= op;
    				System.out.printf("\n*** \nNovo saldo da Conta Corrente %.2f \n*** ", saldoCorrente);
    			}
    			else if (x == 2){
    				while(count != 1){
    					System.out.printf("Qual valor a debitar na conta poupança %d -> ", cntPoupanca);
    					op = scan.nextFloat();

    					if(saldoPoupanca < op){
    						System.out.println("\nSaldo Insuficiente!!!!!! \nTente novamente!!!!!!\n");
    					}
    					else{
    						saldoPoupanca -= op;
    						System.out.printf("\n*** \nNovo saldo da Conta Poupança %.2f \n*** ", saldoPoupanca);
    						count = 1;
    					}
    				}
    			}
    			else{
    				System.out.println("-----------Número Inválido-------------");
    			}


    		}
    		else if(x == 3){


				System.out.print("Entre: \n1 – Conta corrente para poupança \n2 – Poupança para conta corrente \nOpção ->");
    			x = scan.nextInt();
    			if(x == 1){
    				System.out.printf("Qual valor a transferir da CC %d para CP %d > ", cntPoupanca, cntCorrente);
    				op = scan.nextFloat();
					saldoPoupanca += op;
					saldoCorrente -= op;
    				System.out.printf("\n*** \nSaldo atual na Conta Corrente %.2f ", saldoCorrente);
    				System.out.printf("Saldo atual na Conta Poupança %.2f \n*** ", saldoPoupanca);
    			}
    			else if (x == 2){
    				do{
    					System.out.printf("Qual valor a transferir da CP %d para CC %d > ", cntCorrente,cntPoupanca);
    					op = scan.nextFloat();
    					if(saldoPoupanca < op){
    						System.out.println("\nSaldo Insuficiente!!!!!! \nTente novamente!!!!!!\n");
    						System.out.printf("\nSaldo da conta poupança: %.2f \n", saldoPoupanca);
    					}
    					else{
							saldoPoupanca -= op;
							saldoCorrente += op;
    						System.out.printf("\n*** \nSaldo atual na Conta Corrente %.2f", saldoCorrente);
    						System.out.printf("\n Saldo atual na Conta Poupança %.2f \n***", saldoPoupanca);
    						count = 2;
    					}
    				}while(count != 2);
    			}
    			else{
    				System.out.println("-----------Número Inválido-------------");
    			}


    		}
    		else if(x == 4){

				System.out.println("Senhor " + nome);
				System.out.printf("\n*** \nSaldo atual na Conta Corrente %.2f ", saldoCorrente);
    			System.out.printf("\nSaldo atual na Conta Poupança %.2f \n***", saldoPoupanca);
    		}
    		else if(x == 5){
				System.out.println("Obrigado por trabalhar com o nosso baco!!!");
    			count = 0;
    		}
    		else{
    			System.out.println("-----------Número Inválido-------------");
    		}
    	}while(count != 0);
    }

}