package ejercicio6;

import java.util.Comparator;

public class PorObras implements Comparator<ClaseLiteraria> {

	

	@Override
	public int compare(ClaseLiteraria o1, ClaseLiteraria o2) {
		// TODO Auto-generated method stub
		return o1.conjunto1.size()-o2.conjunto1.size();
	}

}
