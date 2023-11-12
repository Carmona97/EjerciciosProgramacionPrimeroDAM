package ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class ClaseLiteraria {
	private String titulo;
	HashSet<String >conjunto1=new HashSet<String>();
	public ClaseLiteraria(String titulo,Set<String >conjunto1) {
		this.titulo=titulo;
	this.conjunto1=(HashSet<String>) conjunto1;
		
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public HashSet<String> getConjunto1() {
		return conjunto1;
	}
	public void setConjunto1(HashSet<String> conjunto1) {
		this.conjunto1 = conjunto1;
	}
	@Override
	public String toString() {
		return "ClaseLiteraria [titulo=" + titulo + ", conjunto1=" + conjunto1 + "]";
	}
	
	
}
