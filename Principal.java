package estructuras;

public class Principal {

	public static void main(String[] args) {
		Pila<String> p = new Pila<>();

		System.out.println("pila: " + p);
		System.out.println("--------------------------------------------");
		
		p.apilar("Rancho");
		p.apilar("Casa");
		p.apilar("Casita");
		p.apilar("Castillo");
		p.apilar("Palacio");
		System.out.println("pila: " + p);
		System.out.println("Tope: " + p.tope());
		System.out.println("cantidad: " + p.cantidad());
		System.out.println("--------------------------------------------");
		
		p.desapilar();
		p.desapilar();
		System.out.println("pila: " + p);
		System.out.println("Tope: " + p.tope());
		System.out.println("cantidad: " + p.cantidad());
		
		
		
		Pila<Integer> pn = new Pila<>();
		pn.apilar(1);
		pn.apilar(10);
		pn.apilar(11);
		pn.apilar(901);
		System.out.println("pila numeros: " + pn);
		
	}

}
