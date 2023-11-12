package ejercicio1;

public class Empleado {

	private final String nombre;
	private final String dni;
	private double sueldoBrutoMensual;
	private int edad;
	private String telefono;
	private String direccion;
	private double sueldoNeto;
	
	public Empleado(String nombre,String dni,double sueldoBrutoMensual) {
		this.nombre=nombre;
		this.dni=dni;
		this.sueldoBrutoMensual=sueldoBrutoMensual;
	}
	
	public Empleado(String nombre,String dni,double sueldoBrutoMensual,int edad,String telefono,String direccion) {
		this.nombre=nombre;
		this.dni=dni;
		this.sueldoBrutoMensual=sueldoBrutoMensual;
		this.edad=edad;
		this.telefono=telefono;
		this.direccion=direccion;
	}
	
	
	
	public double getSueldoBrutoMensual() {
		return sueldoBrutoMensual;
	}

	public void setSueldoBrutoMensual(double sueldoBrutoMensual) {
		this.sueldoBrutoMensual = sueldoBrutoMensual;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public double sueldoNeto() {
		double sueldoBrutoAnual=sueldoBrutoMensual*12;
		if(sueldoBrutoAnual<12000) {
			sueldoNeto=sueldoBrutoAnual-(sueldoBrutoAnual*0.2);
		}else {
			if(sueldoBrutoAnual>=12000 && sueldoBrutoAnual<=25000) {
				sueldoNeto=sueldoBrutoAnual-(sueldoBrutoAnual*0.3);
			}else {
				sueldoNeto=sueldoBrutoAnual-(sueldoBrutoAnual*0.4);
			}
		}
		return sueldoNeto;
	}
	
	public String imprimir() {
		return "Nombre: "+getNombre()+"\nDni: "+dni+"\nEdad: "+Integer.toString(getEdad())+"\nSueldo bruto mensual: "+Double.toString(getSueldoBrutoMensual())+"\nTelefono: "+getTelefono()+"\nDireccion: "+getDireccion()+"\nSueldo neto anual: "+Double.toString(sueldoNeto())+"\n";
	}
}
