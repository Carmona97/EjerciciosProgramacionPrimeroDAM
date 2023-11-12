package ejercicio3;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scn = new Scanner(System.in);
	System.out.println("Indique su nota en el examen:");
	int nota = scn.nextInt();
	switch (nota) {
		case 0:case 1: case 2: case 3: case 4:
			{System.out.println("Suspenso");
			break;
			}
		case 5:
			{
			System.out.println("Aprobado");
			break;
			}
		case 6:
			{
			System.out.println("Bien");	
			break;
			}
		case 7:case 8:
			{
			System.out.println("Notable");
			break;
			}
		case 9:case 10:
			{
			System.out.println("Sobresaliente");
			break;
			}
		default:
			{
			System.out.println("Nota introducida incorrecta");
			break;
			}
		
		}
	}

}
