package ejercicio7;
/*Escribe un programa que pida el ancho y alto de un rectángulo y muestre por pantalla su área y
 * su perímetro. Implementa y utiliza las funciones:
 * double perimetroRectangulo(double ancho, double alto) devuelve el perímetro
 * double areaRectangulo(double ancho, double alto) devuelve el área
 * Juan Manuel Carmona Ruiz
 * 15/11/22*/
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce el ancho del rectangulo");
		double ancho=scn.nextDouble();
		System.out.println("Introduce el alto del rectangulo");
		double alto=scn.nextDouble();
		System.out.println("El perimetro del rectangulo es: "+perimetroRectangulo(ancho,alto)+"\nEl area del rectangulo es: "+areaRectangulo(ancho,alto));
	}

	public static double perimetroRectangulo(double ancho, double alto) {
		double perimetro=ancho*2+alto*2;
		return perimetro;
	}
	public static double areaRectangulo(double ancho, double alto) {
		double area=ancho*alto;
		return area;
	}
}
