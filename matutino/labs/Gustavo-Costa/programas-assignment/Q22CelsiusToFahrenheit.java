import java.util.Scanner;

public class Q22CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        
        System.out.printf("%.1f C= %.1f F", celsius, fahrenheit);
        sc.close();
    }
}
