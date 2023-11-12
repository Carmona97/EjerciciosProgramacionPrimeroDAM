package ejercicio8;

//Realizado por Juan Manuel Carmona Ruiz 1DAM el 27-03-2023

public class DiaTemperatura {

	private int diaDelMes;
	private String diaDeLaSemana;
	private double temperaturaMedia;

	public DiaTemperatura(int diaDelMes, String diaDeLaSemana, double temperaturaMedia) {

		this.diaDelMes = diaDelMes;
	    this.diaDeLaSemana = diaDeLaSemana;
	    this.temperaturaMedia = temperaturaMedia;
	    
    }

	public int getDiaDelMes() {
        return diaDelMes;
    }

    public String getDiaDeLaSemana() {
    	return diaDeLaSemana;
	}

    public double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    public void setTemperaturaMedia(double temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

	@Override
	public String toString() {
		return "DiaTemperatura [diaDelMes=" + diaDelMes + ", diaDeLaSemana=" + diaDeLaSemana + ", temperaturaMedia="
				+ temperaturaMedia + "]";
	}

}
