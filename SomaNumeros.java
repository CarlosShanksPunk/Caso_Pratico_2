import java.util.Scanner;

public class SomaNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero, soma = 0;

        do {
            System.out.print("Digite um número (0 para sair): ");
            numero = scanner.nextInt();

            soma += numero;
        } while (numero != 0);

        System.out.println("A soma dos números digitados é: " + soma);
    }
}
