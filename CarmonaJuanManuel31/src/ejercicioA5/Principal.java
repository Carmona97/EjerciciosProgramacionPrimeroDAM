package ejercicioA5;

/*Realizado por Juan Manuel Carmona Ruiz
 * 23/04/2023
 * Implementa un programa con una función boolean borraTodo(File f) que borre f: Si no existe
lanzará una excepción. Si es un archivo lo borrará. Si es un directorio, borrará primero sus archivos y
luego el propio directorio (recuerda que para poder borrar un directorio debe estar vacío). Devolverá
‘true’ si pudo borrar el ‘File f’ (‘false’ si no fué posible).
Prueba la función borrando las carpetas: ‘Documentos/Fotografias’, ‘Documentos/Libros’ y
‘Documentos’ (es decir, tres llamadas a la función, en ese orden).*/

import java.io.File;
import java.io.FileNotFoundException;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fotografia=new File("src/Documentos/Fotografias");
		File libros=new File("src/Documentos/Libros");
		File documentos=new File("src/Documentos");
		
		try {
			System.out.println(borraTodo(fotografia));
			System.out.println(borraTodo(libros));
			System.out.println(borraTodo(documentos));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static boolean borraTodo(File f) throws FileNotFoundException{
	
		boolean borradoFicheros=false;
		boolean borradoDirectorio=false;
		if(f.isDirectory()) {
			File[] vectorFicheros=f.listFiles();
			for(int i=0;i<vectorFicheros.length;i++) {
				if(vectorFicheros[i].isFile()) {
					borradoFicheros=vectorFicheros[i].delete();					
				}
			}
		}
		
		if(borradoFicheros==true) {
			borradoDirectorio = f.delete();
		}else {
			throw new FileNotFoundException("La ruta especificada no existe");
		}
		
		return borradoDirectorio;
	}
}
