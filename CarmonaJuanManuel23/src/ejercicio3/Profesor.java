package ejercicio3;

/*Juan Manuel Carmona Ruiz 1Dam*/

public class Profesor extends Personal{

	private String asignatura1;
	private String asignatura2;
	
	
	public String getAsignatura1() {
		return asignatura1;
	}

	public void setAsignatura1(String asignatura1) {
		this.asignatura1 = asignatura1;
	}

	public String getAsignatura2() {
		return asignatura2;
	}

	public void setAsignatura2(String asignatura2) {
		this.asignatura2 = asignatura2;
	}

	public String getTutor() {
		return tutor;
	}

	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	public int getAgnosExperiencia() {
		return agnosExperiencia;
	}

	public void setAgnosExperiencia(int agnosExperiencia) {
		this.agnosExperiencia = agnosExperiencia;
	}

	private String tutor;
	private int agnosExperiencia;
	protected String titulacion;
	
	public Profesor(String dni, String nombre, String apellidos, int edad, char genero, double salario, String telefono, String email,String titulacion,String asignatura1,String asignatura2,String tutor,int agnosExperiencia) {
		
		super(dni, nombre, apellidos, edad, genero, salario, telefono, email);
		this.titulacion=titulacion;
		this.asignatura1=asignatura1;
		this.asignatura2=asignatura2;
		this.tutor=tutor;
		this.agnosExperiencia=agnosExperiencia;
		
	}
	
	//Aumenta el salario en funcion de los años de experiencia del profesor, siendo del 1% entre el primer y tercer año, 2% entre el tercero y el quinto y de un 5% a partir del quinto año
	
	public void aumentarSalario() {
		
		if(agnosExperiencia>=1 && agnosExperiencia<3) {
			salario=salario+(salario*1/100);
		}else {
			if(agnosExperiencia>=3 && agnosExperiencia<5) {
				salario=salario+(salario*2/100);
			}else {
				if(agnosExperiencia>=5) {
					salario=salario+(salario*5/100);
				}	
			}
		}
	}

	@Override
	public String toString() {
		return "Profesor"+super.toString() +"[titulacion=" + titulacion + ", asignatura1=" + asignatura1 + ", asignatura2=" + asignatura2
				+ ", tutor=" + tutor + ", agnosExperiencia=" + agnosExperiencia + "]";
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
	

}
