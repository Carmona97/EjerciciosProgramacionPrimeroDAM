package ejercicioA1;

/*Realizado por Juan Manuel Carmona Ruiz
 * 23/04/2023
 Implementa un programa que pida al usuario introducir por teclado una ruta del sistema de
archivos (por ejemplo, “C:/Windows” o “Documentos”) y muestre información sobre dicha ruta (ver
función más abajo). El proceso se repetirá una y otra vez hasta que el usuario introduzca una ruta
vacía (tecla intro). Deberá manejar las posibles excepciones.
Necesitarás crear la función void muestraInfoRuta(File ruta) que dada una ruta de tipo File haga
lo siguiente:
● Si es un archivo, mostrará por pantalla el nombre del archivo.
● Si es un directorio, mostrará por pantalla la lista de directorios y archivos que contiene (sus
nombres). Deberá mostrar primero los directorios y luego los archivos.
● En cualquier caso, añade delante del nombre la etiqueta [*] o [A] para indicar si es un
directorio o un archivo respectivamente.
● Si el path no existe lanzará un FileNotFoundException.*/


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String rutaUsuario="";
		do {
			try {
				System.out.println("Introduzca la direccion de la ruta");
				rutaUsuario = scn.nextLine();
				File ruta = new File(rutaUsuario);
				muestraInfoRuta(ruta);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} 
		} while (rutaUsuario!="");
		
	}

	public static void muestraInfoRuta(File ruta) throws FileNotFoundException {
		
		if(ruta.isDirectory()==true) {
			File[] archivos=new File[ruta.listFiles().length];
			
			archivos=ruta.listFiles();
			
			System.out.println("[*] "+ruta.getName());
			
			for(int i=0;i<archivos.length;i++) {
				System.out.println(archivos[i].getName());
			}
			
		}else {
			if(ruta.isFile()==true) {
				System.out.println("[A] "+ruta.getName());
			}else {
				if(ruta.exists()==false) {
					throw new FileNotFoundException();
				}
			}
		}
	}
}
