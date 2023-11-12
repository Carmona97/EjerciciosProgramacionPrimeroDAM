package ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	// ArrayList para almacenar los objetos Agenda
	
	static ArrayList<Agenda> infoAgenda= new ArrayList();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);

		int num=1;
			
		//Menu del programa con las posibles opciones
		
		while(num>=1 && num<=4) {
			System.out.println("Indique que desea hacer:\n1.Ingresar datos\n2.Obtener datos de un nombre de la agenda"
					+ "\n3.Mostrar todos los datos\n4.Mostrar personas que cumplen años en una fecha\nPulse 0 para finalizar el programa");
				
			num=scn.nextInt();
			
			if(num==1) {
				
				registrarContacto();
				
			}else {
				if(num==2) {
					
					System.out.println("Indique el nombre de la persona de la que se quieran conocer los datos: ");
					scn.nextLine();
					String nombre=scn.nextLine();
					System.out.println(datosDeNombre(nombre));
					
				}else {
					if(num==3) {
						
						System.out.println(datosAgenda());
						
						
					}else {
						if(num==4) {
							
							System.out.println("Indique dia");
							int dia=scn.nextInt();
							System.out.println("Indique mes");
							int mes=scn.nextInt();
							System.out.println("Indique año");
							int agno=scn.nextInt();
							
							System.out.println(indicaCumpleagnos(agno,mes,dia));
							
						}else {
							System.out.println("Fin del programa");
						}
					}
				}
			}
		}	
	}

	// Metodo para registrar un nuevo objeto Agenda en el ArrayList
	
	public static void registrarContacto() {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Indique el nombre: ");
		String nombre=scn.nextLine();
		
		System.out.println("Indique la direccion: ");
		String direccion=scn.nextLine();
		
		System.out.println("Indique el telefono: ");
		String telefono=scn.nextLine();
		
		System.out.println("Indique el email: ");
		String email=scn.nextLine();
		
		System.out.println("Indique el dia");
		int dia=scn.nextInt();
		System.out.println("Indique el mes");
		int mes=scn.nextInt();
		System.out.println("Indique el año");
		int agno=scn.nextInt();
		
		LocalDate fechaNacimiento=LocalDate.of(agno, mes, dia);
		
		Agenda nueva=new Agenda(nombre,direccion,telefono,email,fechaNacimiento);
		
		infoAgenda.add(nueva);
	}
	
	//Metodo que aporta los datos del contacto del nombre introducido por parametro
	
	public static String datosDeNombre(String nombre) {
		
		String datosContacto="";
		
		for(Agenda i:infoAgenda) {
			if(i.getNombre().equals(nombre)) {
				datosContacto+= i.toString()+" ";
			}
		}
		
		return datosContacto;
		
	}
	
	//Metodo que imprime los datos de todos los objetos del ArrayList
	
	public static String datosAgenda() {
		
		String datos="";
		
		for(Agenda i:infoAgenda) {
			
			datos += i.toString();
			
		}	
		
		return datos;
		
	}
	
	//Metodo que indica el nombre de las personas cuyo cumpleaños coincide con el dia, mes y año introducidos por parametros
	
	public static String indicaCumpleagnos(int agno,int mes,int dia) {
		
		LocalDate cumpleagno=LocalDate.of(agno, mes, dia);
		String cumpleagnero="";
		
		for(Agenda i:infoAgenda) {
			
			if(i.getFechaNacimiento().equals(cumpleagno)) {
				
				cumpleagnero+=i.getNombre()+" ";
				
			}	
		}
		
		return cumpleagnero;
	}
}
