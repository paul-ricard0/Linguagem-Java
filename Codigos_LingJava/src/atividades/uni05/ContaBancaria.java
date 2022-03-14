package atividades.uni05;

public class ContaBancaria {
	
	float saldo;
	int estado; // 0 - inativo, 1 - bloqueado, 2 - ativo
	
	
	//************** OPERACOES *******************//
	public void efetuarSaque(float valor) 
			throws ValorInvalidoException, 
			SaldoInsuficienteException, 
			ContaBloqueadaParaOperacoesException{

		// valor invalido (menor que zero)
		validarValorOperacao(valor, "Saque");	
		

		// estado inválido (inativa, bloqueada)
		validarEstadoConta();	
		
		
		// saldo insuficiente
		if (saldo < valor) {
			throw new SaldoInsuficienteException(saldo, valor);
		}
		
		// caso de sucesso
		saldo = saldo - valor;
		System.out.println("Saque de " + valor + " realizado com sucesso.");
		System.out.println("Saldo disponível: " + saldo);
	}
	
	
	public void efetuarDeposito(float valor) 
			throws ValorInvalidoException, ContaBloqueadaParaOperacoesException{
		
		// valor invalido (menor que zero)
		validarValorOperacao(valor, "Deposito");
		
		// estado inválido (inativa, bloqueada)
		validarEstadoConta();
		
		// caso de sucesso
		saldo = saldo - valor;
		System.out.println("Saque de " + valor + " realizado com sucesso.");
		System.out.println("Saldo disponível: " + saldo);
	}
	//*******************************************//
	
	
	
	
	//************** MÉTODOS *******************//
	private void validarEstadoConta() throws ContaBloqueadaParaOperacoesException{
		if(estado !=2) {
			throw new ContaBloqueadaParaOperacoesException(estado);
		}
	}
	
	private void validarValorOperacao(float valor, String tipoOperacao) throws ValorInvalidoException{
		if(valor <= 0) {
			throw new ValorInvalidoException(valor, tipoOperacao);
		}
	}
	//*******************************************//
	

}

