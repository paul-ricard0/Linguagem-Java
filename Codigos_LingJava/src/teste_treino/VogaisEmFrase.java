package teste_treino;



import javax.swing.JOptionPane;

public class VogaisEmFrase {

	
	/**Método que verifica se um caractere é vogal ou não.
	 * 
	 * @param C o caractere a ser testado
	 * @return true se for vogal, false o contrário 
	 */
	private static boolean caractereEhVogal(char C) {
		return "aeiou".contains("" + C);
	}
	
	
	private static String lerFraseDaTela(String mensagem) {
		
		var fraseMetodo = JOptionPane.showInputDialog(mensagem);			
		
		JOptionPane.showMessageDialog(null, "\nVocê digitou a frase: "+ fraseMetodo +"\n\n");	
		
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

