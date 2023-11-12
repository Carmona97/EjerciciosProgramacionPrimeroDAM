package sistemaBancario;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Es el conjunto de funciones que tiene el menu
 * 
 * @author Juan Manuel Carmona Ruiz
 *
 */

public class AccionesMenu {
	

	/*BLOQUE DE FUNCIONES DESTINADAS AL USUARIO*/
	
	/**
	 * Comprueba si el usuario existe en la base de datos
	 * 
	 * @param con Conexion a la base de datos
	 * @param p_dni El DNI del usuario a comprobar
	 * @return true si el usuario existe, false si no.
	 */
	
	public static boolean comprobarUsuario(Connection con,String p_dni) {
		boolean usuarioExiste = false;
		String query = "SELECT dni FROM clientes where dni=?";
		if (con != null) {
            try ( PreparedStatement consulta = con.prepareStatement(query)) {
                consulta.setString(1, p_dni);
                if(consulta.execute()) {
                	ResultSet resultados = consulta.getResultSet();
                	 while (resultados.next()) {
                         String dniUsuario = resultados.getString("dni");
                         if(dniUsuario!=null) {
                         	usuarioExiste=true;
                         }
                     }
                }              

            } catch (SQLException ex) {
                System.err.printf("Se ha producido un error al ejecutar la consulta SQL.");
            }
        }		
		return usuarioExiste;
		
	}
	
	/**
	 * Realiza el alta de un cliente en la base de datos.
     *
	 * 
	 * @param con Conexion a la base de datos
	 * @param p_dni El DNI del usuario a comprobar.
	 * @return El resultado del alta (mensaje de exito o error).
	 */
	
	public static String altaCliente (Connection con,String p_dni) {
		
		Scanner scn = new Scanner(System.in);
		boolean usuarioExiste = comprobarUsuario(con,p_dni);
		String resultadoAlta = "";
		
		if(usuarioExiste) {
			
			resultadoAlta = "El usuario no se ha podido dar de alta porque ya existe";
			
		}else {
			
			String query = "INSERT INTO clientes (dni, nombre, telefono, direccion) VALUES (?,?,?,?)";
			
			System.out.println("Indique su nombre:");
			String nombre = scn.nextLine();
			System.out.println("Indique su telefono:");
			String telefono = scn.next();
			scn.nextLine();
			System.out.println("Indique su direccion:");
			String direccion = scn.nextLine();
			
		    if (con != null) {

				try ( PreparedStatement consulta = con.prepareStatement(query)) {
				
				consulta.setString(1, p_dni);
				consulta.setString(2, nombre);
				consulta.setString(3, telefono);
				consulta.setString(4, direccion);				
				
				int registrosAfectados = consulta.executeUpdate();
				if (registrosAfectados !=0) {
					
					resultadoAlta = "Cliente insertado correctamente.";
					altaCuenta(con, p_dni);
					
					} else {
						
						resultadoAlta = "El cliente no ha podido ser insertado.";
						
					}
				
				} catch (SQLException ex) {
					System.err.printf("Se ha producido un error al ejecutar la consulta SQL.");
				}
		    }
		}	
		return resultadoAlta;
		
	}
	
	 /**
     * Obtiene el numero de cuenta asociado a un cliente.
     *
     * @param con La conexion a la base de datos.
     * @param p_dni El DNI del cliente.
     * @return El numero de cuenta del cliente.
     * @throws Exception Si la cuenta del cliente no existe.
     */
	
	public static int obtenerNumeroCuenta(Connection con,String p_dni) throws Exception{
        int numeroCuenta = 0;
        boolean cuentaExiste =comprobarCuentaExiste(con, p_dni);
        if(cuentaExiste) {
        	try {           
                PreparedStatement statement = con.prepareStatement("SELECT numero_cuenta FROM CUENTAS WHERE dni_cliente = ?");
                statement.setString(1, p_dni);
                ResultSet result = statement.executeQuery();

                if (result.next()) {
                    numeroCuenta = result.getInt("numero_cuenta");
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        	return numeroCuenta;
        }else {
        	throw new Exception("La cuenta no existe");
        }
        
        
    }
	
	/**
	 * Comprueba si un usuario tiene una cuenta activa.
	 *
	 * @param con La conexion a la base de datos.
	 * @param p_dni El DNI del usuario.
	 * @return True si el usuario tiene una cuenta activa, false de lo contrario.
	 */
	
	public static boolean usuarioTieneCuentaActiva(Connection con,String p_dni) {
		boolean usuarioExiste = comprobarUsuario(con,p_dni);
		boolean cuentaActiva = false;
		if(usuarioExiste) {
			String query = "SELECT situacion FROM cuentas where dni_cliente=?";
			if (con != null) {
	            try ( PreparedStatement consulta = con.prepareStatement(query)) {
	                consulta.setString(1, p_dni);
	                if(consulta.execute()) {
	                	ResultSet resultados = consulta.getResultSet();
	                	 while (resultados.next()) {
	                         String situacionCuenta = resultados.getString("situacion");
	                         if(situacionCuenta.equals("activa")) {
	                         	cuentaActiva=true;
	                         }
	                     }
	                }              

	            } catch (SQLException ex) {
	                System.err.printf("Se ha producido un error al ejecutar la consulta SQL.");
	            }
	        }					
		}
		
		return cuentaActiva;
	}
	
	/**
	 * Elimina un cliente de la base de datos.
	 *
	 * @param con La conexion a la base de datos.
	 * @param p_dni El DNI del cliente a eliminar.
	 * @return Un mensaje que indica si el cliente ha sido eliminado correctamente o si ha ocurrido algun error.
	 */
	
	public static String eliminarCliente(Connection con,String p_dni) {
		
		boolean usuarioExiste = comprobarUsuario(con,p_dni);
		String resultadoBorradoCliente = "";
		
		if(usuarioExiste == false) {
			
			resultadoBorradoCliente = "El usuario no se ha podido eliminar porque no existe";
			
		}else {
			
			boolean cuentaActiva = usuarioTieneCuentaActiva(con,p_dni);
			
			if(cuentaActiva == false) {
				
				String queryEliminarMovimientos = "DELETE FROM MOVIMIENTOS WHERE numero_cuenta IN (SELECT numero_cuenta FROM CUENTAS WHERE dni_cliente = ?);";
				String queryEliminarCuentas = "DELETE FROM cuentas WHERE dni_cliente=?";
				String queryEliminarClientes = "DELETE FROM clientes where dni=?";
				
				
			    if (con != null) {

					try ( 	PreparedStatement consultaEliminarMovimientos = con.prepareStatement(queryEliminarMovimientos);
							PreparedStatement consultaEliminarCuentas = con.prepareStatement(queryEliminarCuentas);
							PreparedStatement consultaEliminarCliente = con.prepareStatement(queryEliminarClientes)) {
						
						consultaEliminarMovimientos.setString(1, p_dni);
						consultaEliminarMovimientos.executeUpdate();
					
						consultaEliminarCuentas.setString(1, p_dni);
		                consultaEliminarCuentas.executeUpdate();

		                consultaEliminarCliente.setString(1, p_dni);
		                int registrosAfectados = consultaEliminarCliente.executeUpdate();
					
					if (registrosAfectados !=0) {
						
						resultadoBorradoCliente = "Cliente eliminado correctamente.";
						
						} else {
							
							resultadoBorradoCliente = "El cliente no ha podido ser eliminado.";
							
						}
					
					} catch (SQLException e) {
						System.err.printf("Se ha producido un error al ejecutar la consulta SQL.");
						e.printStackTrace();
					}
			    }
			}else {
				resultadoBorradoCliente = "El cliente no ha podido ser borrado porque tiene una cuenta activa. Si desea dar de baja la cuenta, seleccione 'Realizar una gestion en la cuenta'";
				
			}
		}	
		return resultadoBorradoCliente;
	}
	
	/**
	 * Modifica los datos de un cliente en la base de datos.
	 *
	 * @param con La conexion a la base de datos.
	 * @param p_dni El DNI del cliente a modificar.
	 * @return Un mensaje que indica si el cliente ha sido modificado correctamente o si ha ocurrido algun error.
	 */
	
	public static String modificarCliente (Connection con,String p_dni) {
		
		Scanner scn = new Scanner(System.in);
		boolean usuarioExiste = comprobarUsuario(con,p_dni);
		String resultadoModificacion = "";
		
		if(usuarioExiste == false) {
			
			resultadoModificacion = "El usuario no se ha podido modificar porque no existe";
			
		}else {
			
			String query = "UPDATE clientes set nombre=?,telefono=?,direccion=? where dni=?";
			System.out.println("Indique su nombre:");
			String nombre = scn.nextLine();
			System.out.println("Indique su telefono:");
			String telefono = scn.next();
			scn.nextLine();
			System.out.println("Indique su direccion:");
			String direccion = scn.nextLine();
			
		    if (con != null) {

				try ( PreparedStatement consulta = con.prepareStatement(query)) {
				
				consulta.setString(1, nombre);
				consulta.setString(2, telefono);
				consulta.setString(3, direccion);
				consulta.setString(4, p_dni);

				int registrosAfectados = consulta.executeUpdate();
				if (registrosAfectados !=0) {
					
					resultadoModificacion = "Cliente modificado correctamente.";
					
					} else {
						
						resultadoModificacion = "El cliente no ha podido ser insertado.";
						
					}
				
				} catch (SQLException ex) {
					System.err.printf("Se ha producido un error al ejecutar la consulta SQL.");
				}
		    }
		}	
		return resultadoModificacion;
	}


	/*BLOQUE DE FUNCIONES DESTINADAS A LA GESTION DE CUENTAS*/

	/**
	 * Verifica si existe una cuenta asociada al DNI de un cliente en la base de datos.
	 *
	 * @param con La conexion a la base de datos.
	 * @param p_dni El DNI del cliente.
	 * @return true si la cuenta existe, false si no.
	 */
	
	public static boolean comprobarCuentaExiste(Connection con,String p_dni) {
		boolean cuentaExiste = false;
		String query = "SELECT dni_cliente FROM cuentas where dni_cliente=?";
		if (con != null) {
	        try ( PreparedStatement consulta = con.prepareStatement(query)) {
	            consulta.setString(1, p_dni);
	            if(consulta.execute()) {
	            	ResultSet resultados = consulta.getResultSet();
	            	 while (resultados.next()) {
	                     String dniCuenta = resultados.getString("dni_cliente");
	                     if(dniCuenta!=null) {
	                     	cuentaExiste=true;
	                     }
	                 }
	            }              
	
	        } catch (SQLException e) {
	            System.err.printf("Se ha producido un error al ejecutar la consulta SQL.");
	            e.printStackTrace();
	        }
	    }		
		return cuentaExiste;
		
	}
	
	/**
	 * Crea una nueva cuenta para un cliente en la base de datos.
	 *
	 * @param con La conexion a la base de datos.
	 * @param p_dni El DNI del cliente.
	 * @return Un mensaje que indica si la cuenta ha sido creada correctamente o si ha ocurrido algun error.
	 */
	
	public static String altaCuenta(Connection con,String p_dni) {
		
		boolean usuarioExiste = comprobarUsuario(con, p_dni);
		boolean cuentaExiste = comprobarCuentaExiste(con, p_dni);
		String resultadoAlta = "";
		
		if(usuarioExiste && cuentaExiste == false) {
			
			String query = "INSERT INTO cuentas (dni_cliente,situacion,saldo) VALUES (?,?,?)";
	
			String situacion = "activa";
			int saldo = 0;
			
			
		    if (con != null) {

				try ( PreparedStatement consulta = con.prepareStatement(query)) {
				
				consulta.setString(1, p_dni);
				consulta.setString(2, situacion);
				consulta.setInt(3, saldo);
				

				int registrosAfectados = consulta.executeUpdate();
				if (registrosAfectados !=0) {
					
					resultadoAlta = "Cuenta creada correctamente.";
					
					} else {
						
						resultadoAlta = "La cuenta no se ha podido crear.";
						
					}
				
				} catch (SQLException ex) {
					System.err.printf("Se ha producido un error al ejecutar la consulta SQL.");
				}
		    }
		}else {
			if(usuarioExiste && cuentaExiste) {
				
				boolean cuentaActiva = usuarioTieneCuentaActiva(con,p_dni);
				if(cuentaActiva) {
					
					resultadoAlta = "El usuario ya posee una cuenta activa";
					
				}else {
					
					String situacion = "activa";
					
					String query = "UPDATE cuentas SET situacion = ? where dni_cliente = ?";
					if (con != null) {
				        try ( PreparedStatement consulta = con.prepareStatement(query)) {
				        	
				            consulta.setString(1, situacion);
				            consulta.setString(2, p_dni);
				            
				            int registrosAfectados = consulta.executeUpdate();
							if (registrosAfectados !=0) {
								
								resultadoAlta = "La cuenta se ha dado de alta correctamente";
								
								} else {
									
									resultadoAlta = "La cuenta no se ha podido dar de alta.";
									
								}
							
							} catch (SQLException e) {
								e.printStackTrace();
								System.err.printf("Se ha producido un error al ejecutar la consulta SQL.");
							}
				    }
					
				}
				
			}else {
				if(usuarioExiste == false) {
					
					resultadoAlta = "Para poder dar de alta una cuenta, cree primero un usuario";
					
				}
			}
		}
		
		return resultadoAlta;
	}
	
	/**
	 * Da de baja una cuenta de un cliente en la base de datos.
	 *
	 * @param con La conexion a la base de datos.
	 * @param p_dni El DNI del cliente.
	 * @return Un mensaje que indica si la cuenta ha sido dada de baja correctamente o si ha ocurrido algun error.
	 */
	
	public static String bajaCuenta(Connection con,String p_dni) {
		
		boolean usuarioExiste = comprobarUsuario(con, p_dni);
		boolean cuentaExiste = comprobarCuentaExiste(con, p_dni);
		String resultadoBaja = "";
		
		if(usuarioExiste && cuentaExiste) {
			
			boolean cuentaActiva = usuarioTieneCuentaActiva(con, p_dni);
			
			if(cuentaActiva) {
				
				String situacion = "baja";
				
				String query = "UPDATE cuentas SET situacion = ? where dni_cliente = ?";
				if (con != null) {
			        try ( PreparedStatement consulta = con.prepareStatement(query)) {
			        	
			            consulta.setString(1, situacion);
			            consulta.setString(2, p_dni);
			            
			            int registrosAfectados = consulta.executeUpdate();
						if (registrosAfectados !=0) {
							
							resultadoBaja = "La cuenta se ha dado de baja correctamente";
							
							} else {
								
								resultadoBaja = "La cuenta no se ha podido dar de baja.";
								
							}
						
						} catch (SQLException e) {
							e.printStackTrace();
							System.err.printf("Se ha producido un error al ejecutar la consulta SQL.");
						}
			    }
							
			}else {
				resultadoBaja = "La cuenta ya se encuentra dada de baja";
			}
						
		}else {
			if(usuarioExiste && cuentaExiste == false) {
				
				resultadoBaja = "No se ha podido dar de baja la cuenta, porque no existen cuentas para este usuario";
				
			}else {
				if(usuarioExiste == false) {
					
					resultadoBaja = "Para poder dar de alta una cuenta, cree primero un usuario";
					
				}
			}
		}
		
		return resultadoBaja;
	}
	
	/**
	 * Registra un movimiento de dinero en la base de datos.
	 *
	 * @param con La conexion a la base de datos.
	 * @param p_dni  El DNI del cliente.
	 * @param dinero  La cantidad de dinero del movimiento.
	 * @param concepto El concepto del movimiento.
	 * @param num_cuenta El numero de cuenta.
	 * @param ahora La fecha y hora del movimiento.
	 * @param tipo  El tipo de movimiento.
	 * @return true si el movimiento ha sido registrado correctamente, false si no.
	 */
	
	public static boolean movimientoDinero(Connection con,String p_dni,double dinero,String concepto,int num_cuenta,LocalDateTime ahora,String tipo) {
		
		boolean movimientoRegistrado = false;
		
		String queryMovimiento = "INSERT INTO movimientos (numero_cuenta, importe, fecha_hora, tipo, numero_cuenta_transferencia,concepto) VALUES (?, ?, ?, ?, ?, ?)";
	    
	    int registrosInsertados;
		try {
			PreparedStatement registrarMovimiento = con.prepareStatement(queryMovimiento);
			
			registrarMovimiento.setInt(1, num_cuenta);
			registrarMovimiento.setDouble(2, dinero);
			registrarMovimiento.setTimestamp(3, Timestamp.valueOf(ahora));
			registrarMovimiento.setString(4, tipo);
			registrarMovimiento.setString(5, null);
			registrarMovimiento.setString(6, concepto);
			
			
			registrosInsertados = registrarMovimiento.executeUpdate();
			
			if (registrosInsertados > 0) {
	        	movimientoRegistrado =true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    		                  
	    return movimientoRegistrado;
	}

	/**
	 * Realiza un ingreso de dinero en una cuenta de un cliente en la base de datos.
	 *
	 * @param con La conexion a la base de datos.
	 * @param p_dni El DNI del cliente.
	 * @param dinero La cantidad de dinero a ingresar.
	 * @param concepto El concepto del ingreso.
	 * @return Un mensaje que indica si el ingreso se ha realizado correctamente y si se ha registrado el movimiento en la base de datos.
	 */
	
	public static String ingresarDinero(Connection con,String p_dni,double dinero,String concepto) {
		
		Scanner scn = new Scanner(System.in);
		LocalDateTime ahora = LocalDateTime.now();		
		String infoIngreso="";
		String tipo="ingreso";
		
		boolean cuentaExiste = comprobarCuentaExiste(con, p_dni);
		boolean cuentaActiva = usuarioTieneCuentaActiva(con, p_dni);
		
		System.out.println("Indique su numero de cuenta");
		int num_cuenta = scn.nextInt();
		
		String query = "UPDATE cuentas SET saldo = saldo + ? WHERE numero_cuenta = ?";
		if (con != null && cuentaExiste && cuentaActiva) {
	        try ( PreparedStatement consulta = con.prepareStatement(query)) {
	        	
	            consulta.setDouble(1, dinero);
	            consulta.setInt(2, num_cuenta);
	            
	            int registrosAfectados = consulta.executeUpdate();
				if (registrosAfectados !=0) {
					
					infoIngreso = "El ingreso se ha realizado correctamente";
					
					boolean movimientoRegistrado = movimientoDinero(con,p_dni,dinero,concepto,num_cuenta,ahora,tipo);
					
					if(movimientoRegistrado) {
						infoIngreso = "El ingreso se ha hecho correctamente y se ha registrado el movimiento";
					}else {
						infoIngreso = "Se ha hecho el ingreso, pero no se ha registrado el movimiento";
					}
		        } else {
		            infoIngreso = "No se ha encontrado la cuenta especificada.";
		        }
					
				
				} catch (SQLException e) {
					e.printStackTrace();
					System.err.printf("Se ha producido un error al ejecutar la consulta SQL.");
				}
	    }else {
	    	if(cuentaExiste == false) {
	    		infoIngreso = "La cuenta no existe";
	    	}else {
	    		if(cuentaExiste && cuentaActiva == false) {
	    			infoIngreso = "Primero debe activar su cuenta";
	    		}
	    	}
	    }
		return infoIngreso;
	}
	
	/**
	 * Comprueba el saldo actual de la cuenta.
	 * 
	 * @param con La conexion a la base de datos.
	 * @param num_cuenta Numero de cuenta asociado al dni del cliente
	 * @return Devuelve el saldo actual de la cuenta del cliente.
	 */
	
	public static double saldoActual(Connection con, int num_cuenta) {
		
		double saldo = 0;
		
	    String query = "SELECT saldo FROM cuentas WHERE numero_cuenta = ?";
	    try (PreparedStatement consulta = con.prepareStatement(query)) {
	        consulta.setInt(1, num_cuenta);
	        ResultSet resultado = consulta.executeQuery();
	        if (resultado.next()) {
	            saldo = resultado.getDouble("saldo");	            
	        }
	    } catch (SQLException e) {
			e.printStackTrace();
			System.err.printf("Se ha producido un error al ejecutar la consulta SQL.");
		}
	    return saldo;
	}
	
	/**
	 * Realiza una retirada de dinero de una cuenta de un cliente en la base de datos.
	 *
	 * @param con La conexion a la base de datos.
	 * @param p_dni El DNI del cliente.
	 * @param dinero La cantidad de dinero a retirar.
	 * @param concepto El concepto de la retirada.
	 * @return Un mensaje que indica si la retirada se ha realizado correctamente y si se ha registrado el movimiento en la base de datos.
	 */
	
	public static String retirarDinero(Connection con,String p_dni,double dinero,String concepto) {
		
		Scanner scn = new Scanner(System.in);
		LocalDateTime ahora = LocalDateTime.now();		
		String infoRetirada="";
		String tipo="retirada";
		
		boolean cuentaExiste = comprobarCuentaExiste(con, p_dni);
		boolean cuentaActiva = usuarioTieneCuentaActiva(con, p_dni);
		double saldoActualCuenta = saldoActual(con, 0);
		if(dinero>saldoActualCuenta) {
			infoRetirada = "No puede retirarse mas dinero del disponible en la cuenta";
		}else {
			System.out.println("Indique su numero de cuenta");
			int num_cuenta = scn.nextInt();
			
			String query = "UPDATE cuentas SET saldo = saldo - ? WHERE numero_cuenta = ?";
			if (con != null && cuentaExiste && cuentaActiva) {
		        try ( PreparedStatement consulta = con.prepareStatement(query)) {
		        	
		            consulta.setDouble(1, dinero);
		            consulta.setInt(2, num_cuenta);
		            
		            int registrosAfectados = consulta.executeUpdate();
					if (registrosAfectados !=0) {
						
						infoRetirada = "La retirada se ha realizado correctamente";
						
						boolean movimientoRegistrado = movimientoDinero(con,p_dni,dinero,concepto,num_cuenta,ahora,tipo);
						
						if(movimientoRegistrado) {
							infoRetirada = "La retirada se ha hecho correctamente y se ha registrado el movimiento";
						}else {
							infoRetirada = "Se ha hecho la retirada, pero no se ha registrado el movimiento";
						}
						
			        } else {
			            infoRetirada = "No se ha encontrado la cuenta especificada.";
			        }
						
					
					} catch (SQLException e) {
						e.printStackTrace();
						System.err.printf("Se ha producido un error al ejecutar la consulta SQL.");
					}
		    }else {
		    	if(cuentaExiste == false) {
		    		infoRetirada = "La cuenta no existe";
		    	}else {
		    		if(cuentaExiste && cuentaActiva == false) {
		    			infoRetirada = "Primero debe activar su cuenta";
		    		}
		    	}
		    }
		}
		
		return infoRetirada;
	}
	
	/**
	 * Realiza una transferencia de dinero entre dos cuentas de un cliente en la base de datos.
	 *
	 * @param con La conexion a la base de datos.
	 * @param p_dni El DNI del cliente.
	 * @param dinero La cantidad de dinero a transferir.
	 * @param concepto El concepto de la transferencia.
	 * @return Un mensaje que indica si la transferencia se ha realizado correctamente y si se han registrado los movimientos en la base de datos.
	 * @throws Exception Si se produce un error al realizar la transferencia.
	 */
	
	public static String realizarTransferencia(Connection con,String p_dni,double dinero,String concepto) throws Exception{
		Scanner scn = new Scanner(System.in);
		LocalDateTime ahora = LocalDateTime.now();		
		String infoEnvioTransferencia="";
		String tipoEnvio="Transferencia enviada";
		String tipoRecibe="Transferencia recibida";
		
		boolean cuentaExiste = comprobarCuentaExiste(con, p_dni);
		boolean cuentaActiva = usuarioTieneCuentaActiva(con, p_dni);
	
		int num_cuenta_envia = obtenerNumeroCuenta(con, p_dni);
		double saldoActualCuenta = saldoActual(con, num_cuenta_envia);
		if(saldoActualCuenta<dinero) {
			infoEnvioTransferencia = "No se pudo realizar la transferencia porque la cuenta no dispone de los fondos necesarios";
		}else {
			System.out.println("Indique el numero de cuenta que recibe la transaccion");
			int num_cuenta_recibe = scn.nextInt();
			
			String queryEnviaDinero = "UPDATE cuentas SET saldo = saldo - ? WHERE numero_cuenta = ?";
			String queryRecibeDinero = "UPDATE cuentas SET saldo = saldo + ? WHERE numero_cuenta = ?";
			
			if (con != null && cuentaExiste && cuentaActiva) {
		        try ( PreparedStatement consulta = con.prepareStatement(queryEnviaDinero);
		        		PreparedStatement consulta2 = con.prepareStatement(queryRecibeDinero)) {
		        	
		            consulta.setDouble(1, dinero);
		            consulta.setInt(2, num_cuenta_envia);
		            
		            consulta2.setDouble(1, dinero);
		            consulta2.setInt(2, num_cuenta_recibe);
		            
		            int registrosAfectadosEnvio = consulta.executeUpdate();
		            int registrosAfectadosRecibo = consulta2.executeUpdate();
					if (registrosAfectadosEnvio != 0 && registrosAfectadosRecibo !=0) {
						
						infoEnvioTransferencia = "La transferencia se ha realizado correctamente";
						
						boolean movimientoRegistradoEnvio = movimientoDinero(con,p_dni,dinero,concepto,num_cuenta_envia,ahora,tipoEnvio);
						boolean movimientoRegistradoRecibido = movimientoDinero(con,p_dni,dinero,concepto,num_cuenta_recibe,ahora,tipoRecibe);
						
						if(movimientoRegistradoEnvio && movimientoRegistradoRecibido) {
							infoEnvioTransferencia = "La transferencia se ha hecho correctamente y se ha registrado el movimiento";
						}else {
							infoEnvioTransferencia = "Se ha hecho la transferencia, pero no se ha registrado el movimiento";
						}
						
			        } else {
			            infoEnvioTransferencia = "No se ha encontrado la cuenta especificada.";
			        }
						
					
					} catch (SQLException e) {
						e.printStackTrace();
						System.err.printf("Se ha producido un error al ejecutar la consulta SQL.");
					}
		    }else {
		    	if(cuentaExiste == false) {
		    		infoEnvioTransferencia = "La cuenta no existe";
		    	}else {
		    		if(cuentaExiste && cuentaActiva == false) {
		    			infoEnvioTransferencia = "Primero debe activar su cuenta";
		    		}
		    	}
		    }
		}
		
		return infoEnvioTransferencia;		
	}
	
	/**
	 * Valida una fecha especificada por dia, mes y año.
	 *
	 * @param dia El dia de la fecha.
	 * @param mes El mes de la fecha.
	 * @param ano El año de la fecha.
	 * @return true si la fecha es valida, false de lo contrario.
	 */
	
	public static boolean validarFecha(int dia, int mes, int ano) {
		
	    boolean fechaValida = true;

	    // Verificar el año
	    if (ano < 1 || ano > LocalDate.now().getYear() ) {
	        System.out.println("El año es incorrecto");
	        fechaValida = false;
	    }

	    // Verificar el mes
	    if (mes < 1 || mes > 12) {
	        System.out.println("El mes es incorrecto");
	        fechaValida = false;
	    }

	    // Verificar el día
	    boolean esBisiesto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
	    int maxDias = 0;

	    switch (mes) {
	        case 2: // Febrero
	            if(esBisiesto) {
	            	maxDias = 29;
	            }else {
	            	maxDias = 28;
	            }
	            break;
	        case 4: // Abril
	        case 6: // Junio
	        case 9: // Septiembre
	        case 11: // Noviembre
	            maxDias = 30;
	            break;
	        default:
	            maxDias = 31;
	            break;
	    }

	    if (dia < 1 || dia > maxDias) {
	        System.out.println("El dia es incorrecto");
	        fechaValida = false;
	    }

	    return fechaValida;
	}
	
	/**
	 * Crea una instancia de la clase LocalDate a partir de la entrada del usuario.
	 *
	 * @return La fecha creada por el usuario.
	 */
	
	public static LocalDate creaFecha() {
		Scanner scn =new Scanner(System.in);
		System.out.println("Indique el dia");
		int dia= scn.nextInt();
		System.out.println("Indique el mes");
		int mes=scn.nextInt();
		System.out.println("Indique el año");
		int ano=scn.nextInt();
		validarFecha(dia, mes, ano);
		LocalDate nueva = LocalDate.of(ano, mes, dia);
		return nueva;
	}
	
	/**
	 * Muestra los movimientos asociados a una cuenta en un rango de fechas en la base de datos.
	 *
	 * @param con La conexion a la base de datos.
	 * @param numero_cuenta El numero de cuenta.
	 * @param inicio La fecha de inicio de los movimientos.
	 * @param fin La fecha de fin de los movimientos.
	 * @return Los movimientos asociados a la cuenta en el rango de tiempo especificado.
	 */
	
	public static String mostrarMovimientos(Connection con,int numero_cuenta,LocalDate inicio, LocalDate fin) {
		String query = "SELECT * FROM MOVIMIENTOS WHERE numero_cuenta = ? and fecha_hora >= ? and fecha_hora <= ?";
		String movimientos = "";
    	Date fechaInicio = Date.valueOf(inicio);
    	Date fechaFin = Date.valueOf(fin);
    	if (con != null) {
            try ( PreparedStatement consulta = con.prepareStatement(query)) {
                consulta.setInt(1, numero_cuenta);
                consulta.setDate(2, fechaInicio);
                consulta.setDate(3, fechaFin);
                if(consulta.execute()) {
                	ResultSet resultados = consulta.getResultSet();
                	System.out.println("Sus movimientos asociados a esta cuenta son:");
                	 while (resultados.next()) {
                	    	movimientos+=resultados.getString("tipo")+" "+resultados.getString("importe")+"\n";                        
                     }
                }              

            } catch (SQLException e) {
            	e.printStackTrace();
                System.err.printf("Se ha producido un error al ejecutar la consulta SQL.");
            }
		} 		
    	return movimientos;	
	}
	
}

