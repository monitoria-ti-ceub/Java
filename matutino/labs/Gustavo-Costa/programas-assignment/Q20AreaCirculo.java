import java.util.Scanner;

public class Q20AreaCirculo {

    static final double PI = 3.14159;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = sc.nextDouble();

        double area = PI * raio * raio;
        System.out.printf("Área do círculo: %.2f\n", area);

        sc.close();
    }
}
