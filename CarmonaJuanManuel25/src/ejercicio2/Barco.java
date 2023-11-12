package ejercicio2;

public class Barco extends Acuatico {
	
    private boolean tieneMotor;

    public Barco(String matricula, String modelo, int eslora, boolean tieneMotor) {
    	
        super(matricula, modelo, eslora);
        this.tieneMotor = tieneMotor;
        
    }

    public boolean tieneMotor() {
    	
        return tieneMotor;
        
    }

	@Override
	public String imprimir() {
		
		return "tieneMotor:" + tieneMotor + "\neslora:" + eslora + "\nmatricula:" + matricula + "\nmodelo:"+ modelo;
		
	}

 
}