package teste_treino;

import javax.swing.JOptionPane;

public class ConfirmDaijogExemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int resposta = JOptionPane.showConfirmDialog(null, "Do you like coffee?", "choose one", JOptionPane.YES_NO_OPTION);
		System.out.println(resposta);
		
	}

}
