package ejercicio3;

public class Colegio {
	
/*Juan Manuel Carmona Ruiz 1Dam
 * Esta clase principal se utiliza para instanciar objetos de las clases Personal, Profesor y Pas
 * Se utilizan cada uno de los métodos solicitados y se imprimen por consola los resultados*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personal primero=new Personal();		
		System.out.println(primero.toString());
		
		Personal segundo=new Personal("87977245V","Pepe","Tacon Alto",47,'H',1350.54,"678983472","pepitopepon@gmail.com");
		segundo.aumentoSalario(49.46);
		System.out.println("\n"+segundo.toString()+"\nAños para la jubilacion: "+segundo.agnosJubilacion());
		
		Profesor primaria=new Profesor("67891876C","Antonio","Ruiz Fernandez",32,'H',2139.12,"655845225","Antoñeteprof@gmail.com","magisterio","lengua","EF","No",3);
		primaria.aumentarSalario();
		primaria.aumentoSalario(18.0976);
		System.out.println("\n"+primaria.toString()+"\nAños jubilacion: "+primaria.agnosJubilacion());
		
		Pas administrativa=new Pas("84565245G","Nieves","Foster Garcia",64,'M',2600.01,"666123472","NieveFria@gmail.com",false,false,true,"Finanzas");
		
		administrativa.aumentoSalario(10.99);
		System.out.println(administrativa.toString()+"\nAños para la jubilacion: "+administrativa.agnosJubilacion());
		
		System.out.println("\nLa cantidad de idiomas conocidos son: "+administrativa.numIdiomas());
		administrativa.cambioIdioma("Aleman");
		System.out.println("La cantidad de idiomas conocidos son: "+administrativa.numIdiomas());
		
		
	}

}
