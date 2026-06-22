package javaapplication10;

/**
 *
 * @author Estudiante
 */
import java.util.Stack;
public class libros {

public class EjemploPila {

    public static void main(String[] args) {
// Crear una pila de tipo string//
   Stack <String> pila = new Stack <>();     
  //inserccion de elemntos push//      

       
        pila.push("Libro 1");
        pila.push("Libro 2");
        pila.push("Libro 3"); 

        
        System.out.println("Elemento en la cima: " + pila.peek());

        
        System.out.println("Elemento eliminado: " + pila.pop());
        System.out.println("Elemento eliminado: " + pila.pop());

        
        System.out.println("Pila actual: " + pila);
    }
}    
}
