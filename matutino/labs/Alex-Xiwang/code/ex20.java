import java.util.Scanner;

public class ex20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double pi = 3.14;

        System.out.println("Digite um raio de um circulo: ");
        double raio = sc.nextDouble();

        System.out.println("A area da circuferencia é de: "+ (pi * (raio * raio)));
        sc.close();
    }
}