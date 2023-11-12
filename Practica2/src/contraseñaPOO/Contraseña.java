package contraseñaPOO;

public class Contraseña {
	
	private final static int LONGITUD_MAXIMA;
	private String contrasegna;
	private int longitud;
	
	static{
		LONGITUD_MAXIMA=8;
	}
	
	public Contraseña(int longitud,String contrasegna) {
		this.longitud=longitud;
		this.contrasegna=contrasegna;
		
		if(contrasegna.length()>longitud || longitud>LONGITUD_MAXIMA) {
			System.out.println("Contraseña erronea");
			this.contrasegna=null;
		}
	}
	
	public Contraseña() {
		longitud=LONGITUD_MAXIMA;
		contrasegna="";
		
		String letras= "qwe1rt0yu2iop7as3dfg8hj4klñz5xcv6bnm9QWERTYUIOPÑLKJHGFDSAZXCVBNM";
		
		for(int i=0;i<LONGITUD_MAXIMA;i++) {
			
			int numAleatorio=(int)(Math.random()*62);
			char aleatorio=letras.charAt(numAleatorio);
			
			contrasegna+=aleatorio;
			
		}
		
	}		
	
	public void setContrasegna(String contrasegna) {
		this.contrasegna=contrasegna;
	}
	
	public String getContrasegna() {
		return contrasegna;
	}
	
	

}
