package ejercicioB5;

/*Realizado por Juan Manuel Carmona Ruiz
 * 24/04/2023
 * Implementa un programa que cree la carpeta ‘Diccionario’ con tantos archivos como letras del
abecedario (A.txt, B.txt… Z.txt). Introducirá en cada archivo las palabras de ‘diccionario.txt’ que
comiencen por dicha letra.*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> palabras=new ArrayList<String>();
		File diccionario=new File("src/Documentos/Diccionario");
		if(crearDiccionario(diccionario)==true) {
			System.out.println("La carpeta se ha creado con exito");
		}
		
		File ficheroDiccionario=new File("src/Documentos/diccionario.txt");
		
		try {
	
			Scanner leerDiccionario=new Scanner(ficheroDiccionario);
			
			while(leerDiccionario.hasNext()) {
				
				String palabraDiccionario=leerDiccionario.nextLine();
				palabras.add(palabraDiccionario);	
				
			}
			
			leerDiccionario.close();
			
			String letras="ABCDEFGHIJKLMNOPQRSTUVWXYZ";		
			
			for(int i=0;i<letras.length();i++) {
				
				char letra=letras.charAt(i);
				FileWriter nuevaLetra=new FileWriter(diccionario+"/"+letra+".txt");
				for (String palabra : palabras) {
					if(palabra.toUpperCase().charAt(0)==letra) {
						nuevaLetra.write(palabra+"\n");
					}
				}
				nuevaLetra.close();
			}		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static boolean crearDiccionario(File diccionario) {
		
		boolean crearCarpeta=diccionario.mkdir();
		return crearCarpeta;
		
	}

}
