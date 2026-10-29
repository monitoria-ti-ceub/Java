import java.util.Scanner;

public class Q82Saudacao {

    static void exibirSaudacao(String nome) {
        System.out.println("Olá, " + nome + "! Seja bem-vindo(a).");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Seu nome: ");
        String nome = sc.nextLine();

        exibirSaudacao(nome);

        sc.close();
    }
}
