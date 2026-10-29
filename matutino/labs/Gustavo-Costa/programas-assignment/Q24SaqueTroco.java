import java.util.Scanner;

public class Q24SaqueTroco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor do saque: ");
        int saque = sc.nextInt();
        int notas50 = saque / 50;
        int troco = saque % 50;
        
        System.out.printf("Notas de 50: %d%n", notas50);
        System.out.printf("Troco: %d%n", troco);
        
        sc.close();
    }
}
