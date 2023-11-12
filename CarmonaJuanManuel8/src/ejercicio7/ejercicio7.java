package ejercicio7;
/*Juego de adivinar un número entre 0 y 1000
 *Autor Juan Manuel
 *Fecha 17/10/22*/
import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int aleatorio=(int)(Math.random()*1000);
		int num=-1;
		System.out.println("Acierta el número oculto entre 0 y 1000");
		while(num!=aleatorio) {
			num=scn.nextInt();
			if(aleatorio<num) {
				System.out.println("El número oculto es menor, introduce otro número");
			}else {
				if(aleatorio>num) {
					System.out.println("El número oculto es mayor, introduce otro número");
				}
			}
		}
		System.out.println("¡Has encontrado el número oculto!");
	}

}
