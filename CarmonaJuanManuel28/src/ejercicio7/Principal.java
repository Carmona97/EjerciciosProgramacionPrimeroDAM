package ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

//Realizado por Juan Manuel Carmona Ruiz 1DAM el 27-03-2023

public class Principal {

	static ArrayList<Venta> concesionario=new ArrayList();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
		int num=1;
		
		while(num!=6) {
			
			System.out.println("Indique que desea hacer:\n1.Añadir venta \n2.Indicar lo facturado ese mes"
					+ "\n3.Muestra la suma de ventas del año\n4.Muestra el dinero total de las ventas en los meses que empiezan en A\n5.Mostrar el mes con mas ventas"
					+ "\n6.Salir del programa");
			
			num=scn.nextInt();
			
			if(num==6) {
				
				System.out.println("Fin del programa");
				
			}else {
				if(num==1) {
					
					anadirVenta();
					
				}else {
					if(num==2) {
						
						System.out.println("Indique el nombre del mes: ");
						String mes=scn.next().toUpperCase();
						System.out.println(mostrarVentas(mes));
						
					}else {
						if(num==3) {
							
							System.out.println(dineroTotal());
							
						}else {
							if(num==4) {
								
								System.out.println(mesesA());
								
							}else {
								if(num==5) {
									
									System.out.println(mejorMes());
									
								}else {
									
									System.out.println("Numero erroneo, vuelva a intentarlo");
									
								}								
							}
						}
					}
				}
			}
		}
	}

	public static void anadirVenta() {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Indique el nombre del mes en el que fue vendido");
		String nombreMes=scn.next();
		
		System.out.println("Indique la cantidad de dinero facturado ese mes");
		double ventasMes=scn.nextDouble();
		
		Venta mensual=new Venta(nombreMes,ventasMes);
		
		concesionario.add(mensual);
	}
	
	public static String mostrarVentas(String nombreMes) {

		double facturado=0;
		
		for (Venta i : concesionario) {
			if(i.getNombreMes().toUpperCase().equals(nombreMes)) {
				facturado=i.getVentasMes();
			}
		}
		
		return "Se han facturado "+facturado+" euros este mes\n";
		
	}
	
	public static String dineroTotal() {
		
		double dineroTotal=0;
		
		for (Venta i : concesionario) {
			
			dineroTotal+=i.getVentasMes();
			
		}
		
		return "Se ha facturado en total este año "+dineroTotal+" euros";
		
	}
	
	public static String mesesA() {
		
		double mesesA=0;
		
		for (Venta i : concesionario) {
			if(i.getNombreMes().toUpperCase().substring(0, 1).equals("A")) {
				mesesA+=i.getVentasMes();
			}
		}
		
		return "La suma de dinero ganado en los meses que comienzan por A es de "+mesesA;
		
	}
	
	public static String mejorMes() {
		
		String mejorMes="";
		double valorInicial=0;
		
		for (Venta i : concesionario) {
			if(i.getVentasMes()>valorInicial) {
				mejorMes=i.getNombreMes();
				valorInicial=i.getVentasMes();
			}
		}
		
		return mejorMes;
	}
	
}
