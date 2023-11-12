package ejercicio2;
/*Programa que almacena en un array 10 numeros introducidos en la consola y que realiza la suma de los numeros introducidos
 * Autor Juan Manuel Carmona Ruiz
 * Fecha 25/10/22*/
import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce 10 números: ");
		int num[]=new int[10];
		int suma=0;
		for(int i=0;i<num.length;i++) {
			num[i]=scn.nextInt();						
		}
		for(int i=0;i<num.length;i++) {
			suma+=num[i];
			System.out.print(suma+" ");
		}
	}

}
