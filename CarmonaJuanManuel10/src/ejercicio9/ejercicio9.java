package ejercicio9;
/*Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores
 * enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N y
 * mostrará en qué posiciones del array aparece N.
 * Autor Juan Manuel Carmona Ruiz
 * Fecha 1/11/22*/
import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int[] enteros=new int[100];
		System.out.println("Los números aleatorios son: ");
		for(int i=0;i<enteros.length;i++) {
			enteros[i]=(int)(1+Math.random()*10);
			System.out.print(enteros[i]+" ");			
		}
		System.out.println("\nIntroduce un numero entre 1 y 10");
		int n=scn.nextInt();
		System.out.println("El número aparece en las posiciones:");
		for(int i=0;i<enteros.length;i++) {
			if(n==enteros[i]) {
				System.out.print((i+1)+" ");
			}
		}
	}

}
