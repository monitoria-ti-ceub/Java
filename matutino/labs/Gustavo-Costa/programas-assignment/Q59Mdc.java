import java.util.Scanner;

public class Q59Mdc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Segundo número: ");
        int b = sc.nextInt();

        if (a <= 0 || b <= 0) {
            System.out.println("Os dois números precisam ser positivos.");
        } else {
            int x = a;
            int y = b;
            while (y != 0) {
                int resto = x % y;
                x = y;
                y = resto;
            }
            System.out.println("MDC(" + a + ", " + b + ") = " + x);
        }

        sc.close();
    }
}
