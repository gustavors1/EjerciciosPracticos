package arrays.ejercicios.a;

public class DividePorCero {
    public static void main(String[] args) {
        try {
            new DividePorCero();
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }
    }
    public static void DividePorCero() throws ArithmeticException {
        int a = 1;
        int b = 0;
        int c = a/b;
    }
}
