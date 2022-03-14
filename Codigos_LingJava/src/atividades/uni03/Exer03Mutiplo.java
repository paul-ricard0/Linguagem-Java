package atividades.uni03;

import javax.swing.JOptionPane;

/**
 * Problema
 * Entrada: Ler do usu�rio um n�mero inteiro positivo N
 * Sa�da: Exibir todos os m�ltiplos de N de 1 a 100
 * 
 * Obs:implementar com tratamento de erro de entrada
 * 
 * @author paulo
 *
 */
public class Exer03Mutiplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int n=0;
		boolean sucesso = false;
		
		while(!sucesso) {
			
			String s = JOptionPane.showInputDialog("Digite um n�mer inteiro: ");
			
			if (s ==null || s.trim().length() == 0) {
				JOptionPane.showMessageDialog(null, "Para continuar tem que digitar um valor");
				System.exit(0);
			}
			
			
			//n�o for numero
			try {
				n = Integer.parseInt(s);
				
				if (n < 0) {
					throw new RuntimeException("Valor negativo: " + n);
				}
				
				sucesso = true;
			} catch(NumberFormatException ex) {
				//n�o � n�mero
				JOptionPane.showMessageDialog(null, "Valor inv�lido" + s, "ERRO", JOptionPane.ERROR_MESSAGE );
			} catch(RuntimeException ex) {
				//valor � negativo
				JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE );
			}
			
			
			
			
			//n�o for positivo
		}
			
		String saida = "";
		for (int i = 0; i <= 100; i = i+n) {
			saida = saida + i +", ";
		}
		
		
		JOptionPane.showMessageDialog(null, saida);
	}

}


