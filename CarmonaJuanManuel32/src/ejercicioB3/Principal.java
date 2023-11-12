package ejercicioB3;

/*Realizado por Juan Manuel Carmona Ruiz
 * 24/04/2023
 * Implementa un programa que pida al usuario un nombre de archivo A para lectura y otro nombre
de archivo B para escritura. Leerá el contenido del archivo A (por ejemplo ‘usa_personas.txt’) y lo
escribirá ordenado alfabéticamente en B (por ejemplo ‘usa_personas_sorted.txt’).*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		ArrayList <String> palabrasFichero=new ArrayList<String>();
		try {
			System.out.println("Introduce el nombre del fichero que quieras leer");
			String fichero=scn.next();			
			File ficheroElegido=new File("src/Documentos/"+fichero);
			
			Scanner ficheroLectura= new Scanner(ficheroElegido);
			
			while(ficheroLectura.hasNext()) {
				
				String palabra=ficheroLectura.next();
				String minuscula=palabra.toLowerCase();
				palabrasFichero.add(minuscula);	
				
			}
			
			ficheroLectura.close();
			Collections.sort(palabrasFichero);
			
			String[] nombreFicheroNuevo=ficheroElegido.getName().split("\\.");
			String nombreFicheroNuevoSinExtension=nombreFicheroNuevo[0];
			
			File nuevo=new File("src/Documentos/"+nombreFicheroNuevoSinExtension+"_ordenado.txt");
			FileWriter escritura=new FileWriter(nuevo,true);
			
			for (String i : palabrasFichero) {
			    escritura.write(i + "\n");
			}
	
			escritura.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		

	}
}
