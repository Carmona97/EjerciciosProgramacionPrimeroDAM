package ejercicio4;
/*Escribe un programa que pida un número entero por teclado y muestre por pantalla si es
 * positivo, negativo o cero. Implementa y utiliza la función:
 * int dimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
 * Juan Manuel Carmona Ruiz
 * 15/11/22*/
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce un número: (Devuelve -1 si es negativo, 0 si es 0 y 1 si es positivo");
		int num=scn.nextInt();
		System.out.println("El valor es: "+dimeSigno(num));
	}

	public static int dimeSigno(int a) {
		int valor=0;
		if(a<0) {
			valor=-1;
		}else {
			if(a==0) {
				valor=0;
			}else {
				if(a>0) {
					valor=1;
				}
			}
		}
		return valor;
	}
}
