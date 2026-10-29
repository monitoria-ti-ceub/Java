import java.util.Scanner;

public class Q45Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Horas trabalhadas: ");
        double horas = sc.nextDouble();
        System.out.print("Valor da hora: R$ ");
        double valorHora = sc.nextDouble();

        double salario;
        if (horas > 40) {
            double horasExtras = horas - 40;
            salario = 40 * valorHora + horasExtras * valorHora * 1.5;
        } else {
            salario = horas * valorHora;
        }

        System.out.printf("Salário bruto: R$ %.2f%n", salario);

        sc.close();
    }
}
