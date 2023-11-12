package examen;

import java.util.Scanner;

public class examendaw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce las notas de las actividades: ");
		double activ=scn.nextDouble();
		double activ2=scn.nextDouble();
		double activ3=scn.nextDouble(); 
		
		double mediaactiv=(activ+activ2+activ3)/3*4/10;
		System.out.println(mediaactiv);
		System.out.println("Introduce las notas de las pruebas de evaluación: ");
		double prueba1= scn.nextDouble();
		double prueba2= scn.nextDouble();
		
		double medprueba=(prueba1+prueba2)/2*6/10;
		System.out.println(medprueba);
		int nota=(int) Math.ceil(medprueba+mediaactiv);
		
		System.out.println("La nota media es: "+nota);
	}

}
