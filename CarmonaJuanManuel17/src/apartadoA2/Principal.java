package apartadoA2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		Personas p1=new Personas();
		Personas p2=new Personas();
		System.out.println("Para la primera persona.\nIndica tu nombre");
		p1.nombre=scn.nextLine();
		System.out.println("Indica tus apellidos");
		p1.apellidos=scn.nextLine();
		System.out.println("Indica tu dni");
		p1.dni=scn.nextLine();
		System.out.println("Indica tu edad");
		p1.edad=scn.nextInt();
		System.out.println("Para la segunda persona.\nIndica tu nombre");
		scn.nextLine();
		p2.nombre=scn.nextLine();
		System.out.println("Indica tus apellidos");
		p2.apellidos=scn.nextLine();
		System.out.println("Indica tu dni");
		p2.dni=scn.nextLine();
		System.out.println("Indica tu edad");
		p2.edad=scn.nextInt();
		
		if(p1.edad<18) {
			System.out.println(p1.nombre+" "+p1.apellidos+" con dni "+p1.dni+" es menor de edad");
		}else {
			System.out.println(p1.nombre+" "+p1.apellidos+" con dni "+p1.dni+" es mayor de edad");
		}
		if(p2.edad<18) {
			System.out.println(p2.nombre+" "+p2.apellidos+" con dni "+p2.dni+" es menor de edad");
		}else {
			System.out.println(p2.nombre+" "+p2.apellidos+" con dni "+p2.dni+" es mayor de edad");
		}
	}

}
