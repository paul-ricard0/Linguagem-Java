package teste_treino;



import javax.swing.JOptionPane;

public class VogaisEmFrase {

	
	/**M�todo que verifica se um caractere � vogal ou n�o.
	 * 
	 * @param C o caractere a ser testado
	 * @return true se for vogal, false o contr�rio 
	 */
	private static boolean caractereEhVogal(char C) {
		return "aeiou".contains("" + C);
	}
	
	
	private static String lerFraseDaTela(String mensagem) {
		
		var fraseMetodo = JOptionPane.showInputDialog(mensagem);			
		
		JOptionPane.showMessageDialog(null, "\nVoc� digitou a frase: "+ fraseMetodo +"\n\n");	
		
		fraseMetodo = fraseMetodo.toLowerCase();
		return fraseMetodo;

	}
	
	/** MAIN **/
	public static void main(String[] args) {
		
		int vog = 0;
		
		var frase = lerFraseDaTela("Digite uma frase: ");
		
		for(var c = 0; c < frase.length(); c++) {
			
			var caracter = frase.charAt(c);
			
			if(caractereEhVogal(caracter)){
				vog++;
			}
		}
		
		JOptionPane.showMessageDialog(null, "\nNa frase: " + frase + "\nTemos "+vog+" vogais");
	}


}

