import java.util.Scanner;

public class Q55Bhaskara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("Com a = 0 a equação não é do segundo grau.");
        } else {
            double delta = b * b - 4 * a * c;
            System.out.println("Delta: " + delta);

            if (delta > 0) {
                System.out.println("Duas raízes reais e diferentes.");
            } else if (delta == 0) {
                System.out.println("Duas raízes reais e iguais.");
            } else {
                System.out.println("Não tem raízes reais.");
            }
        }

        sc.close();
    }
}
