package ejercicio8;

public class CuentaException extends Exception{

	private String mensajeDeError;
	
	public CuentaException(String mensajeDeError) {
		
		this.mensajeDeError=mensajeDeError;
		
	}
	
	public String saldoNegativo() throws Exception{
		return "El saldo de la cuenta es negativo";
	}
	
}
