package ejercicio1;
/*Programa que recoge 10 numeros introducidos por consola y que los almacena en el array num para mostrarlos posteriormente
 * autor Juan Manuel Carmona Ruiz
 * Fecha 25/10/22*/
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Escribe 10 números");
		int num[]=new int[10];

		for(int i=0;i<num.length;i++) {
			num[i]=scn.nextInt();
		}
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
	}

}
