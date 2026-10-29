import java.util.Scanner;

public class Q71PrimeiroDivisivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Começar a sequência em: ");
        int inicio = sc.nextInt();
        System.out.print("Primeiro valor: ");
        int a = sc.nextInt();
        System.out.print("Segundo valor: ");
        int b = sc.nextInt();
        System.out.print("Terceiro valor: ");
        int c = sc.nextInt();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Os três valores precisam ser positivos.");
        } else {
            int numero = inicio;
            while (!(numero % a == 0 && numero % b == 0 && numero % c == 0)) {
                numero++;
            }
            System.out.println("Primeiro número divisível por " + a + ", " + b + " e " + c + ": " + numero);
        }

        sc.close();
    }
}
