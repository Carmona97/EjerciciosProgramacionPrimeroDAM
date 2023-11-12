package ejercicio1;
/*Programa que muestra los primeros 20 numeros naturales
 * Autor Juan Manuel Carmona Ruiz
 * Fecha 24/10/22*/
public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1,suma=0;
		System.out.print("Los primeros 20 numeros naturales son: ");
		while(num<=20) {
			suma=num++;
			System.out.print( suma+" " );
		}
	}

}
