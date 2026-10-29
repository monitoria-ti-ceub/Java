import java.util.Scanner;

public class Q88Armstrong {

    static int contarDigitos(int numero) {
        int quantidade = 0;
        do {
            quantidade++;
            numero = numero / 10;
        } while (numero > 0);
        return quantidade;
    }

    static int potencia(int base, int expoente) {
        int resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado = resultado * base;
        }
        return resultado;
    }

    static boolean ehArmstrong(int numero) {
        if (numero < 0) {
            return false;
        }

        int quantidadeDigitos = contarDigitos(numero);
        int soma = 0;
        int n = numero;

        while (n > 0) {
            int digito = n % 10;
            soma = soma + potencia(digito, quantidadeDigitos);
            n = n / 10;
        }

        return soma == numero;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número inteiro: ");
        int numero = sc.nextInt();

        if (ehArmstrong(numero)) {
            System.out.println(numero + " é um número de Armstrong.");
        } else {
            System.out.println(numero + " não é um número de Armstrong.");
        }

        sc.close();
    }
}
