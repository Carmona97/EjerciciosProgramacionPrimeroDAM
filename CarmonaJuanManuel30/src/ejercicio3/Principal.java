package ejercicio3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
		double vector[]=new double[5];
	
		for(int i=0;i<=4;i++) {
			try {
				System.out.println("Introduce un numero:");
				double num=scn.nextDouble();
				vector[i]=num;
			}
			catch(InputMismatchException e){
				e.printStackTrace();
				System.out.println("El valor introducido es incorrecto");
				i--;	
				scn.nextLine();
			}
		}
		System.out.println(Arrays.toString(vector));
	}
}
