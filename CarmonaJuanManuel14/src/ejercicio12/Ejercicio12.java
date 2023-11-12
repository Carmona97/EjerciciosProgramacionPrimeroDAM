package ejercicio12;
/*Realiza un programa que dado un valor en kilómetros nos lo traduce a millas. El programa debe
tener una función que reciba como parámetro una cantidad en kilómetros y nos la devuelva en
millas.
Juan Manuel Carmona Ruiz
25/11/2022*/
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce la cantidad de kilometros");
		int kilometros=scn.nextInt();
		System.out.println(kilometros+" kilometros son "+conversor(kilometros)+" millas");
	}
	public static double conversor(int kilometros) {
		double millas=kilometros*1.60934;
		return millas;
	}
	
}
