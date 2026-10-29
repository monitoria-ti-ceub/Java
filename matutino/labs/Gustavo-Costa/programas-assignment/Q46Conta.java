import java.util.Scanner;

public class Q46Conta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Saldo inicial: R$ ");
        double saldo = sc.nextDouble();
        System.out.print("Depósito: R$ ");
        double deposito = sc.nextDouble();
        System.out.print("Saque: R$ ");
        double saque = sc.nextDouble();

        saldo = saldo + deposito;

        if (saque > saldo) {
            System.out.println("Saldo insuficiente, o saque não foi feito.");
        } else {
            saldo = saldo - saque;
        }

        System.out.printf("Saldo final: R$ %.2f%n", saldo);

        sc.close();
    }
}
