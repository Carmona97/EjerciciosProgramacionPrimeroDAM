package ejercicio2;

public class Helicoptero extends Aereo {
    private int numHelices;

    public Helicoptero(String matricula, String modelo, int numAsientos, int numHelices) {
        super(matricula, modelo, numAsientos);
        this.numHelices = numHelices;
    }

    public int getNumeroHelices() {
        return numHelices;
    }

    public void setNumeroHelices(int numHelices) {
        this.numHelices = numHelices;
    }

	@Override
	public String imprimir() {
		
		return "numHelices:" + numHelices + "\nnumAsientos:" + numAsientos + "\nmatricula:" + matricula+ "\nmodelo:" + modelo;
		
	}


}
