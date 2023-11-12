package ejercicio8;
/*Programa que lee numeros hasta que se introduce un cero y que indica la cantidad de positivos y negativos introducidos
 * Autor Juan Manuel Carmona Ruiz
 * Fecha 24/10/22*/
import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce números(pulsa 0 para detener el programa)");
		int numpos=0,numneg=0;
		int num=1;
		while(num!=0) {
			num=scn.nextInt();
			if(num>0) {
				numpos++;
			}else {
				if(num<0) {
					numneg++;
				}
			}
		}
		if(numneg>=1) {
			System.out.println("Hay numeros negativos");
		}
		System.out.println("Se han introducido " +numpos+ " numeros positivos\nSe han introducido "+numneg+" numeros negativos");
	}
}
