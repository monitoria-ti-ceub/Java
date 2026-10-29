import java.util.Scanner;

public class Q87ConversorBase {

    static String converterBase(int valor, int base) {
        String digitos = "0123456789ABCDEF";

        if (valor == 0) {
            return "0";
        }

        boolean negativo = valor < 0;
        if (negativo) {
            valor = -valor;
        }

        String resultado = "";
        while (valor > 0) {
            int resto = valor % base;
            resultado = digitos.charAt(resto) + resultado;
            valor = valor / base;
        }

        if (negativo) {
            resultado = "-" + resultado;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor inteiro: ");
        int valor = sc.nextInt();
        System.out.print("Base (2 a 16): ");
        int base = sc.nextInt();

        if (base < 2 || base > 16) {
            System.out.println("A base precisa estar entre 2 e 16.");
        } else {
            System.out.println(valor + " na base " + base + " = " + converterBase(valor, base));
        }

        sc.close();
    }
}
