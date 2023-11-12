package ejerricico5;
import java.time.*;
		import java.util.*;
public class cinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		 	/*Aqui pedimos al usuario un año entre estos dos*/
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Introduce un año entre 1900 y 2100: ");
		        int year = sc.nextInt();
		        /*Creamos el map donde le vamos a dar meses , otro map con los dias de la semana y un set con locaLdATE*/
		        Map<Month, Map<DayOfWeek, Set<LocalDate>>> calendar = new HashMap<>();
		        /*Aqui es donde verdaderamente se trabaj */
		        for (Month month : Month.values()) {
		            Map<DayOfWeek, Set<LocalDate>> monthMap = new HashMap<>();
		            for (DayOfWeek day : DayOfWeek.values()) {
		                monthMap.put(day, new HashSet<>());
		            }
		            YearMonth ym = YearMonth.of(year, month);
		            for (LocalDate date = ym.atDay(1); date.getMonth() == month; date = date.plusDays(1)) {
		                monthMap.get(date.getDayOfWeek()).add(date);
		            }
		            calendar.put(month, monthMap);
		        }

		        System.out.println("Fechas de febrero que caen en lunes:");
		        for (LocalDate date : calendar.get(Month.FEBRUARY).get(DayOfWeek.MONDAY)) {
		            System.out.println(date);
		        }

		        System.out.println("Fechas de marzo que caen en jueves:");
		        for (LocalDate date : calendar.get(Month.MARCH).get(DayOfWeek.THURSDAY)) {
		            System.out.println(date);
		        }

		        System.out.println("Fechas de diciembre que caen en domingo:");
		        for (LocalDate date : calendar.get(Month.DECEMBER).get(DayOfWeek.SUNDAY)) {
		            System.out.println(date);
		        }
		    }
		}



