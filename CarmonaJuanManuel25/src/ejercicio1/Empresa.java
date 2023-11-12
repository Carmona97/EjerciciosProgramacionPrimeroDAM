package ejercicio1;

public class Empresa {

	private final String nombre;
	private final String CIF;
	private String telefono;
	private String direccion;
	private int trabajadores;
	private Empleado[] empleados;
	
	public Empresa(String nombre,String CIF,String telefono,String direccion) {
		
		this.nombre=nombre;
		this.CIF=CIF;
		this.telefono=telefono;
		this.direccion=direccion;
		empleados=new Empleado[2];
	}
	
	public void setTrabajadores(int trabajadores) {
		
		empleados=new Empleado[trabajadores];
	
	}
	

	public void agnadeEmpleado(Empleado nuevoEmpleado) {
		
		empleados[trabajadores]=nuevoEmpleado;
		trabajadores++;
		
	}
	
	public void eliminaEmpleado(int eliminaEmpleado) {
		
		for(int i=0;i<trabajadores;i++) {
			
			if(i==eliminaEmpleado) {
				
				empleados[i]=null;
			
			}
		}
		
		trabajadores--;
		
	}
	
	public String mostrarEmpleados() {
		
		String infoEmpleados=" ";
		
		for(int i=0;i<trabajadores;i++) {
			
			infoEmpleados+=empleados[i].imprimir();
			
		}
		
		return infoEmpleados;
	}
	
	public String mostrarSueldos() {
		
		double sueldosBrutos=0;
		double sueldosNetos=0;
		
		for(int i=0;i<=trabajadores;i++) {
			if(empleados[i]!=null) {
				sueldosBrutos+=empleados[i].getSueldoBrutoMensual()*12;
			}		
		}
		for(int i=0;i<=trabajadores;i++) {
			if(empleados[i]!=null) {
			sueldosNetos+=empleados[i].sueldoNeto();
			}
		}
		
		return "Sueldos brutos:"+Double.toString(sueldosBrutos)+"\nSueldos netos:"+Double.toString(sueldosNetos);
	}

}
