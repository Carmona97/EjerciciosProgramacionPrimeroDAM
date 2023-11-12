package ejer1;
import java.util.HashSet;
	import java.util.Set;
public class uno {

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String >conjunto1=new HashSet<String>();
		HashSet<String >conjunto2=new HashSet<String>();
		conjunto1.add("VER");
		conjunto1.add("AZL");
		conjunto1.add("BLA");
		conjunto2.add("AZL");
		conjunto2.add("NGR");
		conjunto2.add("ROJ");
		Set<String >conjunto3=Union(conjunto1,conjunto2);
		
			Set<String> interseccion = new HashSet<>(conjunto1);
			interseccion.retainAll(conjunto2);
			conjunto3.addAll(interseccion);
			Set<String> diferencia = new HashSet<String>(conjunto1);
	        diferencia.removeAll(conjunto2);
	        
			
			System.out.println("CONJUNTOS DE COLORES ");
			System.out.println("-----------------------");
			System.out.println("C1: "+ conjunto1);
			System.out.println("C2: "+ conjunto2);
			System.out.println("Unión C1 y C2: " + conjunto3);
			System.out.println("Interseccion C1 y C2: "+ interseccion);
			System.out.println("Diferencia C1-C2: " + diferencia);
		
		
	
		
		    }
	public static <T>Set<T>Union(Set<T> a,Set<T>b){
		Set<T>conjunto3=new HashSet<>();
		conjunto3.addAll(a);
		conjunto3.addAll(b);
		return conjunto3;
	}
	
 
	}


