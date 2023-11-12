package ejercicio2;

import java.time.LocalDate;

public class Loro extends Aves{

	protected String origen;
	protected boolean habla;
	
	public Loro(String nombre,int edad,String estado,LocalDate fechaNacimiento,String pico,boolean vuela,String origen,boolean habla) {
		
		super(nombre, edad, estado, fechaNacimiento,pico,vuela);
		this.origen=origen;
		this.habla=habla;
		
	}
}
