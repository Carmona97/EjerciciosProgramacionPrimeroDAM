package ejercicio3;

public class Cuadrado implements IFigura2D{
	
	 	private double lado;

	    public Cuadrado(double lado) {
	    	
	        this.lado = lado;
	        
	    }

	    public double perimetro() {
	    	
	        return 4 * lado;
	        
	    }

	    public double area() {
	    	
	        return lado * lado;
	        
	    }

	    public void escalar(double escala) {
	    	
	        lado *= escala;
	        
	    }

	    public void imprimir() {
	    	
	        System.out.println("Cuadrado de lado " + lado + "\nPerimetro = " + perimetro() + "\nArea = " + area()+"\n");
	        
	    }
	
}
