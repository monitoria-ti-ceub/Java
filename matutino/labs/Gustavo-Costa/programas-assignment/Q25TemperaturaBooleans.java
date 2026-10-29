import java.util.Scanner;

public class Q25TemperaturaBooleans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Temperatura: ");
        double temperatura = sc.nextDouble();

        boolean abaixoDeZero = temperatura < 0;
        boolean igualAZero = temperatura == 0;
        boolean acimaDe30 = temperatura > 30;

        System.out.println("Abaixo de zero: " + abaixoDeZero);
        System.out.println("Igual a zero: " + igualAZero);
        System.out.println("Acima de 30: " + acimaDe30);

        sc.close();
    }
}