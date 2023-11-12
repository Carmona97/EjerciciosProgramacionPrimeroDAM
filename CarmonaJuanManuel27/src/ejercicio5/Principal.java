package ejercicio5;

//Realizado por Juan Manuel Carmona Ruiz 1DAM el 19-03-2023

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	static ArrayList<Alumno> alumnosFP=new ArrayList();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		
		int num=1;
		int codigo;
		
		while(num>=1) {
			
			System.out.println("Indique que desea hacer:\n1.Ingresar persona\n2.Mostrar informacion de un alumno\n3.Dar de baja a un alumno\n4.Modificar la direccion o el telefono\n5.Cambio de curso\nPulse 0 para cerrar el programa");
			
			num=scn.nextInt();
			
			if(num==0) {
				
				System.out.println("Fin del programa");
				
			}else {
				if(num==1) {
					
					ingresarAlumno();
					
				}else {
					if(num==2) {
						
						System.out.println("Indique el codigo del alumno: ");
						codigo=scn.nextInt();
						System.out.println(buscarAlumno(codigo));
						
						
					}else {
						if(num==3) {
							
							System.out.println("Indique el codigo del alumno: ");
							codigo=scn.nextInt();
							eliminaAlumno(codigo);
							
							
						}else {
							if(num==4) {
								
								System.out.println("Indique el codigo del alumno: ");
								codigo=scn.nextInt();
								modificaDatos(codigo);
								
								
							}else {
								if(num==5) {
									
									System.out.println("Indique el codigo del alumno: ");
									codigo=scn.nextInt();
									modificaCiclo(codigo);
									
								}else {
									
									System.out.println("Numero erroneo, vuelva a intentarlo");
									
								}								
							}
						}
					}
				}
			}
		}							
	}
	
	public static void ingresarAlumno() {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Indique el codigo de alumno: ");
		int codigo=scn.nextInt();
		
		scn.nextLine();
		System.out.println("Indique los apellidos: ");
		String apellidos=scn.nextLine();
		
		
		System.out.println("Indique el nombre: ");
		String nombre=scn.nextLine();
		
		System.out.println("Indique la direccion");
		String direccion=scn.nextLine();
		
		System.out.println("Indique el telefono");
		String telefono=scn.nextLine();
		
		System.out.println("Indique el codigo del ciclo");
		int codigoCiclo=scn.nextInt();
		
		System.out.println("Indique cursos aprobados:");
		int cursosAprobados=scn.nextInt();
		
		LocalDate fechaIngreso=LocalDate.now();
		
		Alumno nuevo=new Alumno(codigo,apellidos,nombre,direccion,telefono,codigoCiclo,cursosAprobados,fechaIngreso);
		
		alumnosFP.add(nuevo);
	}
	
	public static String buscarAlumno(int codigo) {
		
		String infoAlumno="";
		
		for (Alumno i : alumnosFP) {
			if(i.getCodigo()==codigo) {
				infoAlumno=i.toString();
			}
		}
		
		return infoAlumno;
		
	}
	
	public static void eliminaAlumno(int codigo) {
		
		for (Alumno i : alumnosFP) {
			if(i.getCodigo()==codigo) {
				alumnosFP.remove(i);
			}
		}
		
	}
	
	public static void modificaDatos(int codigo) {
		
		System.out.println("¿Que desea modificar?\n1.Telefono\n2.Direccion\n3.Telefono y direccion");
		
		Scanner scn=new Scanner(System.in);
		int menu=scn.nextInt();
		if(menu==1) {
			for (Alumno i : alumnosFP) {
				if(i.getCodigo()==codigo) {
					System.out.println("Indique el nuevo numero de telefono");
					i.setTelefono(scn.next());
				}
			}
		}else {
			if(menu==2) {
				for (Alumno i : alumnosFP) {
					if(i.getCodigo()==codigo) {
						System.out.println("Indique la nueva direccion");
						i.setDireccion(scn.nextLine());
					}
				}
			}else {
				if(menu==3) {
					for (Alumno i : alumnosFP) {
						if(i.getCodigo()==codigo) {
							
							System.out.println("Indique el nuevo numero de telefono");
							i.setTelefono(scn.next());
							scn.nextLine();
							
							System.out.println("Indique la nueva direccion");
							i.setDireccion(scn.nextLine());
						}
					}
				}else {
					System.out.println("La opcion seleccionada no existe");
				}
			}
		}
	}
	
	public static void modificaCiclo(int codigo) {
		
		Scanner scn=new Scanner(System.in);
		
		for (Alumno i : alumnosFP) {
			if(i.getCodigo()==codigo) {
				System.out.println("Indique el nuevo ciclo");
				i.setCodigoCiclo(scn.nextInt());
				System.out.println("Indique los cursos aprobados");
				i.setCursosAprobados(scn.nextInt());
			}
		}
	}

}
