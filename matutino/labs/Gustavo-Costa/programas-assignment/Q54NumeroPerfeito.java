import java.util.Scanner;

public class Q54NumeroPerfeito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número inteiro: ");
        int numero = sc.nextInt();

        int soma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                soma = soma + i;
            }
        }

        System.out.println("Soma dos divisores próprios: " + soma);
        if (numero > 0 && soma == numero) {
            System.out.println(numero + " é igual à soma dos seus divisores (número perfeito).");
        } else {
            System.out.println(numero + " não é igual à soma dos seus divisores.");
        }

        sc.close();
    }
}
