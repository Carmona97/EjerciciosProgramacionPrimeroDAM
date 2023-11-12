package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Introduzca los siguientes datos:\nNombre: ");
		String nomb= scn.nextLine();
		System.out.println("Apellidos:");
		String apel=scn.nextLine();
		System.out.println("Edad:");
		int edad=scn.nextInt();
		
		if (edad>45) {
			System.out.println("Lo sentimos, pero no cumple con nuestro perfil");
		}else {
			System.out.println("Salario deseado:");
		}
		
		int salar=scn.nextInt();
		
		if (salar>30000) {
			System.out.println("Lo sentimos, pero no cumple con nuestro perfil");
		}else {
			System.out.println("Años de experiencia:");
			int exp=scn.nextInt();
			if(exp<2) {
				System.out.println("Lo sentimos, pero no cumple nuestro perfil");
			}else {
				System.out.println("Cantidad de proyectos trabajados anteriormente: ");
				int proy=scn.nextInt();
				if(proy<3) {
					System.out.println("Lo sentimos, pero no cumple nuestro perfil");
				}else {
					System.out.println("Enhorabuena, ha sido contratado");
				}
			}	
		}
	}

}
