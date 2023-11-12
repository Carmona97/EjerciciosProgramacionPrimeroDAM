package ejercicio2;

import java.time.LocalDate;

public class Gato extends Mascotas{

	protected String color;
	protected boolean peloLargo;
	
	public Gato(String nombre,int edad,String estado,LocalDate fechaNacimiento,String color,boolean peloLargo) {
		
		super(nombre, edad, estado, fechaNacimiento);
		this.color=color;
		this.peloLargo=peloLargo;
		
	}
	
	public String habla() {
		
		return "miaumiau";
		
	}
	
	@Override
	public String muestra() {
		
		return super.toString()+"\nColor: "+color+"\nTiene pelo largo: "+peloLargo;
	
	}
}
