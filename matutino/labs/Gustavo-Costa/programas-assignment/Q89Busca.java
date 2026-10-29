import java.util.Scanner;

public class Q89Busca {

    static int primeiroNegativo(int[] v) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] < 0) {
                return i;
            }
        }
        return -1;
    }

    static int primeiroAcimaDe(int[] v, int limite) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] > limite) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = {12, 5, 30, -4, 18, -7};

        System.out.print("Vetor:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(" " + numeros[i]);
        }
        System.out.println();

        System.out.println("Posição do primeiro negativo: " + primeiroNegativo(numeros));

        System.out.print("Limite: ");
        int limite = sc.nextInt();
        System.out.println("Posição do primeiro valor acima de " + limite + ": " + primeiroAcimaDe(numeros, limite));

        sc.close();
    }
}
