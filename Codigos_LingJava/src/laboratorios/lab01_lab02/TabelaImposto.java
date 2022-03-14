package laboratorios.lab01_lab02;

import javax.swing.JOptionPane;


/**
 * Implementar o c�lculo da Tabela de imposto de renda a partir do sal�rio do usu�rio
 * 
 * @author Paulo Ricardo
 * Data: 03/09/2021
 * Bibliboteca Tools
 */

public class TabelaImposto {
	
	public static void main(String[] args) {
		
		float salario = Tools.inputFloat("Entre com o seu sal�rio: ");
		
		float aliquota = Tools.AliquotaImposto(salario);
		float imposto = Tools.valImposto(salario);
		
		JOptionPane.showMessageDialog(null, 
				"Como seu sal�rio � "+salario+
				"\nCom Aql�quota de "+aliquota+
				"\nVoc� pagar� "+imposto+" de imposto");
		
	}
}

