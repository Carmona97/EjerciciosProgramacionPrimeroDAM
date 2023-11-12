package ejercicio8;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DawBank {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Scanner scn=new Scanner(System.in);
		
		ArrayList<Double> movimientos=new ArrayList();
		
		int numMenu=0;
		double cantidadAIngresar;
		double cantidadARetirar;
		boolean ValorErroneoMenu;
		
		CuentaBancaria paco= new CuentaBancaria("Paco Martinez");
		CuentaBancaria antonio= new CuentaBancaria("Antio Martinez");
		
		try {
			antonio.ingresarDinero(50.57,movimientos);
			antonio.retirarDinero(32.37,movimientos);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		do {
			ValorErroneoMenu=false;
			try {
				while (numMenu != 8) {
					ValorErroneoMenu=true;

					System.out.println(
							"MENU DAWBANK. Presione:\n1.Datos de la cuenta\n2.IBAN\n3.Titular\n4.Saldo\n5.Ingreso\n6.Retirada\n7.Movimientos\n8.Salir");
					System.out.println("\nIntroduce el numero de la accion que desee realizar");

					numMenu = scn.nextInt();

					if (numMenu == 1) {
						System.out.println(antonio.toString());

					} else {
						if (numMenu == 2) {

							System.out.println(antonio.getIban());
						} else {

							if (numMenu == 3) {

								System.out.println(antonio.getTitular());
							} else {

								if (numMenu == 4) {

									System.out.println(antonio.getSaldo());
								} else {

									if (numMenu == 5) {

										try {
											System.out.println("Indique la cantidad que desea ingresar: ");
											cantidadAIngresar = scn.nextDouble();
											antonio.ingresarDinero(cantidadAIngresar, movimientos);
										} catch (AvisarHaciendaException e) {
											// TODO Auto-generated catch block	
											System.out.println(
													e.mensajeError(antonio.getTitular(), antonio.getIban(), true));
											e.printStackTrace();
										}
									} else {

										if (numMenu == 6) {

											try {
												System.out.println("Indique la cantidad que desea retirar: ");
												cantidadARetirar = scn.nextDouble();
												antonio.retirarDinero(cantidadARetirar, movimientos);
											} catch (AvisarHaciendaException e) {
												// TODO Auto-generated catch block
												System.out.println(e.mensajeError(antonio.getTitular(), antonio.getIban(), false));
												e.printStackTrace();
											} catch (CuentaException e) {
												System.out.println(e.saldoNegativo());
												e.printStackTrace();
											}

										} else {

											if (numMenu == 7) {

												System.out.println(antonio.registroMovimientos(movimientos));

											} else {

												if (numMenu == 8) {

													System.out.println("¡Hasta luego, " + antonio.getTitular() + "!");

												} else {

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
			} catch (InputMismatchException e) {
				// TODO Auto-generated catch block
				System.out.println("El valor introducido es incorrecto, por favor vuelva a intentarlo");
				e.printStackTrace();
				scn.nextLine();
			} 
		} while (ValorErroneoMenu);		
	}
}
