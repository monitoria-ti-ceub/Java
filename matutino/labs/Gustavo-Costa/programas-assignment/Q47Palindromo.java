import java.util.Scanner;

public class Q47Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número inteiro positivo: ");
        int numero = sc.nextInt();

        int n = numero;
        int invertido = 0;
        while (n > 0) {
            invertido = invertido * 10 + n % 10;
            n = n / 10;
        }

        if (numero == invertido) {
            System.out.println(numero + " é palíndromo.");
        } else {
            System.out.println(numero + " não é palíndromo.");
        }

        sc.close();
    }
}
