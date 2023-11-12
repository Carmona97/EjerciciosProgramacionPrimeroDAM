package ejercicio8;
/*Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
 * utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
 * cuántos valores del array son igual o superiores a R.
 * Autor Juan Manuel Carmona Ruiz
 * 1/11/22*/
import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		double aleatorio[]=new double[100];
		System.out.println("Inserte un número: ");
		double num=scn.nextDouble();
		int acumulador=0;
		for(int i=0;i<aleatorio.length;i++) {
			aleatorio[i]=Math.random(); 
			if(num<=aleatorio[i]) {
				acumulador++;
			}
			System.out.println("El número aleatorio es: "+aleatorio[i]);
		}
		System.out.println("\nHan habido "+acumulador+" números mayores o iguales que el introducido");
	}

}
