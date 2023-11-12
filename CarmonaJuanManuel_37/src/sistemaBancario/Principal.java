package sistemaBancario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Contiene el menu del programa donde se implementan las funciones de la clase AccionesMenu.
 * 
 * @author Juan Manuel Carmona Ruiz
 *
 */

public class Principal {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		
		String url="jdbc:mysql://localhost/dambank?serverTimezone=UTC&useUnicode=true&characterEncoding=utf8";
		String username = "Carmona";
		String password = "1234";
		Connection con=null;

		String p_dni="";
		double dinero=0;
				
		try {
		    con = DriverManager.getConnection(url, username, password);
		    System.out.println("Conexión exitosa a la base de datos");
		    
		} catch (SQLException e) {
		    System.out.println("Error al conectar a la base de datos: " + e.getMessage());
		}
		
		int seleccionar = -1;
		do {
			try {
				System.out.println("Indique que desea hacer:"
						+ "\n0. Salir del programa"
						+ "\n1.Gestionar su usuario"
						+ "\n2.Realizar una gestion en la cuenta"
						+ "\n3.Comprobar movimientos");
				seleccionar = scn.nextInt();
				
				switch (seleccionar) {
				case 0:				
					try {
						con.close();						
						System.out.println("Saliendo del sistema");
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 1:					
					System.out.println("Introduzca su dni");
					p_dni = scn.next();
					System.out.println("Indique la accion a realizar:" 
					+ "\n1.Darse de alta" 
					+ "\n2.Darse de baja"
					+ "\n3.Modificar sus datos");
					int seleccionarOpcionUsuario = scn.nextInt();
					if (seleccionarOpcionUsuario == 1) {

						System.out.println(AccionesMenu.altaCliente(con, p_dni));

					} else {
						if (seleccionarOpcionUsuario == 2) {

							System.out.println(AccionesMenu.eliminarCliente(con, p_dni));

						} else {
							if (seleccionarOpcionUsuario == 3) {

								System.out.println(AccionesMenu.modificarCliente(con, p_dni));

							}else {
								if(seleccionarOpcionUsuario>3 ||seleccionarOpcionUsuario<1) {
									System.out.println("Número erroneo, volviendo al menu principal...");
								}
							}
						}
					} 
					
				break;
				
				case 2:
					System.out.println("Introduzca su dni");
					p_dni = scn.next();
					if(AccionesMenu.comprobarUsuario(con, p_dni)) {
						System.out.println("El numero de cuenta asociado a este dni es : "+AccionesMenu.obtenerNumeroCuenta(con, p_dni)+"\n") ;
					}					
					System.out.println("Indique la accion a realizar:"
							+ "\n1.Dar de alta una cuenta bancaria"
							+ "\n2.Dar de baja una cuenta bancaria"
							+ "\n3.Hacer un ingreso"
							+ "\n4.Hacer una retirada"
							+ "\n5.Realizar una transferencia");
					
					int seleccionarOpcionCuenta = scn.nextInt();
					
					if(seleccionarOpcionCuenta == 1) {	
						
						System.out.println(AccionesMenu.altaCuenta(con, p_dni));
											
					}else {
						if(seleccionarOpcionCuenta == 2) {

							System.out.println(AccionesMenu.bajaCuenta(con, p_dni));
							
						}else {
							if(seleccionarOpcionCuenta == 3) {
								
								System.out.println("Indique la cantidad a ingresar:");
								dinero = scn.nextDouble();
								System.out.println("Indique el concepto del ingreso:");
								String concepto = scn.nextLine();
								scn.nextLine();
								System.out.println(AccionesMenu.ingresarDinero(con, p_dni, dinero,concepto));
								
							}else {
								if(seleccionarOpcionCuenta == 4) {
									
									System.out.println("Indique la cantidad a retirar:");
									dinero = scn.nextDouble();
									System.out.println("Indique el concepto de la retirada:");
									String concepto = scn.nextLine();
									scn.nextLine();
									System.out.println(AccionesMenu.retirarDinero(con, p_dni, dinero,concepto));
									
								}else {
									if(seleccionarOpcionCuenta == 5) {
										System.out.println("Indique la cantidad a transferir:");
										dinero = scn.nextDouble();
										System.out.println("Indique el concepto de la transferencia:");
										String concepto = scn.nextLine();
										scn.nextLine();
										System.out.println(AccionesMenu.realizarTransferencia(con,p_dni,dinero,concepto));
										
										
									}else {
										if(seleccionarOpcionCuenta < 1 || seleccionarOpcionCuenta > 5) {
											System.out.println("Número erroneo, volviendo al menu principal...");
										}
									}
								}
							}
						}
					}
					break;
				case 3:
					System.out.println("Indique su numero de cuenta");
					int numero_cuenta = scn.nextInt();
					System.out.println("Indique la fecha de inicio");
					LocalDate inicio = AccionesMenu.creaFecha();
					System.out.println("Indique la fecha de fin");
					LocalDate fin = AccionesMenu.creaFecha();
					System.out.println(AccionesMenu.mostrarMovimientos(con, numero_cuenta, inicio, fin));
					break;
				default:
					System.out.println("Opción inválida");
					break;
				}
			} catch (InputMismatchException e) {
				// TODO Auto-generated catch block
				System.out.println("Ha introducido un valor no permitido, por favor vuelva a intentarlo");
				e.printStackTrace();
				scn.nextLine();
			}
			
		} while (seleccionar != 0);
			
		
	}
	
}	
	



	