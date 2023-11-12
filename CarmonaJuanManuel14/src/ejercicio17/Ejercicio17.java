package ejercicio17;
/*Realiza un programa que nos pida número enteros hasta que se introduzca el 0, diciéndonos,
para cada número introducido si es primo o no. Hay que recordar que un número es primo si es
divisible por si mismo y por 1. El 1 no es primo por convenio. Se debe crear una función que
pasándole un número entero devuelva si es primo o no.
Juan Manuel Carmona Ruiz
25/11/2022*/
import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce un número");
		int num=scn.nextInt();		
		if(esPrimo(num)==true) {
			System.out.println("El número es primo");
		}else {
			System.out.println("El número no es primo");
		}
	}

	public static boolean esPrimo(int numero) {	
		boolean esPrimo=false;
		int contador=0;
		for(int i=1;i<=numero;i++) {
			if(numero%i==0) {
				contador++;
			}
		}
		if(contador==2) {
			esPrimo=true;
		}else {
			esPrimo=false;
		}
		return esPrimo;
	}
}
