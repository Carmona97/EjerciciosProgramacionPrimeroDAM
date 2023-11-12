package ejercicio2;

import java.util.Scanner;
/*Realizar un programa en Java que solicite al usuario los siguientes datos:
 Edad
 Nota académica
El usuario quiere acceder a unos estudios para los que se requieren dos condiciones, por un
lado ser mayor de 18 años y además haber obtenido una nota académica mayor de 7.
Comprobar si los datos introducidos cumplen ambas condiciones. De ser así mostrar un
mensaje por pantalla: "Usted ha sido admitido en el curso, cumple las condiciones
requeridas". En caso contrario mostrar el siguiente mensaje "Lo sentimos, no ha sido
admitido en el curso ya que no cumple los requisitos mínimos"
Autor: Juan Manuel Carmona Ruiz
Fecha 07/10/2022*/
public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Introduce los siguientes datos: \nEdad:");
		int edad = scn.nextInt();
		System.out.println("Nota académica:");
		double nota =scn.nextDouble();
		
		if(edad>=18 && nota>=7) {
			System.out.println("Usted ha sido admitido en el curso, cumple las condiciones requeridas.");
		}
		else {
			System.out.println("Lo sentimos, no ha sido admitido en el curso ya que no cumple con los requisitos mínimos.");
		}
	}
}
