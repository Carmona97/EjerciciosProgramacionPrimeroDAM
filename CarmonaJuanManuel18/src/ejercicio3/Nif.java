package ejercicio3;
/*Crea una clase NIF que se usará para mantener DNIs con su correspondiente letra. Los atributos
serán:
el número de DNI (entero largo).
la letra que le corresponde.
La clase dispondrá de los siguientes métodos:
Constructor predeterminado que inicialice el nº de DNI a 0 y la letra a espacio en
blanco (será un NIF no válido).
Constructor que reciba el DNI y establezca la letra que le corresponde.
Set y get para el número de DNI (que ajuste automáticamente la letra).
leer(): que pida el número de DNI (ajustando automáticamente la letra).
Método que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en
mayúscula; por ejemplo: 00395469-F)
La letra se calculará con un método auxiliar (privado) de la siguiente forma: se obtiene el
resto de la división entera del número de DNI entre 23 y se usa la siguiente tabla para
obtener la letra que corresponde:
Juan Manuel Carmona Ruiz*/
public class Nif {
	private long dni;
	private char letra;
	
	public void noValido() {
		dni=0;
		letra=' ';
	}
	public void letraDNI(long dni) {//setter
		String letras="TRWAGMYFPDXBNJZSQVHLCKE";
		long resultado=dni%23;
		for(int i=0;i<letras.length();i++) {
			if(i==resultado) {
				letra=letras.charAt(i);
			}
		}		
	}
	
	public char letraDNI(Nif letraDni) {//getter		
		return letra;
	}
	
	public void DNI(long dni) {
		String letras="TRWAGMYFPDXBNJZSQVHLCKE";
		long resultado=dni%23;
		for(int i=0;i<letras.length();i++) {
			if(i==resultado) {
				letra=letras.charAt(i);				
			}
		}
		this.dni=dni;
	}
	public long getDNI(Nif DNI) {
		return dni;
	}
	
	public void imprimeNif() {
		System.out.println(dni+"-"+letra);
	}
}
