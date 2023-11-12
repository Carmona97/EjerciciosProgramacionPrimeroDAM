package ejercicio3;

/*Juan Manuel Carmona Ruiz 1Dam*/

public class Personal {

	protected String dni;
	protected String nombre;
	protected String apellidos;
	protected int edad;
	protected char genero;
	protected double salario;
	protected String telefono;
	protected String email;
	public Personal(String dni, String nombre, String apellidos, int edad, char genero, double salario, String telefono, String email) {
		
		this.dni=dni;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
		this.genero=genero;
		this.salario=salario;
		this.telefono=telefono;
		this.email=email;
		
	}
	
	public Personal() {
		
		dni=null;
		nombre=null;
		apellidos=null;
		edad=18;
		genero='M';
		salario=0;
		telefono=null;
		email=null;
	}
	
	//Aumenta el salario del personal segun lo introducido por parametro
	
	public void aumentoSalario(double cantidadAumento) {
		
		salario=salario+cantidadAumento;
		
	}
	
	//Indica el tiempo que le queda al personal para jubilarse teniendo en cuenta que la edad de jubilacion es a los 67 años
	
	public int agnosJubilacion() {
		
		return 67-edad;
	}
	
	public String toString() {
		
		return dni+"\n"+nombre+"\n"+apellidos+"\n"+Integer.toString(edad)+"\n"+genero+"\n"+Double.toString(salario)+"\n"+telefono+"\n"+email;
		
	}
}
