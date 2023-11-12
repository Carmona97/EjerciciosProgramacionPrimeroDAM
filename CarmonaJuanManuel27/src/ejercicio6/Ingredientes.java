package ejercicio6;

//Realizado por Juan Manuel Carmona Ruiz 1DAM el 19-03-2023

public class Ingredientes {

	private String codigo;
    private String nombre;
    private int cantidad;
    private int stockMinimo;
    
    public Ingredientes(String codigo, String nombre, int cantidad, int stockMinimo) {
    	
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.stockMinimo = stockMinimo;
        
    }

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getStockMinimo() {
		return stockMinimo;
	}

	public void setStockMinimo(int stockMinimo) {
		this.stockMinimo = stockMinimo;
	}

	@Override
	public String toString() {
		return "Ingredientes [codigo=" + codigo + ", nombre=" + nombre + ", cantidad=" + cantidad + ", stockMinimo="
				+ stockMinimo + "]";
	}
    
}
