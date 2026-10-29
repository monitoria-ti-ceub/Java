import java.util.Scanner;

public class Q53Frete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Peso da encomenda (kg): ");
        double peso = sc.nextDouble();
        System.out.print("Distância (km): ");
        double distancia = sc.nextDouble();

        if (peso <= 0 || distancia <= 0) {
            System.out.println("Peso e distância precisam ser maiores que zero.");
        } else {
            double tarifa;
            if (peso <= 1) {
                tarifa = 15;
            } else if (peso <= 5) {
                tarifa = 25;
            } else if (peso <= 10) {
                tarifa = 40;
            } else {
                tarifa = 40 + (peso - 10) * 5;
            }

            double multiplicador;
            if (distancia <= 100) {
                multiplicador = 1.0;
            } else if (distancia <= 500) {
                multiplicador = 1.5;
            } else {
                multiplicador = 2.0;
            }

            double custo = tarifa * multiplicador;

            System.out.printf("Tarifa pelo peso: R$ %.2f%n", tarifa);
            System.out.println("Multiplicador da distância: " + multiplicador);
            System.out.printf("Custo do frete: R$ %.2f%n", custo);
        }

        sc.close();
    }
}
