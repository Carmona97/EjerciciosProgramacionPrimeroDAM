package ejercicio4;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hora primera = new Hora(3,7,0);
		System.out.println(primera.imprime());
		System.out.println(primera.aSegundos());
		primera.anterior();
		System.out.println(primera.imprime());
		
		Hora segunda= new Hora();
		System.out.println(segunda.deSegundos(700));

	}

}
