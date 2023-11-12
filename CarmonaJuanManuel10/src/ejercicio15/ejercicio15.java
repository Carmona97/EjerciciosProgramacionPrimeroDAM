package ejercicio15;
/*Crea un programa que pida la usuario dos valores N y M y luego cree un array de tamaño N
 * que contenga M en todas sus posiciones. Luego muestra el array por pantalla.
 * Autor Juan Manuel Carmona Ruiz
 * Fecha 1/11/22*/
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce la cantidad de números que aparecerán");
		int n=scn.nextInt();
		int[] cantidad=new int[n];
		System.out.println("Indica que número que se repetirá");
		int m=scn.nextInt();
		Arrays.fill(cantidad, m);
		for(int i=0;i<cantidad.length;i++) {
			System.out.print(cantidad[i]+" ");
		}
	}

}
