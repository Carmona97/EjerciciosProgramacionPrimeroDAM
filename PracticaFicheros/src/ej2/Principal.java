package ej2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Principal {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Cliente> propietariosFiat = new ArrayList<Cliente>();
		
		Cliente antonio = new Cliente("Antonio");
		Cliente paco = new Cliente("Paco");
		propietariosFiat.add(antonio);
		propietariosFiat.add(paco);
		
		Coche fiat = new Coche("7909kmn",2003,"Fiat",4,propietariosFiat);
		
		
		String rutaFichero = "src/Documentos/Paco.txt";
		
		System.out.println(fiat.toString());
		for (Cliente i : propietariosFiat) {
			if(i.getNombre().equals("Paco")) {
				try {
					FileWriter escribe = new FileWriter(rutaFichero);
					escribe.write(i.toString());
					escribe.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
