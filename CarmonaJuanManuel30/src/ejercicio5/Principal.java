package ejercicio5;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int p=0;
		int n=0;
		while (p<=0) {
			try {
				System.out.println("Introduce un numero positivo");
				p = scn.nextInt();
				imprimePositivo(p);
			} catch (Exception e) {
				// TODO Auto-generated catch block	
				System.out.println("El numero introducido es incorrecto,vuelva a intentarlo");
				e.printStackTrace();
			} 
		}
		while (n>=0) {
			try {
				System.out.println("Introduce un numero negativo");
				n = scn.nextInt();
				imprimeNegativo(n);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
		
	}

	static void imprimePositivo(int p) throws Exception {
		if(p<0) {
			throw new Exception("El numero es negativo");
		}
		
	}
	
	static void imprimeNegativo(int n) throws Exception {
		
		if(n>0) {
			throw new Exception("El numero es positivo");
		}
		
	}
}
