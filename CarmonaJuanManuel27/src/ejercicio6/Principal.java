package ejercicio6;

//Realizado por Juan Manuel Carmona Ruiz 1DAM el 19-03-2023

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	static ArrayList<Ingredientes> ingredientesRestaurante=new ArrayList();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn=new Scanner(System.in);
		
		int num=1;
		
		while(num>=1) {
			
			System.out.println("Indique que desea hacer:\n1.Añadir ingrediente\n2.Solicitar ingrediente\n3.Comprobar Stock\nPulse 0 para cerrar el programa");
			
			num=scn.nextInt();
			
			if(num==0) {
				
				System.out.println("Fin del programa");
				
			}else {
				if(num==1) {
					
					anadirIngrediente();
					
				}else {
					if(num==2) {
						
						System.out.println("Indique el codigo del ingrediente que se desea usar");
						String codigo=scn.next();
						System.out.println("Indique la cantidad que se desea utilizar");
						int cantidad=scn.nextInt();
						
						solicitarIngrediente(codigo,cantidad);
						
						
					}else {
						if(num==3) {
							
							pedidoPorStockMinimo();						
							
						}						
					}
				}
			}
		}
	}

	public static void anadirIngrediente() {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Indique el codigo del ingrediente: ");
		String codigo=scn.next();
		
		scn.nextLine();
		System.out.println("Indique el nombre del ingrediente: ");
		String nombre=scn.nextLine();
		
		System.out.println("Indique la cantidad");
		int cantidad=scn.nextInt();
		
		System.out.println("Indique el stock minimo:");
		int stockMinimo=scn.nextInt();
		
		
		Ingredientes nuevo=new Ingredientes(codigo,nombre,cantidad,stockMinimo);
		
		ingredientesRestaurante.add(nuevo);
	}
	
	public static void solicitarIngrediente(String codigo,int cantidad) {
		for (Ingredientes i : ingredientesRestaurante) {
			if(i.getCodigo().equals(codigo)) {
				if(i.getCantidad()>=cantidad) {
					i.setCantidad(i.getCantidad()-cantidad);
				}else {
					System.out.println("La cantidad de ingrediente de ese tipo no es suficiente para la demanda, se va a utilizar "+i.getCantidad());
					i.setCantidad(0);
				}
			}
		}
	}
	
	public static void pedidoPorStockMinimo() {
		
		System.out.println("Se debe realizar un pedido de los siguientes ingredientes:\n");
		
		for (Ingredientes i : ingredientesRestaurante) {
			if(i.getCantidad()<=i.getStockMinimo()) {
				System.out.println(i.getNombre()+". La cantidad requerida es: "+(50-i.getCantidad())+" unidades\n");
			}
		}
	}
	
}
