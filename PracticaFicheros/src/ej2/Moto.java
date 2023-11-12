package ej2;

import java.util.ArrayList;

public class Moto extends Vehiculo{


	private String color;

	public Moto(String matricula, int ano, String marca, String color,ArrayList<Cliente> propietarios) {
		super(matricula, ano, marca,propietarios);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Moto [color=" + color + " "+super.toString();
	}
	
	public String id() {
		return "M"+marca.substring(0, 3)+matricula.substring(4, 7);
	}
}
