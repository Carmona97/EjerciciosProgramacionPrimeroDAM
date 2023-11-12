package ejercicio8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import ejercicio7.Venta;

//Realizado por Juan Manuel Carmona Ruiz 1DAM el 27-03-2023

public class Principal {
	
	static ArrayList<DiaTemperatura> marzo=new ArrayList();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
		
		int num=1;
		
		while(num!=0) {
			
			System.out.println("Indique que desea hacer:\n1.Rellenar temperaturas\n2.Mostrar temperaturas del mes\n3.Ver media de las temperaturas del mes\n4.Ver el dia o dias mas calurosos del mes");
			
			num=scn.nextInt();
			
			if(num==6) {
				
				System.out.println("Fin del programa");
				
			}else {
				if(num==1) {
					
					rellenaTemperaturas();
					
				}else {
					if(num==2) {
						
						
						mostrarTemperaturas();
						
					}else {
						if(num==3) {
							
							System.out.println(mediaTemperatura());	
							
						}else {
							if(num==4) {
								
								System.out.println(diaCaluroso()+"\n");
								
							}else {
									
								System.out.println("Numero erroneo, vuelva a intentarlo");
									
							}								
						}
					}
				}
			}
		}		
	}

	public static void rellenaTemperaturas() {
		
		double temperaturaMedia=0;
		
		
		for(int i=1;i<=31;i++) {
			
			int diaDelMes=i;
			LocalDate fechaMarzo=LocalDate.of(2023,3,i);
			DayOfWeek diaDeLaSemana=fechaMarzo.getDayOfWeek();
			String diaDelaSemanaString=diaDeLaSemana.toString();
			temperaturaMedia=(Math.random()*40);
			
			 DiaTemperatura dia = new DiaTemperatura(diaDelMes, diaDelaSemanaString, temperaturaMedia);
		     marzo.add(dia);
		}
	}
	
	public static void mostrarTemperaturas() {
		
		for (DiaTemperatura i : marzo) {
			System.out.println(i.toString());
		}
	}
	
	public static double mediaTemperatura() {
		
		double sumaTemperaturas=0;
		
		for (DiaTemperatura i : marzo) {
			
			sumaTemperaturas += i.getTemperaturaMedia();
			
		}
		
		double temperaturaMedia=sumaTemperaturas/31;
		
		return temperaturaMedia;
		
	}

	public static String diaCaluroso() {
		
		String diaMasCaluroso="";
		double valorInicial=0;
		
		for (DiaTemperatura i : marzo) {
			if(i.getTemperaturaMedia()>valorInicial) {
				diaMasCaluroso=i.toString();
				valorInicial=i.getTemperaturaMedia();
			}
		}
		
		return diaMasCaluroso;
	}
}
