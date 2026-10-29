import java.util.Scanner;

public class Q61MaiorQueAnterior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vezes = 0;
        int anterior = 0;
        boolean primeiro = true;

        System.out.print("Número (0 para encerrar): ");
        int numero = sc.nextInt();

        while (numero != 0) {
            if (!primeiro && numero > anterior) {
                vezes++;
            }
            anterior = numero;
            primeiro = false;

            System.out.print("Número (0 para encerrar): ");
            numero = sc.nextInt();
        }

        System.out.println("Vezes em que um valor foi maior que o anterior: " + vezes);

        sc.close();
    }
}
