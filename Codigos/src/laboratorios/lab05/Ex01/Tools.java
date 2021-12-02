package laboratorios.lab05.Ex01;

public class Tools {
	
	//************** OPERACOES *******************//
	public static void verificarNumero(String numStr) 
			throws ExcepNaoNumero, ExcepVazio, ExcepNegativo{
		
		validarVazio(numStr);
		
		validarTrueNumero(numStr);
		int num = Integer.parseInt(numStr);
		
		validarNegativo(num);
		
	}
	//*******************************************//
	
	
	
	
	//************** MÉTODOS *******************//
	private static void validarTrueNumero(String num) throws ExcepNaoNumero{
		for (int i=0; i<num.length(); i++) {
			char ch = num.charAt(i);
			if(!Character.isDigit(ch)) {
				throw new ExcepNaoNumero(num);
			}
		}
	}
	
	private static void validarVazio(String num) throws ExcepVazio{
		if(num == null || num.trim().length() == 0){
			throw new ExcepVazio();
		}
	}
	
	private static void validarNegativo(int num) throws ExcepNegativo{
		if(num<0) {
			throw new ExcepNegativo("tamanho", num);	
		}
	}
	//*******************************************//
	
}

