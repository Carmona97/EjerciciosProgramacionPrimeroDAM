package ejercicio2;

public class Moto extends Terrestre {
	
    private String color;

    public Moto(String matricula, String modelo, int numRuedas, String color) {
    	
        super(matricula, modelo, numRuedas);
        this.color = color;
        
    }

    public String getColor() {
    	
        return color;
        
    }

	@Override
	public String imprimir() {
		
		return "color:" + color + "\nnumRuedas:" + numRuedas + "\nmatricula:" + matricula + "\nmodelo:" + modelo;
		
	}

  
}