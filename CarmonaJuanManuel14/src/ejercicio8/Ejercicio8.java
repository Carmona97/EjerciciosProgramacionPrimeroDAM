package ejercicio8;

import java.util.Scanner;

/*Escribe un programa que pida un valor N entero y luego muestre: el sumatorio des 1 a N, el
 * productorio de 1 a N y el valor intermedio entre 1 y N. Implementa y utiliza las funciones:
 *int suma1aN(int n) // Devuelve la suma de enteros de 1 a n
 *int producto1aN(int n) // Devuelve el producto de enteros de 1 a n
 *double intermedio1aN(int n) // Devuelve el valor intermedio entre 1 y n
 *Juan Manuel Carmona Ruiz
 *17/11/22*/
public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int num=scn.nextInt();
		System.out.println("El sumatorio de 1 a N es: "+suma1aN(num)+"\nEl producto de 1 a n es: "+producto1aN(num)+"\nEl intermedio de 1 a N es: "+intermedio1aN(num));

	}

	public static int suma1aN(int n) {
		int sumatorio=0;
		for(int i=0;i<=n;i++) {	
			sumatorio+=i;
		}
		return sumatorio;
	}
public static int producto1aN(int n) {
		int producto=1;
		for(int i=1;i<=n;i++) {
			producto*=i;
		}
		return producto;
	}
	public static double intermedio1aN(int n) {
		double intermedio=(double)(n+1)/2;
		return intermedio;
	}
}
