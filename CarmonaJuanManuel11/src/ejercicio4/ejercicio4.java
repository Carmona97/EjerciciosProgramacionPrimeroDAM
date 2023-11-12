package ejercicio4;

import java.util.Scanner;

/* Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno
 * 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por teclado y luego el
 * programa mostrará la nota mínima, máxima y media de cada alumno.
 * Autor: Juan Manuel Carmona Ruiz
 * Fecha: 4/11/22
*/
public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		double[][] notas=new double[4][5];
		for(int i=0;i<notas.length;i++) {
			System.out.println("Introduzca las notas del alumno "+(i+1));
			for(int j=0;j<notas[i].length;j++) {
				System.out.println("La nota de la asignatura "+(j+1)+" es: ");
				notas[i][j]=scn.nextDouble(); //Almacena las notas de cada asignatura de cada alumno
			}
		}
		double notaMax=notas[0][0]; //Toma como referencia la posicion [0][0] como el máximo
		double notaMin=notas[0][0]; //Toma como referencia la posicion [0][0] como el mínimo
		
		for(int i=0;i<notas.length;i++) {
			double acumulador=0; //Reinicia la suma de las notas para cada alumno
			for(int j=0;j<notas[i].length;j++) {
				if(notas[i][j]>notaMax) {
					notaMax=notas[i][j];
				}
				if(notas[i][j]<notaMin) {
					notaMin=notas[i][j]; 
				}
				acumulador+=notas[i][j];
				
			}
			System.out.println("La nota media del alumno "+(i+1)+" es "+(acumulador/5)+" la nota maxima es: "+notaMax+" la nota minima es: "+notaMin);
		}
	}
}
