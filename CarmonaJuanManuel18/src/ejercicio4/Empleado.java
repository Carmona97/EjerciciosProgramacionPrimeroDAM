package ejercicio4;
/*Crear una clase Empleado que modele la información que una empresa mantiene sobre cada
empleado:
NIF, apellidos, nombre, sueldo base, pago por hora extra, horas extra realizadas en el
mes, tipo (porcentaje) de IRPF, casado o no y número de hijos.
La clase debe contemplar setters y getters para todos los atributos. Al crear los objetos se podrá
proporcionar, si se quiere, el número de DNI. Los demás servicios que deberán proporcionar los
objetos de la clase serán los siguientes:
Cálculo y devolución del complemento correspondiente a las horas extra realizadas.
Cálculo y devolución del sueldo bruto.
Cálculo y devolución de las retenciones (IRPF) a partir del tipo, teniendo en cuenta que el
porcentaje de retención que hay que aplicar es el tipo menos 2 puntos si el empleado está casado
y menos 1 punto por cada hijo que tenga; el porcentaje se aplica sobre todo el sueldo bruto.
verEmpleado(): visualización de la información básica del empleado.
verTodoEmpleado(): visualización de toda la información del empleado. La básica más
el sueldo base, el complemento por horas extra, el sueldo bruto, la retención de IRPF y el sueldo
neto.
copia(): clonación de objetos.
Juan Manuel Carmona Ruiz*/
public class Empleado {
	
	//Atributos

	private Nif empleado;
	private String apellidos;
	private String nombre;
	private int sueldoBase;
	private int pagoHorasExtra;
	private int horasExtra;
	private int porcentajeIrpf;
	private boolean casado;
	private int hijos;
	private int salarioBruto;
	
	//Metodos setter
	

	public void nombre(String nombre) {
		this.nombre=nombre;
	}
	public void apellidos(String apellidos) {
		this.apellidos=apellidos;
	}
	public void sueldoBase(int sueldoBase) {
		this.sueldoBase=sueldoBase;
	}
	public void pagoHorasExtra(int pagoHorasExtra) {
		this.pagoHorasExtra=pagoHorasExtra;
	}
	public void horasExtra(int horasExtra) {
		this.horasExtra=horasExtra;
	}
	public void porcentrajeIrpef(int porcentajeIrpf) {
		this.porcentajeIrpf=porcentajeIrpf;
	}
	public void casado(String respuesta) {
		if(respuesta.equals("si")) {
			casado=true;
		}else {
			casado=false;
		}
	}
	public void hijos(int hijos) {
		this.hijos=hijos;
	}
	
	//Metodos getter
	
	public String nombre() {
		return this.nombre;
	}
	public String apellidos() {
		return this.apellidos;
	}
	public int sueldoBase() {
		return this.sueldoBase;
	}
	public int pagoHorasExtra() {
		return this.pagoHorasExtra;
	}
	public int horasExtra() {
		return this.horasExtra;
	}
	public int porcentajeIrpf() {
		return this.porcentajeIrpf;
	}
	public boolean casado() {
		return casado;
	}
	public int hijos() {
		return this.hijos;
	}
	public int calculoSalarioBruto() {
		salarioBruto=sueldoBase+(sueldoBase*porcentajeIrpf/100);
		return salarioBruto;
	}
	public void verEmpleado() {
		System.out.println(nombre+" "+apellidos);
	}
	public void verTodoEmpleado() {
		System.out.println(nombre+" "+apellidos+" "+sueldoBase+" "+pagoHorasExtra+" "+salarioBruto+" "+porcentajeIrpf);
	}
	
}
