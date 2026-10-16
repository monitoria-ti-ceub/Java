import java.util.Scanner;

public class ex25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a temperatura: ");
        float temp = sc.nextFloat();

        boolean AbaixoZero = temp < 0;
        boolean IgualZero = temp == 0;
        boolean Acima30 = temp > 30;

        System.out.println("Abaixo de zero: "+ AbaixoZero);
        System.out.println("Igual a zero: "+ IgualZero);
        System.out.println("Acima de 30: "+ Acima30);

        sc.close();
    }
}