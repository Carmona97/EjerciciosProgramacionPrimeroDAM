package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	// ArrayList para almacenar los objetos Atleta
	
	static ArrayList<Atleta> conjuntoAtletas=new ArrayList();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mayorEdad=0;
		int menorEdad=0;
		
		Scanner scn=new Scanner(System.in);
		
		int seleccion;
		
		//Menu del programa con las posibles opciones
		
		do{
			System.out.println("Indique que desea hacer\n1.Registrar atleta.\n2.ver la cantidad de atletas mayores y menores de edad.\n3.nombres de los atletas mas altos que el promedio");
			seleccion=scn.nextInt();
			if(seleccion==1) {
			
				registrarAtleta(conjuntoAtletas);
				
			}else {
				if(seleccion==2) {
					
					for(Atleta i:conjuntoAtletas) {
						if(i.getEdad()>=18) {
							mayorEdad++;
						}else {
							menorEdad++;
						}
					}
					System.out.println("Mayores de edad: "+mayorEdad+"\nMenores de edad: "+menorEdad);
					
				}else {
					if(seleccion==3) {
						
						for(Atleta i:conjuntoAtletas) {
							
							if(i.getTalla()>=promedioTalla()) {
								
								System.out.println(i.getNombre());
								
							}
						}
					}else {
						System.out.println("Fin del programa");
					}
				}
			}
		} while(seleccion==1 || seleccion==2 || seleccion==3);
			
	}
	
	// Metodo para registrar un nuevo objeto Atleta en el ArrayList
	
	public static void registrarAtleta(ArrayList conjuntoAtletas) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Edad:");
		int edad=scn.nextInt();
	
		System.out.println("Nombre:");
		String nombre=scn.next();
		
		System.out.println("Talla:");
		double talla=scn.nextDouble();
		
		Atleta nuevo=new Atleta(edad,nombre,talla);
		
		conjuntoAtletas.add(nuevo);
		
	}
	
	// Metodo para calcular el promedio de la talla de los atletas en el ArrayList
	
	public static double promedioTalla() {
		
		double sumaTalla=0;
		
		// Recorre el ArrayList y suma las tallas de los atletas
		
		for(Atleta i:conjuntoAtletas) {
			
			sumaTalla += i.getTalla();
			
		}
		
		//Divide la suma de las tallas entre la cantidad de atletas del ArrayList
		
		double promedioTalla=sumaTalla/conjuntoAtletas.size();
		
		return promedioTalla;
	}

}
