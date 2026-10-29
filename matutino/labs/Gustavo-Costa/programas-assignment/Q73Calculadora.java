import java.util.Scanner;

public class Q73Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int realizadas = 0;
        int invalidas = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.print("Operação (+, -, *, / ou sair): ");
            String operacao = sc.next();

            if (operacao.equals("sair")) {
                continuar = false;
            } else if (!(operacao.equals("+") || operacao.equals("-") || operacao.equals("*") || operacao.equals("/"))) {
                System.out.println("Operação inválida.");
                invalidas++;
            } else {
                System.out.print("Primeiro valor: ");
                double a = sc.nextDouble();
                System.out.print("Segundo valor: ");
                double b = sc.nextDouble();

                if (operacao.equals("/") && b == 0) {
                    System.out.println("Não existe divisão por zero.");
                    invalidas++;
                } else {
                    double resultado = 0;
                    if (operacao.equals("+")) {
                        resultado = a + b;
                    } else if (operacao.equals("-")) {
                        resultado = a - b;
                    } else if (operacao.equals("*")) {
                        resultado = a * b;
                    } else {
                        resultado = a / b;
                    }
                    System.out.println("Resultado: " + resultado);
                    realizadas++;
                }
            }
        }

        System.out.println("Operações realizadas: " + realizadas);
        System.out.println("Operações inválidas: " + invalidas);
        System.out.println("Total de tentativas: " + (realizadas + invalidas));

        sc.close();
    }
}
