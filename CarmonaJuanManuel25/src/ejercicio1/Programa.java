package ejercicio1;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empresa ferrovial=new Empresa("Ferrovial","123453","654123123","Calle triliti");
		Empleado paco=new Empleado("Paco paquete","1234567T",1389.43);
		Empleado nico=new Empleado("Nico niquete","7654321L",3505.50);
		
		ferrovial.setTrabajadores(2);
		ferrovial.agnadeEmpleado(nico);
		ferrovial.agnadeEmpleado(paco);
		System.out.println(ferrovial.mostrarEmpleados());
		ferrovial.eliminaEmpleado(1);
		System.out.println(ferrovial.mostrarEmpleados());
		System.out.println(ferrovial.mostrarSueldos());
	}

}
