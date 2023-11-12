package ejercicio9;

import java.util.Scanner;

/*Realiza un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el más
 * pequeño. Impleméntalo creando únicamente una función a la que le pasemos dos valores (no
 * tres) y nos devuelva el mínimo de los dos valores
 * Juan Manuel Carmona Ruiz
 * 17/11/22*/
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce tres números:");
		int num1=scn.nextInt();
		int num2=scn.nextInt();
		int num3=scn.nextInt();
		
		int menor1=menor(num1,num2);
		int menorFinal=menor(menor1,num3);
		System.out.println("El número menor entre los introducidos es: "+menorFinal);
	}

	public static int menor(int a,int b) {
		if(a<b) {
			return a;
		}else {
			return b;
		}
	}
}
