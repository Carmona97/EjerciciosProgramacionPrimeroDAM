package ejercicio1;
/*Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25
 * y luego muestre la matriz por pantalla.
 * Autor: Juan Manuel Carmona Ruiz
 * Fecha:3/11/22
*/
public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matriz=new int[5][5];
		int suma=1;
		for(int i=0;i<matriz.length;i++) {			
			for(int j=0;j<matriz[i].length;j++) {
				matriz[i][j]=suma;
				System.out.print(matriz[i][j]+" ");
				suma++;
			}
		}
	}

}
