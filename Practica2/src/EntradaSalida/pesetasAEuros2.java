package EntradaSalida;

import java.util.Scanner;

public class pesetasAEuros2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce cantidad de pesetas");
		int pesetas = sc.nextInt(); int divisor = 166;
		int euros = pesetas/divisor;
		System.out.println(pesetas+" pesetas son:\n"+euros+" €");
		
	}

}
