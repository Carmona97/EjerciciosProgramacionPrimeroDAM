package ejercicio1;
/*
 * Juan Manuel Carmona Ruiz 1DAM
 *Esta clase extenderá de la clase Humano
 * Tendrá un atributo protected, de tipo String, documento
 * Tendrá un único constructor el cual como parámetros recibirá un nombre,apellido y un documento.
 * Se creará un método identificacion que devolverá el nombre, apellido y el documento, este método hará uso de super para reaprovechar el método nombrecompleto de la clase padre. 
 * */

public class Ciudadano extends Humano{
	
	protected String documento;
	
	public Ciudadano(String nombre,String apellido, String documento) {
		
		super(nombre,apellido);
		this.documento=documento;
		
	}
	
	public String identificacion() {
		
		return super.nombreCompleto()+" "+documento;
		
	}
	

}
