package ejercicio3;
/*Programa que muestra los numeros pares de 1 a 200 y su contador de 1 en 1
 * Autor Juan Manuel Carmona Ruiz
 * Fecha 24/10/22*/
public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0, contador=0,suma=0;
		while(suma<200) {
			suma+=num+2;
			contador++;
			System.out.println("Los pares son: "+suma);
		}
		System.out.println("\nSe ha contado: "+contador+" veces");
	}

}
