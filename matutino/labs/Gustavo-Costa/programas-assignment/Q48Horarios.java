import java.util.Scanner;

public class Q48Horarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro horário (horas): ");
        int h1 = sc.nextInt();
        System.out.print("Primeiro horário (minutos): ");
        int m1 = sc.nextInt();
        System.out.print("Segundo horário (horas): ");
        int h2 = sc.nextInt();
        System.out.print("Segundo horário (minutos): ");
        int m2 = sc.nextInt();

        int inicio = h1 * 60 + m1;
        int fim = h2 * 60 + m2;

        if (h1 < 0 || h1 > 23 || h2 < 0 || h2 > 23 || m1 < 0 || m1 > 59 || m2 < 0 || m2 > 59) {
            System.out.println("Horário inválido.");
        } else if (fim < inicio) {
            System.out.println("O segundo horário precisa ser depois do primeiro.");
        } else {
            System.out.println("Passaram " + (fim - inicio) + " minutos.");
        }

        sc.close();
    }
}
