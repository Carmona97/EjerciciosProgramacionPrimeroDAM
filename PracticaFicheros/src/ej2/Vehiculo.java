package ej2;

import java.util.ArrayList;

public abstract class Vehiculo {

	protected String matricula;
	protected int ano;
	protected String marca;
	protected ArrayList<Cliente> propietarios = new ArrayList();
	
	public Vehiculo(String matricula, int ano, String marca, ArrayList<Cliente> propietarios) {
		this.matricula = matricula;
		this.ano = ano;
		this.marca = marca;
		this.propietarios = propietarios;
	}

	public ArrayList<Cliente> getPropietarios() {
		return propietarios;
	}

	public void setPropietarios(ArrayList<Cliente> propietarios) {
		this.propietarios = propietarios;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", ano=" + ano + ", marca=" + marca + ", propietarios="
				+ propietarios + "]";
	}

	public abstract String id();
		
	
}
