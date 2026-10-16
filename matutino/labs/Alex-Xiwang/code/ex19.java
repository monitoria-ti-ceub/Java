import java.util.Scanner;

public class ex19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o ano de nascimento: ");
        int nascimento = sc.nextInt();

        System.out.println("Insira o ano atual: ");
        int atual = sc.nextInt();

        System.out.println("Sua idade aproximada é: "+ (atual - nascimento) + " anos");
        sc.close();
    }
}
    

