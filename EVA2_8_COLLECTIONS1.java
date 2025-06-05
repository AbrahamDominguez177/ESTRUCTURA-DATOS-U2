package EVA2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class EVA2_8_COLLECTIONS1 {

	public static void main(String[] args) {
		LinkedList<Integer> miLista = new LinkedList();
		miLista.add(100);//0
		miLista.add(200);//1
		miLista.add(300);//2
		miLista.add(400);//3
		
		//miLista.remove(3);
		System.out.println(miLista);
		miLista.add(2, 9999999);
		System.out.println(miLista);
		miLista.remove(3);
		System.out.println(miLista);
		
		System.out.println("ARRAYLIST");
		ArrayList<String> miArrayList;
        miArrayList.add("kdg");
		System.out.println(miArrayList);
		for (int i = 0; i < miArrayList.size(); i++) {
			System.out.print("[" + miArrayList.get(i) + "]");
		}
		//QUEUES
		System.out.println("");
		System.out.println("UEUES");
		Queue<Integer> myQueue = new LinkedList();
		myQueue.add(100);
		myQueue.add(200);
		myQueue.add(400);
		myQueue.add(300);
		System.out.println(myQueue.peek());
		//STACK
		System.out.println("STACK");
		Stack<Integer> stack = new Stack();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		stack.push(500);
		System.out.println("CIMA:" + stack.pop());
		System.out.println(stack);
		System.out.println("CIMA:" + stack.peek());
		System.out.println(stack);
		//CONJUNTOS
		//SET
		HashSet<String> conjunto = new HashSet();
		conjunto.add("Rojo");
		conjunto.add("verde");
		conjunto.add("Amarillo");
		conjunto.add("Azul");
		conjunto.add("Rojo"); //NO ACEPTA ELEMENTOS REPETIDOS
		System.out.println(conjunto);
		//MAPAS (MAPS)
		Map<String, Integer> mapa = new HashMap();
		mapa.put("LUNES", 1);
		mapa.put("MARTES", 2);
		mapa.put("MIERCOLES", 3);
		mapa.put("JUEVES", 4);
		mapa.put("VIERNES", 5);
		mapa.put("SABADO", 6);
		mapa.put("DOMINGO", 7);
		System.out.println(mapa.get("LUNES"));
		System.out.println(mapa);
	}

}
