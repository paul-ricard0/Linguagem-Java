package teste_treino;

import javax.swing.JOptionPane;

public class SelectExemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Object[] possibleValues = {"First", "Second", "Third"};
		
		Object selectedValue = JOptionPane.showInputDialog(null, "Choose one", "Input", JOptionPane.INFORMATION_MESSAGE, 
				null, possibleValues, possibleValues[0]);
		
		
		System.out.println(selectedValue);
	}

}
