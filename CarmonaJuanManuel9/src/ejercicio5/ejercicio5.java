package ejercicio5;
/*Programa que muestra el factorial que se introduce en la consola
 * Autor Juan Manuel Carmona Ruiz
 * Fecha 24/10/22*/
import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int num=scn.nextInt(),fact=1;
		if(num==0) {
			System.out.println("0! = 1");
		}else {
			if(num!=0) {
				while(num>1) {
					System.out.print(num);
					fact*=num--;
					System.out.print(" x ");
				}
				System.out.println("1 = "+fact);
			}
		}

	}
	
}
