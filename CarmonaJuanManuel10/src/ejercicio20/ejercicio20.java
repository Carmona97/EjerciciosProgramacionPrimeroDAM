package ejercicio20;
/*Crea un programa que cree un array de tamaño 1000 y lo rellene con valores enteros
 * aleatorios entre 0 y 99 (utiliza Math.random()*100). Luego pedirá por teclado un valor N y se
 * mostrará por pantalla si N existe en el array, además de cuantas veces.
 * Autor Juan Manuel Carmona Ruiz
 * Fecha 1/11/22*/
import java.util.Scanner;

public class ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int[] valores=new int[1000];
		for(int i=0;i<valores.length;i++) {
			valores[i]=(int)(Math.random()*100);
			System.out.print(valores[i]+" ");
		}
		System.out.println("\nIntroduce un número");
		int n=scn.nextInt();
		int contador=0;
		for(int i=0;i<valores.length;i++) {
			if(n==valores[i]) {
				contador++;
			}
		}
		if(contador==0) {
			System.out.println("El número no existe");
		}else {
			if(contador>=1) {
				System.out.println("El número aparece "+contador+" veces");
			}
		}
	}

}
