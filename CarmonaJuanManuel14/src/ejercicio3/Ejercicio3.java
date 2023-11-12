package ejercicio3;
/*Escribe un programa que pida dos números enteros por teclado y muestre por pantalla cual es el
 * mínimo. Implementa y utiliza la función:
 * int minimo(int a, int b) // Devuelve el menor entre a y b
 * Juan Manuel Carmona Ruiz
 * 15/11/22*/
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce dos números:");
		int num1= scn.nextInt();
		int num2= scn.nextInt();
		System.out.println("El menor es: "+minimo(num1,num2));
	}

	public static int minimo(int a,int b) {
		if(a<b) {
			return a;
		}else {
			return b;
		}
	}
}
