package EntradaSalida;

import java.util.Scanner;

public class cuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lado, area;
		Scanner tec = new Scanner(System.in);
		System.out.println("¿Cual es el lado del cuadrado?");
		lado = tec.nextInt();
		area = lado*lado;
		System.out.println("El area del cuadrado es= "+area);

	}

}
