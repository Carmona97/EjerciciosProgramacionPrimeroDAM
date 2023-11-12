package ejercicio1;

public class Satelites extends Astros{

	private double distanciaPlaneta;
	private double orbitaPlanetaria;
	private String pertenecePlaneta;
	
	public Satelites(String nombre,double masa, double diametro, double periodoRotacion,double periodoTraslacion, double distanciaMedia,double distanciaPlaneta,double orbitaPlanetaria,String pertenecePlaneta) {
		
		super(nombre,masa, diametro, periodoRotacion, periodoTraslacion, distanciaMedia);
		this.distanciaPlaneta=distanciaPlaneta;
		this.orbitaPlanetaria=orbitaPlanetaria;
		this.pertenecePlaneta=pertenecePlaneta;
		
	}
	
	@Override
	public String muestra() {
		
		return super.muestra()+"\nDistancia respecto al planeta: "+Double.toString(distanciaPlaneta)+" Km\nOrbita respecto al planeta: "+Double.toString(orbitaPlanetaria)+" KM\nPertenece a: "+pertenecePlaneta;
		
	}
}
