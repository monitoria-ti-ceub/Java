import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        // O método main está limpo pra construir passo a passo!
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Escolha a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = 0;
        boolean operacaoValida = true;
        switch (operacao) {
            case '+':
                resultado = somar(num1, num2);
                break;
            case '-':
                resultado = subtrair(num1, num2);
                break;
            case '*':
                resultado = multiplicar(num1, num2);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Erro: Não é possível dividir por zero!");
                    operacaoValida = false;
                } else {
                    resultado = dividir(num1, num2);
                }
                break;
            default:
                System.out.println("Operação inválida!");
                operacaoValida = false;
        }
        if (operacaoValida) {
            System.out.println("Resultado: " + resultado);
        }
        scanner.close();
    }

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não permitida!");
        }
        return a / b;
    }
}
