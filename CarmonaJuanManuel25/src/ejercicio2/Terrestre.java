package ejercicio2;

public class Terrestre extends Vehiculo {
	
    protected int numRuedas;

    public Terrestre(String matricula, String modelo, int numRuedas) {
    	
        super(matricula, modelo);
        this.numRuedas = numRuedas;
        
    }

    public int getNumRuedas() {
    	
        return numRuedas;
        
    }

	
	public String imprimir() {
		
		return "numRuedas:" + numRuedas + "\nmatricula:" + matricula + "\nmodelo:" + modelo;
		
	}

	
}