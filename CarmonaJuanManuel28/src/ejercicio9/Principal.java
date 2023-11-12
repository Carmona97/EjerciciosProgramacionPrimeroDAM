package ejercicio9;

//Realizado por Juan Manuel Carmona Ruiz 1DAM el 27-03-2023

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente Paco = new Cliente("Paco", "Pacopaquete@iesplayamar.com");
		
		Paco.addTelefono("123456789");
		Paco.addCompra("Monitor", 2);
		Paco.addCompra("Teclado", 1);
		
		System.out.println("Productos de: "+Paco.getNombre()+" "+Paco.verProductos()+" Y tiene: "+Paco.totalUnidades()+" unidades");
		
		Paco.eliminarProducto("Monitor");
		System.out.println("Productos de: "+Paco.getNombre()+" "+Paco.verProductos()+" Y tiene: "+Paco.totalUnidades()+" unidades");
		
		System.out.println("Numeros de: "+Paco.getNombre()+" "+Paco.buscarTelefono("123"));
		System.out.println("Numeros de: "+Paco.getNombre()+" "+Paco.buscarTelefono("645"));
	}

}
