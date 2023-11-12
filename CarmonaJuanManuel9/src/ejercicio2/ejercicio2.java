package ejercicio2;
/*Programa que muestra los numeros pares de 1 a 200 y su contador de 2 en 2
 * Autor Juan Manuel Carmona Ruiz
 * Fecha 24/10/22*/
public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0, contador=0,suma=0;
		while(suma<200) {
			suma+=num+2;
			contador+=num+2;
			System.out.println("Los pares son: "+suma);
		}
		System.out.println("\nSe ha contado: "+contador+" veces");
	}

}
