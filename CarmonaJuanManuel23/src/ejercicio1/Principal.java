package ejercicio1;

import java.util.Scanner;
/*Juan Manuel Carmona Ruiz 1Dam
 * Esta clase nos servirá para poder poner a prueba las clases anteriores.
 *  Crearemos tres objetos, un objeto a de la clase Humano y otros dos b y c de la clase Ciudadano, al crearlos usaremos el constructor para darle valores en la propia creación.
 *  Haremos uso del método nombreCompleto en cada uno de los objetos.
 *  Solicitaremos los datos necesarios y mostraremos un informe en el que se vea claramente la información de cada objeto.
 * */
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
		Humano a=new Humano("Harry","Potter");
		
		System.out.println("Indique el documento de ciudadano b");
		String documentob=scn.nextLine();
		System.out.println("Indique el documento de ciudadano c");
		String documentoc=scn.nextLine();
		
		Ciudadano b=new Ciudadano("Ron","Weasley",documentob);
		Ciudadano c=new Ciudadano("Albus","Dumbledore",documentoc);
		
		System.out.println(a.nombreCompleto()+"\n"+b.nombreCompleto()+"\n"+c.nombreCompleto());
		
		System.out.println("\n"+b.identificacion()+"\n"+c.identificacion());
		
	}

}
