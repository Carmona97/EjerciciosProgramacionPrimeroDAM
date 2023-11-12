package ejercicio2;

public abstract class Vehiculo {
	
    protected String matricula;
    protected String modelo;

    public Vehiculo(String matricula, String modelo) {
    	
        this.matricula = matricula;
        this.modelo = modelo;
        
    }

    public String getMatricula() {
    	
        return matricula;
        
    }

    public String getModelo() {
    	
        return modelo;
        
    }


}
