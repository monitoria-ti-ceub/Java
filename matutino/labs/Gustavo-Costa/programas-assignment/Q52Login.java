import java.util.Scanner;

public class Q52Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String USUARIO_CORRETO = "admin";
        final String SENHA_CORRETA = "1234";

        System.out.print("Usuário: ");
        String usuario = sc.nextLine();
        System.out.print("Senha: ");
        String senha = sc.nextLine();

        boolean usuarioOk = usuario.equals(USUARIO_CORRETO);
        boolean senhaOk = senha.equals(SENHA_CORRETA);

        if (usuarioOk && senhaOk) {
            System.out.println("Usuário e senha corretos. Acesso liberado.");
        } else if (usuarioOk) {
            System.out.println("Usuário correto, mas a senha está errada.");
        } else if (senhaOk) {
            System.out.println("Senha correta, mas o usuário está errado.");
        } else {
            System.out.println("Usuário e senha incorretos.");
        }

        sc.close();
    }
}
