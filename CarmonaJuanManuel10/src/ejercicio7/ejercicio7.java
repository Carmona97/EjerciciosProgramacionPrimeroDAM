package ejercicio7;
/*Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga
 * todos los valores desde P hasta Q, y lo muestre por pantalla.
 * Autor Juan Manuel Carmona Ruiz	
 * 1/11/22*/
import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce un valor: ");
		int p=scn.nextInt();
		int q=scn.nextInt();
		int tamaño=q-p;
		int recorrido[]=new int[tamaño+1];
		for(int i=0;i<recorrido.length;i++) {
			recorrido[i]=p;
			p++;
			System.out.println(recorrido[i]);
			
		}		
		
	}

}
