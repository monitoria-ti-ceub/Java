public class Q17CartaoProduto {
    public static void main(String[] args) {
        
        String descricao = "Camiseta gato miau";
        int codigo = 13131313;
        double preco = 100.00;
        String categoria = "Roupas";
        boolean disponivel = true;

        System.out.println("==============Produto==============");
        System.out.println("Descrição: " + descricao);
        System.out.println("Código: " + codigo);
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.println("Categoria: " + categoria);
        System.out.println("Disponível: " + disponivel);
        System.out.println("===================================");
    }

}