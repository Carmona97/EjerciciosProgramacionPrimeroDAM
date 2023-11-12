package ejercicio5;
/*Programa que pide introducir 20 números en consola para posteriormente calcular y mostrar la media
 * Autor Juan Manuel Carmona Ruiz
 * Fecha 27/10/22*/
import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce 20 números reales: ");
		int num[]=new int[20];
		double suma=0;
		for(int i=0;i<num.length;i++) {
			num[i]=scn.nextInt();
		}
		for(int i=0;i<num.length;i++) {
			suma+=num[i];
			System.out.println("la media "+(i+1)+" es: "+suma/(i+1));
		}
		
	}

}
