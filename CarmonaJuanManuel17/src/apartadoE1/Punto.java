package apartadoE1;


public class Punto {
	private int x;
	private int y;
	
	public Punto(int x, int y) {
		this.x=x;
		this.y=y;
}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}
	
	public void setXY(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public void desplaza(int dx,int dy) {
		this.x=x+dx;
		this.y=y+dy;
	}
	public int distancia(Punto p) {
		int distancia= (int) (Math.sqrt(Math.pow((p.getX()-x),2)+Math.pow((p.getY()-y),2)));
		return distancia;
	}
	public static Punto creaPuntoAleatorio() {
		int x=(int) (Math.random()*200-100);
		int y=(int) (Math.random()*200-100);
		Punto aleatorio= new Punto(x,y);
		return aleatorio;
	}
	public void imprime() {
		System.out.println(x+","+y);
	}
}