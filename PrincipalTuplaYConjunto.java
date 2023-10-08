package estructuras;
import java.util.*;

public class PrincipalTuplaYConjunto {

	public static void main(String[] args) {

//		Conjunto<String> c = new Conjunto<>();
//		Conjunto<String> c2 = new Conjunto<>();
//		
//		
//		c.agregar("chancho");
//		c.agregar("cabra");
//		c.agregar("gallina");
//		c.agregar("caballo");
//		c.agregar("conejo");
//		
//		c2.agregar("perro");
//		c2.agregar("gato");
//		c2.agregar("caballo");
//		c2.agregar("conejo");
//		
//		System.out.println("conjunto 1: " + c);
//		System.out.println("conjunto 2: " + c2);
//		System.out.println("cant: " + c.tamanio());
//		System.out.println("pertenece avion? " + c.pertenece("avion"));
//		System.out.println("pertenece 4x4? " + c.pertenece("4x4"));
//		
//		System.out.println("Dame uno: "+c.dameUno());
//		System.out.println("Dame uno: "+c.dameUno());
//		System.out.println("Dame uno: "+c.dameUno());
//		
//		
//		c.interseccion1(c2);
//		System.out.println("Conjunto Interseccion: "+c);
//		c.union1(c2);
//		System.out.println("Conjunto Union: "+c);
//		
//		System.out.println("\n");
		//mainTupla();
		mainSubasta();
		
		
	}

	private static void mainSubasta() {
		Scanner scan = new Scanner(System.in);
		Diccionario<Integer, Integer> subasta = new Diccionario<>();
		System.out.println("Ingrese el código del producto: ");
		int codProductoIngreso = scan.nextInt();
		System.out.println("Codigo de producto ingresado: "+codProductoIngreso);
		subasta.agregar(0, 1000);
		subasta.agregar(1, 2000);
		subasta.agregar(2, 3000);
		
		System.out.println("valor de producto n°"+codProductoIngreso+" : "+"$"+subasta.obtener(codProductoIngreso));
		
		System.out.println("Ingrese el código del producto que desea rematar: ");
		int productoVendido = scan.nextInt();
		System.out.println("código del producto rematado: "+productoVendido);
		subasta.eliminar(productoVendido);
		
		if(!subasta.pertenece(productoVendido)) {
			System.out.println("El producto que usted busca ya fué vendido");
		}
	}

//	private static void mainTupla() {
//		Tupla<String, Integer> t1 = new Tupla<>("proceso", 1);
//		System.out.println("Tupla de proceso con prioridad: " + t1);
//		
//		Tupla<Integer, Integer> t2 = new Tupla<>(6, 1);
//		System.out.println("Tupla enteros: " + t2);
//		
//		Tupla<Tupla<String, Integer>, Tupla<Integer,Integer>> tt = new Tupla<>(t1,t2);
//		System.out.println("Tupla enteros: " + tt);
//		
//		Tupla<Integer, Integer> tupla3 = new Tupla<>(2, 5);
//		String res = tupla3.sumar();
//		System.out.println("tupla de enteros: "+tupla3);
//		System.out.println("resultado de la suma de x e y: "+res);
//	}

}
