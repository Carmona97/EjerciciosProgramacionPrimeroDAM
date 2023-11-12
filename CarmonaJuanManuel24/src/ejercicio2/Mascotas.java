package ejercicio2;

import java.time.LocalDate;

public abstract class Mascotas {

	protected String nombre;
	protected int edad;
	protected String estado;
	protected LocalDate fechaNacimiento;
	
	protected static int agno;
	protected static int mes;
	protected static int dia;
	
	static {
		dia=1;
		mes=1;
		agno=2000;
	}
	
	public Mascotas(String nombre,int edad,String estado,LocalDate fechaNacimiento) {
		
		this.nombre=nombre;
		this.edad=edad;
		this.estado=estado;
		this.fechaNacimiento=fechaNacimiento.of(agno, mes, dia);
		
	}
	
	public void setDiaNacimiento(int dia) {
		
		this.dia=dia;
		
	}
	
	public void setMesNacimiento(int mes) {
		
		this.mes=mes;
		
	}

	public void setAgnoNacimiento(int agno) {
	
	this.agno=agno;
	
	}
	
	public String Cumpleagnos() {
		
		return fechaNacimiento.getDayOfYear()+"-"+fechaNacimiento.getMonthValue()+"-"+fechaNacimiento.getYear();
		
	}
	
	public String habla() {
		
		return "";
		
	}
	
	public void morir() {
		
		estado="Muerto";
		
	}
	
	public String muestra() {
		
		return "Nombre: "+nombre+"\nEdad: "+Integer.toString(edad)+"\nEstado: "+estado+"\nFecha de nacimiento: "+fechaNacimiento.toString()+"\nHace: "+habla();
		
	}
}
