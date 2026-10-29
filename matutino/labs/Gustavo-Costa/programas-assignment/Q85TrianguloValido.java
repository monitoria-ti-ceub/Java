import java.util.Scanner;

public class Q85TrianguloValido {

    static boolean formaTriangulo(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }
        return a < b + c && b < a + c && c < a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lado 1: ");
        double a = sc.nextDouble();
        System.out.print("Lado 2: ");
        double b = sc.nextDouble();
        System.out.print("Lado 3: ");
        double c = sc.nextDouble();

        if (formaTriangulo(a, b, c)) {
            System.out.println("Formam um triângulo válido.");
        } else {
            System.out.println("Não formam um triângulo.");
        }

        sc.close();
    }
}
