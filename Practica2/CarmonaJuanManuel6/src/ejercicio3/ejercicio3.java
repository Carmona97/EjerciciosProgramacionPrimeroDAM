package ejercicio3;

import java.util.Scanner;
/*Realizar un programa en Java que solicite al usuario los siguientes datos:
Edad
El usuario quiere acceder a unos estudios para los que se requiere ser mayor de edad. 
Comprobaremos la edad y en caso de ser menor de 18 años mostraremos el siguiente 
mensaje: No tiene la edad requerida para realizar estos estudios.
En caso de cumplir el requisito de edad se le solicitarán los siguientes datos:
Nombre
Apellidos
Fecha de Nacimiento
Una vez recopilados se le mostrará el siguiente mensaje:
Nombre: Juan
Apellidos: López Pérez
Edad: 25
Usted ha sido admitido
Autor: Juan Manuel Carmona Ruiz
Fecha 07/10/2022*/
public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Introduce tu edad:");
		int edad = scn.nextInt();
		scn.nextLine();
		if (edad<18) {
			System.out.println("No tiene la edad requerida para realizar estos estudios.");
		}
		else {
			System.out.println("Introduzca los siguientes datos\nNombre:");
			String nombre = scn.nextLine();
			System.out.println("Apellidos:");
			String apellidos = scn.nextLine();
			System.out.println("Fecha de nacimiento: ");
			String fecha = scn.nextLine();
			
			System.out.println("Nombre: "+nombre+"\nApellidos: "+apellidos+"\nEdad: "+edad+"\nUsted ha sido admitido.");
		}
		

	}

}
