package atividades.uni05;

public class ContaBloqueadaParaOperacoesException extends Exception {
	
	public ContaBloqueadaParaOperacoesException(int estado) {
		super("Esta conta não permite operações - estado: " + estado);
	}

}
