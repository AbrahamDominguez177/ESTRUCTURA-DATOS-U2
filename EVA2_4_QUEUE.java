package EVA2;

public class EVA2_4_QUEUE {

    public static void main(String[] args) {
        MyQueue miqueue = new MyQueue();
        miqueue.AgregarNodo(100);
        miqueue.AgregarNodo(200);
        miqueue.AgregarNodo(300);
        miqueue.AgregarNodo(400);
        miqueue.AgregarNodo(500);
        miqueue.imprimir();
        try{
        miqueue.peek();    
        System.out.println(miqueue.peek());
        miqueue.poll();
        miqueue.imprimir();
        System.out.println(miqueue.poll());
        miqueue.poll();
        miqueue.imprimir();
        System.out.println(miqueue.poll());
        miqueue.poll();
        miqueue.imprimir();
        System.out.println(miqueue.poll());
        miqueue.poll();
        miqueue.imprimir();
        System.out.println(miqueue.poll());
        miqueue.poll();
        miqueue.imprimir();
        System.out.println(miqueue.poll());
               
        }catch(Exception e){
            
        }
    }
}