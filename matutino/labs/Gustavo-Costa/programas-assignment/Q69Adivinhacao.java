import java.util.Random;
import java.util.Scanner;

public class Q69Adivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secreto = random.nextInt(100) + 1;
        int[] historico = new int[100];
        int tentativas = 0;
        int palpite = 0;

        System.out.println("Adivinhe o número entre 1 e 100.");

        while (palpite != secreto && tentativas < historico.length) {
            System.out.print("Seu palpite: ");
            palpite = sc.nextInt();

            historico[tentativas] = palpite;
            tentativas++;

            if (palpite < secreto) {
                System.out.println("O número secreto é maior.");
            } else if (palpite > secreto) {
                System.out.println("O número secreto é menor.");
            } else {
                System.out.println("Acertou!");
            }
        }

        System.out.println("Tentativas: " + tentativas);
        System.out.print("Histórico dos palpites:");
        for (int i = 0; i < tentativas; i++) {
            System.out.print(" " + historico[i]);
        }
        System.out.println();

        sc.close();
    }
}
