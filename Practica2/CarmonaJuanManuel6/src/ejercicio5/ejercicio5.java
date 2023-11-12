package ejercicio5;

import java.util.Scanner;
/*Realizar un programa en Java que solicite al usuario una serie de datos:
Nombre
Apellidos
Ciclo Formativo
Nota académica (entero)
Una vez conocida la nota devolverá un mensaje al usuario en formato de ficha, mostrando 
todos los datos así como la nota obtenida en formato palabra (Insuficiente, aprobado, bien, 
notable o sobresaliente). 
Nombre: Juan
Apellidos: López Pérez
Ciclo Formativo: Desarrollo de Aplicaciones Multiplataforma
Nota académica: 8 (Notable)
Autor: Juan Manuel Carmona Ruiz
Fecha 07/10/2022*/
public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Introduzca los siguientes datos:\nNombre:");
		String nombre=scn.nextLine();
		System.out.println("Apellidos:");
		String apellido=scn.nextLine();
		System.out.println("Ciclo formativo:");
		String ciclo=scn.nextLine();
		System.out.println("Nota académica: ");
		int nota=scn.nextInt();
		
		System.out.println("Nombre: "+nombre+"\nApellidos: "+apellido+"\nCiclo formativo: "+ciclo+"\nNota académica:"+nota);
		
		if (nota<5) {
			System.out.println("Insuficiente");
		}else {
			if(nota<6) {
				System.out.println("Suficiente");
			}else {
				if(nota<7) {
					System.out.println("Bien");
				}else {
					if (nota<9) {
						System.out.println("Notable");
					}else {
						if(nota>=9) {
							System.out.println("Sobresaliente");
						}
					}
				}
			}
		}
		
		
	}
}
