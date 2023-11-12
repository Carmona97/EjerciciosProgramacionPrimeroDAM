package ejercicio9;
/*Programa que muestra la suma y el producto de los 10 primeros numeros naturales
 * Autor Juan Manuel Carmona Ruiz
 * Fecha 24/10/22*/
public class ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma=0,producto=1;
		for(int i=1;i<=10;i++) {
			suma+=i;
			producto*=i;			
		}
		System.out.println("La suma de los 10 primeros numeros naturales es "+suma+"\nEl producto de los 10 primero numeros naturales es "+producto);
	}

}
