package ejercicioB2;

/*Realizado por Juan Manuel Carmona Ruiz
 * 24/04/2023
 * El archivo ‘alumnos_notas.txt’ contiene una lista de 10 alumnos y las notas que han obtenido en
cada asignatura. El número de asignaturas de cada alumno es variable. Implementa un programa
que muestre por pantalla la nota media de cada alumno junto a su nombre y apellido, ordenado
por nota media de mayor a menor.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File alumnosNotas=new File("src/Documentos/alumnos_notas.txt");
		ArrayList<String> alumnos = new ArrayList<String>();
		
		
		
		try {
			Scanner lector=new Scanner(alumnosNotas);
			do {
				
				//Hago un array de cada una de las filas de texto
				String[] fila=new String[10];
				fila=lector.nextLine().split(" ");
				
				//El elemento 0 y 1 de cada fila corresponden al nombre y apellido del alumno
				
				String nombre=fila[0];
				String apellido=fila[1];
				      
				 int suma = 0;
	                for (int i = 2; i < fila.length; i++) {
	                    suma += Integer.valueOf(fila[i]);
	                }
	                
	             double mediaAlumno=(double)suma/(double)(fila.length-2);
	             alumnos.add(nombre+" "+apellido+" "+mediaAlumno);
     
			} while (lector.hasNextLine());
			
			for (String i : alumnos) {
				System.out.println(i);
			}
			
			lector.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {	
			e.printStackTrace();
		}
		
		
	}

}
