package ejercicioA4;

/*Realizado por Juan Manuel Carmona Ruiz
 * 23/04/2023
 * Implementa un programa que cree, dentro de ‘Documentos’, dos nuevas carpetas: ‘Mis Cosas’ y
‘Alfabeto’. Mueve las carpetas ‘Fotografias’ y ‘Libros’ dentro de ‘Mis Cosas’. Luego crea dentro de
‘Alfabeto’ una carpeta por cada letra del alfabeto (en mayúsculas): ‘A’, ‘B’, ‘C’... ‘Z’. Te serán de
ayuda los códigos numéricos ASCII: https://elcodigoascii.com.ar*/

import java.io.File;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File misCosas=new File("src/Documentos/Mis cosas");
		File alfabeto=new File("src/Documentos/Alfabeto");
		
		boolean crearMisCosas=misCosas.mkdir();
		boolean crearAlfabeto=alfabeto.mkdir();
		
		if(crearMisCosas==true && crearAlfabeto==true) {
			System.out.println("Las carpetas se han creado correctamente");
		}
		
		File fotografias=new File("src/Documentos/Fotografias");
		File libros=new File("src/Documentos/Libros");
		
		File moverFotografias=new File("src/Documentos/Mis cosas/Fotografias");
		File moverLibros=new File("src/Documentos/Mis cosas/Libros");
		
		fotografias.renameTo(moverFotografias);
		libros.renameTo(moverLibros);
		
		/*En lugar de utilizar los codigos ASCII he utilizado un String con todas las mayusculas y un bucle que instancie en cada vuelta un objeto de la clase File 
		con la ruta especificada y se le añade cada uno de los caracteres del String*/
		
		String mayus="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		for(int i=0;i<mayus.length();i++) {
			
			char letra=mayus.charAt(i);
			File nuevaLetra=new File("src/Documentos/Alfabeto/"+letra);
			
			boolean mkdirLetra=nuevaLetra.mkdir();
			
			if(mkdirLetra==true) {
				System.out.println("La carpeta "+letra+" se ha creado con exito");
			}
		}
		
	}

}
