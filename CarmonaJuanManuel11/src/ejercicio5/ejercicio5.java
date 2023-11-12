package ejercicio5;

import java.util.Scanner;

/*Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una
 * empresa y detectar si existe brecha salarial entre ambos. El programa pedirá por teclado la
 * información de N personas distintas (valor también introducido por teclado). Para cada
 * persona, pedirá su género (0 para varón y 1 para mujer) y su sueldo. Esta información debe
 * guardarse en una única matriz. Luego se mostrará por pantalla el sueldo medio de cada
 * género
 * Autor: Juan Manuel Carmona Ruiz
 * Fecha: 4/11/22*/
public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Indique la cantidad de sueldos a introducir:");
		int n=scn.nextInt();
		int[][]sueldos=new int[n][2];
		int acumVar=0;
		int acumMuj=0;
		int contVar=0;
		int contMuj=0;
		for(int i=0;i<sueldos.length;i++) { //i representa a cada usuario que introduce su género y sueldo
			for(int j=0;j<sueldos[0].length;j++) {
				if(j==0) {
					System.out.println("Indique su género(0 para varón, 1 para mujer): "); //En la columna 0 se registra el género
					sueldos[i][j]=scn.nextInt();
				}
				if(j==1) {
					System.out.println("Indique el sueldo"); //En la columna 1 se registra el sueldo
					sueldos[i][j]=scn.nextInt();
				}
			}	
		}
		for(int i=0;i<sueldos.length;i++) {
			if(sueldos[i][0]==0) { //Esta parte se ejecuta cuando el género es varón
				acumVar+=sueldos[i][1];
				contVar++;
			}else {
				if(sueldos[i][0]==1) { //Esta parte se ejecuta cuando el género es mujer
					acumMuj+=sueldos[i][1];
					contMuj++;	
				}
			}				
		}
		System.out.println("Sueldo medio del varón: "+(acumVar/contVar)+"\nSueldo medio de la mujer: "+(acumMuj/contMuj));		
	}				
			
}
