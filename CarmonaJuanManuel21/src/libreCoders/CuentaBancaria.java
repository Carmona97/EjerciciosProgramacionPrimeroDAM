package libreCoders;

import java.util.Arrays;

/**
 * 
 * @author Juanma 1 Dam
 *
 */

public class CuentaBancaria {
	
	private String titular;
	private String iban;
	private double saldo;
	private double movimientos[];
	
	private static int contadorMovimiento;
	private static int numeroIban;
	private static int MOVIMIENTOS_MAX;
	
	private static final String ESPAÑA;
	
	static {
		
		ESPAÑA="ES";
		numeroIban=0;
		contadorMovimiento=0;
		MOVIMIENTOS_MAX=100;
	}

	/**
	 * Crea una nueva cuenta bancaria con el nombre del titular
	 * @param titular Nombre del titular de la cuenta bancaria
	 */
	
	public CuentaBancaria(String titular) {
		
		this.titular=titular;		
		iban=ESPAÑA.concat(Integer.toString(numeroIban));
		saldo=0;
		numeroIban++;
		contadorMovimiento=0;
		movimientos=new double[MOVIMIENTOS_MAX];
		
	}
	
	/**
	 * Devuelve el IBAN de la cuenta bancaria
	 * @return IBAN de la cuenta bancaria
	 */
	
	public String getIban() {
		
		return iban;
	}
	
	/**
	 * Metodo que devuelve el nombre del titular de la cuenta
	 * @return Nombre del titular de la cuenta
	 */
	
	public String getTitular() {
		
		return titular;
	}
	
	/**
	 * Obtiene el saldo actual de la cuenta
	 * @return saldo actual de la cuenta
	 */
	
	public double getSaldo() {
		
		return saldo;
	}
	
	/**
	 * Permite ingresar dinero en la cuenta
	 * @param dinero cantidad de dinero a ingresar
	 * @return saldo actual de la cuenta despues del ingreso
	 */
	
	public double ingresarDinero(double dinero) {
		
		if(dinero>0) {
			saldo+=dinero;
			movimientos[contadorMovimiento]=dinero;
			contadorMovimiento++;
		}	
		
		if(dinero>3000) {
			System.out.println("AVISO: Notificar a Hacienda");
		}
		
		return saldo;
	}
	
	/**
	 * Permite retirar dinero de la cuenta
	 * @param dinero cantidad de dinero a retirar
	 * @return saldo actual de la cuenta despues del retiro
	 */
	
	public double retirarDinero(double dinero) {
		
		if(dinero>0) {
			saldo=saldo-dinero;
			movimientos[contadorMovimiento]=-dinero;
			contadorMovimiento++;
		}	
		
		if(dinero>3000) {
			System.out.println("AVISO: Notificar a Hacienda");
		}
		
		if(saldo<=-50) {
			saldo+=dinero;
			
		}else {
			
			if (saldo>-50 && saldo<0) {
				System.out.println("AVISO: Saldo negativo");
			}		
		}
		
		return saldo;
	}
	
	/**
	 * Permite observar los movimientos realizados en la cuenta
	 * @return movimientos realizados en la cuenta
	 */
	
	public String movimientosCajero() {
		
		return Arrays.toString(movimientos);
		
	}
	
	/**
	 * Metodo que imprime la informacion de la cuenta
	 * @return imprime la imformacion de la cuenta
	 */
	
	public String imprime() {
		
		String imprime="\nIBAN: "+getIban().toString()+"\nTitular: "+getTitular().toString()+"\nSaldo:"+Double.toString(getSaldo());
		return imprime;
	
	}
	
	
	
}
