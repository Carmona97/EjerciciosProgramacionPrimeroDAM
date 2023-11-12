package agenciaInmobiliaria;

public abstract class Propiedad {
    private static int contadorId = 1;

    protected int numId;
    protected String direccion;
    protected double precio;

    public Propiedad(String direccion, double precio) {
        this.numId = contadorId++;
        this.direccion = direccion;
        this.precio = precio;
    }

    public abstract String getId(); 
    

    public int getNumId() {
		return numId;
	}

	public String getDireccion() {
        return direccion;
    }

    public double getPrecio() {
        return precio;
    }
}