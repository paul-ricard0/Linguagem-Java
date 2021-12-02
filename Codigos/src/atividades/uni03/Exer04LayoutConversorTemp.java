package atividades.uni03;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
/**
 * Problema:
 * Entra: um valor real digitado pelo usuário (temperatura em celsius ou fahrenheit)
 * Saída: exibir a temperatura convertida
 * 
 * Ex: 30 celsius
 * Saída: 70 fahrenheit
 * 
 * objetivo: construir a interface gráfica de usuário (somente janela)
 * 
 * =========================================
 * [label]: [caixa de texto]
 * () Celsius
 * () Fahrenheit
 * 
 * [Resultado]: [ 70% Fahrenheit ]
 * =========================================
 * 
 * @author paulo
 *
 */
public class Exer04LayoutConversorTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// criar a janela
		JFrame frame = new JFrame("Conversortemp");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		// definir os atributos da janela
		frame.setSize(600, 400);
		
		var painelPrincipal = frame.getContentPane();
		
		
		
		
		
		
						//Norte
		var painelNorte = new JPanel(new FlowLayout());
		
		var RotuloPedido = new JLabel( "Digite uma temperatura: ");
		painelNorte.add(RotuloPedido);
		
		var Entrada = new JTextField(5);
		painelNorte.add(Entrada);
		
		
		//var comboTipo = new JComboBox<String>();
		//comboTipo.addItem("Celsius");
		//comboTipo.addItem("Fahrenheit");
		//painelNorte.add(comboTipo);
		

		
		
		
						//Centro
		var painelCentro = new JPanel(new GridLayout(3,1));
		
		var Celsius = new JRadioButton("Celsius");
		painelCentro.add(Celsius);
		
		var Fahrenheit = new JRadioButton("Fahremheit");
		painelCentro.add(Fahrenheit);
		
	     // criar um grupo de botoes para fazzer a logica de selecao unica
		 var grupo = new ButtonGroup();
	     grupo.add(Celsius);
	     grupo.add(Fahrenheit);

	     var painelGrupo = new JPanel();
	     painelGrupo.add(Celsius);
	     painelGrupo.add(Fahrenheit);
	        
	     painelCentro.add(painelGrupo);
	        
	     
	     var botao = new JButton("Ok");
	     painelCentro.add(botao);
		
	     
	     
	     
		
		
							//Sul
		var painelSul = new JPanel(new FlowLayout());
		
		var RotoloResultado = new JLabel("Resultado: ");
		painelSul.add(RotoloResultado);
		
		var Resposta = new JLabel("70");
		
		painelSul.add(Resposta);
		
		
		
		painelPrincipal.add(painelNorte, BorderLayout.NORTH);
		painelPrincipal.add(painelCentro, BorderLayout.CENTER);
		painelPrincipal.add(painelSul, BorderLayout.SOUTH);
		
		// - adicionar o componente na janela de acordo com o gerenciador de layout
		
		
		
		// mandar exibir a tela com os componentes
		frame.pack();
		frame.setVisible(true);
		
		
	    botao.addActionListener(new ActionListener() {
		    	
	    	 public void actionPerformed(ActionEvent e) {	 	
	    		 	
	    		 	var valor = ""+ Entrada.getText();
	    		 	if(valor== null || valor.trim().equals("")){
	    		 		JOptionPane.showMessageDialog(frame, "Por favor, informe um número.");
	    		 		return;
	    		 	}	
    		 
	    		 	
	    		 	String selected = "";
	    		 	if(Celsius.isSelected()) {
	    		 		selected="Celsius";
	    		 	}else if(Fahrenheit.isSelected()){
	    		 		selected = "Fahrenheit";
	    		 	}
	    		 	else {
	    		 		JOptionPane.showMessageDialog(frame, "Por favor, Selecione um tipo.");
	    		 		return;
	    		 	}

	    		 	
	    		 	System.out.println("temperatura informada: " + Entrada.getText() + " " + selected);
	    		 	
	    		 	
	    		 	float temperatura = 0.0f;
	    		 	try {
	    		 		temperatura = Float.parseFloat(valor);
	    		 	}catch(NumberFormatException ex) {
	    		 		JOptionPane.showMessageDialog(frame, "Número inválido", "ERRO", JOptionPane.ERROR_MESSAGE);
	    		 		return;
	    		 	}

	    		 	
	    		 	// F = C * 1.8 + 32
	    		 	float f = Float.parseFloat(Entrada.getText()) * 1.8f + 32;
	    		 	
	    		 	// C = (F-32) / 1.8
	    		 	float c = (Float.parseFloat(Entrada.getText()) - 32) /1.8f;
	    		 	
	    		 	if(selected.equals("Celsius")) {
	    		 		Resposta.setText(f + "Fahrenheit");
	    		 	}else {
	    		 		Resposta.setText(c + "Celsius");
	    		 	}
	    		 	
	    		 	System.out.println(Resposta.getText());
	    	 } 
	     });
		 
	    
	    
	    
		
	}

}


