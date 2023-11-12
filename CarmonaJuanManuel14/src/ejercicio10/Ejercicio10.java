package ejercicio10;

import java.util.Scanner;

/*Realiza un programa que lea una fecha introduciendo el día, mes y año por separado y nos diga
 * si la fecha es correcta o no. Se debe crear una función donde le pasemos los datos y devuelva si
 * es correcta o no
 * Juan Manuel Carmona Ruiz
 * 17/11/22*/
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce un día");
		int dia=scn.nextInt();
		System.out.println("Introduce un mes");
		int mes=scn.nextInt();
		System.out.println("Introduce un año");
		int anno=scn.nextInt();
		if(fecha(dia,mes,anno)==true) {
			System.out.println("La fecha es correcta");
		}else {			
				System.out.println("La fecha es incorrecta");			
		}
	}

	public static boolean fecha(int dia,int mes,int anno) {
		boolean fecha=false;
		if(anno%4==0 || anno%400==0 && anno%100 !=0) {
			switch(mes) {
			case 2:{		
				if(dia<=29) {
					fecha=true;					
				}
				break;
			}
			case 1,3,5,7,8,10,12:{
				if(dia<=31) {
					fecha=true;	
				}	
				break;
			}
			case 4,6,9,11:{
				if(dia<=30) {
					fecha=true;	
				}
				break;
			}
		}
		}
		switch(mes) {
			case 2:{		
				if(dia<=28) {
					fecha=true;					
				}
				break;
			}
			case 1,3,5,7,8,10,12:{
				if(dia<=31) {
					fecha=true;	
				}	
				break;
			}
			case 4,6,9,11:{
				if(dia<=30) {
					fecha=true;	
				}
				break;
			}
		}
		
		return fecha;
	}		
	
}
