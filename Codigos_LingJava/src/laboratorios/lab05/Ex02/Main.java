package laboratorios.lab05.Ex02;


import javax.swing.JOptionPane;

/*
Entrada: uma senha (String) informada pelo usu�rio
Sa�da: informar se a senha est� v�lida de acordo com as regras abaixo:
- Tamanho m�nimo 8 m�ximo 12
- M�nimo uma letra mai�scula
- M�nimo um d�gito (0-9)
- M�nimo um dos s�mbolos ! @ # ? ]
- N�o pode haver repeti��es: ex AA, cc
- N�o pode ter espa�os

Obs: Utilizar uma exce��o para representar cada situa��o anormal e implementar o tratamento desta exce��o com uma mensagem para o usu�rio (i.e. JOptionPane).

Ex: "abcd123 " (espa�o)

Sa�da: Senha Inv�lida: n�o pode ter espa�os. Tente novamente.
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


