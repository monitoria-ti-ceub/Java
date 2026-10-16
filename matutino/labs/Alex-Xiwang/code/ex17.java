import java.util.Scanner;

public class ex17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a descricao do produto: ");
        String desc = sc.nextLine();

        System.out.println("Insira o código do produto: ");
        String codigo = sc.nextLine();
        int cod = Integer.parseInt(codigo);

        System.out.println("Insira o preco do produto: ");
        float preco = Float.parseFloat(sc.nextLine());

        System.out.println("Insira a categoria do produto: ");
        String categoria = sc.nextLine();

        System.out.println("insira se esta disponivel: ");
        String confira = sc.nextLine();

        System.out.println("A descricao do produto é: " + desc + " o produto custa: " + preco + "R$ sua categoria é: "
        + categoria + "seu codigo é: " + cod + " Está: " + confira);

        sc.close();
        }
    }