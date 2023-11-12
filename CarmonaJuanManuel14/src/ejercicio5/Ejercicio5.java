package ejercicio5;
/*Escribe un programa que pida un valor entero en millas y muestre su equivalente en kilómetros.
 * Recuerda que una milla son 1,60934 kilómetros. Implementa y utiliza la función:
 *double millas_a_kilometros(int millas)
 * Devuelve la conversión de millas a kilómetros
 * Juan Manuel Carmona Ruiz
 * 15/11/22*/
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce una valor entero de millas: ");
		int millas=scn.nextInt();
		System.out.println(millas+" millas equivalen a "+millas_a_kilometros(millas)+" kilometros");
	}

	public static double millas_a_kilometros(int millas) {
		double kilometro=1.60934*(double)millas;
		return kilometro;
	}
}
