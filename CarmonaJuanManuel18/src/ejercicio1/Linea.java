package ejercicio1;
/*Define una clase Linea con dos atributos: puntoA y puntoB. Son dos puntos por los que
pasa la línea en un espacio de dos dimensiones. La clase dispondrá de los siguientes métodos:
Linea()
Constructor predeterminado que crea una línea con sus dos puntos como (0,0) y (0,0).
Linea(Punto, Punto)
Constructor que recibe como parámetros dos objetos de la clase Punto, que son
utilizados para inicializar los atributos.
mueveDerecha(double)
Desplaza la línea a la derecha la distancia que se indique.
mueveIzquierda(double)
Desplaza la línea a la izquierda la distancia que se indique.
mueveArriba(double)
Desplaza la línea hacia arriba la distancia que se indique.
mueveAbajo(double)
Desplaza la línea hacia abajo la distancia que se indique.
EscribirLinea()
Método que nos permita mostrar la información de la línea de la siguiente forma:
[puntoA,puntoB]. Por ejemplo: [(0.0,0.0),(1.0,1.0)].
setters y getters.
Juan Manuel Carmona Ruiz
*/
public class Linea {
	
	private Punto puntoA;
	private Punto puntoB;
	
public Linea() {
	puntoA.setXY(0, 0);
	puntoB.setXY(0, 0);
}
public Linea(Punto puntoA,Punto puntoB) {
	this.puntoA=puntoA;
	this.puntoB=puntoB;
}

public void mueveDerecha(int desplaza) {
	if(desplaza>0) {
		puntoA.desplaza(desplaza, 0);
		puntoB.desplaza(desplaza, 0);
	}
}
public void mueveIzquierda(int desplaza) {
	if(desplaza<0) {
		puntoA.desplaza(desplaza, 0);
		puntoB.desplaza(desplaza, 0);
	}
}
public void mueveArriba(int desplaza) {
	if(desplaza>0) {
		puntoA.desplaza(0, desplaza);
		puntoB.desplaza(0, desplaza);
	}
}
public void mueveAbajo(int desplaza) {
	if(desplaza<0) {
		puntoA.desplaza(0, desplaza);
		puntoB.desplaza(0, desplaza);
	}
}
public void escribirLinea() {
		System.out.println(puntoA+","+puntoB);
	}
}