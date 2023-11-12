package ejercicio10;
/*Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas.
 * Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. Luego
 * mostrará la altura media, máxima y mínima así como cuántas personas miden por encima y
 * por debajo de la media
 * Autor Juan Manuel Carmona Ruiz
 * Fecha 1/11/22*/
import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Indique cuantas alturas desea introducir");
		int n=scn.nextInt();
		double[] altura=new double[n];
		double alturaSuma=0;
		int i=0;
		for(i=0;i<altura.length;i++) {
			System.out.println("Introduzca una altura(en metros)");
			altura[i]=scn.nextDouble();
		}
		double altMax=altura[0];
		double altMin=altura[0];
		for(i=0;i<altura.length;i++) {
			if(altura[i]>altMax) {
				altMax=altura[i];
			}
			if(altura[i]<altMin) {
				altMin=altura[i];
			}
			alturaSuma+=altura[i];			
		}
		System.out.println("La altura máxima es: "+altMax+"\nLa altura mínima es: "+altMin+"\nLa media de las alturas es: "+alturaSuma/n);
	}

}
