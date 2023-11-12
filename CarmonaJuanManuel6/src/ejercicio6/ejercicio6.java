package ejercicio6;

import java.util.Scanner;

/*Este ejercicio supone una variación del ejercicio anterior. Una vez solicitados los datos al 
usuario, y almacenada en la correspondiente variable la nota obtenida se harán las siguientes 
comprobaciones:
Si la nota obtenida es menor que 0 o mayor que 10, mostrará un mensaje por pantalla 
que dirá: " La nota académica indicada es incorrecta"
En caso contrario, procederá con el programa tal y como se mostraba anteriormente
Añadiremos al programa anterior un caso más, en caso de obtener una nota académica 
de 10, el valor mostrado será "Matrícula de Honor"
Autor: Juan Manuel Carmona Ruiz
Fecha 07/10/2022*/
public class ejercicio6 {
	
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
		
		
		System.out.println("Nombre: "+nombre+"\nApellidos: "+apellido+"\nCiclo formativo: "+ciclo+"\nNota académica: "+nota);
		
		if (nota<0) {
			System.out.println("La nota académica indicada es incorrecta");
		}else {
		if (nota>=0 && nota<5){
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
						if(nota>=9 && nota<10) {
							System.out.println("Sobresaliente");
						} else {
							if(nota==10) {
								System.out.println("Matrícula de honor");
								}else {
									if(nota>10) {
										System.out.println("La nota académica es incorrecta");
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
