import java.util.Scanner;

public class Q40DobroDaSoma {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Digite o primeiro número: "); 
        int numero1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = sc.nextInt();

        // Usando a variável soma para armazenar a soma dos dois números
        int soma = numero1 + numero2;
        System.out.println("O dobro da soma com variável auxiliar é: " + (2 * soma));

        // Sem usar a variável soma, calculando diretamente o dobro da soma
        System.out.println("O dobro da soma sem variável auxiliar é: " + (2 * (numero1 + numero2)));

        sc.close();
    } 
}
