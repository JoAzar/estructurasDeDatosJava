package estructuras;

public class Tupla<T1,T2> {
	private T1 x;
	private T2 y;
	
	Tupla(T1 x, T2 y) {
		establecerX(x);
		establecerY(y);
	}
	
	void establecerX(T1 x) {
		this.x = x;
	}
	
	void establecerY(T2 y) {
		this.y = y;
	}
	
	T1 obtenerX() {
		return x;
	}
	
	T2 obtenerY() {
		return y;
	}
	
	String sumar() {

		if(x instanceof Number && y instanceof Number) {
			int res = ((Number) x).intValue() + ((Number) y).intValue();
			return String.valueOf(res);
		}else{
			return "Los tipos de datos no son válidos para la suma";
		}
		
	}
	
	public String toString() {
		return "[" + x + " ; " + y + " ]";
	}
}
