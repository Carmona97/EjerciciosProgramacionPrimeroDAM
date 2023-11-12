package asdf;

import java.util.Scanner;

public class asdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner (System.in);
		int num1= scn.nextInt();
		int num2=scn.nextInt();
		int mayor= Math.max(num1,num2);
	System.out.println("El mayor es: "+mayor);
	}

}
