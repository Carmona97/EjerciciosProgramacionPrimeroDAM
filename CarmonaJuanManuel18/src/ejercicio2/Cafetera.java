package ejercicio2;
/*Desarrolla una clase Cafetera con atributos:
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera)
cantidadActual (la cantidad actual de café que hay en la cafetera).
Implementa, al menos, los siguientes métodos:
Constructor predeterminado: establece la capacidad máxima en 1000 (c.c.) y la actual
en cero (cafetera vacía).
Constructor con la capacidad máxima de la cafetera; inicializa la cantidad actual de
café igual a la capacidad máxima.
Constructor con la capacidad máxima y la cantidad actual. Si la cantidad actual es
mayor que la capacidad máxima de la cafetera, la ajustará al máximo.
llenarCafetera(): hace que la cantidad actual sea igual a la capacidad.
servirTaza(int): simula la acción de servir una taza con la capacidad indicada.
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
vaciarCafetera(): pone la cantidad de café actual en cero.
agregarCafe(int): añade a la cafetera la cantidad de café indicada.
setters y getters.
Juan Manuel Carmona Ruiz*/
public class Cafetera {

	private final int CAPACIDADMAXIMA=1000;
	private int cantidadActual;
	
	public void cantidadCafetera() {
		System.out.println(cantidadActual);
	}

	public void cafeteraVacia() {
		int CAPACIDADMAXIMA;
		cantidadActual=0;
	}
	
	public void cantidadMaxima() { //setter
		cantidadActual=CAPACIDADMAXIMA;
	}
	
	public int getCantidadMaxima() {//getter
		cantidadActual=CAPACIDADMAXIMA;
		return cantidadActual;
	}
	
	public void capacidadMaxima(Cafetera cantidadActual) {//setter
		if(this.cantidadActual>CAPACIDADMAXIMA) {
			this.cantidadActual=CAPACIDADMAXIMA;
		}
	}
	
	public int getCapacidadMaxima() { //getter
		if(cantidadActual>CAPACIDADMAXIMA) {
			cantidadActual=CAPACIDADMAXIMA;	
			return CAPACIDADMAXIMA;
		}
		return CAPACIDADMAXIMA;
	}
	
	public void llenarCafetera() {//setter
		if(cantidadActual<CAPACIDADMAXIMA) {
			cantidadActual=CAPACIDADMAXIMA;
		}
	}
	
	public int getLlenarCafetera() { //getter
		if(cantidadActual<CAPACIDADMAXIMA) {
			cantidadActual=CAPACIDADMAXIMA;
		}
		return cantidadActual;
	}
	
	public void servirTaza(int servir) {//setter
		cantidadActual=cantidadActual-servir;
		if(servir>cantidadActual) {
			servir=cantidadActual;
		}
	}
	
	public int getServirTaza(int servir) {//getter
		cantidadActual=cantidadActual-servir;
		if(servir>cantidadActual) {
			return servir;
		}
		return cantidadActual;
	}
	
	public void vaciarCafetera() {//setter
		cantidadActual=0;
	}
	
	public int getVaciarCafetera() {//getter
		cantidadActual=0;
		return cantidadActual;
	}
	
	public void agregarCafe(int agregar) {//setter
		cantidadActual+=agregar;
		if(cantidadActual>CAPACIDADMAXIMA) {
			cantidadActual=CAPACIDADMAXIMA;
		}
	}
	
	public int getAgregarCafe(int agregar) {//getter
		cantidadActual+=agregar;
		if(cantidadActual>CAPACIDADMAXIMA) {
			return CAPACIDADMAXIMA;
		}
		return cantidadActual;
	}
}
