package contraseñaPOO;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contraseña nueva= new Contraseña(4,"pacos");
		System.out.println(nueva.getContrasegna());
		nueva.setContrasegna("paco");
		System.out.println(nueva.getContrasegna());
		
		Contraseña aleatoria=new Contraseña();
		System.out.println(aleatoria.getContrasegna());
		System.out.println();
	}

}
