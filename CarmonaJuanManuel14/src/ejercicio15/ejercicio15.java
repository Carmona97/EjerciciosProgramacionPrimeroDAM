package ejercicio15;
/*Escribe un programa que cree un array de tamaño 50 con los números naturales comprendidos
entre 50 y 99. Luego muestra la suma total y la media. Implementa una función que calcule la
suma de un array y otra que calcule la media de un array.
Juan Manuel Carmona Ruiz
25/11/2022*/
public class ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vectorNum[]=new int [50];
		int acumulador=50;
		for(int i=0;i<vectorNum.length;i++) {
			vectorNum[i]=acumulador;
			acumulador++;
		}
		System.out.println("La suma es: "+suma(vectorNum)+"\nLa media es: "+media(vectorNum));
	}

	public static int suma(int numeros[]) {
		int suma=0;
		for(int i=0;i<numeros.length;i++) {
			suma+=numeros[i];
		}
		return suma;
	}
	public static int media(int numeros[]) {
		int suma=0;
		int media=0;
		for(int i=0;i<numeros.length;i++) {
			suma+=numeros[i];
			media=suma/50;
		}
		return media;
	}
}
