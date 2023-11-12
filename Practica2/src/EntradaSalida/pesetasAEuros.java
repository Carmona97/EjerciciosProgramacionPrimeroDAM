package EntradaSalida;

import java.util.Scanner;

public class pesetasAEuros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float peseta=166.386f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique cuantos euros quiere convertir");
		int euro = sc.nextInt();
		peseta = euro*peseta;
		System.out.println(euro+ "€ son\n" +peseta+" pesetas");

	}

}
