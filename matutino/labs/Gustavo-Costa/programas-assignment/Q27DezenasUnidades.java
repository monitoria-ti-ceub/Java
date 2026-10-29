import java.util.Scanner;

public class Q27DezenasUnidades {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número entre 1 e 100: ");
        int numero = sc.nextInt();
        
            int dezenas = numero / 10;
            int unidades = numero % 10;

            System.out.println("Número invertido: " + unidades + dezenas );

            sc.close();
    }
}

