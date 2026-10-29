import java.util.Scanner;

public class Q35MinutosHoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de minutos: ");
        int minutos = sc.nextInt();

        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;

        System.out.println(minutos + " minutos equivalem a " + horas + " horas e " + minutosRestantes + " minutos.");
    
        sc.close();
    }
}