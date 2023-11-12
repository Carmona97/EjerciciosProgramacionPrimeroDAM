package ejercicioA3;

/*Realizado por Juan Manuel Carmona Ruiz
 * 23/04/2023
 * Implementa un programa que haga lo siguiente:
● Cambiar el nombre de la carpeta ‘Documentos’ a ‘DOCS’, el de la carpeta ‘Fotografias’ a
‘FOTOS’ y el de la carpeta ‘Libros’ a ‘LECTURAS’
● Cambiar el nombre de todos los archivos de las carpetas FOTOS y LECTURAS quitándole la
extensión. Por ejemplo, ‘astronauta.jpg’ pasará a llamarse ‘astronauta’.*/


import java.io.File;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File documentos= new File("src/Documentos");
		File docs = new File("src/DOCS");
		File fotografias = new File("src/DOCS/Fotografias");
		File fotos= new File("src/DOCS/FOTOS");
		File libros=new File("src/DOCS/Libros");
		File lecturas=new File("src/DOCS/LECTURAS");
		boolean comprobacion1 = documentos.renameTo(docs);
		boolean comprobacion2 = fotografias.renameTo(fotos);
		boolean comprobacion3 = libros.renameTo(lecturas);
		
		if(comprobacion1==true) {
			System.out.println("Se ha renombrado el directorio "+documentos+" correctamente a "+docs);
		}
		
		if(comprobacion2==true) {
			System.out.println("Se ha renombrado el directorio  "+fotografias+" correctamente a "+fotos);
		}
		
		if(comprobacion3==true) {
			System.out.println("Se ha renombrado el directorio "+libros+" correctamente a "+lecturas);
		}
		
		
		
		File[] vectorArchivos = fotos.listFiles();
		for(int i=0;i<vectorArchivos.length;i++) {
			if(vectorArchivos[i].isFile()) {
				String nombresFicheros = vectorArchivos[i].getName();
				int indicePunto = nombresFicheros.lastIndexOf(".");
				if(indicePunto>0 &&  indicePunto<nombresFicheros.length() - 1) {
					String nuevoNombre = nombresFicheros.substring(0,indicePunto);
					File nuevoFichero = new File(vectorArchivos[i].getParent(),nuevoNombre);
					vectorArchivos[i].renameTo(nuevoFichero);
				}
			}
		}
		
		File[] vectorArchivos2 = lecturas.listFiles();
		for(int i=0;i<vectorArchivos2.length;i++) {
			if(vectorArchivos2[i].isFile()) {
				String nombresFicheros = vectorArchivos2[i].getName();
				int indicePunto = nombresFicheros.lastIndexOf(".");
				if(indicePunto>0 &&  indicePunto<nombresFicheros.length() - 1) {
					String nuevoNombre = nombresFicheros.substring(0,indicePunto);
					File nuevoFichero = new File(vectorArchivos2[i].getParent(),nuevoNombre);
					vectorArchivos2[i].renameTo(nuevoFichero);
				}
			}
		}		
	}

}
