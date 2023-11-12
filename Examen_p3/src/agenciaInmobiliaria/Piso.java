package agenciaInmobiliaria;

public class Piso extends Propiedad {
    private int m2;
    private int numHabitaciones;
    private int numBanos;

    public Piso(String direccion, double precio, int m2, int numHabitaciones, int numBanos) {
        super(direccion, precio);
        this.m2 = m2;
        this.numHabitaciones = numHabitaciones;
        this.numBanos = numBanos;
    }

    public int getM2() {
        return m2;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public int getNumBanos() {
        return numBanos;
    }
    public String getId() {
    	return "P"+super.getNumId();
    }
}