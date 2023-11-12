package agenciaInmobiliaria;

public class LocalComercial extends Propiedad {
    private int m2;
    private boolean aireAcondicionado;

    public LocalComercial(String direccion, double precio, int m2, boolean aireAcondicionado) {
        super(direccion, precio);
        this.m2 = m2;
        this.aireAcondicionado = aireAcondicionado;
    }

    public int getM2() {
        return m2;
    }

    public boolean tieneAireAcondicionado() {
        return aireAcondicionado;
    }
    
    public String getId() {
    	return "LC"+super.getNumId();
    }

}