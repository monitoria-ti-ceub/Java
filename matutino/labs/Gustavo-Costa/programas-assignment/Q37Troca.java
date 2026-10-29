import java.util.Scanner;

public class Q37Troca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = sc.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = sc.nextInt();

        int aux = numero1;
        numero1 = numero2;
        numero2 = aux;

        System.out.println("Após a troca:");
        System.out.println("Primeiro número: " + numero1);
        System.out.println("Segundo número: " + numero2);

        sc.close();
    }
}
