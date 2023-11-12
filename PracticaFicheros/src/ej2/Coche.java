package ej2;

import java.util.ArrayList;

public class Coche extends Vehiculo{

	private int numRuedas;

	public Coche(String matricula, int ano, String marca, int numRuedas,ArrayList<Cliente> propietarios) {
		super(matricula, ano, marca, propietarios);
		this.numRuedas = numRuedas;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
	
	
	
	@Override
	public String toString() {
		return "Coche [numRuedas=" + numRuedas + " "+super.toString();
	}

	public String id() {
		return "C"+marca.substring(0, 3)+matricula.substring(4, 7);
	}
}
