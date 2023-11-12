package ejercicio3;

public class Rectangulo implements IFigura2D{
	
	 	private double ancho;
	    private double alto;

	    public Rectangulo(double ancho, double alto) {
	    	
	        this.ancho = ancho;
	        this.alto = alto;
	        
	    }

	    public double perimetro() {
	    	
	        return (ancho*2)+(alto*2);
	        
	    }

	    public double area() {
	    	
	        return ancho * alto;
	        
	    }

	    public void escalar(double escala) {
	    	
	        ancho *= escala;
	        alto *= escala;
	        
	    }

	    public void imprimir() {
	    	
	        System.out.println("Rectángulo de ancho " + ancho + " y alto " + alto + "\nPerimetro = " + perimetro() + "\nArea = " + area()+"\n");
	        
	    }
}
