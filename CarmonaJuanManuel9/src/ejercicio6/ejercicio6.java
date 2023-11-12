package ejercicio6;
/*Programa que lee 100 numeros no nulos e indica si hay negativos
 * Autor Juan Manuel Carmona Ruiz
 * Fecha 24/10/22*/
import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce 100 números:");
		int numneg=0;
		for(int i=1;i<=100;i++) {
			int num=scn.nextInt();
			if(num<0) {
				numneg++;
			}
			if(num==0) {
				i--;				
			}
		}
		if(numneg>=1) {
			System.out.println("Se han leido números negativos");
		}else {
			if(numneg==0) {
				System.out.println("Los numeros no nulos introducidos eran positivos");
			}
		}
	}

}
