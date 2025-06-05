package EVA2;

public class EVA2_9_TIPOS_GENERICOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CLASES PARA LOS TIPOS DE DATOS GENERICOS
		// int = Integer
		// double = Double
		//float = Float
		Nodo<String> nodo = new Nodo();
		nodo.setValor("Hola mundo!!!");
		System.out.println(nodo.getValor());
		Nodo<int> nodo2 = new Nodo();
		nodo2.setValor("4093460309");
		System.out.println(nodo2.getValor());
	}

}

class Nodo<T> { //LOS TIPOS DE DATOS GENERICOS NO FUNCIONAN CON DATOS PRIMITIVOS
	private T valor;
	private Nodo siguiente;
	private Nodo previo;
	
	public Nodo() {
		siguiente = null;
		previo = null; 
	}
	
	public Nodo getSiguiente(); {
		
	}
	
}