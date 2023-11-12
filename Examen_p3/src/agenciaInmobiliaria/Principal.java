package agenciaInmobiliaria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgenciaInmobiliaria agencia = new AgenciaInmobiliaria();
		Scanner scn = new Scanner(System.in);
		int opcion = 0;

		// Agregar propietarios y propiedades precargadas
		Propietario propietario1 = new Propietario("Juan", "Pérez", "12345678A", "123456789");
		Propietario propietario2 = new Propietario("María", "López", "87654321B", "987654321");
		Propietario propietario3 = new Propietario("Pedro", "Gómez", "56789012C", "987654321");

		Piso piso1 = new Piso("Calle Principal 123", 1000, 80, 2, 1);
		Piso piso2 = new Piso("Avenida Central 456", 1500, 100, 3, 2);
		LocalComercial local1 = new LocalComercial("Plaza Mayor 789", 2000, 150, true);

		propietario1.agregarPropiedad(piso1);
		propietario2.agregarPropiedad(piso2);
		propietario3.agregarPropiedad(local1);

		agencia.propietarios.add(propietario1);
		agencia.propietarios.add(propietario2);
		agencia.propietarios.add(propietario3);
		
		boolean fallo=false;
		
		
		do {
			try {
				while (opcion != 7) {
					System.out.println("----- MENÚ -----");
					System.out.println("1. Mostrar todas las propiedades");
					System.out.println("2. Agregar una propiedad");
					System.out.println("3. Mostrar todos los pisos de un propietario");
					System.out.println("4. Mostrar precio medio de los locales comerciales");
					System.out.println("5. Mostrar propietario del piso con mayor número de baños");
					System.out.println("6. Exportar datos de los pisos a un archivo de texto");
					System.out.println("7. Salir");
					System.out.println("----------------");

					System.out.println("Ingrese una opción:");
					opcion = scn.nextInt();
					scn.nextLine(); // Limpiar el buffer de lectura

					switch (opcion) {
					case 1:
						agencia.mostrarPropiedades();
						break;
					case 2:
						agencia.agregarPropiedad();
						break;
					case 3:
						agencia.mostrarPisosPropietario();
						break;
					case 4:
						agencia.mostrarPrecioMedioLocalesComerciales();
						break;
					case 5:
						String dni=scn.next();
						agencia.eliminarPropietario(dni);
						break;
					case 6:
						System.out.println("Ingrese el nombre del archivo de texto:");
						String nombreArchivo = scn.nextLine();
						agencia.exportarPisosATexto(nombreArchivo);
						break;
					case 7:
						System.out.println("¡Hasta luego!");
						break;
					default:
						System.out.println("Opción inválida. Por favor, ingrese un número del 1 al 7.");
						break;
					}
				}
			} catch (InputMismatchException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				fallo = true;
				System.out.println("No es una opcion correcta, vuelva a intentarlo");
				scn.nextLine();
			} 
		} while (fallo);	    
	}

}
