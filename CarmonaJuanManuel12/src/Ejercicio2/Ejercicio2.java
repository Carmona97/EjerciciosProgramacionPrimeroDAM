package Ejercicio2;
/*Crea un programa que pida dos cadenas de texto por teclado y luego indique si son iguales,
 * además de si son iguales sin diferenciar entre mayúsculas y minúsculas.
 * Juan Manuel Carmona Ruiz
 * 14/11/2022*/
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
		//Se introducen por consola las dos cadenas de texto
		
		System.out.println("Introduzca una cadena de texto");
		String texto1=scn.nextLine();
		System.out.println("Introduzca otra cadena de texto");
		String texto2=scn.nextLine();
		
		//Se comparan en primer lugar con las mayusculas, posteriormente ignorando las mayúsculas y si no se dan esos casos, los textos son diferentes
		
		if(texto1.equals(texto2)) {
			System.out.println("Los textos son iguales");
		}else {
			if(texto1.equalsIgnoreCase(texto2)){
				System.out.println("Los textos son iguales sin tener en cuenta las mayúsculas");
			}else {
				System.out.println("Los textos son diferentes");
			}
		}
	}

}
