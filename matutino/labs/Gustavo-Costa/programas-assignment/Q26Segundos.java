import java.util.Scanner;

public class Q26Segundos {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Segundos: ");
        int segundos = sc.nextInt();

        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = segundos % 60;

        System.out.println("Horas: " + horas + "h" + minutos + "m" + segundosRestantes + "s");
        
        sc.close();
}
}