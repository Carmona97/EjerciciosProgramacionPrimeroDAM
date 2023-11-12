package ejercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Indique 'P', para seleccionar informacion de un planeta o 'S' para seleccionar un satelite");
		String seleccion=scn.next();
		
			if(seleccion.equals("S")) {
				satelitesSistemaSolar();
				
			}else {
				if(seleccion.equals("P")) {
					planetasGaseosos();
				}
			}
		}
		
	public static void planetasGaseosos() {
		
		Scanner scn=new Scanner(System.in);
		
		Planetas gaseosos[]=new Planetas[2];
		gaseosos[0]=new Planetas("Jupiter",1.9*Math.pow(10, 27),138346,(9*3600+56*60),(4329*24*3600),965000000,778000000,750000000,true);
		gaseosos[1]=new Planetas("Neptuno",1.024*Math.pow(10, 26),154345.0,(16*3600+6*60),(5690*24*3600),814700000,761800000,921400000,true);
	
		System.out.println("Indique el planeta gaseoso que desea ver (0 ó 1)");	
		int eleccion=scn.nextInt();
		
		System.out.println(gaseosos[eleccion].muestra());
		
	}
	
	public static void satelitesSistemaSolar() {
		
		Scanner scn=new Scanner(System.in);
		
		Satelites sistemaSolar[]=new Satelites[2];
		sistemaSolar[0]=new Satelites("Luna",7.349*Math.pow(10, 22),92340,(27*24*3600),(28*24*3600),123456789,98765432,61475000,"Tierra");
		sistemaSolar[1]=new Satelites("Europa",9.573*Math.pow(10, 25),62830,(32*24*3600),(45*3600+17*60),45623486,98643542,92352000,"Mercurio");
		
		System.out.println("Indique el satelite que desea ver (0 ó 1)");	
		int eleccion=scn.nextInt();
		
		System.out.println(sistemaSolar[eleccion].muestra());
	}
}
