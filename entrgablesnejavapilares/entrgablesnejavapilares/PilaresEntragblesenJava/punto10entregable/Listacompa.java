import java.util.LinkedList;
import java.util.Queue;

public class Listacompa {

    public static void main(String[] args) {

 // definir comando para la cola       
    Queue<String>cola = new LinkedList();
// Agregar cola de elementos con nombre 
    
    cola.offer("Pedro");
    cola.offer("Susana");
    cola.offer("Javier");
    cola.offer("Alfonzo");
    cola.offer("Luis");

    System.out.println("El primer elemento de la cola : "+cola.peek( ));
    System.out.println("La Lista de elemento de la cola:   "+cola);
    System.out.println("El elemnto borrado es :"+cola.poll());
    
    }
}

        
