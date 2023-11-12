package ejercicio7;
/*Programa que lee 100 numeros no nulos introducidos y determina la cantidad de positivos y negativos
 * Autor Juan Manuel Carmona Ruiz
 * Fecha 24/10/22*/
import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce 100 números:");
		int numneg=0,numpos=0;
		for(int i=1;i<=100;i++) {
			int num=scn.nextInt();
			if(num<0) {
				numneg++;				
			}else {
				if(num==0) {
					i--;
				}else {
					if(num>0) {
						numpos++;
					}
				}
			}
		}
		System.out.println("Los numeros negativos introducidos han sido:"+numneg+"\nLos numeros positivos introducidos han sido:"+numpos);
	}

}
