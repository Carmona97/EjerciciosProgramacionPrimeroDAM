package ejercicio4;

//Realizado por Juan Manuel Carmona Ruiz 1DAM el 19-03-2023

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	static ArrayList<Persona> poblacion=new ArrayList();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		
		int num=1;
		
		while(num>=1) {
			
			System.out.println("Indique que desea hacer:\n1.Ingresar persona\n2.Mostrar cantidad de personas de un estado civil determinado\n3.Mostrar un rango de edad determinado\n4.Sexo y estado civil\nPulse 0 para cerrar el programa");
			
			num=scn.nextInt();
			
			if(num==0) {
				
				System.out.println("Fin del programa");
				
			}else {
				if(num==1) {
					
					agnadirPersona();
					
				}else {
					if(num==2) {
						
						System.out.println(estadoCivil());
						
						
					}else {
						if(num==3) {
							
							System.out.println(rangoEdad());
							
							
						}else {
							if(num==4) {
								
								System.out.println(sexoYestadoCivil());
								
								
							}else {
								System.out.println("Numero erroneo, vuelva a intentarlo");
							}
						}
					}
				}
			}
		}						
	}

	public static void agnadirPersona() {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Indique el sexo: (Masculino o femenino)");
		String sexo=scn.next();
		System.out.println("Indique el estado civil: (Casado,divorciado,soltero,viudo)");
		String estadoCivil=scn.next();
		System.out.println("Indique edad");
		int edad=scn.nextInt();
		
		Persona nueva= new Persona(sexo,estadoCivil,edad);
		nueva.setSexo(nueva.comprobarSexo(sexo));
		nueva.setEstadoCivil(nueva.comprobarEstadoCivil(estadoCivil));
		poblacion.add(nueva);
	}
	
	public static String rangoEdad() {
		
		int ochentas=0;
		int noventas=0;
		int dosmil=0;
		int diez=0;
		int veintes=0;
		int demasiadoMayor=0;
		
		for (Persona i : poblacion) {
			if(i.getEdad()<=3) {
				veintes++;
			}else {
				if(i.getEdad()>3 && i.getEdad()<=13) {
					diez++;
				}else {
					if(i.getEdad()>13 && i.getEdad()<=23) {
						dosmil++;
					}else {
						if(i.getEdad()>23 && i.getEdad()<=33) {
							noventas++;
						}else {
							if(i.getEdad()>33 && i.getEdad()<=43) {
								ochentas++;
							}else {
								demasiadoMayor++;
							}
						}
					}
				}
			}
		}
		
		return "Decada 2020: "+veintes+"\nDecada 2010: "+diez+"\nDecada 2000: " +dosmil+"\nDecada 1990: "+noventas+"\nDecada 1980: "+ochentas+"\nDemasiado Mayor: "+demasiadoMayor;
	}
		
	
	public static String sexoYestadoCivil() {
		
		int hombreCasado=0;
		int hombreSoltero=0;
		int hombreDivorciado=0;
		int hombreViudo=0;
		
		int mujerCasada=0;
		int mujerSoltera=0;
		int mujerDivorciada=0;
		int mujerViuda=0;
		
		for (Persona i : poblacion) {
			i.getSexo();
			i.getEstadoCivil();
			if(i.getSexo().equals("MASCULINO")) {
				if(i.getEstadoCivil().equals("CASADO")) {
					hombreCasado++;
				}else {
					if(i.getEstadoCivil().equals("SOLTERO")) {
						hombreSoltero++;
					}else {
						if(i.getEstadoCivil().equals("VIUDO")) {
							hombreViudo++;
						}else {
							if(i.getEstadoCivil().equals("DIVORCIADO")) {
								hombreDivorciado++;
							}
						}
					}
				}
			}else {
				if(i.getSexo().equals("FEMENINO")) {
					if(i.getEstadoCivil().equals("CASADO")) {
						mujerCasada++;
					}else {
						if(i.getEstadoCivil().equals("SOLTERO")) {
							mujerSoltera++;
						}else {
							if(i.getEstadoCivil().equals("VIUDO")) {
								mujerViuda++;
							}else {
								if(i.getEstadoCivil().equals("DIVORCIADO")) {
									mujerDivorciada++;
								}
							}
						}
					}
				}
			}
		}
		
		return "Hombres casados: "+hombreCasado+"\nhombres solteros: "+hombreSoltero+"\nhombres viudos: "+hombreViudo+"\nhombres divorciados: "+hombreDivorciado+"\nmujeres casadas: "+mujerCasada+"\nmujeres solteras: "+mujerSoltera+"\nmujeres viudas: "+mujerViuda+"\nmujeres divorciadas: "+mujerDivorciada;
		
	}
	
	public static String estadoCivil() {
		
		int contadorSoltero=0;
		int contadorCasado=0;
		int contadorDivorciado=0;
		int contadorViudo=0;
		
		for (Persona i: poblacion) {
			if(i.getEstadoCivil().equals("SOLTERO")) {
				contadorSoltero++;
			}else {
				if(i.getEstadoCivil().equals("VIUDO")) {
					contadorViudo++;
				}else {
					if(i.getEstadoCivil().equals("DIVORCIADO")) {
						contadorDivorciado++;
					}else {
						if(i.getEstadoCivil().equals("CASADO")) {
							contadorCasado++;
						}
					}
				}
			}
		}
		
		return "Casados: "+contadorCasado+"\nSolteros: "+contadorSoltero+"\nDivorciados: "+contadorDivorciado+"\nViudos: "+contadorViudo;
		
	}
		
}
