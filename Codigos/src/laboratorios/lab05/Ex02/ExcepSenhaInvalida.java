package laboratorios.lab05.Ex02;

public class ExcepSenhaInvalida extends Exception{

	public ExcepSenhaInvalida(String erro) {
		super("Senha Inválida: "+erro);
	}
}
