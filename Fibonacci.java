public class Fibonacci {

    public static void main(String[] args) {
        int a = 0, b = 1, next;

        System.out.println("Sequência de Fibonacci:");
        for (int i = 0; i < 10; ++i) {
            System.out.print(a + " ");

            next = a + b;
            a = b;
            b = next;
        }
    }
}
