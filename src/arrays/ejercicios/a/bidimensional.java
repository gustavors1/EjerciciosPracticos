package arrays.ejercicios.a;

public class bidimensional {
    public static void main(String[] args) {
        // Se crea un array de enteros con dos dimensiones de 3x3
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Recorremos el array mostrando la posición y el valor de cada elemento
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Posisición [" + i + "][" + j + "] " + matriz[i][j]);
            }
        }
    }
}
