package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
			System.out.println("Introduzca los siguientes datos");
			
			System.out.println("Nombre: ");
		String nombre = scn.nextLine();
			System.out.println("Apellidos: ");
		String apellidos = scn.nextLine();
			System.out.println("Fecha de nacimiento: ");
		int nacimiento = scn.nextInt();
			System.out.println("Salario bruto: ");
		double salario = scn.nextDouble();
			System.out.println("Años trabajados en la empresa: ");
		int añosTrabajo = scn.nextInt();
		
		double salarioNeto = salario - salario*15/100;
		double aumento = salario/100;
		double salarioTotal = salario+aumento*añosTrabajo;
		
		System.out.println("Estimado "+nombre+" "+apellidos+" su salario bruto es de: "+salario+"€, teniendo en cuenta un IRPF del 15% su salario neto es de "+salarioNeto+"€\n\nDebido a sus "+añosTrabajo+" años trabajando en la empresa, su salario se incrementará en un 1% por cada año. El aumento es de un "+aumento+" % y el salario total es de: "+salarioTotal+" € brutos.");
				
			
		
		

	}

}
