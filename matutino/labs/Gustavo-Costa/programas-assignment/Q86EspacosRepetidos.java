import java.util.Scanner;

public class Q86EspacosRepetidos {

    static String removerEspacosRepetidos(String texto) {
        String resultado = "";
        for (int i = 0; i < texto.length(); i++) {
            char atual = texto.charAt(i);
            boolean repetido = atual == ' ' && i > 0 && texto.charAt(i - 1) == ' ';
            if (!repetido) {
                resultado = resultado + atual;
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = sc.nextLine();

        System.out.println("[" + removerEspacosRepetidos(texto) + "]");

        sc.close();
    }
}
