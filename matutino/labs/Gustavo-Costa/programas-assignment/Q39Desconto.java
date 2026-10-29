import java.util.Scanner;

public class Q39Desconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = sc.nextDouble();

        double desconto = 0.10; 

        if (valorCompra >= 100) { 
            double valorComDesconto = valorCompra * (1 - desconto);
            System.out.printf("O valor da compra com desconto é: %.2f%n", valorComDesconto);
        } 
        else {
            System.out.printf("O valor da compra não tem desconto. Valor: %.2f%n", valorCompra);
        }
        sc.close();
    }
}