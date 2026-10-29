import java.util.Scanner;

public class Q65Caracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = sc.nextLine().toLowerCase();

        String listaVogais = "aeiouáàâãéêíóôõú";
        int vogais = 0;
        int consoantes = 0;
        int digitos = 0;
        int espacos = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (listaVogais.indexOf(c) >= 0) {
                vogais++;
            } else if (Character.isLetter(c)) {
                consoantes++;
            } else if (c >= '0' && c <= '9') {
                digitos++;
            } else if (c == ' ') {
                espacos++;
            }
        }

        System.out.println("Vogais: " + vogais);
        System.out.println("Consoantes: " + consoantes);
        System.out.println("Dígitos: " + digitos);
        System.out.println("Espaços: " + espacos);

        sc.close();
    }
}
