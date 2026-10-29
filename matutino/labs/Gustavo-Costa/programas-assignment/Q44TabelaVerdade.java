public class Q44TabelaVerdade {
    public static void main(String[] args) {
        boolean[] valores = {false, true};
        boolean equivalentes = true;

        System.out.println("ativo  | admin  | dono   | regra1 | regra2");
        for (boolean ativo : valores) {
            for (boolean admin : valores) {
                for (boolean dono : valores) {
                    boolean regra1 = ativo && (admin || dono);
                    boolean regra2 = (ativo && admin) || dono;

                    System.out.printf("%-6b | %-6b | %-6b | %-6b | %-6b%n", ativo, admin, dono, regra1, regra2);

                    if (regra1 != regra2) {
                        equivalentes = false;
                    }
                }
            }
        }

        if (equivalentes) {
            System.out.println("As duas regras são equivalentes.");
        } else {
            System.out.println("As duas regras não são equivalentes.");
        }
    }
}
