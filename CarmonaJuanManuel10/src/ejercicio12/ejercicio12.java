package ejercicio12;
/*Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con
 * distintas opciones:
 * a. Mostrar valores.
 * b. Introducir valor.
 * c. Salir.
 * La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una
 * posición P, luego escribirá V en la posición P del array. El menú se repetirá indefinidamente
 * hasta que el usuario elija la opción ‘c’ que terminará el programa.
 * Autor Juan Manuel Carmona Ruiz
 * Fecha 1/11/22*/
import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int[] enteros=new int[10];		
		int i=0;
		int opcion=0;
		int contador=0;
		while(opcion!=3) {
			System.out.println("Seleccione un digito para realizar una de las siguientes acciones:\n1. Mostrar valores\n2. Introducir valor\n3. Salir");
			opcion=scn.nextInt();
			if(opcion==2) {
				System.out.println("Introduzca un valor:");
				enteros[i]=scn.nextInt();
				System.out.println("Introduzca una posicion");
				i=scn.nextInt();
				contador++;
			}else {
				if(contador==10) {
					System.out.println("Ya se han introducido 10 valores");
				}
			}
			if(opcion==1) {
				for(i=0;i<enteros.length;i++) {
					System.out.println("el numero introducido es: "+enteros[i]+" y la posicion: "+(i+1));
				}
			}
		}
	}

}
