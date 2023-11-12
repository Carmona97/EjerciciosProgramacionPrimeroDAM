package ejercicio3;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class tres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<LocalDate, String> clave = new HashMap<LocalDate, String>();
		LocalDate fecha = null;
		fecha.of(2022, 3,1 );
		for(int i=1;i<6 ; i++) {
			String color=ColoAleatorio();
			
			while(clave.containsValue(color)) {
				color=ColoAleatorio();
			}
			clave.put(	fecha.of(2022, 3,i ), color);
			
		}
		System.out.println(clave);
	}
	public  static String  ColoAleatorio() {
		String[]Colores= {"Rojo","Azul","Verde","Amarillo","Celeste"};
		Random rand=new Random();
		int indice=rand.nextInt((Colores.length));
		return Colores[indice];
	}

}
