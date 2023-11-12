package Ejercicio4;
/*Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas ‘a’,
 * cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe diferenciar entre
 * mayúsculas y minúsculas. Por ejemplo dada la frase “Mi mama me mima” dirá que hay:
 * Nº de A's: 3
 * Nº de E's: 1
 * Nº de I's: 2
 * Nº de O's: 0
 * Nº de U's: 0
 * Juan Manuel Carmona Ruiz
 * 14/11/2022*/
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		//Se introduce por consola una cadena de texto y se ponen todos los caracteres en minuscula
		
		System.out.println("Introduce una cadena de texto");
		String texto=scn.nextLine();
		String textominusc=texto.toLowerCase();
		
		//Se declaran contadores para cada una de las vocales
		
		int contadorA=0;
		int contadorE=0;
		int contadorI=0;
		int contadorO=0;
		int contadorU=0;
		
		//Se recorre el bucle por cada uno de los caracteres y si es vocal, el contador de dicha vocal aumenta en 1
		
		for(int i=0;i<texto.length();i++) {
			textominusc.charAt(i);
			if(textominusc.charAt(i) == 'a') {
				contadorA++;
			}
			if(textominusc.charAt(i) == 'e') {
				contadorE++;
			}
			if(textominusc.charAt(i) == 'i') {
				contadorI++;
			}
			if(textominusc.charAt(i) == 'o') {
				contadorO++;
			}
			if(textominusc.charAt(i) == 'u') {
				contadorU++;
			}
		}
		System.out.println("Nº de A= "+contadorA+"\nNº de E= "+contadorE+"\nNº de I= "+contadorI+"\nNº de O= "+contadorO+"\nNº de U= "+contadorU);
	}

}
