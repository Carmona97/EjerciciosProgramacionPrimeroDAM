package ejercicio3;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
			System.out.println("Introduce la variable A: ");
		int a = scn.nextInt();
			System.out.println("Introduce la variable B: ");
		int b= scn.nextInt();
		int c;//Esta variable es necesaria para almacenar el valor de a
		
		c=a;
		a=b;
		b=c;
			System.out.println("La variable A se ha intercambiado por B con un valor "+a+". La variable B se ha intercambiado por A con un valor "+b);
		
		
		

	}

}
