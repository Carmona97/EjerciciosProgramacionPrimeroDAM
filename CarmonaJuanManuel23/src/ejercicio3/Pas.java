package ejercicio3;

/*Juan Manuel Carmona Ruiz 1 Dam*/

public class Pas extends Personal{

	private boolean aleman;
	private boolean chino;
	private boolean ingles;
	private String areaAtencion;
	protected String titulacion;
	private static int idiomasConocidos;
	
	static {
		idiomasConocidos=0;
	}
	
	public Pas(String dni, String nombre, String apellidos, int edad, char genero, double salario, String telefono, String email,boolean aleman,boolean chino,boolean ingles,String areaAtencion) {
		
		super(dni, nombre, apellidos, edad, genero, salario, telefono, email);
		this.aleman=aleman;
		this.chino=chino;
		this.ingles=ingles;
		this.areaAtencion=areaAtencion;
	}
	
	//Devuelve un numero entero que indica la cantidad de idiomas conocidos
	
	public int numIdiomas() {
		
		if(aleman==true) {
			idiomasConocidos++;
		}
		
		if(chino==true) {
			idiomasConocidos++;
		}
		
		if(ingles==true) {
			idiomasConocidos++;
		}
		
		return idiomasConocidos;
	}
	
	//Se introduce por parametro el idioma del cual se quiere cambiar el estado
	
	public void cambioIdioma(String idiomaCambio) {
		
		idiomaCambio.toUpperCase();
		
		if(idiomaCambio=="ALEMAN" && aleman==true) {
			aleman=false;
		}else {
			if(idiomaCambio=="ALEMAN" && aleman==false) {
				aleman=true;
			}
		}
		
		if(idiomaCambio=="CHINO" && chino==true) {
			chino=false;
		}else {
			if(idiomaCambio=="CHINO" && chino==false) {
				chino=true;
			}
		}
		
		if(idiomaCambio=="INGLES" && ingles==true) {
			ingles=false;
		}else {
			if(idiomaCambio=="INGLES" && ingles==false) {
				ingles=true;
			}
		}
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nAleman: "+aleman+"\nChino: "+chino+"\nIngles: "+ingles+"\n"+areaAtencion;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
}
