package ejercicio18;
/*El NIF (o letra asociada a un DNI) se obtiene de la siguiente manera: Se divide el número de DNI
entre 23 y el resto es codificado por una letra según la siguiente equivalencia:
0: "T", 1: "R", 2: "W", 3: "A", 4: "G", 5: "M", 6: "Y", 7: "F", 8: "P", 9: "D",10:"X", 11: "B", 12: "N",
13: "J", 14: "Z", 15: "S", 16: "Q", 17: "V", 18: "H", 19: "L", 20: "C", 21: "K", 22: "E".
Escribe un programa que pida el DNI y muestre por pantalla la letra asociada. Para ello se
deberá crear una función a la que se le pase el número y devuelva la letra.
Juan Manuel Carmona Ruiz
25/11/2022*/
import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce el número de tu dni:");
		int num=scn.nextInt();
		dni(num);
	}

	public static void dni(int numero) {
		String letras="TRWAGMYFPDXBNJZSQVHLCKE";
		int resultado=numero%23;
		for(int i=0;i<letras.length();i++) {
			if(i==resultado) {
				System.out.println(letras.charAt(i));
			}
		}
	}
}
