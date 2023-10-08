package intro;

import java.util.LinkedList;

public class PilaString {
 
	private LinkedList<String> elementos;
	private int cantidad;
	
	PilaString() {
		elementos = new LinkedList<>();
		cantidad = 0;
	}
	
	void apilar(String elem) {
		elementos.addFirst(elem);
		cantidad++;
	}
	
	String desapilar() {
		cantidad--;
		return elementos.removeFirst();
	}
	
	String tope() {
		return elementos.getFirst();
	}
	
	int cantidad() {
		return cantidad;
	}
	
	public String toString() {
		return elementos.toString();
	}
	
}
