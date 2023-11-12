package ejercicio11;
/*Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el
 * primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores del
 * primer array al segundo array en orden inverso, y mostrar ambos por pantalla.
 * Autor Juan Manuel Carmona Ruiz
 * Fecha 1/11/22*/
public class ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] primero= new int[100];
		int[] segundo= new int[100];
		int i=0;
		for(i=0;i<primero.length;i++) {
			primero[i]=i+1;
			System.out.print(primero[i]+" ");
		}
		System.out.println("\n");
		System.arraycopy(primero, 0, segundo, 0, primero.length);
		for(i=(segundo.length-1);i>=0;i--) {
			System.out.print(segundo[i]+" ");
		}
	}

}
