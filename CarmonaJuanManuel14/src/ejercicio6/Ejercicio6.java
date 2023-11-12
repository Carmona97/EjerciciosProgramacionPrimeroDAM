package ejercicio6;
/*Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta de cada
 * uno tras aplicarle un 21% de IVA. Implementa y utiliza la función:
 * double precioConIVA(double precio) 
 * Devuelve el precio tras sumarle un 21% de IVA
 * Juan Manuel Carmona Ruiz
 * 15/11/22*/
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.println("Introduce el precio del producto sin IVA");
			double precioSinIVA=scn.nextDouble();
			System.out.println("El precio del producto con IVA es: "+precioConIVA(precioSinIVA)+"\n");
		}		
	}

	public static double precioConIVA(double precio) {
		double sumaIVA=precio+(precio*0.21);
		return sumaIVA;
	}
}
