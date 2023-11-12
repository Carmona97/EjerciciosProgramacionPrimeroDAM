package factoriales;

import java.util.Scanner;

public class factoriales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		int num =scn.nextInt();
		int mult=1;
		for(int i=1;i<=num;i++) {
			mult=mult*i;
			System.out.println("El factorial es: "+mult);
		}
	}

}
