import java.util.Scanner;

public class PlanilhaGastos {

    static Scanner sc = new Scanner(System.in);
    static String[] categorias = { "Alimentação", "Transporte", "Moradia", "Saúde", "Educação", "Lazer", "Outros" };
    static double[][] gastos = new double[2][categorias.length];

    public static void main(String[] args) {
        int opcao;
        do {
            mostrarMenu();
            opcao = lerInterio("Escolha uma opção: ");
            switch (opcao) {
                case 1:
                    registrarGasto();
                    break;
                case 2:
                    verTotais();
                    break;  
                case 3:
                    verMaiorGasto();
                    break;
                case 4:
                    compararMeses();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }while (opcao != 0);
    }

    static void mostrarMenu() {
        System.out.println("=== Planilha de Gastos ===");
        System.out.println("1. Registrar gasto");
        System.out.println("2. Ver totais");
        System.out.println("3. Ver maior gasto");
        System.out.println("4. Comparar meses");
        System.out.println("0. Sair");
    }

    static int lerInterio(String mensagem) {
        System.out.print(mensagem);
        while (!sc.hasNextInt()) {
            System.out.println("Entrada inválida. Digite um número inteiro.");
            sc.next();
        }
        return sc.nextInt();
    }

    static void registrarGasto() {
        System.out.println("=== Registrar Gasto ===");
        int mes = lerInterio("Digite o mês (1 ou 2): ");
        if (mes < 1 || mes > 2) {
            System.out.println("Mês inválido. Digite 1 ou 2.");
            return;
        }
        System.out.println("Categorias:");
        for (int i = 0; i < categorias.length; i++) {
            System.out.println((i + 1) + ". " + categorias[i]);
        }
        int categoriaIndex = lerInterio("Escolha a categoria (1-" + categorias.length + "): ") - 1;
        if (categoriaIndex < 0 || categoriaIndex >= categorias.length) {
            System.out.println("Categoria inválida.");
            return;
        }
        double valor = lerDouble("Digite o valor do gasto: ");
        gastos[mes - 1][categoriaIndex] += valor;
        System.out.println("Gasto registrado com sucesso!");
    }

    static double lerDouble(String mensagem) {
        System.out.print(mensagem);
        while (!sc.hasNextDouble()) {
            System.out.println("Entrada inválida. Digite um número.");
            sc.next();
        }
        return sc.nextDouble();
    }


    static void verTotais() {
        System.out.println("=== Totais por Categoria ===");
        for (int i = 0; i < categorias.length; i++) {
            double totalMes1 = gastos[0][i];
            double totalMes2 = gastos[1][i];
            System.out.printf("%s: Mês 1: %.2f, Mês 2: %.2f%n", categorias[i], totalMes1, totalMes2);
        }
    }

    static void verMaiorGasto() {
        System.out.println("=== Maior Gasto por Mês ==="); 
            for (int mes = 0; mes < 2; mes++) {
                double maiorGasto = 0;
                String categoriaMaiorGasto = "";
                for (int i = 0; i < categorias.length; i++) {
                    if (gastos[mes][i] > maiorGasto) {
                        maiorGasto = gastos[mes][i];
                        categoriaMaiorGasto = categorias[i];
                    }
                }
                System.out.printf("Mês %d: Maior gasto em %s: %.2f%n", mes + 1, categoriaMaiorGasto, maiorGasto);}
            }


    static void compararMeses() {
        System.out.println("=== Comparação de Gastos entre Meses ==="); 
            for (int i = 0; i < categorias.length; i++) {
                double totalMes1 = gastos[0][i];
                double totalMes2 = gastos[1][i];
                if (totalMes1 > totalMes2) {
                    System.out.printf("%s: Mês 1 teve maior gasto (%.2f) que Mês 2 (%.2f)%n", categorias[i], totalMes1, totalMes2);
                } else if (totalMes2 > totalMes1) {
                    System.out.printf("%s: Mês 2 teve maior gasto (%.2f) que Mês 1 (%.2f)%n", categorias[i], totalMes2, totalMes1);
                } else {
                    System.out.printf("%s: Gastos iguais em ambos os meses (%.2f)%n", categorias[i], totalMes1);
                }
            }












}
}