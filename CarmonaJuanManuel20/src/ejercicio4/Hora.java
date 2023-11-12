package ejercicio4;

import java.util.Scanner;

/**
 * 
 * @author Juanma 1Dam
 *
 */

public class Hora {
	
	private int hora;
	private int minuto;
	private int segundo;
	
	public Hora() {
		
		hora=0;
		minuto=0;
		segundo=0;
		
	}
	
	/**
	 * Constructor que inicializa la hora con los valores indicados
	 * 
	 * @param hora Indica la hora en formato digital
	 * @param minuto Indica los minutos en formato digital
	 * @param segundo Indica los segundos en formato digital
	 */
	
	public Hora(int hora, int minuto, int segundo) {
		
		this.hora=hora;
		this.minuto=minuto;
		this.segundo=segundo;
		
		valida();
		
	}
	
	/**
	 * Método que permite leer la hora por teclado
	 */
	
	public void leer() {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Indique hora");
		hora=scn.nextInt();
		
		System.out.println("Indique minuto");
		minuto=scn.nextInt();
		
		System.out.println("Indique segundo");
		segundo=scn.nextInt();
		
		valida();
		
	}
	
	/**
	 * Método privado que valida que los valores de hora, minuto y segundo estén en el rango permitido,sino establece los valores en 0
	 */
	
	private void valida() {
		
		if(hora<0 || hora>23) {
			hora=0;
		}
		
		if(minuto<0 || minuto>59) {
			minuto=0;
		}
		
		if(segundo<0 || segundo>59) {
			segundo=0;
		}
		
	}
	
	
	public String imprime() {
		
		String horaDigital= Integer.toString(hora).concat(":"+Integer.toString(minuto)).concat(":"+Integer.toString(segundo));
		
		return horaDigital;
		
	}
	
	public int aSegundos() {
		int aSegundos= (hora*3600+minuto*60+segundo);
		return aSegundos;
	}
	
	public String deSegundos(int deSegundos) {
		
		Hora desdeMedianoche= new Hora(hora,minuto,segundo);
		
		if(deSegundos<3600) {
			
			desdeMedianoche.hora=0;
			desdeMedianoche.minuto=deSegundos/60;
			desdeMedianoche.segundo=minuto%60;
			
		}else {
			
			desdeMedianoche.hora= deSegundos/3600;
			if(deSegundos%3600 != 0) {
				
				desdeMedianoche.minuto=(deSegundos%3600)/60;
				
			}else {
				
				desdeMedianoche.minuto=0;
				desdeMedianoche.segundo=0;
				
			}
			
			if(minuto%60!=0) {
				desdeMedianoche.segundo=minuto%60;
				
			}
		}
			
		return desdeMedianoche.imprime();
		
	}
	
	public int segundosDesde(Hora introducida) {
		
		int resultado;
		
		Hora inicial= new Hora(hora,minuto,segundo);
		
		if(inicial.aSegundos()>introducida.aSegundos()) {
			
			resultado=inicial.aSegundos()-introducida.aSegundos();		
		}else {
			
			resultado=introducida.aSegundos()-inicial.aSegundos();			
		}
		
		return resultado;
		
	}
	
	public void siguiente() {
		
		if(segundo<59) {
			segundo++;
			
		}else {
			
			if(segundo==59 && minuto<59) {
				
				minuto++;
				segundo=0;
				
			}else {
				
				if(segundo==59 && minuto==59) {
					hora++;
					minuto=0;
					segundo=0;
				}
			}										
		}
	}
	
	public void anterior() {
		
		if(segundo==0 && minuto>1) {
			minuto--;
			segundo=59;
			
		}else {
			
			if(segundo==0 && minuto==0) {
				hora--;
				minuto=59;
				segundo=59;
				
			}else {
				
				if(segundo>0) {
					segundo--;
					
				}
			}
		}
	}
	
	public Hora copia() {
		
		Hora clon=new Hora(hora,minuto,segundo);
		return clon;
	}
	
	public boolean igualQue(Hora introducida) {
		
		Hora inicial= new Hora(hora,minuto,segundo);
		
		boolean igualQue=false;
		
		if(inicial.aSegundos()==introducida.aSegundos()) {
			igualQue=true;
		}
		
		return igualQue;
		
	}
	
	public boolean menorQue(Hora introducida) {
		
		Hora inicial= new Hora(hora,minuto,segundo);
		
		boolean menorQue=false;
		
		if(inicial.aSegundos()>introducida.aSegundos()) {
			menorQue=true;
		}
		
		return menorQue;
		
	}

	public boolean mayorQue(Hora introducida) {
	
		Hora inicial= new Hora(hora,minuto,segundo);
	
		boolean mayorQue=false;
	
		if(inicial.aSegundos()<introducida.aSegundos()) {
			mayorQue=true;
		}
	
		return mayorQue;
	
	}
	
}
