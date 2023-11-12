package ejercicio1;

public class Planetas extends Astros{

	private double distanciaSol;
	private double orbitaSol;
	private boolean tieneSatelites;
	
	public Planetas(String nombre,double masa, double diametro, double periodoRotacion,double periodoTraslacion, double distanciaMedia,double distanciaSol,double orbitaSol,boolean tieneSatelites) {
		
		super(nombre,masa, diametro, periodoRotacion, periodoTraslacion, distanciaMedia);
		this.distanciaSol=distanciaSol;
		this.orbitaSol=orbitaSol;
		this.tieneSatelites=tieneSatelites;
		
	}
	
	@Override
	public String muestra() {
		
		return super.muestra()+"\nDistancia al Sol: "+Double.toString(distanciaSol)+" Km\nOrbita respecto al Sol: "+Double.toString(orbitaSol)+" Km\nTiene satélite: "+Boolean.toString(tieneSatelites);
		
	}
	
}
