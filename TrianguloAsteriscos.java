import java.util.Scanner;

public class TrianguloAsteriscos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura do triângulo: ");
        int altura = scanner.nextInt();

        for (int i = 1; i <= altura; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
