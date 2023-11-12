package ejercicio3;

public class Circulo implements IFigura2D{
	
		private double radio;

	    public Circulo(double radio) {
	    	
	        this.radio = radio;
	        
	    }

	    public double perimetro() {
	    	
	        return 2 * 3.14 * radio;
	        
	    }

	    public double area() {
	    	
	        return 3.14 * Math.pow(radio, 2);
	        
	    }

	    public void escalar(double escala) {
	    	
	        radio *= escala;
	        
	    }

	    public void imprimir() {
	    	
	        System.out.println("Circulo de radio " + radio + "\nPerimetro = " + perimetro() + "\nArea = " + area()+"\n");
	        
	    }
}
