package estructuras;

import java.util.ArrayList;
import java.util.Iterator;

public class Conjunto<T> {

	private ArrayList<T> elems;
	private int cont;
	
	Conjunto() {
		elems = new ArrayList<>();
		cont = 0;
	}

	int tamanio() {
		return elems.size();
	}

	boolean agregar(T t) {
		if (pertenece(t))
			return false;
		return elems.add(t);
	}

	boolean pertenece(T t) {
		return elems.contains(t);
	}

	boolean quitar(T t) {
		if (pertenece(t))
			return elems.remove(t);

		return false;
	}

	T dameUno() {
		T elemento = elems.get(cont);
		cont++;
		if(cont >= tamanio()) {
			cont = 0;
		}
		return elemento;
		
	}
	
	void union1(Conjunto<T> c){ // union1: Destructiva
		Iterator<T> iteratorC = c.elems.iterator();
	    while (iteratorC.hasNext()) {
	        T elemento = iteratorC.next();
	        agregar(elemento);
	    }
	}
	
	Conjunto<T> union2(Conjunto<T> c){ // union2: No debe tener Aliasing!
		throw new RuntimeException("Implementar");
	}
	
	void interseccion1(Conjunto<T> c){ // interseccion1: Destructiva
		Iterator<T> iteratorC = c.elems.iterator();
		while(iteratorC.hasNext()) {
			T elemento = iteratorC.next();
			if(pertenece(elemento)) {
				agregar(elemento);
			}
		}
	}
	Conjunto<T> interseccion2(Conjunto<T> c){ //interseccion2: No debe tener Aliasing!
		throw new RuntimeException("Implementar");
	}
	
	@Override
	public String toString() {
		return elems.toString();
	}

}
