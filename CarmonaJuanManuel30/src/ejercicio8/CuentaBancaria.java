package ejercicio8;

import java.util.ArrayList;

public class CuentaBancaria {

	private String titular;
	private String iban;
	private double saldo;
	
	private static int numeroIban;
	
	private static final String ESPAÑA;
	
	ArrayList<Double> movimientos=new ArrayList();
	
	static {
		ESPAÑA="ES";
		numeroIban=0;
	}

	public CuentaBancaria(String titular) {
		this.titular=titular;
		
		iban=ESPAÑA.concat(Integer.toString(numeroIban));
		saldo=0;
		numeroIban++;
	}
	
	public String getIban() {
		return iban;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double ingresarDinero(double dinero,ArrayList<Double> movimientos) throws AvisarHaciendaException{
		if(dinero>0) {
			saldo+=dinero;
		}	
		if(dinero>3000) {
            throw new AvisarHaciendaException(titular, iban, "Ha realizado un ingreso superior a 3000 euros, se ha notificado a Hacienda");

		}
		movimientos.add(dinero);
		return saldo;
	}
	
	public double retirarDinero(double dinero,ArrayList<Double> movimientos) throws CuentaException, AvisarHaciendaException{
		if(dinero>0) {
			saldo=saldo-dinero;
		}	
		if(dinero>3000) {
			throw new AvisarHaciendaException(titular, iban, "Ha realizado una retirada superior a 3000 euros, se ha notificado a Hacienda");
		}
		if(saldo<=-50) {
			saldo+=dinero;
		}else {
			if (saldo>-50 && saldo<0) {
				throw new CuentaException("Saldo negativo");
			}
		}
		movimientos.add(-dinero);
		return saldo;
	}
	
	public String registroMovimientos(ArrayList<Double> movimientos) {

		String registro=" ";
		
		for (Double i : movimientos) {
			 registro += i.toString()+"\n";
		}
		
		return registro;
	}
	
	@Override
	public String toString() {
		
		String imprime="\nIBAN: "+getIban().toString()+"\nTitular: "+getTitular().toString()+"\nSaldo:"+Double.toString(getSaldo());
		return imprime;
	
	}
}
