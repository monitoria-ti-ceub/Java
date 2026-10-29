import java.util.Scanner;

public class Q84AlgarismosPares {

    static int contarAlgarismosPares(int numero) {
        if (numero < 0) {
            numero = -numero;
        }

        int pares = 0;
        do {
            int algarismo = numero % 10;
            if (algarismo % 2 == 0) {
                pares++;
            }
            numero = numero / 10;
        } while (numero > 0);

        return pares;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número inteiro: ");
        int numero = sc.nextInt();

        System.out.println("Algarismos pares: " + contarAlgarismosPares(numero));

        sc.close();
    }
}
