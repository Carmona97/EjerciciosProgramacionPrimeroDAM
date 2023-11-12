package ejercicio5;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
			System.out.println("Introduzca dos números:");
			
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		
		int menor = Math.min(num1,num2);
		int potencia =(int) Math.pow(num1,num2);
		double raiz = Math.sqrt(num1);
		double aleatorio =(double) Math.random()*num2;
		
			System.out.println("El número menor es "+menor+" \nLa potencia de "+num1+" elevado a "+num2+" es "+potencia+" \nLa raíz cuadrada de "+num1+" es "+raiz+"\nEl número generado aleatoriamente es el: "+aleatorio);

	}

}
