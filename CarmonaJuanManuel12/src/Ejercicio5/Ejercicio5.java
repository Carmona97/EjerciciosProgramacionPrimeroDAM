package Ejercicio5;
/*Realiza un programa que lea una frase por teclado e indique si la frase es un palíndromo o
 * no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas). Supondremos que
 * el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni acentos, etc.). Un
 * palíndromo es un texto que se lee igual de izquierda a derecha que de derecha a izquierda.
 * Por ejemplo:
 * Amigo no gima
 * Dabale arroz a la zorra el abad
 * Amo la pacífica paloma
 * A man a plan a canal Panama
 * Juan Manuel Carmona Ruiz
 * 14/11/2022*/
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
		//Se introduce la cadena de texto en consola, se suprimen los espacios y se declara la variable inverso 
		
		System.out.println("Introduce una frase");
		String texto=scn.nextLine();
		String textojunto=texto.replace(" ", "");
		String inverso="";
		
		//Se almacenan en la variable inverso los caracteres del texto introducido sin espacios empezando por el caracter en última posición
		
		for(int i=textojunto.length()-1;i>=0;i--) {
			char concatenacion=textojunto.charAt(i);
			inverso+=concatenacion;
		}
		
		//Se comparan la variable inverso y textojunto ignorando las mayusculas e indican si las cadenas de texto son identicas o no
		
		if(textojunto.equalsIgnoreCase(inverso)) {
			System.out.println("Las frase es un palíndromo");
		}else {
			System.out.println("La frase no es un palíndromo");
		}
		
	}
}
