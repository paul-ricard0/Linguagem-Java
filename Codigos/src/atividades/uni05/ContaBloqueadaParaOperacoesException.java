package atividades.uni05;

public class ContaBloqueadaParaOperacoesException extends Exception {
	
	public ContaBloqueadaParaOperacoesException(int estado) {
		super("Esta conta n�o permite opera��es - estado: " + estado);
	}

}
