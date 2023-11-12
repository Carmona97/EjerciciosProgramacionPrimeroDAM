package ejercicio2;
/*Juan Manuel Carmona Ruiz 1Dam
 * tendrá dos atributos de tipo int y con visibilidad private (cilindrada y potencia).
 * habrá que crear dos constructores, uno de ellos sin parámetros colocará pordefecto como cilindrada “2000” y potencia “150”, el segundo constructor a partir de dos parámetros establecerá la cilindrada y la potencia.
 * Crear métodos public get y set para poder introducir y consultar ambos atributos (cilindrada y potencia).
 * Crear un método toString que devuelva la cilindrada y la potencia de un coche*/
public class Coche {
	
	private int cilindrada;
	private int potencia;
	
	public Coche() {
		
		cilindrada=2000;
		potencia=150;
		
	}
	
	public Coche(int cilindrada, int potencia) {
		
		this.cilindrada=cilindrada;
		this.potencia=potencia;
		
	}
	
	public void setCilindrada(int cilindrada) {
		
		this.cilindrada=cilindrada;
		
	}
	
	public void setPotencia(int potencia) {
		
		this.potencia=potencia;
		
	}
	
	public int getCilindrada() {
		
		return cilindrada;
		
	}

	public int getPotencia() {
		
		return potencia;
		
	}
	
	public String imprimir() {
		
		return "Cilindrada: "+Integer.toString(getCilindrada())+", potencia: "+Integer.toString(getPotencia());
		
	}
}
