import java.util.Scanner;

public class Q51Ordem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        double a = sc.nextDouble();
        System.out.print("Segundo número: ");
        double b = sc.nextDouble();
        System.out.print("Terceiro número: ");
        double c = sc.nextDouble();

        if (a < b && b < c) {
            System.out.println("Ordem crescente.");
        } else if (a <= b && b <= c) {
            System.out.println("Ordem não decrescente (tem valores repetidos).");
        } else if (a > b && b > c) {
            System.out.println("Ordem decrescente.");
        } else {
            System.out.println("Não está em nenhuma das três ordens.");
        }

        sc.close();
    }
}
