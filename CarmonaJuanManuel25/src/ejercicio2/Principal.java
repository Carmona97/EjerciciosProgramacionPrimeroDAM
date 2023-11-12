package ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		Terrestre nuevo;
		
		Coche coche1 = new Coche("1234ABC", "Renault", 4, true);
		System.out.println(coche1.imprimir()+"\n");

		Moto moto1 = new Moto("5678DEF", "Yamaha", 2, "Rojo");
	    System.out.println(moto1.imprimir()+"\n");

	    Barco barco1 = new Barco("ABCDEFGHI", "Titanic", 100, true);
	    System.out.println(barco1.imprimir()+"\n");

	    Submarino submarino1 = new Submarino("JKLMN", "Submarino Nuclear",200, 5000);
	    System.out.println(submarino1.imprimir()+"\n");

	    Avion avion1 = new Avion("ABCD123456", "Boeing 747", 200, 12);
	    System.out.println(avion1.imprimir()+"\n");

	    Helicoptero helicoptero1 = new Helicoptero("EFGH567890", "Apache", 4, 2);
	    System.out.println(helicoptero1.imprimir()+"\n");
	    
	    Terrestre terrestre1 = new Terrestre("1234ABC", "Renault", 4);
	    System.out.println(terrestre1.imprimir()+"\n");
	    
	    Acuatico acuatico1 = new Acuatico("ABCDEFGHI", "Titanic", 100);
	    System.out.println(acuatico1.imprimir()+"\n");
	    
	    Aereo aereo1 = new Aereo("ABCD123456", "Boeing 747", 200);
	    System.out.println(aereo1.imprimir());
	    
	}

}
