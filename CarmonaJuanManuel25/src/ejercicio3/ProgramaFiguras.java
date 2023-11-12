package ejercicio3;

public class ProgramaFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 IFigura2D[] figuras = new IFigura2D[4];

	       
		 figuras[0] = new Cuadrado(5);
		 figuras[1] = new Rectangulo(8, 3);
		 figuras[2] = new Triangulo(4,7);
		 figuras[3] = new Circulo(6);

		 for (int i=0;i<figuras.length;i++) {
			 figuras[i].imprimir();
		 }

		 System.out.println("ESCALA 2\n");
		 
		 for (int i=0;i<figuras.length;i++) {
			 figuras[i].escalar(2);
		 }

		 for (int i=0;i<figuras.length;i++) {
			 figuras[i].imprimir();
		 }

		 System.out.println("ESCALA 0,1\n");
		 
		 for (int i=0;i<figuras.length;i++) {
			 figuras[i].escalar(0.1);
		 }

		 for (int i=0;i<figuras.length;i++) {
			 figuras[i].imprimir();
		 }	    
	}

}
