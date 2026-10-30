public class ex28 {
    public static void main(String[] args) {
        int alunos = 25;
        int aprovados = 15;
        double taxaAprovados = (double) aprovados / alunos * 100;

        System.out.println("Taxa de aprovação de: " + taxaAprovados);
    }
}

//originalmente o codigo estava fazendo a divisão em inteiros, fazendo com que a parte decimal não aparecesse, adicionando o (double) antes 
//operação, ela muda os valores de int para double, assim fazendo com que a parte decimal aparecesse.