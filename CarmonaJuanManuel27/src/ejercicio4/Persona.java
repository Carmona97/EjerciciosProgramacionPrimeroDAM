package ejercicio4;

//Realizado por Juan Manuel Carmona Ruiz 1DAM el 19-03-2023

public class Persona {

	private String sexo;
	private String estadoCivil;
	private int edad;
	
	public Persona(String sexo,String estadoCivil,int edad) {
		
		this.sexo=sexo;
		this.estadoCivil=estadoCivil;
		this.edad=edad;
		
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public static String comprobarSexo(String sexo) {
		
		String sexoMayus=sexo.toUpperCase();
					
			if(sexoMayus.equals("MASCULINO")) {
				sexo="MASCULINO";
			}else {
					sexo="FEMENINO";
			}	
		
			return sexo;
			
	}
	
	public static String comprobarEstadoCivil(String estadoCivil) {
		
		String estadoCivilMayus=estadoCivil.toUpperCase();
		
		if(estadoCivilMayus.equals("CASADO")) {
			estadoCivil="CASADO";
		}else {
			if(estadoCivilMayus.equals("DIVORCIADO")) {
				estadoCivil="DIVORCIADO";
			}else {
				if(estadoCivilMayus.equals("VIUDO")) {
					estadoCivil="VIUDO";
				}else {
						estadoCivil="SOLTERO";	
				}
			}
		}
		
		return estadoCivil;
		
	}
	

	@Override
	public String toString() {
		return "Persona [sexo=" + sexo + ", estadoCivil=" + estadoCivil + ", edad=" + edad + "]";
	}
	
	
}
