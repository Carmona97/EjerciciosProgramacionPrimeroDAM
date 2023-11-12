package ejercicio13;
/*Crea un programa que permita al usuario almacenar una secuencia aritmética en un array y
 * luego mostrarla. Una secuencia aritmética es una serie de números que comienza por un
 * valor inicial V, y continúa con incrementos de I. Por ejemplo, con V=1 e I=2, la secuencia sería
 * 1, 3, 5, 7, 9… Con V=7 e I=10, la secuencia sería 7, 17, 27, 37… El programa solicitará al
 * usuario V, I además de N (nº de valores a crear).
 * Autor Juan Manuel Carmona Ruiz
 * Fecha 1/11/22*/
import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce la cantidad de números a almacenar: ");
		int n=scn.nextInt();
		int[] sucesion= new int[n];
		System.out.println("Introduce un valor inicial");
		int valor=scn.nextInt();
		System.out.println("Introduce un valor para incrementar");
		int incremento=scn.nextInt();
		for(int i=0;i<sucesion.length;i++) {			
			sucesion[i]=valor+(i*incremento);
			System.out.print("secuencia aritmetica: "+sucesion[i]+" incremento: "+incremento+" posicion: "+(i+1));
		}
		
	}

}
