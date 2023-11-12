package ej3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fichero = new File("src/Documentos/diccionario.txt");
		
		try {
			Scanner lectorArchivo = new Scanner(fichero);
			FileWriter escribe = new FileWriter("src/Documentos/A",true);
			do {
				String linea = lectorArchivo.nextLine();
				if(linea.startsWith("a") || linea.startsWith("A")) {
					
					escribe.write(linea+"\n");
					
				}
			} while (lectorArchivo.hasNext());
			lectorArchivo.close();
			escribe.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
