package atividades.uni05;


public class ValorInvalidoException extends Exception{

	public ValorInvalidoException(float valor, String tipoOperacao) {
		super("Valor inv�lido para "+ tipoOperacao +": " + valor);
	}
}

