import java.util.Scanner;

public class Q72Mediana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de números: ");
        int quantidade = sc.nextInt();

        if (quantidade <= 0) {
            System.out.println("A quantidade precisa ser maior que zero.");
        } else {
            double[] numeros = new double[quantidade];
            for (int i = 0; i < quantidade; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                numeros[i] = sc.nextDouble();
            }

            // ordena com bubble sort
            for (int i = 0; i < quantidade - 1; i++) {
                for (int j = 0; j < quantidade - 1 - i; j++) {
                    if (numeros[j] > numeros[j + 1]) {
                        double aux = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = aux;
                    }
                }
            }

            double mediana;
            if (quantidade % 2 == 1) {
                mediana = numeros[quantidade / 2];
            } else {
                mediana = (numeros[quantidade / 2 - 1] + numeros[quantidade / 2]) / 2;
            }

            System.out.print("Ordenados:");
            for (int i = 0; i < quantidade; i++) {
                System.out.print(" " + numeros[i]);
            }
            System.out.println();
            System.out.println("Mediana: " + mediana);
        }

        sc.close();
    }
}
