package ejercicio2;

import java.time.LocalDate;

public class Perro extends Mascotas{

	protected String raza;
	protected boolean pulgas;
	
	public Perro(String nombre,int edad,String estado,LocalDate fechaNacimiento,String raza,boolean pulgas) {
		
		super(nombre, edad, estado, fechaNacimiento);
		this.raza=raza;
		this.pulgas=pulgas;
		
	}
	
	public String habla() {
		
		return "Guauguau";
		
	}
	
	@Override
	public String muestra() {
		return super.toString()+"\nRaza: "+raza+"\nTiene pulgas: "+pulgas;
	}
}
