package arrays.ejercicios.a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class EjemploArrayLinkedLists {
    public static void main(String[] args) {
        // Creamos el ArrayList de tipo String con 4 elementos
        List<String> miArrayList = new ArrayList<>(4);
        miArrayList.add("elemento 1");
        miArrayList.add("elemento 2");
        miArrayList.add("elemento 3");
        miArrayList.add("elemento 4");

        //Copiamos el ArrayList en una LinkedList
        List<String> miLinkedList = new LinkedList<>(miArrayList);

        //Recorremos ambos monstrando el valor de cada elemento
        System.out.println("elementos del ArrayList");
        for (String elemento : miArrayList) {
            System.out.println(elemento);
        }

        System.out.println("elementos de la LinkedList");
        for (String elemento : miLinkedList) {
            System.out.println(elemento);
        }
    }
}
