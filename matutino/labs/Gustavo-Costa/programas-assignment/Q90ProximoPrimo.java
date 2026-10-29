import java.util.Scanner;

public class Q90ProximoPrimo {

    static boolean ehPrimo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int proximoPrimo(int n) {
        int candidato = n + 1;
        while (!ehPrimo(candidato)) {
            candidato++;
        }
        return candidato;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número inteiro: ");
        int numero = sc.nextInt();

        System.out.println("Próximo primo depois de " + numero + ": " + proximoPrimo(numero));

        sc.close();
    }
}
