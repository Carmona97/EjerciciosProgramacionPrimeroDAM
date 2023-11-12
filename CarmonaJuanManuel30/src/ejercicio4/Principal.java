package ejercicio4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		crearVector();
	
	}
	
	public static void crearVector() {
		Scanner scn=new Scanner(System.in);
		
		int tamano=(int)(Math.random()*100)+1;
		int vector[]= new int[tamano];
		int posicion=0;
		
		for(int i=0;i<vector.length;i++) {
			vector[i]=(int)(Math.random()*10)+1;
		}
		
		while(posicion>=0) {
			
			try {
				System.out.println("Indique la posicion que quiere imprimir por pantalla");
				posicion=scn.nextInt();
				System.out.println(vector[posicion]);
			} catch (IndexOutOfBoundsException e) {
				// TODO Auto-generated catch block
				if(posicion<0) {
					System.out.println("La posicion no existe y el programa se cerrara al haber introducido un numero negativo");
					e.printStackTrace();
				}else {
					System.out.println("La posicion no existe, vuelve a introducir otra posicion");
					e.printStackTrace();
				}
				
			}
				
			
			
		}
	}

}
