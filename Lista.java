package estructuras;
import Nodo2;

public class Lista {

	private Nodo2 primero;
	
	Lista() {
		primero = null;
	}
	
	
	public int largo() {
		int cont=0;
		Nodo2 actual = this.primero;
		while(actual != null) {
			actual = actual.siguiente;
			cont++;
		}
		
		return cont;
	}
	
	public void agregarAdelante(int n) {
		Nodo2 nuevo = new Nodo2(n);
		nuevo.siguiente = primero;
		primero = nuevo;
		
	}
	
	public void agregarAtras(int n) {
		Nodo2 nuevo = new Nodo2(n);
		if(primero == null) {
			primero = nuevo;
		}else {
			Nodo2 actual = primero;
			while(actual.siguiente != null) {
				actual = actual.siguiente;
			}
			actual.siguiente = nuevo;
		}
	}
	
	
	public void imprimir() {
		System.out.print("[ ");
		Nodo2 actual = primero;
		while(actual != null) {
			System.out.print(actual.elemento+" ");
			actual = actual.siguiente;
		}
		System.out.println("]");
	}
	
	
	public Lista agregarAka(int k) {
		Lista salida = new Lista();		//CREO UNA NUEVA LISTA
		Nodo2 actual = this.primero;	//CREO UN ALIASING DE PRIMERO
		
		while(actual.siguiente != null) {	//MIENTRAS EL SIGUIENTE NO SEA NULL
			if(actual.elemento > k) {		//SI EL ELEMENTO ES MAYOR A K LO AGREGO A SALIDA
				salida.agregarAdelante(actual.elemento);
			}
			actual = actual.siguiente;
		}
		salida.agregarAdelante(k);
		actual = this.primero;
		while(actual != null) {
			if(actual.elemento < k) {
				salida.agregarAdelante(actual.elemento);
			}
			actual = actual.siguiente;
		}
		
		return salida;
	}
	

	public void eliminarMenoresAlPromedio() {
		double promedio = 0;
		int cant = 0;
		Nodo2 actual = this.primero;
		
		while(actual != null) {
			promedio += actual.elemento;
			cant++;
			actual = actual.siguiente;
		}
		promedio = promedio / cant;
		actual = this.primero;	//reinicio actual
		
		while(actual.siguiente != null) {
			if(actual.siguiente.elemento < promedio) {
				actual.siguiente = actual.siguiente.siguiente;
			}
			else {
				actual = actual.siguiente;
			}
		}
		if(this.primero.elemento < promedio) {
			this.primero = this.primero.siguiente;
		}
	}
	
	
	
	
}

	public void eliminarMenoresAlPromedio() {
		int cont = 0;
		double promedio = 0;
		
		Nodo2 actual = this.primero;
		while(actual.siguiente != null) {
			cont++;
			promedio += actual.elemento;
			actual = actual.siguiente;
		}
		promedio = promedio / cont;
		actual = this.primero;
		while(actual.siguiente != null) {
			if(actual.elemento < promedio) {
				actual.siguiente = actual.siguiente.siguiente;
			}
		}
	}
