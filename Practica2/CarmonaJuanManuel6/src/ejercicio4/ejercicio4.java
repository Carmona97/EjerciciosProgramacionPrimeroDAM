package ejercicio4;

import java.util.Scanner;
/*Un supermercado quiere premiar a los clientes que mayor desembolso hacen en sus tiendas. 
Para ello lleva un control de las compras que realiza cada cliente, si estas superan en suma la 
cantidad de 300 euros en un mes se les entrega un vale descuento de 50 euros.
Solicita al usuario los siguientes valores:
 Nombre
 Apellidos
 ImporteGastado1
 ImporteGastado2
 ImporteGastado3
 ImporteGastado4
Realizar las siguientes acciones:
Sumar los importes gastados por el usuario
Calcular la media del importe gastado (ImporteGastado1+ImpGast.2.../4)
Comprobar si el importe en suma es mayor o igual que 300 euros, si es indicar al 
usuario que tiene un vale descuento de 5o euros, en caso contrario indicad que no es 
así.
Mostrar toda la información en una ficha.
Nombre: Juan
Apellidos: López Pérez
Importe Gastado1: 50 euros
Importe Gastado2: 40 euros
Importe Gastado3: 50 euros
Importe Gastado4: 40 euros
Importe Medio: 45 euros
Lo sentimos pero sus compras no han alcanzado los 300 euros este mes, no dispone de 
descuento.

Autor: Juan Manuel Carmona Ruiz
Fecha 07/10/2022*/
public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		
		System.out.println("Introduce los siguientes datos:");
		System.out.println("Nombre: ");
		String nombre = scn.nextLine();
		System.out.println("Apellidos: ");
		String apellidos = scn.nextLine();
		System.out.println("¿Cuanto ha gastado en sus últimas 4 compras?");
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		int num3 = scn.nextInt();
		int num4 = scn.nextInt();
		
		int suma = num1+num2+num3+num4;
		int media = suma/4;
		
		System.out.println("Nombre: "+nombre+"\nApellidos: "+apellidos+"\nImporte gastado 1: "+num1+"\nImporte gastado 2: "+num2+"\nImporte gastado 3: "+num3+"\nImporte gastado 4: "+num4+"\nImporte medio: "+media);
		
		if (suma>=300) {
			System.out.println("Tiene usted un descuento de 50€");
		} 
		else {
			System.out.println("No dispone de descuento");
		}
		
		
		

	}

}
