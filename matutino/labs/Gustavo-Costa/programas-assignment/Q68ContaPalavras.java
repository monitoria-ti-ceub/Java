import java.util.Scanner;

public class Q68ContaPalavras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = sc.nextLine().toLowerCase();

        // troca pontuação por espaço
        String limpo = "";
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                limpo = limpo + c;
            } else {
                limpo = limpo + ' ';
            }
        }

        String[] palavras = limpo.trim().split(" +");
        String[] diferentes = new String[palavras.length];
        int[] contagem = new int[palavras.length];
        int total = 0;

        for (int i = 0; i < palavras.length; i++) {
            if (!palavras[i].isEmpty()) {
                int posicao = -1;
                for (int j = 0; j < total; j++) {
                    if (diferentes[j].equals(palavras[i])) {
                        posicao = j;
                    }
                }

                if (posicao == -1) {
                    diferentes[total] = palavras[i];
                    contagem[total] = 1;
                    total++;
                } else {
                    contagem[posicao]++;
                }
            }
        }

        if (total == 0) {
            System.out.println("Nenhuma palavra encontrada.");
        }
        for (int i = 0; i < total; i++) {
            System.out.println(diferentes[i] + ": " + contagem[i]);
        }

        sc.close();
    }
}
