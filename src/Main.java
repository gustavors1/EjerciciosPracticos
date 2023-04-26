import java.lang.System;

public class Main {
    public static void main(String[] args) {
        String texto = "hola mundo";
        String resultado = reverse(texto);
        System.out.println(resultado); // imprime "odnum aloh"
    }

    public static String reverse (String texto){
        String resultado = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            resultado += texto.charAt(i);
        }
        return resultado;
    }
}