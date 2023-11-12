package EntradaSalida;

import java.util.Scanner;

public class teclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad; String nombre; float altura;
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Dime tu nombre:");
		nombre = entradaTeclado.nextLine();
		System.out.println("Dime tu altura: ");
		altura = entradaTeclado.nextFloat();
		System.out.println("Dime tu edad: ");
		edad = entradaTeclado.nextInt();
		System.out.println("Tu edad es: "+edad+"\nTu nombre es: "+nombre+"\nTu altura es: "+altura);

	}

}

