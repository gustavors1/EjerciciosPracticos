package arrays.ejercicios.a;
import java.util.Vector;
public class EjemploVector {
    public static void main(String[] args) {
        // Se crea un Vector de tipo String
        Vector<String> miVector = new Vector<>();

        // Añadimos 5 elementos al Vector
        miVector.add("elemento 1");
        miVector.add("elemento 2");
        miVector.add("elemento 3");
        miVector.add("elemento 4");
        miVector.add("elemento 5");

        //Mostramos primero el vector original
        System.out.println("Vector original: " + miVector);

        //Ahora elemininamos el segundo y el tercer elemento del vector
        miVector.remove(2);
        miVector.remove(3);

        //Mostramos el vector resultante
        System.out.println("Vector resultante: " + miVector);
    }
}
