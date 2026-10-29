import java.util.Scanner;

public class Q66PalindromoTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = sc.nextLine().toLowerCase();

        // guarda só letras e números
        String limpo = "";
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                limpo = limpo + c;
            }
        }

        boolean palindromo = true;
        int inicio = 0;
        int fim = limpo.length() - 1;

        while (inicio < fim && palindromo) {
            if (limpo.charAt(inicio) != limpo.charAt(fim)) {
                palindromo = false;
            }
            inicio++;
            fim--;
        }

        if (palindromo) {
            System.out.println("É palíndromo.");
        } else {
            System.out.println("Não é palíndromo.");
        }

        sc.close();
    }
}
