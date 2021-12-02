package laboratorios.lab05.Ex02;

import javax.swing.JOptionPane;

public class TesteSenha {

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
