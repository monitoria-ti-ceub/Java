import java.util.Scanner;

public class Q49Parcelas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da compra: R$ ");
        double valor = sc.nextDouble();
        System.out.print("Quantidade de parcelas: ");
        int parcelas = sc.nextInt();

        if (parcelas <= 0) {
            System.out.println("A quantidade de parcelas precisa ser maior que zero.");
        } else {
            // trabalha em centavos para não ter erro de arredondamento
            int totalCentavos = (int) Math.round(valor * 100);
            int base = totalCentavos / parcelas;
            int resto = totalCentavos % parcelas;
            int soma = 0;

            for (int i = 1; i <= parcelas; i++) {
                int parcela = base;
                if (i <= resto) {
                    parcela = parcela + 1;
                }
                soma = soma + parcela;
                System.out.printf("Parcela %d: R$ %.2f%n", i, parcela / 100.0);
            }

            System.out.printf("Soma das parcelas: R$ %.2f%n", soma / 100.0);
            System.out.printf("Total da compra: R$ %.2f%n", totalCentavos / 100.0);

            if (soma == totalCentavos) {
                System.out.println("A soma das parcelas é igual ao total.");
            }
        }

        sc.close();
    }
}
