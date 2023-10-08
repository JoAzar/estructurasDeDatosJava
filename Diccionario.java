package estructuras;

import java.util.ArrayList;

public class Diccionario<C,V> {
	
	private ArrayList<Tupla<C,V>> entradas;
	
	Diccionario() {
		entradas = new ArrayList<>();
	}
	
	boolean agregar (C c, V v){
		if (pertenece(c)) {
			buscarEntrada(c).establecerY(v);
			return false;
		}
		return entradas.add(new Tupla<>(c,v));
	}

	V obtener(C c) {	

		if (!pertenece(c))
			return null;	
		return buscarEntrada(c).obtenerY();
	}
	
	boolean pertenece(C c){
		return buscarEntrada(c) != null;
	}


	boolean eliminar (C c) {
		if (!pertenece(c)) {
			return false;
		}
		return entradas.remove(buscarEntrada(c));
	}
	
	private Tupla<C,V> buscarEntrada(C c) {
		Tupla<C,V> ret = null;
		for(Tupla<C,V> entrada: entradas)
			if (entrada.obtenerX().equals(c)) {
				ret = entrada;
			}
		return ret;
	}
	
	int tamanio() {
		return entradas.size();
	}
	
	boolean estaVacio() {
		return tamanio() == 0;
	}
	
}
