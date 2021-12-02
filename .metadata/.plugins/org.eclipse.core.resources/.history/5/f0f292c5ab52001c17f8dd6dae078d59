package laboratorios.lab01_lab02;

import javax.swing.JOptionPane;

/**
 * Resolvi fazer tudo usando essa biblicote pq
 * queria treinar programa por "chamadas"(biblioteca pessoal)
 * 
 * @author paulo
 *
 */

public class Tools {
	//Entrada de número inteiro 
	public static int inputInt (String pedidoInt) {
		return Integer.parseInt(
				JOptionPane.showInputDialog(pedidoInt)
		);
	}
	
	//Entra de número float
	public static float inputFloat (String pedidoFloat) {	
		return Float.parseFloat(
				JOptionPane.showInputDialog(pedidoFloat)
		);
	}
	
	//validação de um número Primo
	public static boolean numPrimo (int num) {
		
		int div=0;
		for(int cont = 1; cont <= num; cont++ ) {
			if(num % cont == 0) {
				div++;
			}	
		}
		
		if(div == 2) {
			return true;
		}
		return false;	
	}
	
	//calculo do IMC
	public static float IMC (float alturaImc, float pesoImc) {
		return(pesoImc / (Math.getExponent(alturaImc) ));
	}
	
	//calculo do valor ah pagar de Imposto 
	public static float valImposto (float salario) {
		if(salario <= 1903.98f) {
			return 0;
		}
		if(salario <= 2826.65f) {
			return salario * 0.075f;
		}
		else if(salario <= 3751.05f) {
			return salario * 0.15f;
		}
		else if(salario <= 4664.68f) {
			return salario * 0.225f;
		}
		else{
			return salario * 0.275f;
		}
	}
	
	//Porcentagem que pagará de imposto
	public static float AliquotaImposto (float salario) {
		if(salario <= 1903.98f) {
			return 0;
		}
		if(salario <= 2826.65f) {
			return 7.5f;
		}
		else if(salario <= 3751.05f) {
			return 15f;
		}
		else if(salario <= 4664.68f) {
			return 22.5f;
		}
		else{
			return 27.5f;
		}
	}
	

}
