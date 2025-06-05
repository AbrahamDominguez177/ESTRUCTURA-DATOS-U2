package EVA2;

public class EVA2_3_LINKED_LIST {

    public static void main(String[] args) {
        
       /* int datos[] = new int[10000];
        long ini = System.nanoTime();
        for (int i = 0; i < 10000; i++){
            datos[i] = (int)(Math.random() * 1000);
        }
        long fin = System.nanoTime();
        long tiempo = fin - ini;
        System.out.println("Tiempo arreglo: " + tiempo);
        
        Lista lista = new Lista();
        long ini1 = System.nanoTime();
        //O(N2)
        for (int i = 0; i < 10000; i++){
            lista.add((int)(Math.random() * 1000));
        }
        long fin1 = System.nanoTime();
        long tiempo1 = fin1 - ini1;
        System.out.println("Tiempo arreglo: " + tiempo1);
        System.out.println("Tamaño de la lista: " + lista.size()); */
       Lista lista = new Lista();
       lista.add(100);
       lista.add(200);
       lista.add(300);
       lista.add(400);
       lista.add(500);
       lista.printList();
        System.out.println("");
        System.out.println("Cantidad de nodos " + lista.size());
        try{
            lista.inserAt(3, 1);
        }
    }
}
