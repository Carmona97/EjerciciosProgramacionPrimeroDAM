package ejercicio3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha cumpleaños= new Fecha();
		Fecha aniversario=new Fecha(1,1,1900);
		System.out.println(cumpleaños.igualQue(aniversario));
	}
}
