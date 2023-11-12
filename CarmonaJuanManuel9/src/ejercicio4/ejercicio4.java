package ejercicio4;
/*Programa que muestra los numeros del 1 al que el usuario indique en la consola
 * Autor Juan Manuel Carmona Ruiz
 * Fecha 24/10/22*/
import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int limite=scn.nextInt(),num=1,suma=-1;
		
		while(suma<limite) {			
			suma=num++;
			System.out.println("Los numeros son: "+suma);
		}
		
	}

}
