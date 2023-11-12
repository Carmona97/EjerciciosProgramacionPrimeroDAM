package ejercicio20;
/*Escribe un programa que imprima las tablas de multiplicar del 1 al 10. Implementa una función
que reciba un número entero como parámetro e imprima su tabla de multiplicar.
Juan Manuel Carmona Ruiz
25/11/2022*/
import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		todasTablas();
		System.out.println("\nIntroduce el numero del que quieras ver su tabla de multiplicar: ");
		int num=scn.nextInt();
		tablas(num);
	}

	public static void tablas(int numero) {
		for(int i=0;i<=10;i++) {
			int multiplicacion=numero*i;
			System.out.println(numero+" x "+i+" = "+multiplicacion);
		}
	}
	public static void todasTablas() {
		int[][] tablas=new int[10][10];
		for(int i=0;i<tablas.length;i++) { 
			System.out.println("\nLa tabla de multiplicar "+(i+1)+" es \n");
			for(int j=0;j<tablas[i].length;j++) {
				tablas[i][j]=(i+1)*(j+1); 
				System.out.println((i+1)+" x "+(j+1)+" es "+tablas[i][j]);
			}
		}
	}
}
