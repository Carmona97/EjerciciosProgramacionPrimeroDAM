package ejercicio1;
/*Crea un programa que pida una cadena de texto por teclado y luego muestre cada palabra
 * de la cadena en una línea distinta. 
 * Juan Manuel Carmona Ruiz
 * 14/11/2022*/
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
		//Se introduce por teclado el String
		
		System.out.println("Introduzca una frase");
		String texto=scn.nextLine();
		
		//Se declara la variable espacio para compararla en el bucle
		
		char espacio=' ';
		for(int i=0;i<texto.length();i++) {	
			
			//El bucle compara cada caracter de cada posicion y si es un espacio, hace un salto de linea
			
			if(texto.charAt(i)==' ') {
				System.out.println();
			}else {
				System.out.print(texto.charAt(i));
			}
		}

	}

}
