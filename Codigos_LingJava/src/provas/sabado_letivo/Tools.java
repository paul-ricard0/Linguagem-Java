package provas.sabado_letivo;

import javax.swing.JOptionPane;
import javax.swing.JLabel;





/**
 * Waldir, tentei usar método mas tava ficando quase a mesma coisa e masi complicado, então acabei não usando 
 * @author paulo
 *
 */
public class Tools {

	
	//Entrada de número String
	public static String inputString (String pedidoString) {
		
		return JOptionPane.showInputDialog(pedidoString);
	}
	
	//Para saber se o número é maior que o outro
	public static int total (int entrada, int total) {
		
		if(entrada > total) {
			total = entrada;
			
		}
		
		return total;
	}
	
	//Para conferir se os número são iguais (conferir o maior com a quantidade de vezes que a letra aparece
	public static boolean maior (int entrada, int maior) {
		if(maior == entrada) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	
	
}
