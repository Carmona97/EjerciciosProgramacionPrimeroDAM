package ejercicio3;

public class Triangulo implements IFigura2D{
	
	 	private double base;
	    private double altura;


	    public Triangulo(double base, double altura) {
	    	
	        this.base = base;
	        this.altura = altura;
	        
	    }
	    
	    public double calculoHipotenusa() {
	    	
	    	return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
	    	 
	    }

	    public double perimetro() {
	    	
	        return base + calculoHipotenusa()*2;
	         
	    }

	    public double area() {
	    	
	        return (base*altura)/2;
	        
	    }

	    public void escalar(double escala) {
	    	
	        base *= escala;
	        altura *= escala;

	    }

	    public void imprimir() {
	    	
	        System.out.println("Triángulo de base " + base + " y altura " + altura + "\nPerimetro = " + perimetro() + "\nArea = " + area()+"\n");
	        
	    }
}
