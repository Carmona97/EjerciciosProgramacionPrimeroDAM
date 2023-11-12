package ejercicio16;
/*Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de
 * valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la
 * muestre por pantalla. En esta ocasión has de utilizar Arrays.fill().
 * Autor Juan Manuel Carmona Ruiz
 * Fecha 1/11/22*/
import java.util.Arrays;

public class ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] secuencia=new int[55];
		Arrays.fill(secuencia, 0, 1, 1);
		Arrays.fill(secuencia, 1, 3, 2);
		Arrays.fill(secuencia, 3, 6, 3);
		Arrays.fill(secuencia, 6, 10, 4);
		Arrays.fill(secuencia, 10, 15, 5);
		Arrays.fill(secuencia, 15, 21, 6);
		Arrays.fill(secuencia, 21, 28, 7);
		Arrays.fill(secuencia, 28, 36, 8);
		Arrays.fill(secuencia, 36, 45, 9);
		Arrays.fill(secuencia, 45, 55, 10);
		for(int i=0;i<secuencia.length;i++) {
			System.out.print(secuencia[i]+" ");
		}
	}
}
