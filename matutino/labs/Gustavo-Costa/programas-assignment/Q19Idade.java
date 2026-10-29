import java.util.Scanner;

public class Q19Idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = sc.nextInt(); 
        System.out.print("Digite o ano atual: ");
        int anoAtual = sc.nextInt();

        int idade = anoAtual - anoNascimento;
        System.out.println("Idade: " + idade);

        sc.close();
    }
}