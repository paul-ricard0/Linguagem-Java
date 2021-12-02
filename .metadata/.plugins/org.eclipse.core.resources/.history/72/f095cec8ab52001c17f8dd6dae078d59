package laboratorios.lab03_lab04;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/*
Utilizando interfaces gráficas de usuário em Java (GUIs) e conjuntos de dados EM MEMÓRIA, apresente uma solução em forma de software que resolva o problema abaixo:

Tela:

Cadastro e listagem (N)

Número registro:    1
Nome completo:      [             ]
CPF:                [             ]
Email:              [             ]
Telefone:           [             ]
Data de Nascimento: [             ]

<Voltar> <Avançar>      <Salvar> <Excluir>
(N): apresenta a quantidade de registros salvos
<Voltar>: acessa o registro anterior
<Avançar>: acessa o próximo registro, se existir. Caso contrário, exibe um formulário vazio para criação
<Salvar>: Salva o registro (existente ou novo) na lista (ArrayList)
<Excluir>: remove o registro da lista (arranjo)

Partes (MVC):
- Visão: compomentes de interface
- Controle: execução de eventos a partir da interface
- Modelo: dados armazenados e exibidos na visão

 */



public class Main {
	
	//************************** Modelo **********************************//
	private static List<String> nomesList = new ArrayList<String>();
	private static List<String> cpfList = new ArrayList<String>();
	private static List<String> emailList = new ArrayList<String>();
	private static List<String> telefoneList = new ArrayList<String>();
	private static List<String> dataNascimentoList = new ArrayList<String>();
	

	private static int index = 0;
	
	//*******************************************************************//

	public static void main(String[] args) {

		
		JFrame frame = new JFrame("Cadastro");
		
		var pf = new PessoaFisica();
		
		var banco  = new ArrayList<String>();
		

		//****************************************************//
		// Serve para que?
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		//***************************************************//
		
		frame.setSize(1720, 1080);
		
		var painelPrincipal = frame.getContentPane();
		
		painelPrincipal.setSize(1720, 1080);
		
		
		

		
						//Norte
		var painelNorte = new JPanel(new FlowLayout());
		
		var listagem = new JLabel("  Cadastro e listagem " + nomesList.size());
		painelNorte.add(listagem);
		


		
						//Centro
		var painelCentro = new JPanel(new GridLayout(6,2));
		

		var registro = new JLabel("   Número registro:");
		var registroBox = new JLabel(""+(index+1));
		painelCentro.add(registro); 
		painelCentro.add(registroBox); 
		
		
		var nome = new JLabel("   Nome completo:");
		var nomeBox = new JTextField();
		painelCentro.add(nome);
		painelCentro.add(nomeBox);
		
		
		
		var cpf = new JLabel("   CPF:");
		var cpfBox = new JTextField();
		painelCentro.add(cpf); 
		painelCentro.add(cpfBox); 
		
		
		
		var email = new JLabel("   E-mail:");
		var emailBox = new JTextField();
		painelCentro.add(email);
		painelCentro.add(emailBox); 
		
		
		
		var telefone = new JLabel("   Telefone:");
		var telefoneBox = new JTextField();
		painelCentro.add(telefone);
		painelCentro.add(telefoneBox);
		
		
		
		var dataNascimento = new JLabel("   Data de Nascimento:");
		var dataNascimentoBox = new JTextField();
		painelCentro.add(dataNascimento); 
		painelCentro.add(dataNascimentoBox);
		

		
		
		
		
						//Sul
		var painelSul = new JPanel(new FlowLayout());
		
		var voltar = new JButton("Voltar");
		var next = new JButton("Next");
		var salvar = new JButton("Salvar");
		var excluir = new JButton("Excluir");
		painelSul.add(voltar);
		painelSul.add(next);
		painelSul.add(salvar);
		painelSul.add(excluir);
		
		
		
		

		// **************** adicionando ao painel *****************//
		painelPrincipal.add(painelNorte, BorderLayout.NORTH);
		painelPrincipal.add(painelCentro, BorderLayout.CENTER);
		painelPrincipal.add(painelSul, BorderLayout.SOUTH);
		
		
		
		

		// **************** mandando exibir o painel ****************//
		frame.pack();
		frame.setVisible(true);
		
		
		
		
		
		// ****************** Controle *****************//
		
		excluir.setEnabled(false);
		
		salvar.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				
				index = nomesList.size();
				
				var nome = nomeBox.getText();
				if(nome.trim().isBlank()) {  //Verificando se ta em branco
					return;
				}
				nomesList.add(nome);

				
				var cpf = cpfBox.getText();
				cpfList.add(cpf);
				
				
				var email = emailBox.getText();
				emailList.add(email);
				
				
				var telefone = telefoneBox.getText();
				telefoneList.add(telefone);
				
				
				var dataNascimento = dataNascimentoBox.getText();
				dataNascimentoList.add(dataNascimento);


				
				listagem.setText(" Cadastro e listagem " + nomesList.size());
				
				registroBox.setText(""+(nomesList.size()+1));
				nomeBox.setText("");
				cpfBox.setText("");
				emailBox.setText("");
				telefoneBox.setText("");
				dataNascimentoBox.setText("");
				
				System.out.println(nomesList.size());
				System.out.println(nomesList);
				System.out.println("Index: "+index+ "\n");	
				
				//Desabilando o Exlcuir
				excluir.setEnabled(false);
			}
		});
		
		
		//****** Next *****///
		next.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				
				index++;
				if(index < nomesList.size()) {
					registroBox.setText(""+(index+1));
					nomeBox.setText(nomesList.get(index));
					cpfBox.setText(cpfList.get(index));
					emailBox.setText(emailList.get(index));
					telefoneBox.setText(telefoneList.get(index));
					dataNascimentoBox.setText(dataNascimentoList.get(index));
					
				}else {
					index = nomesList.size();
					registroBox.setText(""+ (index+1));
					nomeBox.setText("");
					cpfBox.setText("");
					emailBox.setText("");
					telefoneBox.setText("");
					dataNascimentoBox.setText("");
				}
				
				System.out.println(nomesList.size());
				System.out.println(nomesList);
				System.out.println("Index: "+index+ "\n");	
				listagem.setText(" Cadastro e listagem " + nomesList.size());
				
				//Habilitar o Excluir
				excluir.setEnabled(!nomesList.isEmpty());
				if(index==nomesList.size()) {
					excluir.setEnabled(false);
				}
			}
		});

		
		//****** Voltar *****//
		voltar.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {

				index--;
				if(index >= 0) {
					registroBox.setText(""+(index+1));
					nomeBox.setText(nomesList.get(index));
					cpfBox.setText(cpfList.get(index));
					emailBox.setText(emailList.get(index));
					telefoneBox.setText(telefoneList.get(index));
					dataNascimentoBox.setText(dataNascimentoList.get(index));
					
				}else {
					index = 0;
				}
				
				System.out.println(nomesList.size());
				System.out.println(nomesList);
				System.out.println("Index: "+index+ "\n");	
				listagem.setText(" Cadastro e listagem " + nomesList.size());
				
				//Habilitar o Excluir
				excluir.setEnabled(!nomesList.isEmpty());
			}
		});
		
		
		//****** Excluir *****//
		excluir.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				var nome = nomeBox.getText();
				if(nome.trim().isBlank()) {
					return;
				}
				
				if(index < nomesList.size()) {
					nomesList.remove(nome);
				}
				
				
				if(index < 0) {
					index = 0;
				}
			
				
				if(nomesList.size()>0 && index < nomesList.size() ) {
					registroBox.setText(""+(index+1));
					nomeBox.setText(nomesList.get(index));
					cpfBox.setText(cpfList.get(index));
					emailBox.setText(emailList.get(index));
					telefoneBox.setText(telefoneList.get(index));
					dataNascimentoBox.setText(dataNascimentoList.get(index));
				}else {
					nomeBox.setText("");
					cpfBox.setText("");
					emailBox.setText("");
					telefoneBox.setText("");
					dataNascimentoBox.setText("");
				}
				
				
				System.out.println(nomesList.size());
				System.out.println(nomesList);
				System.out.println("Index: "+index+ "\n");	
				listagem.setText(" Cadastro e listagem " + nomesList.size());
				
				
				//Habilitar o Excluir
				excluir.setEnabled(!nomesList.isEmpty());
				if(index==nomesList.size()) {
					excluir.setEnabled(false);
				}
			}
		} );
		
		
	}

}


