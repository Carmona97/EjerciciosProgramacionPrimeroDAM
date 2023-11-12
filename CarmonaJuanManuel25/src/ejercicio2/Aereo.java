package ejercicio2;

public class Aereo extends Vehiculo {
	
    protected int numAsientos;

    public Aereo(String matricula, String modelo, int numAsientos) {
    	
        super(matricula, modelo);
        this.numAsientos = numAsientos;
        
    }
    

    public int getNumAsientos() {
    	
        return numAsientos;
    }

	
	public String imprimir() {
		
		return "numAsientos:" + numAsientos + "\nmatricula:" + matricula + "\nmodelo:" + modelo;
		
	}
    
}