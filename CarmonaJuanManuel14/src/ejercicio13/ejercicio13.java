package ejercicio13;
/*Realiza un programa que calcule el porcentaje de descuento que nos han hecho al comprar algo.
Se debe solicitar la cantidad sin descuento y la cantidad con el descuento aplicado. Se debe
crear una función a la que le pasemos ambos valores y nos devuelva el descuento (en %).
Juan Manuel Carmona Ruiz
25/11/2022*/
import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce el precio del producto: ");
		int precio=scn.nextInt();
		System.out.println("Introduce el precio con el descuento: ");
		int precioDesc=scn.nextInt();
		System.out.println("El descuento es de "+descuento(precio,precioDesc)+" %");
		
	}
	public static int descuento(int precio,int precioDesc) {
		int descuento=100-(precioDesc*100/precio);
		return descuento;
	}
}
