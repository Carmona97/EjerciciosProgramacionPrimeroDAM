package ejercicio5;
/*Introducir 10 número y mostrar media de los positivos, negativos y la cantidad de 0
 * Autor: Juan Manuel Carmona
 * Fecha 17/10/22*/

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce 10 números: ");
		int cantneg=0, cantpos=0,intro=1,num=0,ceros=0;
		double medneg=0, medpos=0;
		while(intro<=10){
			num=scn.nextInt();
			if(num<0) {
				medneg=num+medneg;
				cantneg++;
			}else {
				if(num==0) {
					ceros++;
				}else {
					if(num>0) {
						medpos=num+medpos;
						cantpos++;
					}
				}
			}
			intro++;
		}
		System.out.println("La media de los números positivos es "+medpos/cantpos+"\nLa media de los números negativos es "+medneg/cantneg+"\nSe ha introducido el cero "+ceros);
	}

}
