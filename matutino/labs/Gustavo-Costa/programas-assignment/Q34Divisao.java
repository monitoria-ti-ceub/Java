
import java.util.Scanner;

public class Q34Divisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numerador: ");
        int numerador = sc.nextInt();
        System.out.print("Digite o denominador: ");
        int denominador = sc.nextInt();

        if (denominador == 0) {
            System.out.println("Não existe divisão por zero.");
        } else {
            System.out.println("Quociente: " + (numerador / denominador));
            System.out.println("Resto: " + (numerador % denominador));
        }
        sc.close();
    }
}


