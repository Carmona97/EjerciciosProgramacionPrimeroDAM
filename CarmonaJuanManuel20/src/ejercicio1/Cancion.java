package ejercicio1;

/**
 * 
 * @author Juanma 1Dam
 *
 */

public class Cancion {

	/**
	 * El título de la canción
	 */
	
	private String titulo;
	
	/**
	 * El autor de la canción
	 */
	
	private String autor;
	
	/**
	 * Constructor que recibe dos argumentos para inicializar el título y el autor de la canción
	 * 
	 * @param titulo El título de la canción
	 * @param autor El autor de la canción
	 */
	
	public Cancion(String titulo, String autor) {
		this.titulo=titulo;
		this.autor=autor;
	}
	
	/**
	 * Constructor que no recibe argumentos y establece el título y el autor de la canción en un valor vacío
	 */
	
	public Cancion() {
		autor=" ";
		titulo=" ";
	}
	
	/**
	 * Devuelve el título de la canción
	 * @return El título de la canción
	 */
	
	public String dameTitulo() {
		return titulo;
	}
	
	/**
	 * Devuelve el autor de la canción
	 * @return El autor de la canción
	 */
	
	public String dameAutor() {
		return autor;
	}
	
	/**
	 * Establece el título de la canción
	 * @param titulo El título de la canción
	 */
	
	public void ponTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	/**
	 * Establece el autor de la canción
	 * @param autor El autor de la canción
	 */
	
	public void ponAutor(String autor) {
		this.autor=autor;
	}

}
