package arrays.ejercicios.a;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        //Rellenamos el ArrayList con los números del 1 al 10
        for (int i = 1; i < 10; i++) {
            numeros.add(i);
        }
        //Eliminamos los numeros pares
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 == 0) {
            numeros.remove(i);
            i--;} //Es importante tener en cuenta que al eliminar elementos de un ArrayList
            // mientras se recorre con un bucle for, debemos decrementar el índice si se elimina un elemento
            // para evitar saltar por encima del siguiente elemento.
            // En este ejemplo, lo hacemos mediante la sentencia i-- después de eliminar un elemento.
        }
        //Mostramos el ArrayList final
        for (int i = 0; i < numeros.size(); i++){
            System.out.println(numeros.get(i));
        }
    }
}
