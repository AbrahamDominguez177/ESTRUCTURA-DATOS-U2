package EVA2;

public class EVA2_REFERENCIAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Ejemplo obj1 = new Ejemplo();
     obj1.valor = 100;
     obj1.siguiente = new Ejemplo();
     obj1.siguiente.valor = 200;
     obj1.siguiente.siguiente = new Ejemplo();
     obj1.siguiente.valor = 300;
     obj1.siguiente.siguiente.siguiente = null;
     
     Ejemplo temp = obj1;
     while(temp != null) {
    	 System.out.print("[" + temp.valor + "]");
    	 temp = temp.siguiente;
     }
	}

}

class Ejemplo{
	int valor;
	Ejemplo siguiente;
}