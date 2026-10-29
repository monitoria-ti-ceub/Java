import java.util.Scanner;

public class Q63Potencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Base: ");
        int base = sc.nextInt();
        System.out.print("Expoente: ");
        int expoente = sc.nextInt();

        if (base <= 0 || expoente < 0) {
            System.out.println("Use base positiva e expoente maior ou igual a zero.");
        } else {
            long resultado = 1;
            for (int i = 0; i < expoente; i++) {
                resultado = resultado * base;
            }
            System.out.println(base + " elevado a " + expoente + " = " + resultado);
        }

        sc.close();
    }
}
