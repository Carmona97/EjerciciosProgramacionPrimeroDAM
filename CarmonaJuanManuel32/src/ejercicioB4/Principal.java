package ejercicioB4;

/*Realizado por Juan Manuel Carmona Ruiz
 * 24/04/2023
 * Implementa un programa que genere aleatoriamente nombres de persona (combinando nombres
y apellidos de ‘usa_nombres.txt’ y ‘usa_apellidos.txt’). Se le pedirá al usuario cuántos nombres de
persona desea generar y a qué archivo añadirlos (por ejemplo ‘usa_personas.txt’).*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		try {
			File nombres=new File("src/Documentos/usa_nombres.txt");
			File apellidos=new File("src/Documentos/usa_apellidos.txt");
			Scanner lectorNombres=new Scanner(nombres);
			Scanner lectorApellidos=new Scanner(apellidos);
			
			ArrayList<String> listaNombres=new ArrayList<String>();
			ArrayList<String> listaApellidos=new ArrayList<String>();
			
			while(lectorNombres.hasNext()) {
				String nombre=lectorNombres.next();
				listaNombres.add(nombre);
			}
			
			lectorNombres.close();
			
			while(lectorApellidos.hasNext()) {
				String apellido=lectorApellidos.next();
				listaApellidos.add(apellido);
			}
			
			lectorApellidos.close();
			
			System.out.println("Indique cuantos nombres se desea generar");
			int cantidadNombres=scn.nextInt();
			
			System.out.println("Donde se añadiran estos nombres?");
			String nombreFicheroGuardado=scn.next();
			
			try {
				FileWriter anadirNombresFichero=new FileWriter("src/Documentos/"+nombreFicheroGuardado,true);
				anadirNombresFichero.write(generarNombres(cantidadNombres,listaNombres,listaApellidos));
				anadirNombresFichero.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static String generarNombres(int cantidadNombres,ArrayList<String> listaNombres,ArrayList<String> listaApellidos) {
		
		String nombreAleatorio="";
		String apellidoAleatorio="";
		String nombreCompleto="";
		for(int i=0;i<=cantidadNombres-1;i++) {
			
			/*Los numeros que aparecen a la derecha de el metodo random es por la cantidad de nombres/apellidos de cada uno de estos ficheros no se usa el metodo size correspondiente a cada una de las listas, 
			 * porque es posible que se seleccionen ya nombres completos incluidos en otras veces que se haya ejecutado el programa*/
			
			nombreAleatorio=listaNombres.get((int)(Math.random()*275));
			apellidoAleatorio=listaApellidos.get((int)(Math.random()*246));
			nombreCompleto+=nombreAleatorio+" "+apellidoAleatorio+"\n";
		}
		return nombreCompleto;
	}

}
