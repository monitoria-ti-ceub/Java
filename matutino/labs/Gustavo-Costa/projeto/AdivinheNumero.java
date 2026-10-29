import java.util.Scanner;
import java.util.Random;

public class AdivinheNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int tentativas = 0;
        int palpite;

        System.out.println("Bem-vindo ao jogo Adivinhe o Número!");
        System.out.println("Tente adivinhar o número secreto entre 1 e 100.");

        do {
            System.out.print("Digite seu palpite: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                scanner.next(); // Limpa a entrada inválida
            }
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("Muito baixo! Tente novamente.");
            } else if (palpite > numeroSecreto) {
                System.out.println("Muito alto! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número secreto em " + tentativas + " tentativas.");
            }
        } while (palpite != numeroSecreto);

        scanner.close();
    }
}











