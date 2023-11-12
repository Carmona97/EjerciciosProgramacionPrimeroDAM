package ejercicio7;

//Realizado por Juan Manuel Carmona Ruiz 1DAM el 27-03-2023

public class Venta {

	private String nombreMes;
	private double ventasMes;
	
	public Venta(String nombreMes, double ventasMes) {
		// TODO Auto-generated constructor stub
		
		this.nombreMes=nombreMes;
		this.ventasMes=ventasMes;
		
	}

	public String getNombreMes() {
		return nombreMes;
	}

	public void setNombreMes(String nombreMes) {
		this.nombreMes = nombreMes;
	}

	public double getVentasMes() {
		return ventasMes;
	}

	public void setVentasMes(int ventasMes) {
		this.ventasMes = ventasMes;
	}

	@Override
	public String toString() {
		return "Venta [nombreMes=" + nombreMes + ", ventasMes=" + ventasMes + "]";
	}

	
}
