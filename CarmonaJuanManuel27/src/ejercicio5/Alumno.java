package ejercicio5;

//Realizado por Juan Manuel Carmona Ruiz 1DAM el 19-03-2023

import java.time.LocalDate;

public class Alumno {

	 	private int codigo;
	    private String apellidos;
	    private String nombre;
	    private String direccion;
	    private String telefono;
	    private int codigoCiclo;
	    private int cursosAprobados;
	    private LocalDate fechaIngreso;
	    
	    public Alumno(int codigo, String apellidos, String nombre, String direccion, String telefono, int codigoCiclo, int cursosAprobados, LocalDate fechaIngreso) {
	    	
	        this.codigo = codigo;
	        this.apellidos = apellidos;
	        this.nombre = nombre;
	        this.direccion = direccion;
	        this.telefono = telefono;
	        this.codigoCiclo = codigoCiclo;
	        this.cursosAprobados = cursosAprobados;
	        this.fechaIngreso = fechaIngreso;
	        
	    }

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

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

		public int getCodigoCiclo() {
			return codigoCiclo;
		}

		public void setCodigoCiclo(int codigoCiclo) {
			this.codigoCiclo = codigoCiclo;
		}

		public int getCursosAprobados() {
			return cursosAprobados;
		}

		public void setCursosAprobados(int cursosAprobados) {
			this.cursosAprobados = cursosAprobados;
		}

		public LocalDate getFechaIngreso() {
			return fechaIngreso;
		}

		public void setFechaIngreso(LocalDate fechaIngreso) {
			this.fechaIngreso = fechaIngreso;
		}

		@Override
		public String toString() {
			return "Alumno [codigo=" + codigo + ", apellidos=" + apellidos + ", nombres=" + nombre + ", direccion="
					+ direccion + ", telefono=" + telefono + ", codigoCiclo=" + codigoCiclo + ", cursosAprobados="
					+ cursosAprobados + ", fechaIngreso=" + fechaIngreso + "]";
		}
	    
}
