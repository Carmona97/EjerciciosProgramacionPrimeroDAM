package ejercicio3;

public class Trabajadores {
	
	//Variables de la clase
	
	private String nombre;
	private int edad;
	private String sexo;
	private String estadoCivil;
	private double salarioBase;
	
	// Constructor con parametros que inicializa las variables 
	
	public Trabajadores(String nombre,int edad,String sexo,String estadoCivil,double salarioBase) {
		
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;
		this.estadoCivil=estadoCivil;
		this.salarioBase=salarioBase;
		
	}

	// Metodos para obtener y establecer nombre,edad,sexo,estado civil y salario base
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		comprobarSexo(sexo);
		this.sexo = sexo;		
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		comprobarEstadoCivil(estadoCivil);
		this.estadoCivil = estadoCivil;		
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	//Metodo que comprueba el sexo de la persona y en caso de no ser valido lo establece como femenino
	
	public static String comprobarSexo(String sexo) {
		
		String sexoMayus=sexo.toUpperCase();
		
		if(sexoMayus.equals("MASCULINO")) {
			sexo="MASCULINO";
		}else {
			sexo="FEMENINO";
		}
		
		return sexo;
	}
	
	//Metodo que comprueba el estado civil de la persona y en caso de no ser valido lo establece como soltero
	
	public static String comprobarEstadoCivil(String estadoCivil) {
	
		String estadoCivilMayus=estadoCivil.toUpperCase();
		
		if(estadoCivilMayus.equals("CASADO")) {
			estadoCivil="CASADO";
		}else {
			estadoCivil="SOLTERO";
		}
		
		return estadoCivil;
		
	}
	
	//Metodo que imprime la informacion del objeto
	
	@Override
	public String toString() {
		return "Trabajadores [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", estadoCivil=" + estadoCivil
				+ ", salarioBase=" + salarioBase + "]";
	}
}
