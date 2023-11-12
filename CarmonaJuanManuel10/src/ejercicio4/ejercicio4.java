package ejercicio4;
/*Programa que se introducen 20 numeros en la consola y se almacenan en un array para posteriormente mostrar la suma de los numeros positivos y la suma de los numeros negativos
 * Autor Juan Manuel Carmona Ruiz
 * Fecha 25/10/22*/
import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce 20 números: ");
		int num[]=new int[20];
		int sumaneg=0,sumapos=0;
		for(int i=0;i<num.length;i++) {
			num[i]=scn.nextInt();
			if(num[i]<0) {
				sumaneg+=num[i];
			}else {
				if(num[i]>0) {
					sumapos+=num[i];
				}
			}
		}
		System.out.println("La suma de los valores positivos es: "+sumapos+"\nLa suma de los valores negativos es: "+sumaneg);
	}

}
