package ejercicio2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class dos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ale=new Random();
		String color;
		 LinkedList<String> lista1 = new LinkedList<String>();
		 LinkedList<String> lista2 = new LinkedList<String>(lista1);
		lista1.add(ColoAleatorio());
		  for (int i = 0; i < 10; i++) {
	            lista1.add(ColoAleatorio());
	            lista2.add(ColoAleatorio());
	        } 
		  System.out.println("Lista 1: " + lista1);
	        System.out.println("Lista 2: " + lista2);
		  List<String> coloresEliminados = new ArrayList<String>();
	        List<Integer> posicionesEliminadas = new ArrayList<Integer>();
	        for (int i = 0; i < lista1.size() && i < lista2.size(); i++) {
	            if (lista1.get(i).equals(lista2.get(i))) {
	                coloresEliminados.add(lista1.get(i));
	                posicionesEliminadas.add(i);
	                lista1.set(i, "---");
	                lista2.set(i, "---");
	            }
	        }
		 
	        System.out.println("Lista actualizada" + lista1);
	        System.out.println("Lista 2 actualizada"+ lista2);
	        System.out.println(coloresEliminados);
	        System.out.println(posicionesEliminadas);
		
	}
	
	public  static String  ColoAleatorio() {
		String[]Colores= {"Rojo","Azul","Verde","Amarillo","Celeste"};
		Random rand=new Random();
		int indice=rand.nextInt((Colores.length));
		return Colores[indice];
	}
}
