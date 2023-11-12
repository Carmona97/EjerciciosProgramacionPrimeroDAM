package ejercicio1;

public abstract class Astros {
	
	protected String nombre;
	protected double masa;
	protected double diametro;
	protected double periodoRotacion;
	protected double peridoTraslacion;
	protected double distanciaMedia;
	
	public Astros(String nombre,double masa, double diametro, double periodoRotacion,double periodoTraslacion, double distanciaMedia) {
		
		this.nombre=nombre;
		this.masa=masa;
		this.diametro=diametro;
		this.periodoRotacion=periodoRotacion;
		this.peridoTraslacion=periodoTraslacion;
		this.distanciaMedia=distanciaMedia;
		
	}
	
	public String muestra() {
		
		return nombre+"\nMasa: "+Double.toString(masa)+" Kilogramos\nDiametro: "+Double.toString(diametro)+" Km\nDistancia media: "+Double.toString(distanciaMedia)+" Km\nPeriodo de rotacion "+Double.toString(periodoRotacion)+" segundos\nPeriodo de traslacion: "+Double.toString(peridoTraslacion)+" segundos";
	
	}
}
