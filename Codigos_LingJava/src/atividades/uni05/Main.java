package atividades.uni05;

public class Main {

	public static void main(String[] args){
		var conta = new ContaBancaria();
		conta.saldo = 100.0f;
		conta.estado = 2; // inativa 
		
		try {
			conta.efetuarSaque(-101.01f);	
			
			System.out.println("Saque bem sucedido.");
		} catch (ValorInvalidoException | ContaBloqueadaParaOperacoesException | SaldoInsuficienteException ex) {
			System.out.println(ex.getMessage());			
		} finally {
			System.out.println("Terminou.");
		}
	}
	
}
