package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cafetera sony=new Cafetera();
		sony.llenarCafetera();
		sony.servirTaza(100);
		System.out.println(sony.getCapacidadMaxima());
	}

}
