package ejercicio17;
/*Crea un programa que pida al usuario 20 valores enteros e introduzca los 10 primeros en un
 * array y los 10 últimos en otro array. Por último, comparará ambos arrays y le dirá al usuario
 * si son iguales o no.
 * Autor Juan Manuel Carmona Ruiz
 * Fecha 1/11/22*/
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int[] primeros=new int[10];
		int[] segundos=new int[10];
		
		System.out.println("Introduce los primeros 10 valores");
		for(int i=0;i<primeros.length;i++) {
			primeros[i]=scn.nextInt();
		}
		System.out.println("Introduce los segundos 10 valores");
		for(int i=0;i<segundos.length;i++) {
			segundos[i]=scn.nextInt();
		}
		if(Arrays.equals(primeros, segundos)) {
			System.out.println("Los valores coinciden");
		}else {
			System.out.println("Los valores son distintos");
		}		
		
	}

}
