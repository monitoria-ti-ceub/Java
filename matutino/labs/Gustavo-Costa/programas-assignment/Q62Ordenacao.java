import java.util.Scanner;

public class Q62Ordenacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números? ");
        int quantidade = sc.nextInt();

        if (quantidade < 2) {
            System.out.println("Digite pelo menos 2 números.");
        } else {
            boolean crescente = true;
            boolean decrescente = true;

            System.out.print("Número 1: ");
            int anterior = sc.nextInt();

            for (int i = 2; i <= quantidade; i++) {
                System.out.print("Número " + i + ": ");
                int atual = sc.nextInt();

                if (atual <= anterior) {
                    crescente = false;
                }
                if (atual >= anterior) {
                    decrescente = false;
                }
                anterior = atual;
            }

            if (crescente) {
                System.out.println("A sequência está em ordem crescente.");
            } else if (decrescente) {
                System.out.println("A sequência está em ordem decrescente.");
            } else {
                System.out.println("A sequência não está ordenada.");
            }
        }

        sc.close();
    }
}
