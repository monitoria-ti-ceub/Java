import java.util.Scanner;

public class Q42Moedas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Troco em centavos: ");
        int troco = sc.nextInt();

        int moedas1Real = troco / 100;
        troco = troco % 100;
        int moedas50Centavos = troco / 50;
        troco = troco % 50;
        int moedas25Centavos = troco / 25;
        troco = troco % 25;
        int moedas10Centavos = troco / 10;
        troco = troco % 10;
        int moedas5Centavos = troco / 5;
        troco = troco % 5;

        System.out.printf("Moedas de 1 real: %d%n", moedas1Real);
        System.out.printf("Moedas de 50 centavos: %d%n", moedas50Centavos);
        System.out.printf("Moedas de 25 centavos: %d%n", moedas25Centavos);
        System.out.printf("Moedas de 10 centavos: %d%n", moedas10Centavos);
        System.out.printf("Moedas de 5 centavos: %d%n", moedas5Centavos);

        if (troco > 0) {
            System.out.printf("Centavos que não dá para devolver: %d%n", troco);
        }
        
        sc.close();
    }
}