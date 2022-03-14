package atividades.uni05;

public class Main2 {

	public static void main(String[] args){
		
		var conta = new ContaBancaria();
		conta.saldo = 100f;
		conta.estado = 2;
		
		try {
			conta.efetuarDeposito(10);
			
			System.out.println("Saque bem sucedido.");
		}catch (ValorInvalidoException | ContaBloqueadaParaOperacoesException ex) {
			System.out.println(ex.getMessage());
		}finally {
			System.out.println("Terminou.");
		}
		
	}

}
