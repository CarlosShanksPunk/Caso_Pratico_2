public class FibonacciModificado {

    public static void main(String[] args) {
        int a = 0, b = 1, next;

        System.out.println("Sequência de Fibonacci modificada:");
        for (int i = 0; i < 100; ++i) {
            if (a % 4 != 0) {
                System.out.print(a + " ");
            }

            next = a + b;
            a = b;
            b = next;

            if (a > 100) {
                break;
            }
        }
    }
}
