package ejercicio4;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		
			System.out.println("Introduce un valor:");
			
		double 	valor = scn.nextDouble();
		double valor1 = Math.ceil(valor);
		double valor2 = Math.floor(valor);
		double valor3 = Math.round(valor);
			
			System.out.println("El valor ceil es "+valor1+" el valor floor es "+valor2+" el valor round es "+valor3);
		
		
		
	}

}
