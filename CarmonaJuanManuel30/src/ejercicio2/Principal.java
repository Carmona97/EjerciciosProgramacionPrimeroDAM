package ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
		boolean repetir;
		double division=0;
		do {
			
		
			try {
				
				System.out.println("Introduce un numero entero");
				int a=scn.nextInt();
				scn.nextLine();
				System.out.println("Introduce otro numero entero");
				int b=scn.nextInt();
				scn.nextLine();
				
				division=a/b;
				
				repetir=false;
				
			} catch (InputMismatchException e) {
				
				System.out.println("El tipo introducido es incorrecto");
				e.printStackTrace();
				repetir=true;
				scn.nextLine();
				
			} catch (ArithmeticException e) {
				
				System.out.println("No es posible dividir entre 0");
				e.printStackTrace();
				repetir=true;
				
			}
			
		}while(repetir);
	
		System.out.println(division);
	}

}
