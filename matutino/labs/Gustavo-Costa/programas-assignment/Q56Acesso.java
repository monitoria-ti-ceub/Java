public class Q56Acesso {

    public static boolean podeAcessar(boolean cadastroAtivo, boolean senhaCorreta, int idade) {
        return cadastroAtivo && senhaCorreta && idade >= 18;
    }

    public static void testar(boolean cadastroAtivo, boolean senhaCorreta, int idade, boolean esperado) {
        boolean resultado = podeAcessar(cadastroAtivo, senhaCorreta, idade);
        String situacao;
        if (resultado == esperado) {
            situacao = "OK";
        } else {
            situacao = "FALHOU";
        }
        System.out.printf("%-6b | %-6b | %-5d | %-8b | %-6b | %s%n",
                cadastroAtivo, senhaCorreta, idade, esperado, resultado, situacao);
    }

    public static void main(String[] args) {
        System.out.println("ativo  | senha  | idade | esperado | obtido | teste");
        testar(false, false, 16, false);
        testar(false, false, 20, false);
        testar(false, true, 16, false);
        testar(false, true, 20, false);
        testar(true, false, 16, false);
        testar(true, false, 20, false);
        testar(true, true, 16, false);
        testar(true, true, 20, true);
        // limites da idade
        testar(true, true, 18, true);
        testar(true, true, 17, false);
    }
}
