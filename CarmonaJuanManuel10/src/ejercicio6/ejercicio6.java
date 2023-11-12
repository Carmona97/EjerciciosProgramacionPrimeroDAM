package ejercicio6;
/*Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño N,
 * escriba M en todas sus posiciones y lo muestre por pantalla.
 * Autor: Juan Manuel Carmona Ruiz
 * Fecha 1/11/22*/
import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce las posiciones que quieres mostrar");
		int n=scn.nextInt();		
		int pos[]=new int[n];	
		System.out.println("Introduce el valor que quieres añadir");
		int m=scn.nextInt();
		for(int i=0;i<pos.length;i++) {
			pos[i]=m;
			System.out.println("En la posición "+(i+1)+" el valor es: "+m);
		}
		
	}

}
