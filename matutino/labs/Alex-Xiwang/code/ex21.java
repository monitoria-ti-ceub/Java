import java.util.Scanner;

public class ex21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        if(a > 100){
            System.out.println("Maior que 100");
        }
        else {
            System.out.println("Menor que 100");
        }

        sc.close();
    }
}