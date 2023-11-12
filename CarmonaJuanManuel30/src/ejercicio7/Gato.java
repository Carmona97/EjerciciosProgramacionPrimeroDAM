package ejercicio7;

public class Gato {

	private String nombre;
	private int edad;
	
	public Gato(String nombre, int edad) throws Exception {
		
		comprobarNombre(nombre);
		comprobarEdad(edad);
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws Exception{
		comprobarNombre(nombre);
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws Exception{
		comprobarEdad(edad);
	}

	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	 public void comprobarNombre(String nombre) throws Exception {
		
		do {
			if (nombre.length() < 3) {
				throw new Exception("El nombre es mas corto de lo permitido, elija otro nombre");
			} else {
				this.nombre = nombre;
			} 
		} while (nombre.length()<3);
		
	}
	 
	public void comprobarEdad(int edad) throws Exception{
		do {
			if (edad < 0) {
				throw new Exception("La edad no puede ser negativa, vuelva a introducirla");
			} else {
				this.edad = edad;
			} 
		} while (edad<0);
	}
}
