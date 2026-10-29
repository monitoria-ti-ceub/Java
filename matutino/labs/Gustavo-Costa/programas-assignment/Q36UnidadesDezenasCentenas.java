import java.util.Scanner;

public class Q36UnidadesDezenasCentenas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro de três algarismos: ");
        int numero = sc.nextInt();

        if (numero < 100 || numero > 999) {
            System.out.println("O número precisa ter três algarismos.");} 
        else {
            int centena = numero / 100;
            int dezena = (numero / 10) % 10;
            int unidade = numero % 10;

            System.out.println("Centena: " + centena);
            System.out.println("Dezena: " + dezena);
            System.out.println("Unidade: " + unidade);
        }
        sc.close();
    }
}
