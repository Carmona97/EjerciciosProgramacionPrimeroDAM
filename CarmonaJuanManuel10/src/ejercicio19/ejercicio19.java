package ejercicio19;
/*Necesitamos crear un programa para mostrar el ranking de puntuaciones de un torneo de
 * ajedrez con 8 jugadores. Se le pedirá al usuario que introduzca las puntuaciones de todos los
 * jugadores (habitualmente valores entre 1000 y 2800, de tipo entero) y luego muestre las
 * puntuaciones en orden descendente (de la más alta a la más baja).
 * Autor Juan Manuel Carmona Ruiz
 * Fecha 1/11/22*/
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int[] puntuacion=new int[8];
		System.out.println("Introduzca la puntuación de los jugadores: ");
		for(int i=0;i<puntuacion.length;i++) {
			puntuacion[i]=scn.nextInt();
			if(puntuacion[i]<1000 || puntuacion[i]>2800) {
				System.out.println("Puntuación errónea, vuelva a introducirla");
				i--;
			}
		}
		Arrays.sort(puntuacion);
		for(int i=(puntuacion.length-1);i>=0;i--) {
			System.out.println(puntuacion[i]+" ");
		}
	}

}
