package ejercicio2;
/*Escribe un programa que pida la edad por teclado y muestre por pantalla si eres mayor de edad
 * o no. Implementa y utiliza la función:
 * boolean esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario
 * Juan Manuel Carmona Ruiz
 * 15/11/22*/
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce tu edad");
		int a=scn.nextInt();
		if(esMayorEdad(a)==true) {
			System.out.println("Eres mayor de edad");
		}else {
			System.out.println("No eres mayor de edad");
		}
	}

	public static boolean esMayorEdad(int a) {
		boolean esMayorEdad=false;
		if(a>=18) {
			esMayorEdad=true;		
		}
		return esMayorEdad;
	}
}
