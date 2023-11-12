package ejercicio14;
/*Escribe una función que muestre por pantalla un triángulo como el del ejemplo. Deberá recibir
dos parámetros: el carácter que se desea imprimir y el número de líneas del triángulo.
Juan Manuel Carmona Ruiz
25/11/2022*/
import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce la letra de la piramide");
		String letra=scn.next();
		System.out.println("Introduce la cantidad de lineas:");
		int lineas=scn.nextInt();
		piramide(letra,lineas);
	}
	public static void piramide(String letra,int lineas) {
		for(int i=0;i<lineas;i++) {
			if(i==0) {
				System.out.println(letra);
			}else {
				System.out.println(letra+=letra);
			}		
		}		
	}
}
