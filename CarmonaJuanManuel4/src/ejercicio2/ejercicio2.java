package ejercicio2;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
			System.out.println("Indique cuantos euros quiere convertir");
		double peseta=166.386;
		double euro = sc.nextDouble();
		peseta = euro*peseta;
			System.out.println(euro+ "€ son "+peseta+" pesetas");
			System.out.println("Introduce cantidad de pesetas");
		double pesetas = sc.nextDouble(); 
		double euros = pesetas/166.386;
			System.out.println(pesetas+" pesetas son: "+euros+" €");

	}

}
