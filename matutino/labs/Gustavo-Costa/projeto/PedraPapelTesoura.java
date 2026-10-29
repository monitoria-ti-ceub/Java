import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};

        System.out.println("Bem-vindo ao jogo Pedra, Papel e Tesoura!");
        System.out.println("Escolha uma opção: 0 - Pedra, 1 - Papel, 2 - Tesoura");

        int escolhaUsuario = -1;
        while (escolhaUsuario < 0 || escolhaUsuario > 2) {
            System.out.print("Digite sua escolha (0, 1 ou 2): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                scanner.next(); // Limpa a entrada inválida
            }
            escolhaUsuario = scanner.nextInt();
            if (escolhaUsuario < 0 || escolhaUsuario > 2) {
                System.out.println("Escolha inválida. Tente novamente.");
            }
        }

        int escolhaComputador = random.nextInt(3);
        System.out.println("Você escolheu: " + opcoes[escolhaUsuario]);
        System.out.println("O computador escolheu: " + opcoes[escolhaComputador]);

        if (escolhaUsuario == escolhaComputador) {
            System.out.println("Empate!");
        } else if ((escolhaUsuario == 0 && escolhaComputador == 2) ||
                   (escolhaUsuario == 1 && escolhaComputador == 0) ||
                   (escolhaUsuario == 2 && escolhaComputador == 1)) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("O computador venceu!");
        }

        scanner.close();
    }
}
