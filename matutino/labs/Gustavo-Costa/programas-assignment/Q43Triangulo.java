import java.util.Scanner;

public class Q43Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo lado: ");
        int b = sc.nextInt();
        System.out.print("Digite o terceiro lado: ");
        int c = sc.nextInt();

        if (a <= 0 || b <= 0 || c <= 0){
            System.out.println("Os comprimentos precisam ser positivos");
        }
        else if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Podem formar um triângulo");
        }
        else { 
            System.out.println("Não podem formar um triângulo.");
        }
        sc.close();
    }
}
