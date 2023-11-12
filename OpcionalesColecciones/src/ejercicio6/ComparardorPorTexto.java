package ejercicio6;

import java.util.Comparator;

public class ComparardorPorTexto implements Comparator<ClaseLiteraria> {

	@Override
	public int compare(ClaseLiteraria o1, ClaseLiteraria o2) {
		// TODO Auto-generated method stub
		return o1.getTitulo().compareTo(o2.getTitulo());
	}

}
