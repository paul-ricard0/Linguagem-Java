package laboratorios.lab01_lab02;

import javax.swing.JOptionPane;


/**
 * Implementar o cálculo da Tabela de imposto de renda a partir do salário do usuário
 * 
 * @author Paulo Ricardo
 * Data: 03/09/2021
 * Bibliboteca Tools
 */

public class TabelaImposto {
	
	public static void main(String[] args) {
		
		float salario = Tools.inputFloat("Entre com o seu salário: ");
		
		float aliquota = Tools.AliquotaImposto(salario);
		float imposto = Tools.valImposto(salario);
		
		JOptionPane.showMessageDialog(null, 
				"Como seu salário é "+salario+
				"\nCom Aqlíquota de "+aliquota+
				"\nVocê pagará "+imposto+" de imposto");
		
	}
}

