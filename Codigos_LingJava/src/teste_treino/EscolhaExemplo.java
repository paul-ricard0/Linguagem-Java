package teste_treino;

import javax.swing.JOptionPane;

public class EscolhaExemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Object[] options = {"OK", "CANCEL", "MAYBE"};
		
		int valor = JOptionPane.showOptionDialog(null, "Click OK to continue", "Warning", JOptionPane.DEFAULT_OPTION,
						JOptionPane.WARNING_MESSAGE, null, options, options[0]);
		
		System.out.println(valor);
		
		
		
	}

}
