package ejercicio1;
/*Juan Manuel Carmona Ruiz 1DAM
 * Tendrá dos atributos de tipo string y con visibilidad protected (nombre y apellido) Habrá que crear dos constructores, uno de ellos sin parámetros colocará por defecto como nombre “Juan” y como apellido “García”, el segundo
 * constructor a partir de dos parámetros establecerá el nombre y apellido.( recordar usar this)
 * Crear un método nombreCompleto que devuelva el nombre completo con los valores de nombre y apellido separados por una coma (apellido,nombre)
*/

public class Humano {

	protected String nombre;
	protected String apellido;
	
	public Humano() {
		
		nombre="Juan";
		apellido="Garcia";
		
	}
	
	public Humano(String nombre, String apellido) {
		
		this.nombre=nombre;
		this.apellido=apellido;
		
	}
	
	public String nombreCompleto() {
		return nombre+", "+apellido;
	}
}
