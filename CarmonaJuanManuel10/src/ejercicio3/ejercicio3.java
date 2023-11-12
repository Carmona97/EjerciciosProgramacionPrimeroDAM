package ejercicio3;
/*Programa que pide 10 numeros y los almacena en un array para posteriormente mostrar el máximo y el mínimo de los numeros introducidos
 * Autor Juan Manuel Carmona Ruiz
 * Fecha 25/10/22*/
import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int num[]=new int[10];
		System.out.println("Introduce 10 numeros: ");
		for(int i=0;i<num.length;i++) {
			num[i]=scn.nextInt();
		}
		int nummax,nummin;
		nummax=num[0];
		nummin=num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]>nummax) {
				nummax=num[i];
			}
			if(num[i]<nummin) {
				nummin=num[i];
			}
		}
		System.out.println("El numero mayor es: "+nummax+"\nEl numero menor es: "+nummin);
	}

}
