package teste_treino;

import javax.swing.JOptionPane;

public class ParOuImpar {
	
	
	private static int lerNumeroInteiro(String pedido) {
		
		var num= Integer.parseInt(
				JOptionPane.showInputDialog(pedido)
		);
		return num;
	}
	
	private static boolean igualPar(int num) {
		var p = num % 2;
		return p == 0;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valor = lerNumeroInteiro("Digite um número inteiro");
		
		boolean ehPar = igualPar(valor);
		
		JOptionPane.showMessageDialog(null, "O número é "+ (ehPar?"PAR":"IMPAR"));

	}

}

