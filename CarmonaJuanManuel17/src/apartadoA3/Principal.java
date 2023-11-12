package apartadoA3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1=new Rectangulo();
		Rectangulo r2=new Rectangulo();
		r1.x1=0;
		r1.y1=0;
		r1.x2=5;
		r1.y2=5;
		r2.x1=7;
		r2.y1=9;
		r2.x2=2;
		r2.y2=3;
		System.out.println("Las coordenadas del primer rectangulo es: ("+r1.x1+","+r1.y1+")("+r1.x2+","+r1.y2+")");
		System.out.println("Las coordenadas del segundo rectangulo es: ("+r2.x1+","+r2.y1+")("+r2.x2+","+r2.y2+")");
		System.out.println("El perimetro del primer rectangulo es: "+perimetro(r1.x1,r1.x2,r1.y1,r1.y2));
		System.out.println("El perimetro del segundo rectangulo es: "+perimetro(r2.x1,r2.x2,r2.y1,r2.y2));
		System.out.println("El area del primer rectangulo es: "+area(r1.x1,r1.x2,r1.y1,r1.y2));
		System.out.println("El area del segundo rectangulo es: "+area(r2.x1,r2.x2,r2.y1,r2.y2));
	}
	public static int perimetro(int x1, int x2,int y1, int y2) {
		int perimetro;
		if(x2<x1) {
			 perimetro=(x1-x2)*2+(y1-y2)*2;
		}else {
			 perimetro=(x2-x1)*2+(y2-y1)*2;
		}		
		return perimetro;
	}
	public static int area(int x1, int x2,int y1, int y2) {
		int area;
		if(x2<x1) {
			 area=(x1-x2)*(y1-y2);
		}else {
			 area=(x2-x1)*(y2-y1);
		}
		return area;
	}
}
