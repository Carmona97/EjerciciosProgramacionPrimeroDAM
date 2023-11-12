package ejercicio1;

public class Atleta {
	
	//Variables de la clase
	
	private int edad;
	private String nombre;
	private double talla;
	
	// Constructor con parametros que inicializa las variables 
	
	public Atleta(int edad,String nombre,double talla) {
		
		this.edad=edad;
		this.nombre=nombre;
		this.talla=talla;
		
	}
	
	// Constructor sin parametros que inicializa las variables con valores por defecto

	public Atleta() {
		edad=0;
		nombre=null;
		talla=0;
	}

	// Metodos para obtener y establecer la edad, el nombre y la talla del atleta
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getTalla() {
		return talla;
	}

	public void setTalla(double talla) {
		this.talla = talla;
	}

	//Metodo que imprime la informacion del objeto
	
	@Override
	public String toString() {
		return "Atleta [edad=" + edad + ", nombre=" + nombre + ", talla=" + talla + "]";
	}
	
}
