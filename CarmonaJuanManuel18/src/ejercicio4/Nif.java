package ejercicio4;

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
	
	public char letraDNI() {//getter		
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
		this.dni=dni+letra;
	}
	public long getDNI(Nif DNI) {
		return dni;
	}
	
	public void imprimeNif() {
		System.out.println(dni+"-"+letra);
	}
}

