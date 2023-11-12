package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		boolean repetir=false;
		
		do {
			
			try {
			
				System.out.println("Introduce un numero");
				int num=scn.nextInt();	
				scn.nextLine();
				repetir=false;
			
			} catch (InputMismatchException e) {
				scn.nextLine();
				System.out.println("Valor introducido incorrecto");
				e.printStackTrace();
				repetir=true;
			
			}
			
		}while(repetir);
	}

}
