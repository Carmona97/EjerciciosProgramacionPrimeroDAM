package ejercicio2;

public class Acuatico extends Vehiculo {
	
    protected int eslora;

    public Acuatico(String matricula, String modelo, int eslora) {
    	
        super(matricula, modelo);
        this.eslora = eslora;
        
    }

    public int getEslora() {
    	
        return eslora;
        
    }

	
	public String imprimir() {
		
		return "eslora:" + eslora + "\nmatricula:" + matricula + "\nmodelo:" + modelo;
		
	}
    
}