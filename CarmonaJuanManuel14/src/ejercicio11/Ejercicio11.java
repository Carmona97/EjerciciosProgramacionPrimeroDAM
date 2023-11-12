package ejercicio11;
/*Realiza un programa que escriba la tabla de multiplicar de un número introducido por teclado.
Para ello implementa una función que reciba como parámetro un número entero y muestre por
pantalla la tabla de multiplicar de dicho número*/
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce un número");
		int num=scn.nextInt();
		multiplicar(num);
	}

	public static void multiplicar(int num) {
		int multiplicar=0;
		for(int i=0;i<=10;i++) {
			multiplicar=num*i;
			System.out.println(num+" x "+(i)+" es "+multiplicar);
		}
	}
}
