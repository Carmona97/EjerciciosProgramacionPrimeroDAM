package ejercicio2;

/*Juan Manuel Carmona Ruiz 1Dam
 * Esta clase extenderá de la clase Coche.
 *  Tendrá un atributo protected de tipo string traccion (total o delantera).
 *  Tendrá un único constructor el cual como parámetros recibirá cilindrada,potencia y traccion.
 *  se creará un método toString que sobreescribirá el de la clase Coche y añadirá el valor de traccion.*/
public class Deportivo extends Coche{
	
	protected String traccion;
	
	public Deportivo(int cilindrada,int potencia,String traccion) {
		
		super(cilindrada,potencia);
		this.traccion=traccion;
		
	}

	@Override
	public String imprimir() {
		
		return super.imprimir()+" traccion: "+traccion.toString();
		
	}
}
