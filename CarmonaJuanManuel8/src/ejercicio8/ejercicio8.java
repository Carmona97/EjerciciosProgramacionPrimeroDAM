package ejercicio8;
/*Programa que imprime por pantalla los datos de una caminata y ofrece la informacion de la media, la distancia mas larga de las rutas y la ciudad con mayor distancia de caminata
 * autor: Juan Manuel Carmona Ruiz
 * Fecha: 17/10/22*/
import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce los siguientes datos:\nNombre: ");
		String nombre=scn.nextLine();
		System.out.println("Apellidos: ");
		String apellidos=scn.nextLine();
		int edad=0;
		System.out.println("Introduce edad");
		do {	
			edad=scn.nextInt();
			if(edad<17 || edad>45)
			System.out.println("Edad incorrecta, vuelve a introducirla");
		}while(edad<17 ||edad>45);
		System.out.println("Numero de rutas realizadas");
		int ruta=scn.nextInt();
		System.out.println("Distancia de la última ruta:");
		int distancia=scn.nextInt();
		
		int i=0, dismayor=0,mediarutas=0,part=0,discam=0;
		String ciudmayor="a",ciudad="b";
		while(i<=5) {
			System.out.println("Ciudad");
			ciudad=scn.nextLine();
			scn.nextLine();
			System.out.println("Distancia de la caminata");
			discam=scn.nextInt();
			mediarutas=discam+mediarutas;
			System.out.println("Número participantes");
			part=scn.nextInt();

			if(discam>dismayor) {
				ciudmayor=ciudad;
				dismayor=discam;
			}
			i++;
		}
		System.out.println("Nombre: "+nombre+" "+apellidos+"\nEdad: "+edad+"\nNúmero de rutas realizadas: "+ruta+"\nDistancia media de las últimas 5 rutas: "+mediarutas/5+"\nDistancia más larga de las últimas 5 rutas: "+dismayor+"\nCiudad de la ruta mas larga: "+ciudmayor);
	}
	
}
