package ejercicio3;


import java.sql.Date;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Scanner;

/**
 * 
 * @author Juanma 1Dam
 *
 */

public class Fecha {
	private int dia;
	private int mes;
	private int agno;
	
	/**
	 * Constructor sin parámetros que inicializa la fecha a 1 de enero de 1900
	 */
	
	public Fecha() {
		dia=1;
		mes=1;
		agno=1900;
	}
	
	/**
	 * Constructor con parámetros que inicializa la fecha con los valores dados
	 * 
	 * @param dia día de la fecha
	 * @param mes mes de la fecha
	 * @param agno año de la fecha
	 */
	
	public Fecha(int dia, int mes, int agno) {
		this.dia=dia;
		this.mes=mes;
		this.agno=agno;
		valida();
	}
	
	/**
	 * Devuelve el día de la fecha
	 * 
	 * @return día de la fecha
	 */
	
	public int getDia() {
		return dia;
	}
	
	/**
	 * Devuelve el mes de la fecha
	 * 
	 * @return mes de la fecha
	 */
	
	public int getMes() {
		return mes;
	}
	
	/**
	 * Devuelve el año de la fecha
	 * 
	 * @return año de la fecha
	 */
	
	public int getAgno() {
		return agno;
	}
	
	/**
	 * Lee los valores para el día, mes y año a partir del teclado
	 */
	
	public void leer() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Indique dia");
		dia=scn.nextInt();
		System.out.println("Indique mes");
		mes=scn.nextInt();
		System.out.println("Indique año");
		agno=scn.nextInt();
		valida();
	}
	
	/**
	 * Devuelve true si el año de la fecha es bisiesto y false en caso contrario
	 * 
	 * @return true si el año de la fecha es bisiesto y false en caso contrario
	 */
	
	public boolean bisiesto() {
		boolean bisiesto=false;
		if ((agno % 4 == 0) && ((agno % 100 != 0) || (agno % 400 == 0))) {
			bisiesto=true;
		}
		return bisiesto;
	}
	
	/**
	 * Método que devuelve el número de días del mes correspondiente
	 * @param mes El mes para el que se quiere conocer el número de días
	 * @return El número de días del mes correspondiente
	 */
	
	public int diasMes(int mes) {
		boolean bisiesto=false;
		if ((agno % 4 == 0) && ((agno % 100 != 0) || (agno % 400 == 0))) {
			bisiesto=true;
		}
		if(mes==2 && bisiesto == true) {
			dia=29;
		}
		if(mes==2 && bisiesto==false) {
			dia=28;
		}
		if(mes==1 || mes==3 || mes==5 || mes==7||mes==8||mes==10||mes==12) {
			dia=31;
		}else {
			if(mes==4 || mes==6 || mes==9|| mes==11) {
				dia=30;			}
		}
		return dia;
	}
	
	/**
	 * Método que valida la fecha. Si algún valor es inválido, se establece a un valor por defecto
	 */
	
	private void valida() {
		if(dia<1 || dia>30 && (mes==1 || mes==3 || mes==5 || mes==7||mes==8||mes==10||mes==12)) {
			dia=1;
		}
		if(dia<1 || dia>31 && (mes==4 || mes==6 || mes==9 || mes==11)) {
			dia=1;
		}
		boolean bisiesto=false;
		if ((agno % 4 == 0) && ((agno % 100 != 0) || (agno % 400 == 0))) {
			bisiesto=true;
		}
		if(mes==2 && bisiesto == true && dia<1 || dia>29) {
			dia=1;
		}
		if(mes==2 && bisiesto==false && dia<1 || dia>28) {
			dia=1;
		}
		if(mes<1 || mes>12) {
			mes=1;
		}
		if(agno<1900 || agno>2050) {
			agno=1900;
		}
	}
	
	/**
	 * Método que devuelve la fecha en formato "día - mes - año"
	 * @return La fecha en formato "día - mes - año"
	 */
	
	public String corta() {
		String corta=Integer.toString(getDia())+" - "+Integer.toString(getMes())+" - "+Integer.toString(getAgno());
		return corta;
	}

	/**
	 * Método que devuelve el número de días transcurridos desde el 1 de enero de 1900 hasta la fecha
	 * @return El número de días transcurridos desde el 1 de enero de 1900
	 */
	
	public int diasTranscurridos() {		
		int diferenciaagno=0;
		int agnosbisiestos=0;
		LocalDate indicada = LocalDate.of(agno, mes, dia);
		if(agno!=1900) {
			diferenciaagno=agno-1900;
		}
		for(int i=1900;i<=agno;i++) {
			if ((agno % 4 == 0) && ((agno % 100 != 0) || (agno % 400 == 0))) {
				agnosbisiestos++;
			}
		}
		return (diferenciaagno*365)+indicada.getDayOfYear()+agnosbisiestos;
	}
	
	/**
	 * Método que devuelve el nombre del día de la semana correspondiente a la fecha
	 * @return El nombre del día de la semana correspondiente a la fecha
	 */
	public String diaSemana() {
		
		String nombreDia []= {"Domingo ", "Lunes ","Martes ","Miercoles ","Jueves ","Viernes ","Sabado "};
		
		//Algoritmo de Zeller cuyo resultado es un numero de 0 a 6 donde el 0 es Domingo y 6 Sabado
		
		int algoritmo = (14 - mes) / 12;
		int agnoZeller = agno - algoritmo;
		int mesZeller = mes + 12 * algoritmo - 2;
		int diaZeller = (dia + agnoZeller + agnoZeller/4 - agnoZeller/100 + agnoZeller/400 + (31*mesZeller)/12) % 7;
		
		return nombreDia[diaZeller];
		 			
	}
	
	/**
	 * Método que devuelve la fecha en formato "día de mes de año"
	 * @return La fecha en formato "día de mes de año"
	 */
	
	public String larga() {
		String larga=diaSemana()+Integer.toString(getDia())+" de "+Month.of(getMes()).toString()+" de "+Integer.toString(getAgno());
		return larga;
	}
	
	/**
	 * Método que modifica la fecha sumándole un número de días
	 * @param diasTras El número de días que se quieren sumar a la fecha
	 */
	
	public void fechaTras(long diasTras) {
		
		Calendar fecha= Calendar.getInstance();
		fecha.set(1, Calendar.JANUARY, 1900);
		fecha.add(Calendar.DATE, (int)diasTras);
		fecha.getTime();	
		
	}
	
	 /**
     * Método que devuelve la cantidad de días entre dos fechas
     * @param proporcionada fecha a comparar
     * @return número de días de diferencia
     */
	
	public int diasEntre(Fecha proporcionada) {
		
		Fecha inicial= new Fecha(dia,mes, agno);
		int resultado;
		
		if(inicial.diasTranscurridos()>proporcionada.diasTranscurridos()) {
			
			resultado=inicial.diasTranscurridos()-proporcionada.diasTranscurridos();
			
		}else {
			
			resultado=proporcionada.diasTranscurridos()-inicial.diasTranscurridos();
			
		}
		
		return resultado;
				
	}
	
	/**
     * Método que avanza un día en la fecha 
     */
	
	public void siguiente() {
		Fecha siguiente= new Fecha(dia,mes,agno);
		if(dia<siguiente.diasMes(mes)) {
			dia++;
		}else {
			if(mes<12) {
				dia=1;
				mes++;
			}else {
				if(mes==12) {
					mes=1;
					agno++;
				}
			}
			
		}
	}
	
	/**
     * Método que retrasa un día en la fecha 
     */
	
	public void anterior() {
		Fecha anterior= new Fecha(dia,mes,agno);
		if(dia>1) {
			dia--;
		}else {
			if(dia==1) {
				mes--;
				dia=anterior.diasMes(mes);				
			}else {
				if(mes==1 && dia==1) {
					agno--;
					dia=31;
					mes=12;
				}
			}			
		}
	}
	
	 /**
     * Método que devuelve una copia de la fecha
     * @return copia de la fecha 
     */
	
	public Fecha copia() {
		Fecha clon = new Fecha(dia,mes,agno);
		return clon;
	}
	
	/**
     * Método que devuelve si la fecha actual es igual a una fecha introducida
     * @param introducida fecha a comparar
     * @return true si ambas fechas son iguales, false en caso contrario
     */
	
	public boolean igualQue(Fecha introducida) {
		boolean igual=false;
		Fecha anterior= new Fecha(dia,mes,agno);
		if(introducida.diasTranscurridos()==anterior.diasTranscurridos()) {
			igual=true;
		}	
		
		return igual;
		
	}
	
	 /**
     * Método que devuelve si la fecha actual es mayor a una fecha introducida
     * @param introducida fecha a comparar
     * @return true si la fecha actual es mayor, false en caso contrario
     */
	
	public boolean mayorQue(Fecha introducida) {
		boolean mayor=false;
		Fecha anterior= new Fecha(dia,mes,agno);
		if(introducida.diasTranscurridos()>anterior.diasTranscurridos()) {
			mayor=true;
		}		return mayor;
	}
	
	 /**
     * Método que devuelve si la fecha actual es menor a una fecha introducida
     * @param introducida fecha a comparar
     * @return true si la fecha actual es menor, false en caso contrario
     */
	public boolean menorQue(Fecha introducida) {
		boolean menor=false;
		Fecha anterior= new Fecha(dia,mes,agno);
		if(introducida.diasTranscurridos()<anterior.diasTranscurridos()) {
			menor=true;
		}		return menor;
	}

	
}
