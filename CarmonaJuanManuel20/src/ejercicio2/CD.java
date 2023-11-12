package ejercicio2;

/**
 * 
 * @author Juanma 1Dam
 *
 */

public class CD {
	
	/**
	 * Un array de objetos Cancion que almacena las canciones del CD
	 */
	
	private Cancion[] canciones;
	
	/**
	 * Contador que lleva un registro del número de canciones en el CD
	 */
	
	private int contador;
	
	/**
	 * La cantidad máxima de canciones que el CD puede almacenar
	 */
	
	private int memoria;
	
	/**
	 * Inicializa el contador de canciones a 0
	 */
	
	{
		contador=0;
	}
	
	/**
	 * Constructor que no recibe argumentos y establece la cantidad máxima de canciones que el CD puede almacenar
	 */
	
	public CD() {
		canciones=new Cancion[memoria];
	}
	
	/**
	 * Devuelve el número de canciones en el CD
	 * @return El número de canciones en el CD
	 */
	
	public int numeroCanciones() {
		return contador;
	}
	
	/**
	 * Devuelve el título de la canción en la posición especificada
	 * @param posicion La posición de la canción en el CD
	 * @return El título de la canción
	 */
	
	public String dameCancion(int posicion) {
		return canciones[posicion-1].dameTitulo();
	}
	
	/**
	 * Graba una canción en la posición especificada del CD
	 * @param posicion La posición en la que se grabará la canción
	 * @param canciones La canción que se grabará en el CD
	 */
	
	public void grabaCancion(int posicion, Cancion canciones) {	
		this.canciones[posicion-1]=canciones;
		contador++;
	}
	
	/**
	 * Agrega una canción al final del CD
	 * @param canciones La canción que se agregará al CD en último lugar
	 */
	
	public void agrega(Cancion canciones) {
		this.canciones[contador]=canciones;
		contador++;
	}
	
	/**
	 * Elimina una canción del CD en la posición especificada
	 * @param posicion La posición de la canción que se eliminará
	 */
	
	public void elimina(int posicion) {
		canciones[posicion-1]=null;
		contador--;
	}
	
}
