import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira os segundos: ");
        int total = sc.nextInt();

        int horas = total / 3600;
        int minutos = (total % 3600) / 60;
        int segundos = total % 60;

        System.out.println("São: " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos");
        sc.close();
    }
}