import java.util.Scanner;

public class Q64Romanos {

    static int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    static String[] simbolos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String paraRomano(int numero) {
        String romano = "";
        for (int i = 0; i < valores.length; i++) {
            while (numero >= valores[i]) {
                romano = romano + simbolos[i];
                numero = numero - valores[i];
            }
        }
        return romano;
    }

    public static int valorDaLetra(char letra) {
        if (letra == 'I') return 1;
        if (letra == 'V') return 5;
        if (letra == 'X') return 10;
        if (letra == 'L') return 50;
        if (letra == 'C') return 100;
        if (letra == 'D') return 500;
        if (letra == 'M') return 1000;
        return 0;
    }

    public static int paraDecimal(String romano) {
        int total = 0;
        for (int i = 0; i < romano.length(); i++) {
            int atual = valorDaLetra(romano.charAt(i));
            if (atual == 0) {
                return -1; // letra que não existe nos romanos
            }
            if (i + 1 < romano.length() && atual < valorDaLetra(romano.charAt(i + 1))) {
                total = total - atual;
            } else {
                total = total + atual;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Decimal para romano");
        System.out.println("2 - Romano para decimal");
        System.out.print("Opção: ");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.print("Número (1 a 4000): ");
            int numero = sc.nextInt();
            if (numero < 1 || numero > 4000) {
                System.out.println("O número precisa estar entre 1 e 4000.");
            } else {
                System.out.println(numero + " = " + paraRomano(numero));
            }
        } else if (opcao == 2) {
            System.out.print("Número romano: ");
            String romano = sc.next().toUpperCase();
            int numero = paraDecimal(romano);
            // se converter de volta e não der o mesmo texto, o romano estava escrito errado (ex.: IIII, VX)
            if (numero < 1 || numero > 4000 || !paraRomano(numero).equals(romano)) {
                System.out.println("Número romano inválido.");
            } else {
                System.out.println(romano + " = " + numero);
            }
        } else {
            System.out.println("Opção inválida.");
        }

        sc.close();
    }
}
