package provas.sabado_letivo;

import javax.swing.JOptionPane;
import javax.swing.JLabel;





/**
 * Waldir, tentei usar m�todo mas tava ficando quase a mesma coisa e masi complicado, ent�o acabei n�o usando 
 * @author paulo
 *
 */
public class Tools {

	
	//Entrada de n�mero String
	public static String inputString (String pedidoString) {
		
		return JOptionPane.showInputDialog(pedidoString);
	}
	
	//Para saber se o n�mero � maior que o outro
	public static int total (int entrada, int total) {
		
		if(entrada > total) {
			total = entrada;
			
		}
		
		return total;
	}
	
	//Para conferir se os n�mero s�o iguais (conferir o maior com a quantidade de vezes que a letra aparece
	public static boolean maior (int entrada, int maior) {
		if(maior == entrada) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	
	
}
