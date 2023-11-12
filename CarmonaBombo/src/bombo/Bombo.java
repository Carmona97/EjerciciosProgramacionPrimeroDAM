package bombo;
/**
 * 
 * @author Juan Manuel Carmona Ruiz DAM1
 *
 */

public class Bombo {
	
	//ATRIBUTOS DE CLASE
	
	private boolean bolas[];
	private final int CAPACIDAD_DEFECTO=90;
	
	//ATRIBUTOS OBJETO
	
	private int bolasExtraidas;
	private int capacidadMaxima;
	private int valorBolaExtraida;
	
	/**
	 * Contruye el objeto bombo con una capacidad introducida en el parametro
	 * @param capacidadBombo Indica la cantidad de bolas que se pueden introducir dentro del bombo
	 */
	
	public Bombo(int capacidadBombo) {
		capacidadMaxima=capacidadBombo;
		bolas=new boolean[capacidadMaxima];
		for(int i=0;i<capacidadMaxima;i++) {
			bolas[i]=false;
		}
	}
	/**
	 * Construye el bombo con una capacidad por defecto de 90 bolas
	 */
	public Bombo() {
		capacidadMaxima=CAPACIDAD_DEFECTO;
		bolas=new boolean[capacidadMaxima];
		for(int i=0;i<capacidadMaxima;i++) {
			bolas[i]=false;
		}
	}
	
	public int getCapacidadBombo() {
		return capacidadMaxima;
	}
	public int getCantidadBolasRestantes() {
		return capacidadMaxima-bolasExtraidas;
	}
	public int getCantidadBolasExtraidas() {
		return bolasExtraidas;
	}
	public int isCompleto() {
		return bolasExtraidas=capacidadMaxima;
	}
	public int isVacio() {
		return bolasExtraidas=0;
	}
	public void representacionTextual() {
		System.out.println("Capacidad: "+(capacidadMaxima-bolasExtraidas)+" Cantidad bolas extraidas: "+bolasExtraidas);
	}
	public void extraccionBola() {
		
		for(bolasExtraidas=1;bolasExtraidas<=capacidadMaxima;bolasExtraidas++) {
			valorBolaExtraida=(int)(Math.random()*(capacidadMaxima));
			
			System.out.println("1");
			
			if(bolas[valorBolaExtraida]=false) {
				
				bolas[valorBolaExtraida]=true;
				System.out.println("2");
				
			}else {//comprobar bucle while
				
				while(bolas[valorBolaExtraida]=true) {
					
					valorBolaExtraida++;
					System.out.println("3");
					if(valorBolaExtraida==capacidadMaxima) {
						valorBolaExtraida=0;
						System.out.println("4");
					}
					System.out.println("5");
				}
				if(bolas[valorBolaExtraida]=false) {
					bolas[valorBolaExtraida]=true;
					System.out.println("6");
				}
			}
			
			if(bolasExtraidas==capacidadMaxima) {
				System.out.println("No quedan mas bolas por salir");
			}
			System.out.println(valorBolaExtraida);
		}
		
		
	}
	public int reset() {
		bolas=new boolean[capacidadMaxima];
		for(int i=0;i<capacidadMaxima;i++) {
			bolas[i]=false;
		}
		bolasExtraidas=0;
		return capacidadMaxima;
	}
	
}
