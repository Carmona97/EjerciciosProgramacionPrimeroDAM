package ejercicio2;
/* Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de
 * multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla.
 * Autor: Juan Manuel Carmona Ruiz
 * Fecha:3/11/22*/
public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] tablas=new int[10][10];
		for(int i=0;i<tablas.length;i++) { 
			System.out.println("\nLa tabla de multiplicar "+(i+1)+" es \n");//Recorro las filas del array y le indico que le sume 1 a la fila para que el calculo se vea correcto en pantalla
			for(int j=0;j<tablas[i].length;j++) {
				tablas[i][j]=(i+1)*(j+1); 
				System.out.println((i+1)+" x "+(j+1)+" es "+tablas[i][j]);
			}
		}
	}

}
