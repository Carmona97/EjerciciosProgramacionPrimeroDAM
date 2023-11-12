package ejercicioA2;


/*Realizado por Juan Manuel Carmona Ruiz
 * 23/04/2023
 Partiendo de una copia del programa anterior, modifica la función muestraInfoRuta:
● En el caso de un directorio, mostrará la lista de directorios y archivos en orden alfabético. Es
decir, primero los directorios en orden alfabético y luego los archivos en orden alfabético. Te
será útil Arrays.sort().
● Añade un segundo argumento ‘boolean info’ que cuando sea ‘true’ mostrará, junto a la
información de cada directorio o archivo, su tamaño en bytes y la fecha de la última
modificación. Cuando ‘info’ sea ‘false’ mostrará la información como en el ejercicio anterior.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String rutaUsuario="";
		do {
			try {

				System.out.println("Introduzca la direccion de la ruta");
				rutaUsuario = scn.nextLine();
				File ruta = new File(rutaUsuario);
				muestraInfoRuta(ruta, true);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} 
		} while (rutaUsuario !="");
	}

public static void muestraInfoRuta(File ruta,boolean info) throws FileNotFoundException {
		
		if (info==false) {
			if (ruta.isDirectory() == true) {
				File[] archivos = new File[ruta.listFiles().length];

				archivos = ruta.listFiles();

				System.out.println("[*] " + ruta.getName());

				for (int i = 0; i < archivos.length; i++) {
					System.out.println(archivos[i].getName());
				}

			} else {
				if (ruta.isFile() == true) {
					System.out.println("[A] " + ruta.getName());
				} else {
					if (ruta.exists() == false) {
						throw new FileNotFoundException();
					}
				}
			} 
		}else {
			if (ruta.isDirectory() == true) {
				
				int tamano=ruta.listFiles().length;
				
				File archivos[]=new File[tamano];
				archivos=ruta.listFiles();
				
				Arrays.sort(archivos);
				
				String ficheros="";
				String directorios="";
				
				for(int i=0;i<tamano;i++) {
					if(archivos[i].isDirectory()) {
						directorios+= "[*] "+archivos[i]+" "+archivos[i].length()+" "+archivos[i].lastModified()+"\n";
					}
				}
				
				for(int i=0;i<tamano;i++) {
					if(archivos[i].isFile()) {
						ficheros+= "[A] "+archivos[i]+" "+archivos[i].length()+" "+archivos[i].lastModified()+"\n";
					}
				}
				
				System.out.println(directorios+ficheros);
				
			} else {
				if (ruta.isFile() == true) {
					System.out.println("[A] " + ruta.getName()+" "+ruta.length()+" "+ruta.lastModified());
				} else {
					if (ruta.exists() == false) {
						throw new FileNotFoundException();
					}
				}
			}
		}
	}
}
