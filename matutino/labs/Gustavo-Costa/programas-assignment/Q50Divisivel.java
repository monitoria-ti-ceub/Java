import java.util.Scanner;

public class Q50Divisivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número: ");
        int numero = sc.nextInt();
        System.out.print("Divisor: ");
        int divisor = sc.nextInt();

        if (divisor == 0) {
            System.out.println("Não existe divisão por zero.");
        } else if (numero % divisor == 0) {
            System.out.println(numero + " é divisível por " + divisor);
        } else {
            System.out.println(numero + " não é divisível por " + divisor);
        }

        sc.close();
    }
}
