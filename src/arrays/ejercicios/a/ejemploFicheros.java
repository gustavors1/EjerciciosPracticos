package arrays.ejercicios.a;
import java.io.*;
public class ejemploFicheros {
    public static void main(String[] args) {
        String fileIn = "archivoEntrada.txt";
        String fileOut = "archivoSalida.txt";
        copiarArchivo(fileIn, fileOut);
    }
    public static void copiarArchivo(String fileIn, String fileOut) {
        try (InputStream inputStream = new FileInputStream(fileIn);
             PrintStream outputStream = new PrintStream(new FileOutputStream(fileOut))) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
