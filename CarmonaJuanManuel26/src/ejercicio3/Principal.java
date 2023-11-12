package ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import ejercicio2.Agenda;

public class Principal {

	// ArrayList para almacenar los objetos Trabajadores
	
	static ArrayList<Trabajadores> coleccionTrabajadores = new ArrayList();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn=new Scanner(System.in);

		int contadorMasculino=0;
		
		int num=1;
		
		//Menu del programa con las posibles opciones
		
		while(num>=1 && num<=4) {
			System.out.println("Indique que desea hacer:\n1.Ingresar trabajador\n2.Mostrar cantidad de trabajadores hombres\n3.Mostrar la cantidad de mujeres casadas\n4.Sumar sueldos\nPulse 0 para cerrar el programa");
			
			num=scn.nextInt();
			
			if(num==1) {
				
				registrarTrabajador();
				
			}else {
				if(num==2) {
					
					System.out.println("Hay "+trabajadoresHombres()+" trabajadores hombres\n");
					
				}else {
					if(num==3) {
						
						System.out.println("Hay "+trabajadorasCasadas()+" mujeres casadas\n");
						
					}else {
						if(num==4) {
							
							System.out.println("La suma de los salarios de los trabajadores es: "+sumaSueldos()+" euros\n");
							
						}else {
							System.out.println("Fin del programa");
						}
					}
				}
			}
		}
	}
	
	// Metodo para registrar un nuevo objeto Trabajador en el ArrayList
	
	public static void registrarTrabajador() {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Indique el nombre: ");
		String nombre=scn.nextLine();
		
		System.out.println("Indique la edad");
		int edad=scn.nextInt();
		
		System.out.println("Indique el sexo: (Masculino o femenino)");
		String sexo=scn.next();	
		sexo=Trabajadores.comprobarSexo(sexo);
		
		System.out.println("Indique estado civil: (Casado o soltero)");
		String estadoCivil=scn.next();
		estadoCivil=Trabajadores.comprobarEstadoCivil(estadoCivil);
		
		System.out.println("Indique su salario base");
		double salarioBase=scn.nextDouble();
		
		Trabajadores nueva=new Trabajadores(nombre,edad,sexo,estadoCivil,salarioBase);
		
		coleccionTrabajadores.add(nueva);
	}
	
	//Metodo que cuenta la cantidad de trabajadores cuyo sexo es masculino
	
	public static int trabajadoresHombres() {
		
		int contadorTrabajadorMasculino=0;
		
		for(Trabajadores i:coleccionTrabajadores) {
			if(i.getSexo().equals("MASCULINO")) {
				contadorTrabajadorMasculino++;
			}
		}
		
		return contadorTrabajadorMasculino;
		
	}
	
	//Metodo que cuenta la cantidad trabajadores cuyo sexo es femenino y el estado civil es casado
	
	public static int trabajadorasCasadas() {
		
		int contadorCasadas=0;
		
		for(Trabajadores i:coleccionTrabajadores) {
			if(i.getSexo().equals("FEMENINO") && i.getEstadoCivil().equals("CASADO")) {
				contadorCasadas++;
			}
		}
		
		return contadorCasadas;
		
	}
	
	//Metodo que suma los salarios de los trabajadores del ArrayList
	
	public static int sumaSueldos() {
		
		int sumaSueldos=0;
		
		for(Trabajadores i:coleccionTrabajadores) {
			sumaSueldos+= i.getSalarioBase();
		}
		
		return sumaSueldos;
		
	}

}
