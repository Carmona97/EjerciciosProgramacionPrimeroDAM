package ejercicio2;

public class Avion extends Aereo {
	
    private int tiempoMaximoVuelo;

    public Avion(String matricula, String modelo, int numAsientos, int tiempoMaximoVuelo) {
    	
        super(matricula, modelo, numAsientos);
        this.tiempoMaximoVuelo = tiempoMaximoVuelo;
        
    }

    public int getTiempoMaximoVuelo() {
    	
        return tiempoMaximoVuelo;
        
    }

    public void setTiempoMaximoVuelo(int tiempoMaximoVuelo) {
    	
        this.tiempoMaximoVuelo = tiempoMaximoVuelo;
        
    }

	@Override
	public String imprimir() {
		
		return "tiempoMaximoVuelo:" + tiempoMaximoVuelo + " horas\nnumAsientos:" + numAsientos + "\nmatricula:"+ matricula + "\nmodelo:" + modelo;
		
	}

  
}
