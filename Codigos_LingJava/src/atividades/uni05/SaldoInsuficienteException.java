package atividades.uni05;

public class SaldoInsuficienteException extends Exception {
	
	public SaldoInsuficienteException(float saldo, float valor) {
		super("Saldo da conta (" + saldo + ") insuficiente para saque: " + valor);
	}
}
