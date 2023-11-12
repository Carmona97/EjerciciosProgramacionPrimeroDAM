package ej1;

import java.io.File;import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		
		int seleccionar=-1;
		
		do {
			System.out.println("Indica la ruta del archivo");
			String ruta = scn.next();
			File actual = new File(ruta);
			System.out.println("Indique que accion desea realizar");
			seleccionar = scn.nextInt();
			switch (seleccionar) {
			case 0:

				break;
			case 1:
				System.out.println(pwd(actual));
				break;

			case 2:
				boolean carpetaCreada = crearDirectorio(actual);
				if(carpetaCreada) {
					System.out.println("La carpeta se ha creado correctamente");
				}else {
					System.out.println("No se ha creado nada");
				}
				break;
			case 3:
				System.out.println("nombre");
				String nombre = scn.nextLine();
				scn.nextLine();
				System.out.println("direccion");
				String direccion = scn.nextLine();
				break;
			default:
				System.out.println("Opción inválida");
				break;
			}
		} while (seleccionar!=0);
		
		
	}
	
	public static String pwd(File archivo) throws FileNotFoundException{
		
		String nombreDirectorio = "";
		String nombreArchivos = "";
		
	
		if(archivo.isDirectory()) {
			nombreDirectorio = archivo.getName();
			int tamano = archivo.listFiles().length;
			File[] ficheros=new File[tamano];
			ficheros = archivo.listFiles();
			for(int i=0;i<tamano;i++) {
				nombreArchivos += ficheros[i].getName()+"\n";
			}
		}else {
			if(archivo.isFile()) {
				nombreDirectorio =  archivo.getParent();
				
			}else {
				throw new FileNotFoundException();
			}
		}
		return nombreDirectorio+"\n"+nombreArchivos;
	}
	

	public static boolean crearDirectorio(File archivo) {
		boolean crearCarpeta = archivo.mkdir();
		return crearCarpeta;
	}
}
	
	