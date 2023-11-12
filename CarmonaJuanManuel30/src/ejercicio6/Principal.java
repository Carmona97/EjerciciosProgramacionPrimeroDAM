package ejercicio6;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Gato monet= new Gato("Mt",2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Gato andresito= new Gato("Andresito",-3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Gato pepito= new Gato("pepito",5);
			pepito.setNombre("a");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Gato antonio= new Gato("antonio",12);
			System.out.println(antonio.toString());			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
