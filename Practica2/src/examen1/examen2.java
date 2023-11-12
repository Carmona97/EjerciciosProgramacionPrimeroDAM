package examen1;

import java.util.Scanner;

public class examen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int num=0,clave=1234;		
		for(int i=1;i<=4;i++) {
			num=scn.nextInt();
			if(num!=clave) {
				System.out.println("Lo sentimos, esa no es la combinacion");
			}else {
				if(num==clave) {
					System.out.println("La caja fuerte se ha abierto satifactoriamente");
				}
			}
		}
	}

}
