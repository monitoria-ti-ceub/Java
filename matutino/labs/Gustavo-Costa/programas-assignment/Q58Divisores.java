import java.util.Scanner;

public class Q58Divisores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número inteiro positivo: ");
        int numero = sc.nextInt();

        if (numero <= 0) {
            System.out.println("O número precisa ser positivo.");
        } else {
            System.out.print("Divisores de " + numero + ":");
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    System.out.print(" " + i);
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
