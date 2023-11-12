package ejercicio18;
/*Crea un programa que cree un array de tamaño 30 y lo rellene con valores aleatorios entre 0
 * y 9 (utiliza Math.random()*10). Luego ordena los valores del array y los mostrará por
 * pantalla.
 * Autor Juan Manuel Carmona Ruiz
 * Fecha 1/11/22*/
import java.util.Arrays;

public class ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] valores=new int[30];
		for(int i=0;i<valores.length;i++) {
			valores[i]=(int)(Math.random()*10);
		}
		Arrays.sort(valores);
		for(int i=0;i<valores.length;i++) {
			System.out.print(valores[i]+" ");
		}
	}

}
