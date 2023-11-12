package ejercicio4;
/*Introducir valores positivos, hacer una media de ellos y parar el programa al pulsar el 0
 * Autor: Juan Manuel
 * Fecha:16/10/22*/

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);	
		System.out.println("Introduzca valores enteros positivos:(pulse 0 para detener el programa) ");
		int num=1;
		double suma=0;
		int introducidos=-1;
		
		while(num>0){
			num=scn.nextInt();
			suma+=(double)num;
			introducidos++;
		}
		System.out.println("La media de los números es: "+suma/introducidos+" y los números introducidos: "+introducidos);

	}

}
