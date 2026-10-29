import java.util.Scanner;

public class Q21MaiorQue100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        
        if (numero>100) {
            System.out.println("O número é maior que 100.");
        } else if (numero==100){
            System.out.println("O número é igual a 100.");
        } else {
            System.out.println("O número é menor que 100.");
        }
        sc.close();
    }
}