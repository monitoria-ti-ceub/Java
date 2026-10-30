import java.util.Scanner;

public class ex23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("insira a primeira nota: ");
        double nota01 = sc.nextDouble();

        System.out.println("insira o peso da nota: ");
        int peso01 = sc.nextInt();

        System.out.println("insira a segunda nota: ");
        double nota02 = sc.nextDouble();

        System.out.println("insira o peso da nota: ");
        int peso02 = sc.nextInt();

        System.out.println("insira a terceira nota: ");
        double nota03 = sc.nextDouble();

        System.out.println("insira o peso da nota: ");
        int peso03 = sc.nextInt();

        double media = ((nota01 * peso01) + (nota02 * peso02) + (nota03 * peso03)) / (peso01 + peso02 + peso03);
        System.out.println("Sua média e: " + media);
        sc.close();
    }
}