package javaapplication10;
import java.util.ArrayList;

public class Estudiantes {
    public static void main(String[]args){
        ArrayList<String>estudiantes = new ArrayList<>();
        estudiantes.add("Sebi");
        estudiantes.add("Carlitos");
        estudiantes.add("Mateo");
        estudiantes.add("Andres");
        estudiantes.add("Luis");
   if(estudiantes.contains("carlitos")) 
        
         System.out.println("Estudiante Encontrado");
       
        System.out.println("Lista de estudiantes");
        for (String item : estudiantes){
            System.out.println(item);
            
        }
    }
}
 