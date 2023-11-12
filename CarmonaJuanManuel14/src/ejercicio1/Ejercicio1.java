package ejercicio1;
/*Escribe un programa que pida dos números reales por teclado y muestre por pantalla elresultado de multiplicarlos. Implementa y utiliza la función:
 * double multiplica(double a, double b) 
 * Devuelve la multiplicación de dos números
 * Juan Manuel Carmona Ruiz
 * 15/11/22*/
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce un número");
		double a=scn.nextDouble();
		System.out.println("Introduce otro número");
		double b=scn.nextDouble();
		System.out.println("El resultado es "+multiplica(a,b));
	}

	public static double multiplica(double a,double b) {
		double multiplica=a*b;
		return multiplica;
	}
}
