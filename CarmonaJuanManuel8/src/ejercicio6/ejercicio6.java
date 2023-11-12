package ejercicio6;
/*Realizar un cuadrado y el programa para al escribir un numero negativo
 * autor: Juan Manuel Carmona Ruiz
 * Fecha 17/10/22*/
import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int cuadrado=0;
		double num=1;
		while(num>0) {
			System.out.println("Introduce el número al que desea hacer el cuadrado: ");
			num=scn.nextDouble();
			if(num<0) {
				System.out.println("El número es negativo");
			}else {
				if(num>0) {
					cuadrado=(int)Math.pow(num, 2);
					System.out.println("El cuadrado es: "+cuadrado);
				}
			}
		}
	}

}
