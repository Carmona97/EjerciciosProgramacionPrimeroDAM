package ejercicio2;

import java.time.LocalDate;

public class Agenda {

	//Variables de la clase
	
	private String nombre;
	private String direccion;
	private String telefono;
	private String email;
	private LocalDate fechaNacimiento;
	
	// Constructor con parametros que inicializa las variables 
	
	public Agenda(String nombre,String direccion,String telefono,String email,LocalDate fechaNacimiento) {
		
		this.nombre=nombre;
		this.direccion=direccion;
		this.telefono=telefono;
		this.email=email;
		this.fechaNacimiento=fechaNacimiento;
		
	}

	// Metodos para obtener y establecer nombre, direccion, telefono,email y fecha de nacimiento
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	//Metodo que imprime la informacion del objeto
	
	@Override
	public String toString() {
		return "Agenda [nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", email=" + email+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
	
}
