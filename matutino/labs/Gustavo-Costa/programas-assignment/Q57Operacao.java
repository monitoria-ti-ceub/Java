import java.util.Scanner;

public class Q57Operacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Código da operação (+, -, * ou /): ");
        String operacao = sc.next();
        System.out.print("Primeiro valor: ");
        double a = sc.nextDouble();
        System.out.print("Segundo valor: ");
        double b = sc.nextDouble();

        if (operacao.equals("+")) {
            System.out.println("Resultado: " + (a + b));
        } else if (operacao.equals("-")) {
            System.out.println("Resultado: " + (a - b));
        } else if (operacao.equals("*")) {
            System.out.println("Resultado: " + (a * b));
        } else if (operacao.equals("/")) {
            if (b == 0) {
                System.out.println("Não existe divisão por zero.");
            } else {
                System.out.println("Resultado: " + (a / b));
            }
        } else {
            System.out.println("Código de operação inválido.");
        }

        sc.close();
    }
}
