package ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner scn=new Scanner(System.in);
		ArrayList<Gato> gatos=new ArrayList();
		
		for(int i=0;i<5;i++) {
			try {
				anadirGato(gatos);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				i--;
				e.printStackTrace();
			}
		}
		
		System.out.println(gatos.toString());
	}

	public static void anadirGato(ArrayList<Gato> gatos) throws Exception{
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce un nombre");
		String nombre=scn.nextLine();
		System.out.println("Introduce la edad");
		int edad=scn.nextInt();
		
		Gato nuevo=new Gato(nombre,edad);
		gatos.add(nuevo);
	}
}
