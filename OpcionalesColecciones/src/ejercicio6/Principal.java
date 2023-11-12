package ejercicio6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<ClaseLiteraria> citas = new ArrayList<>();
		 HashSet<String >conjunto1=new HashSet<String>();
		 HashSet<String >conjunto2=new HashSet<String>();
		 HashSet<String >conjunto3=new HashSet<String>();
		 HashSet<String >conjunto4=new HashSet<String>();
		 conjunto1.add("Libro1");
		 conjunto2.add("Libro2");
		conjunto2.add("Libro1");
		conjunto3.add("Libro 3");
		conjunto3.add("Libro 4");
		ClaseLiteraria uno =new ClaseLiteraria("Soy el Mejor en morir en la escena " , conjunto1);
		ClaseLiteraria dos =new ClaseLiteraria("El mundo acaba hoy ", conjunto2);
		ClaseLiteraria tres =new ClaseLiteraria("Silba una vez y vendre siempre ", conjunto3);
		ClaseLiteraria cuatro =new ClaseLiteraria("Un invitado invita a cien  ", conjunto4);
		citas.add(uno);
		citas.add(dos);
		citas.add(tres);
		citas.add(cuatro);
		System.out.println("Ordenacion de citas literarias ");
		System.out.println("----------------------------");
		System.out.println("Contenido inicial de la lista:");
        for (ClaseLiteraria cita : citas) {
            System.out.println("{" + cita.getTitulo() + ", " + cita.conjunto1 + "}");
        }
        Collections.sort(citas, new ComparardorPorTexto());
        System.out.println("-----------------------------------------");
        System.out.println("Ordenacion de la lista por texto de la cita(alfabetico)");
        for (ClaseLiteraria cita : citas) {
            System.out.println("{" + cita.getTitulo() + ", " + cita.conjunto1 + "}");
        }
        System.out.println("---------------------------------");
        System.out.println("Ordenacion de la cita por longitud de la cita");
        Collections.sort(citas,new PorLongitud());
        for(ClaseLiteraria cita: citas) {
        	System.out.println("{" + cita.getTitulo() + ", " + cita.conjunto1 + "}");
        }
        System.out.println("----------------------");
        System.out.println("Ordenacion de la lista por numero de obras en las que aparece ");
        Collections.sort(citas,new PorObras());
        for(ClaseLiteraria cita: citas) {
        	System.out.println("{" + cita.getTitulo() + ", " + cita.conjunto1 + "}");
	}

}
}
