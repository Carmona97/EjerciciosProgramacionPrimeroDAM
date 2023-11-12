package Ejercicio3;
/*. Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos. Luego
 * mostrará un código de usuario (en mayúsculas) formado por la concatenación de las tres
 * primeras letras de cada uno de ellos. Por ejemplo si se introduce “Lionel”, “Tarazón” y
 * “Alcocer” mostrará “LIOTARALC”.
 * Juan Manuel Carmona Ruiz
 * 14/11/2022*/
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
		//Se introducen las cadenas de texto por teclado
		
		System.out.println("Introduce un nombre");
		String nombre=scn.nextLine();
		System.out.println("Introduce un apellido");
		String apellido1=scn.nextLine();
		System.out.println("Introduce otro apellido");
		String apellido2=scn.nextLine();
		
		//Se toman las posiciones 0,1 y 2 de cada cadena y se concatenan en mayúsculas
		
		String subnombre=nombre.substring(0,3);
		String subapellido1=apellido1.substring(0,3);
		String subapellido2=apellido2.substring(0,3);
		String suma= subnombre.concat(subapellido1).concat(subapellido2);
		System.out.println(suma.toUpperCase());
	}

}
