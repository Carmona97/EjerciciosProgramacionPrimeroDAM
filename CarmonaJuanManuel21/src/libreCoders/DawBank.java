package libreCoders;

import java.util.Scanner;

public class DawBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn=new Scanner(System.in);
		
		int numMenu=0;
		double cantidadAIngresar;
		double cantidadARetirar;
		
		CuentaBancaria antonio= new CuentaBancaria("Antonio Martinez");
		
		
		while(numMenu!=8) {
			
			System.out.println("MENU DAWBANK. Presione:\n1.Datos de la cuenta\n2.IBAN\n3.Titular\n4.Saldo\n5.Ingreso\n6.Retirada\n7.Movimientos\n8.Salir");
			System.out.println("\nIntroduce el numero de la accion que desee realizar");
			
			numMenu=scn.nextInt();
			
			if(numMenu==1) {
				System.out.println(antonio.imprime());
				
			}else {
				if(numMenu==2) {
					
					System.out.println(antonio.getIban());
				}else {
					
					if(numMenu==3) {
						
						System.out.println(antonio.getTitular());
					}else {
						
						if(numMenu==4) {
							
							System.out.println(antonio.getSaldo());
						}else {
							
							if(numMenu==5) {
								
								System.out.println("Indique la cantidad que desea ingresar: ");
								cantidadAIngresar=scn.nextDouble();
								antonio.ingresarDinero(cantidadAIngresar);
							}else {
								
								if(numMenu==6) {
									
									System.out.println("Indique la cantidad que desea retirar: ");
									cantidadARetirar=scn.nextDouble();
									antonio.retirarDinero(cantidadARetirar);
									
								}else {
									
									if(numMenu==7) {
										
										System.out.println(antonio.movimientosCajero());
										
									}else {
										
										if(numMenu==8) {
											
											System.out.println("¡Hasta luego, "+antonio.getTitular()+"!");
											
										}else {
											
											System.out.println("Numero erróneo, vuelva a intentarlo");
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		
	}

}
