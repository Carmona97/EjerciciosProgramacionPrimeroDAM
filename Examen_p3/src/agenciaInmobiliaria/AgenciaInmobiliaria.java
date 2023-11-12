package agenciaInmobiliaria;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AgenciaInmobiliaria {
    public ArrayList<Propietario> propietarios;

    // Constructor de la clase AgenciaInmobiliaria
    public AgenciaInmobiliaria() {
        propietarios = new ArrayList<>();
    }

    // Método para mostrar todas las propiedades con sus características
    public void mostrarPropiedades() {
        // Recorre la lista de propietarios
        for (Propietario propietario : propietarios) {
            ArrayList<Propiedad> propiedades = propietario.getPropiedades();
            // Recorre la lista de propiedades del propietario
            for (Propiedad propiedad : propiedades) {
                // Comprueba el tipo de propiedad y muestra sus características correspondientes
                if (propiedad instanceof Piso) {
                    Piso piso = (Piso) propiedad;
                    System.out.println("Propiedad ID: " + propiedad.getId());
                    System.out.println("Tipo: Piso");
                    System.out.println("Dirección: " + propiedad.getDireccion());
                    System.out.println("Precio: " + propiedad.getPrecio());
                    System.out.println("Metros cuadrados: " + piso.getM2());
                    System.out.println("Número de habitaciones: " + piso.getNumHabitaciones());
                    System.out.println("Número de baños: " + piso.getNumBanos());
                    System.out.println();
                } else if (propiedad instanceof LocalComercial) {
                    LocalComercial local = (LocalComercial) propiedad;
                    System.out.println("Propiedad ID: " + propiedad.getId());
                    System.out.println("Tipo: Local Comercial");
                    System.out.println("Dirección: " + propiedad.getDireccion());
                    System.out.println("Precio: " + propiedad.getPrecio());
                    System.out.println("Metros cuadrados: " + local.getM2());
                    System.out.println("Aire acondicionado: " + (local.tieneAireAcondicionado() ? "Sí" : "No"));
                    System.out.println();
                }
            }
        }
    }

    // Método para agregar una propiedad a un propietario
    public void agregarPropiedad() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Ingrese el DNI del propietario:");
        String dniPropietario = scn.nextLine();

        Propietario propietario = buscarPropietarioPorDNI(dniPropietario);
        if (propietario == null) {
            System.out.println("El propietario no existe. Por favor, registre al propietario primero.");
            return;
        }

        System.out.println("Ingrese el tipo de propiedad (Piso/Local):");
        String tipoPropiedad = scn.nextLine();

        System.out.println("Ingrese la dirección:");
        String direccion = scn.nextLine();

        System.out.println("Ingrese el precio:");
        double precio = scn.nextDouble();

        // Verifica el tipo de propiedad y solicita los datos correspondientes
        if (tipoPropiedad.equalsIgnoreCase("Piso")) {
            System.out.println("Ingrese los metros cuadrados:");
            int m2 = scn.nextInt();

            System.out.println("Ingrese el número de habitaciones:");
            int numHabitaciones = scn.nextInt();

            System.out.println("Ingrese el número de baños:");
            int numBanos = scn.nextInt();

            if (m2 <= 0 || precio <= 0) {
                System.out.println("Error: los metros cuadrados y el precio deben ser mayores a cero.");
                return;
            }

            Piso piso = new Piso(direccion, precio, m2, numHabitaciones, numBanos);
            propietario.agregarPropiedad(piso);
        } else if (tipoPropiedad.equalsIgnoreCase("Local")) {
            System.out.println("Ingrese los metros cuadrados:");
            int m2 = scn.nextInt();

            System.out.println("¿Dispone de aire acondicionado? (Sí/No):");
            String tieneAireAcondicionadoStr = scn.next();

            boolean tieneAireAcondicionado;
            if (tieneAireAcondicionadoStr.equalsIgnoreCase("Sí")) {
                tieneAireAcondicionado = true;
            } else if (tieneAireAcondicionadoStr.equalsIgnoreCase("No")) {
                tieneAireAcondicionado = false;
            } else {
                System.out.println("Error: opción inválida. El valor por defecto será 'No'.");
                tieneAireAcondicionado = false;
            }

            if (m2 <= 0 || precio <= 0) {
                System.out.println("Error: los metros cuadrados y el precio deben ser mayores a cero.");
                return;
            }

            LocalComercial local = new LocalComercial(direccion, precio, m2, tieneAireAcondicionado);
            propietario.agregarPropiedad(local);
        } else {
            System.out.println("Error: tipo de propiedad inválido.");
            return;
        }

        System.out.println("La propiedad ha sido agregada correctamente.");
    }

    // Método para mostrar todos los pisos de un propietario a partir de su DNI
    public void mostrarPisosPropietario() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Ingrese el DNI del propietario:");
        String dniPropietario = scn.nextLine();

        Propietario propietario = buscarPropietarioPorDNI(dniPropietario);
        if (propietario == null) {
            System.out.println("El propietario no existe.");
            return;
        }

        ArrayList<Propiedad> propiedades = propietario.getPropiedades();
        System.out.println("Pisos del propietario con DNI " + dniPropietario + ":");
        for (Propiedad propiedad : propiedades) {
            if (propiedad instanceof Piso) {
                Piso piso = (Piso) propiedad;
                System.out.println("Propiedad ID: " + propiedad.getId());
                System.out.println("Dirección: " + propiedad.getDireccion());
                System.out.println("Precio: " + propiedad.getPrecio());
                System.out.println("Metros cuadrados: " + piso.getM2());
                System.out.println("Número de habitaciones: " + piso.getNumHabitaciones());
                System.out.println("Número de baños: " + piso.getNumBanos());
                System.out.println();
            }
        }
    }

    // Método para mostrar el precio medio de los locales comerciales en alquiler
    // y los locales que estén debajo de la media
    public void mostrarPrecioMedioLocalesComerciales() {
        double sumaPrecios = 0;
        int numLocales = 0;

        for (Propietario propietario : propietarios) {
            ArrayList<Propiedad> propiedades = propietario.getPropiedades();
            for (Propiedad propiedad : propiedades) {
                if (propiedad instanceof LocalComercial) {
                    sumaPrecios += propiedad.getPrecio();
                    numLocales++;
                }
            }
        }

        if (numLocales > 0) {
            double precioMedio = sumaPrecios / numLocales;
            System.out.println("Precio medio de los locales comerciales: " + precioMedio);

            System.out.println("Locales comerciales con precio por debajo de la media:");
            for (Propietario propietario : propietarios) {
                ArrayList<Propiedad> propiedades = propietario.getPropiedades();
                for (Propiedad propiedad : propiedades) {
                    if (propiedad instanceof LocalComercial && propiedad.getPrecio() < precioMedio) {
                        LocalComercial local = (LocalComercial) propiedad;
                        System.out.println("Propiedad ID: " + propiedad.getId());
                        System.out.println("Dirección: " + propiedad.getDireccion());
                        System.out.println("Precio: " + propiedad.getPrecio());
                        System.out.println("Metros cuadrados: " + local.getM2());
                        System.out.println("Aire acondicionado: " + (local.tieneAireAcondicionado() ? "Sí" : "No"));
                        System.out.println();
                    }
                }
            }
        } else {
            System.out.println("No hay locales comerciales registrados.");
        }
    }

    // Método para mostrar el nombre del propietario del piso con mayor número de baños
    public void mostrarPropietarioPisoMayorBanos() {
        Propietario propietarioMayorBanos = null;
        int maxNumBanos = 0;

        for (Propietario propietario : propietarios) {
            ArrayList<Propiedad> propiedades = propietario.getPropiedades();
            for (Propiedad propiedad : propiedades) {
                if (propiedad instanceof Piso) {
                    Piso piso = (Piso) propiedad;
                    if (piso.getNumBanos() > maxNumBanos) {
                        maxNumBanos = piso.getNumBanos();
                        propietarioMayorBanos = propietario;
                    }
                }
            }
        }

        if (propietarioMayorBanos != null) {
            System.out.println("Propietario del piso con mayor número de baños:");
            System.out.println("Nombre: " + propietarioMayorBanos.getNombre());
            System.out.println("Apellidos: " + propietarioMayorBanos.getApellidos());
            System.out.println("DNI: " + propietarioMayorBanos.getDni());
            System.out.println("Teléfono: " + propietarioMayorBanos.getTelefono());
        } else {
            System.out.println("No hay pisos registrados.");
        }
    }

    // Método para exportar todos los datos de los pisos almacenados en un archivo de texto
    public void exportarPisosATexto(String nombreArchivo) {
        try {
            FileWriter writer = new FileWriter(nombreArchivo);

            for (Propietario propietario : propietarios) {
                ArrayList<Propiedad> propiedades = propietario.getPropiedades();
                for (Propiedad propiedad : propiedades) {
                    if (propiedad instanceof Piso) {
                        Piso piso = (Piso) propiedad;
                        writer.write("Propiedad ID: " + propiedad.getId() + "\n");
                        writer.write("Tipo: Piso\n");
                        writer.write("Dirección: " + propiedad.getDireccion() + "\n");
                        writer.write("Precio: " + propiedad.getPrecio() + "\n");
                        writer.write("Metros cuadrados: " + piso.getM2() + "\n");
                        writer.write("Número de habitaciones: " + piso.getNumHabitaciones() + "\n");
                        writer.write("Número de baños: " + piso.getNumBanos() + "\n\n");
                    }
                }
            }

            writer.close();
            System.out.println("Los datos de los pisos se han exportado correctamente al archivo: " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al exportar los datos de los pisos.");
        }
    }

    // Método para buscar un propietario por su DNI
    private Propietario buscarPropietarioPorDNI(String dni) {
        for (Propietario propietario : propietarios) {
            if (propietario.getDni().equalsIgnoreCase(dni)) {
                return propietario;
            }
        }
        return null;
    }
    
    public void eliminarPropietario(String dni) {
    	for (Propietario i : propietarios) {
			if(i.getDni().equals(dni)) {
				propietarios.remove(i);
				break;
			}
		}
    }
}