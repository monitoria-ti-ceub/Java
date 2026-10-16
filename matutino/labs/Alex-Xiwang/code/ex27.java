import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor inteiro: ");
        int inteiro = sc.nextInt();

        if (inteiro >= 0 && inteiro < 100) {
            int dezena = inteiro / 10;
            int unidade = inteiro % 10;
            System.out.println("" + unidade + dezena);

        } else {
            System.out.println("Valor inválido: informe um número de 0 a 99");
        }
        
        sc.close();
    }
}