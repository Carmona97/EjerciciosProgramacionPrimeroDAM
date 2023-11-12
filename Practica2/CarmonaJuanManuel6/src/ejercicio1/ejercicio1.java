package ejercicio1;

import java.util.Scanner;
/*Realizar un programa en Java que solicite al usuario dos números, num1 y num2.
Comprobar si num1 es mayor que num2, si es al revés o si son iguales.
Mostrar por pantalla al usuario un mensaje informando del resultado
Autor: Juan Manuel Carmona Ruiz
Fecha 07/10/2022*/

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Introduce dos números:");
		
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		
		int mayor= Math.max(num1,num2);
		
		if (num1 == num2) {
			System.out.println("Los números son iguales");
		}
		else {
		System.out.println("El número mayor es: "+mayor);
		}

	}

}
