import java.util.Scanner;

public class Q70Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número inteiro positivo: ");
        int numero = sc.nextInt();

        long a = 0;
        long b = 1;
        while (a < numero) {
            long proximo = a + b;
            a = b;
            b = proximo;
        }

        if (a == numero) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }

        sc.close();
    }
}
