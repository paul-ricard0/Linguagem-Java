package laboratorios.lab05.Ex01;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Entrada: um conjunto de números inteiros informado pelo usuário
 * Saída: Exibir o conjunto destes números na saída padrão
 * Obs: Realizar todos os tratamentos necessários de exceções
 */

public class Main {

	public static void main(String[] args) 
			throws ExcepNaoNumero, ExcepVazio, ExcepNegativo{
		
		var Lista = new ArrayList<Integer>();
		
		String numStr;
		int chave=0, qtd=0, num=0;
		
		do {

			try {
	
				numStr = JOptionPane.showInputDialog("Digite a quantidade números que deseja: ");
				Tools.verificarNumero(numStr);
				
				qtd = Integer.parseInt(numStr);

				for(int i = 0; i < qtd; i++) {
					
					numStr=JOptionPane.showInputDialog("insira o "+ (i+1) +"° número: ");
					Tools.verificarNumero(numStr);					
					num = Integer.parseInt(numStr);
					Lista.add(num);
				}
				
			chave = 1;
			
			}catch (ExcepNaoNumero | ExcepVazio | ExcepNegativo ex) {
				System.out.println(ex.getMessage());			
			}
			
		}while(chave != 1);
		
		JOptionPane.showMessageDialog(null, Lista);
	
	}

}
