import java.util.Scanner;

public class Q60Mmc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Segundo número: ");
        int b = sc.nextInt();

        if (a <= 0 || b <= 0) {
            System.out.println("Os dois números precisam ser positivos.");
        } else {
            // MDC pelo algoritmo de Euclides
            int x = a;
            int y = b;
            while (y != 0) {
                int resto = x % y;
                x = y;
                y = resto;
            }
            int mdc = x;

            int mmc = a / mdc * b;

            System.out.println("MDC(" + a + ", " + b + ") = " + mdc);
            System.out.println("MMC(" + a + ", " + b + ") = " + mmc);
        }

        sc.close();
    }
}
