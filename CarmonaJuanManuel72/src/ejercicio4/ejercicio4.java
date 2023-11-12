package ejercicio4;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scn = new Scanner(System.in);
	System.out.println("Indique su nota en 4 asignaturas:");
	double num1=scn.nextDouble();
	double num2=scn.nextDouble();
	double num3=scn.nextDouble();
	double num4=scn.nextDouble();
	
	double media = (num1+num2+num3+num4)/4;
	System.out.println("Su nota media es: "+media);
	
	double redondeo = Math.ceil(media);
	System.out.println("Su media redondeada es: "+redondeo);
	
	double truncamiento = Math.floor(media);
	System.out.println("Su media truncada es: "+truncamiento);
	
	if(media<8) {
		System.out.println("No puede acceder a los estudios que deseaba");
		}else {
			System.out.println("Puede acceder a estudios superiores");
		}
	}

}
