package laboratorios.lab05.Ex03;

import javax.swing.JOptionPane;


/**
*
* Entrada: um CPF (String) digitado pelo usuário
* Saída: informar se o CPF é válido ou não conforme o algoritmo de validação de CPFs
* Obs: Realizar todos os tratamentos necessários de exceções
*/

public class Main {

	public static void main(String[] args) throws ExcepSequenciaInvalida,  ExcepDigitoInvalido, 
	ExcepFormatoInvalido, ExcepVazio, ExcepNaoDigito{
		
		int chave = 0;
		do {
			String cpf = JOptionPane.showInputDialog("Digite o CPF: ");
			
			try {
				
				Tools.validarCPF(cpf);
				
				chave =1;
			}catch(ExcepSequenciaInvalida |  ExcepDigitoInvalido | ExcepNaoDigito | ExcepFormatoInvalido | ExcepVazio ex){
				System.out.println(ex.getMessage());
			};
			
		}while(chave != 1);
		
		
		System.out.print("\nCPF validado como sucesso");
		
	}

}
