package ejercicio16;
/*Escribe un programa que cree un array del tamaño indicado por teclado y luego lo rellene con
valores aleatorios (utiliza Math.random()). Implementa la función que rellena un array con
valores aleatorios.
Juan Manuel Carmona Ruiz
25/11/2022*/
import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Indique el tamaño del vector");
		int tamanio=scn.nextInt();
		double[] aleatorio=new double[tamanio];
		vector(aleatorio);		
	}

	public static void vector(double[] vector) {
		
		for(int i=0;i<vector.length;i++) {
			vector[i]=Math.random();
			System.out.println("El valor "+(i+1)+" es "+vector[i]);			
		}
	}
}
