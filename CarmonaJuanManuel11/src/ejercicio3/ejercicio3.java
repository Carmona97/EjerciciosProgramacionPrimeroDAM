package ejercicio3;
/*Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
 * introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
 * matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
 * menores que cero y cuántos son igual a cero.
 * Autor: Juan Manuel Carmona Ruiz
 * Fecha:3/11/22*/
import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce la cantidad de filas");
		int n=scn.nextInt();
		System.out.println("Introduce la cantidad de columnas");
		int m=scn.nextInt();
		int matriz[][]=new int[n][m];
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) { //Recorro las columnas de cada una de las filas y le pido al usuario que introduzca un valor
				System.out.println("Introduce un valor");
				matriz[i][j]=scn.nextInt();
				
			}			
		}
		int contadorNeg=0;
		int contadorPos=0;
		int cero=0;
		System.out.print("Los valores de la matriz son: ");
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.print(matriz[i][j]+" "); //Imprimo los valores dados en consola y distingo a que contador le corresponde cada numero
				if(matriz[i][j]<0) {
					contadorNeg++;
				}else {
					if(matriz[i][j]==0) {
						cero++;
					}else {
						if(matriz[i][j]>0) {
							contadorPos++;
						}
					}
				}				
			}
		}
		System.out.println("\nHay "+contadorNeg+" números menores que 0\nHay "+cero+" numeros iguales a 0\nHay "+contadorPos+" numeros mayores que 0");
	}

}
