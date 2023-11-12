package EntradaSalida;

import java.util.Scanner;

public class areaCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner solucion = new Scanner(System.in);
		
		System.out.println("¿Cual es el lado de un cuadrado? ");
		
		int lado = solucion.nextInt();
		int area = lado*lado;
		System.out.println("El area del cuadrado es: "+area);	
		
		

	}

}
