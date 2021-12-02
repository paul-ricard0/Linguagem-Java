package laboratorios.lab05.Ex02;


import javax.swing.JOptionPane;

/*
Entrada: uma senha (String) informada pelo usuário
Saída: informar se a senha está válida de acordo com as regras abaixo:
- Tamanho mínimo 8 máximo 12
- Mínimo uma letra maiúscula
- Mínimo um dígito (0-9)
- Mínimo um dos símbolos ! @ # ? ]
- Não pode haver repetições: ex AA, cc
- Não pode ter espaços

Obs: Utilizar uma exceção para representar cada situação anormal e implementar o tratamento desta exceção com uma mensagem para o usuário (i.e. JOptionPane).

Ex: "abcd123 " (espaço)

Saída: Senha Inválida: não pode ter espaços. Tente novamente.
 */


public class Main {

	public static void main(String[] args) throws ExcepSenhaInvalida{
		// TODO Auto-generated method stub
		
		int chave = 0;
		
		
		do {
			String senha = JOptionPane.showInputDialog("Digite a Senha: ");
			
			try {
				Tools.validarSenha(senha);
				chave++;
			}catch(ExcepSenhaInvalida ex){
				System.out.println(ex.getMessage());
			}
		}while(chave != 1 );
		
		
		
		System.out.print("\nSenha validada com SUCESSO");
	}
	
	

}


