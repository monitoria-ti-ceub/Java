import java.util.Scanner;

public class ex24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor em real: ");
        int notas = 0;

        double valor = sc.nextDouble();
        while(valor >= 50){
            notas ++;
            valor = valor - 50;
        }

        System.out.println("Ele recebera: " + notas + " notas de 50 e "+ valor +" de troco");
        sc.close();
    }
}