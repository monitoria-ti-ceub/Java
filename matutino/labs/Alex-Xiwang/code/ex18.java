import java.util.Scanner;

public class ex18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro valor: ");
        int a = sc.nextInt();

        System.out.println("Insira o segundo valor: ");
        int b = sc.nextInt();

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));

        sc.close();
    }
}