package intro;

import java.util.LinkedList;

public class Pila<T> {
 
	private LinkedList<T> elementos;
	private int cantidad;
	
	Pila() {
		elementos = new LinkedList<>();
		cantidad = 0;
	}
	
	void apilar(T elem) {
		elementos.addFirst(elem);
		cantidad++;
	}
	
	T desapilar() {
		cantidad--;
		return elementos.removeFirst();
	}
	
	T tope() {
		return elementos.getFirst();
	}
	
	int cantidad() {
		return cantidad;
	}
	
	public String toString() {
		return elementos.toString();
	}
	
}
