package ejercicio19;
/*Realiza un programa que permita comprobar si una terna de valores enteros (3 valores) se ajusta
a la ecuación de Pitágoras: x ² + y ² = z ². El programa solicita al usuario los valores x, y, z. Se
deberá crear una función a la que se le pase x, y, z y devuelva si son iguales o no.
Juan Manuel Carmona Ruiz
25/11/2022*/
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce el valor de X en la ecuacion de pitagoras:");
		int x=scn.nextInt();
		System.out.println("Introduce el valor de Y en la ecuacion de pitagoras:");
		int y=scn.nextInt();
		System.out.println("Introduce el valor de Z en la ecuacion de pitagoras:");
		int z=scn.nextInt();
		
		if(pitagoras(x,y,z)==true) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
	}
	public static boolean pitagoras(int x,int y, int z) {
		int xCuadrado=(int)Math.pow(x, 2);
		int yCuadrado=(int)Math.pow(y, 2);
		int zCuadrado=(int)Math.pow(z, 2);
		boolean pitagoras=false;
		if(xCuadrado+yCuadrado==zCuadrado) {
			pitagoras=true;
		}
		return pitagoras;
	}
}
