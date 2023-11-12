package ejercicioB1;

/*Realizado por Juan Manuel Carmona Ruiz
 * 24/04/2023
 * Implementa un programa que muestre por pantalla los valores máximos y mínimos del archivo
‘numeros.txt’.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		Scanner lectorArchivo;
		try {
			File numeros=new File("src/Documentos/numeros.txt");
			lectorArchivo = new Scanner(numeros);
				
			int numero=lectorArchivo.nextInt();
			int maximo=numero;
			int minimo=numero;
			
				do {
					numero=lectorArchivo.nextInt();
					if (numero >= maximo) {
						maximo = numero;
					}
					
					if (numero <= minimo) {
						minimo = numero;
					} 
					
				} while (lectorArchivo.hasNext()==true);
				
			System.out.println("El maximo es: "+maximo+" El minimo es: "+minimo);
			lectorArchivo.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
