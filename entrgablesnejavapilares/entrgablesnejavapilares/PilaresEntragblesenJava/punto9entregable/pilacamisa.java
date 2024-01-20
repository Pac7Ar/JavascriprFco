
import java.util.Stack;

class Camisa{ 


public static void main(String[] args) {

    Stack<String>pila = new Stack<String>();

    System.out.println(" Lista de la Pila :"+pila);
    System.out.println("Esta vacia:  "+pila.isEmpty());

    // crea una pila
     
    pila.push("Camisa verde");
    pila.push("Camisa azul");
    pila.push("Camisa Morada");
    pila.push("Camisa Blanca");

    //recorrido 

    for(String pilita:pilita){
        System.out.println(pila);

    }
    //mostrar

    System.out.println("La pila de camisas es : "+pila);     
    
    System.out.println("pila vacia:  "+(pila.isEmpty()));  
    
    System.out.println("Pila ")+pila.pop();
    System.out.println("Esta es la camisa 3 : "+pila.search(3));
    System.out.println("El Ultimo agregado"+pila.peek());


}
    
    
    
}




    
