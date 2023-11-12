package ejercicio2;

import java.util.Scanner;

/*Juan Manuel Carmona Ruiz 1Dam
 * Esta clase nos servirá para poder poner a prueba las clases anteriores.
 * Crearemos un objeto de tipo Coche, le daremos valores y haremos uso del método toString.
 * Se creará un método obtener_coche,de tipo void, el cual creará dos objetos de tipo Deportivo y solicitará al usuario los valores correspondientes a cilindrada, potencia y tracción, con estos valores crearemos cada uno de los objetos y una
 * vez rellenados mostrará por pantalla uno a uno el contenido de los vehículos utilizados.*/

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Coche a=new Coche(1000,50);
		
		System.out.println(a.imprimir());
	
		obtener_coche();
		
	}
	
	public static void obtener_coche() {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Indique cilindrada");
		int cilindrada=scn.nextInt();
		System.out.println("Indique potencia");
		int potencia=scn.nextInt();
		System.out.println("Indique traccion");
		String traccion=scn.next().toUpperCase();
		scn.nextLine();
		
		//Establezco que si la traccion introducida es incorrecta, sea total por defecto
		
		if(traccion.equals("TOTAL")) {
			traccion="total";
		}else {
			if(traccion.equals("DELANTERA")) {
				traccion="delantera";
			}else {
				traccion="total";
			}
		}
		
		Deportivo b=new Deportivo(cilindrada,potencia,traccion);
		System.out.println(b.imprimir());
		
		System.out.println("Indique cilindrada");
		int cilindrada1=scn.nextInt();
		System.out.println("Indique potencia");
		int potencia1=scn.nextInt();
		System.out.println("Indique traccion");
		String traccion1=scn.next().toUpperCase();
		scn.nextLine();
		
		//Establezco que si la traccion introducida es incorrecta, sea total por defecto
		
		if(traccion1.equals("TOTAL")) {
			traccion1="total";
		}else {
			if(traccion1.equals("DELANTERA")) {
				traccion1="delantera";
			}else {
				traccion1="total";
			}
		}
		
		Deportivo c=new Deportivo(cilindrada1,potencia1,traccion1);
		System.out.println(c.imprimir());
	}

}
