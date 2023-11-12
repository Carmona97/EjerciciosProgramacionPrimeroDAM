package ejercicio2;

public class Coche extends Terrestre {
	
    private boolean aireAcondicionado;

    public Coche(String matricula, String modelo, int numRuedas, boolean aireAcondicionado) {
    	
        super(matricula, modelo, numRuedas);
        this.aireAcondicionado = aireAcondicionado;
        
    }

    public boolean tieneAireAcondicionado() {
    	
        return aireAcondicionado;
    }

    @Override
    public String imprimir() {
    	
        return "modelo: " + modelo + "\nMatricula: " + matricula + "\nNumero de ruedas: " + Integer.toString(numRuedas) + "\nAire acondicionado: " + aireAcondicionado;
        
    }
}