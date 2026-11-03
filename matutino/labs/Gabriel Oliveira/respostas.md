R1: Um problema computacional é algo a ser resolivdo com um computador tipo ordeanar uma lista. 
Algorito é uma sequencias de instrucoes de forma que fique linear.
Codigo-Fonte é o conjunto de intruções implementado em uma linguagem(algoritimo aplicado a uma linguagem).

R2: 
Javac Transformar um arquivo .Java em um bytecode bem dificil e entender.
JVM compila o bytecode em linguagem de maquina.

R3: É um start do progama, onde o codigo principal vai estar alocado.

R4: .java, javaC, .class, JVM e progama em execução

R5: int a; é declarar um int e nao dar valor(inicializar) agr se fosse inta a = 5; ela teria sido inicialziada.

R6: Java é de tipagem forte porque exige definir o tipo exato de cada variável e impede misturar tipos incompatíveis. Na prática, você é obrigado a declarar o tipo (como int ou String) e o código não compila se tentar guardar o valor errado.

R7:String, float, char, String e String.

R8: "S" esta sobre aspas duplas, deveria ta em aspas simples.

9. Qual é a saída do código?

    ```java
    System.out.println("hii");
    System.out.print("world");
    System.out.println("!");
    ```
R9: hii
    world!


10. Qual é a saída do código?

   ```java
   int a = 5;
   int b = 2;
   System.out.println(a / b);
   ```
R10: 2

11. Qual é a saída do código?

    ```java
    int x = 10;
    int y = 3;
    System.out.println("Resultado: " + x + y);
    ```
R11: Resultado: 103


12. Qual é a saída do código?

    ```java
    int x = 10;
    int y = 3;
    System.out.println("Resultado: " + (x + y));
    ```
R12: Resultado: 13


13. Qual é a saída do código?

    ```java
    double a = 5 / 2;
    System.out.println(a);
    ```
R13: 2.0


14. Quais são os valores finais de `x` e `y`?

    ```java
    int x = 10;
    int y = x;
    x = 20;
    ```
R14: X: 20, Y: 10


15. Crie `OlaCurso.java`, com classe pública `OlaCurso` e exiba o nome do curso em duas linhas.
R15:public class OlaCurso {
    public static void main(String[] args){
        System.out.println("Monitoria");
        System.out.println("Java");
    }
}


16. Escreva um programa que declare nome, semestre e status de matrícula e exiba os dados com `printf`.
R16:
public class exec16 {
    public static void main(String[] args){
        //Escreva um programa que declare nome, semestre e status de matrícula e exiba os dados com `printf`.
        String nome = "Gabriel";
        String semestre = "Segundo";
        String status = "Matriculado";
        System.out.printf("Nome: %s, Semestre: %s e Semestre atual: %s", nome, semestre, status);
    }
}


17. Escreva um cartão de produto com descrição, código inteiro, preço, categoria e disponibilidade.
R17:
import java.util.Scanner;
public class exec17 {
    public static void main(String[] args){
        //Escreva um cartão de produto com descrição, código inteiro, preço, categoria e disponibilidade.
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

        System.out.println("A descricao do produto é: "+desc+" o produto custa: "+preco+"R$ sua categoria é: "+categoria+
                "seu codigo é: "+cod+" Está: "+
                confira);
        sc.close();
    }
}


18. Escreva um programa que leia dois números inteiros do usuário e exiba a soma, subtração e multiplicação entre eles.
R18:
import java.util.Scanner;
public class exec18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro valor: ");
        int num1 = sc.nextInt();
        System.out.println("Insira o segundo valor: ");
        int num2 = sc.nextInt();
        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));
        sc.close();
    }
}

19. Escreva um programa que leia o ano de nascimento de um usuário e o ano atual, calcula a idade aproximada da pessoa (sem considerar o mês)
R19:
import java.util.Scanner;
public class exec19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o ano de nascimento: ");
        int nasce = sc.nextInt();
        System.out.println("Insira o ano atual: ");
        int atual = sc.nextInt();
        System.out.println("Voce tem: "+ (atual - nasce) + " anos");
        sc.close();
    }
}

20. Declare uma constante para o valor de PI. Leia o raio de um círculo e calcule a área.
import java.util.Scanner;
public class exec20 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double pi = 3.14;

        System.out.println("Insira um raio de uma circuferencia: ");
        float raio = sc.nextFloat();

        System.out.println("A area da circuferencia é de: "+ (pi * (raio * raio)));
    }
}

21. Escreva um programa que leia um número inteiro e exiba se o valor é maior que 100.
R21:
import java.util.Scanner;
public class exec21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a > 100){
            System.out.println("É maior que 100");
        }
        else {
            System.out.println("Nao é maior que 100");
        }
        sc.close();
    }
}


22. Leia uma temperatura em °C (Celsius) e converta para °F (Fahrenheit).
R22:
import java.util.Scanner;
public class exec22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float c = sc.nextFloat();
        System.out.println(1.8 * c + 32);
        sc.close();
    }
}


23. Leia três notas de um aluno e seus respectivos pesos. Calcule e exiba a média ponderada.
R23:
import java.util.Scanner;
public class exec23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("insira a primeira nota: ");
        float primeiro = sc.nextFloat();
        System.out.println("insira o peso da nota: ");
        int peso1 = sc.nextInt();

        System.out.println("insira a segunda nota: ");
        float segundo = sc.nextFloat();
        System.out.println("insira o peso da nota: ");
        int peso2 = sc.nextInt();

        System.out.println("insira a terceira nota: ");
        float terceiro = sc.nextFloat();
        System.out.println("insira o peso da nota: ");
        int peso3 = sc.nextInt();

        float media = ((primeiro * peso1) + (segundo * peso2) + (terceiro * peso3)) / (peso1 + peso2 + peso3);
        System.out.println(media);
        sc.close();
    }
}


24. Leia um valor inteiro em reais que um usuário deseja sacar. Supondo que o caixa só tem notas de R$50, exiba quantas notas ele receberá e qual é o valor do "troco" que não pode ser sacado.
R24:
import java.util.Scanner;
public class exec24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor em real: ");
        int cont = 0;

        float R = sc.nextFloat();
        while(R >= 50){
            cont ++;
            R = R - 50;
        }

        System.out.println("Ele recebera: "+ cont+ " notas de 50 e "+R+" de troco");
        sc.close();
    }
}


25. Leia uma temperatura e armazene em três variáveis (booleanas) se `temperatura < 0`, `temperatura == 0` e `temperatura > 30`. Exiba os dados. Não use `if`.
R25:
import java.util.Scanner;
public class exec25 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma temperatura: ");
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

26. Leia um número inteiro representando uma quantidade total de segundos. Converta esse valor para horas, minutos e segundos.
R26:
import java.util.Scanner;
public class exec26 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int contH = 0;
        int contM = 0;
        // Leia um número inteiro representando uma quantidade total de segundos.
        // Converta esse valor para horas, minutos e segundos.
        System.out.println("Insira uma quantidade de segundos: ");
        int seg = sc.nextInt();


        while (seg >= 3600){
            contH ++;
            seg = seg - 3600;
        }
        while(seg >= 60){
            contM ++;
            seg = seg - 60;
        }

        System.out.println(+contH+" Horas "+contM+" Minutos "+seg+" segundos");
        sc.close();
    }
}

27. Leia um número inteiro de dois dígitos. Extraia a dezena e a unidade e exiba o número invertido.
R27:
import java.util.Scanner;
public class exec27 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int cont = 0;
        
        System.out.println("Insira um valor inteiro: ");
        int inteiro = sc.nextInt();


        if (inteiro < 100){
            while (inteiro >= 10){
                cont ++;
                inteiro = inteiro - 10;
            }
            System.out.print(inteiro);
            System.out.print(cont);
        }
        else {
            System.out.println("Valor com mais de dois digitos");
        }
        sc.close();
    }
}

28. Identifique o erro, explique o motivo e reescreva o código com a correção.

    ```java
    // o objetivo é calcular a porcentagem de aprovação

    int totalAlunos = 25;
    int alunosAprovados = 15;
    double taxaAprovacao = alunosAprovados / totalAlunos;
    System.out.println("Taxa de aprovação: " + taxaAprovacao);
    ```
R28:
import java.util.Scanner;
public class exec28 {
    public static void main(String[] args){
        //O problema do código é que o totalAlunos e alunosAprovados eram int e o int
        //não tem espaço na memoria para numeros depois da virgula printando so 0 alem de 0.6
        Scanner sc = new Scanner(System.in);
        double totalAlunos = 25;
        double alunosAprovados = 15;
        double taxaAprovacao = alunosAprovados / totalAlunos;
        System.out.println("Taxa de aprovação: " + taxaAprovacao);
        sc.close();
    }
}



R29:
14 7

R30: A variavel idade já foi declarada, entao o certo seria idade = 21; para atribuir um novo valor para idade, além disso a declaracao e atribuicao da variavel ano veio antes da alteracao de idade, entao a idade nova vai vim mas o print vai so usar o ano antigo.

int idade;
idade = 20;
idade = 21;
int ano = idade + 2000;
System.out.println(idade + ano);


R31: 
    int qntEstoque = 50;
    double precoUni = 59.99;
    char Letra = 'M';
    boolean disponivel = true;


R32: 
    double nota1 = 7;
    double nota2 = 8;
    double media = (nota1 + nota2) / 2;
    System.out.println(media);


R33: 
    7 
    Resultado: 52
    Resultado: 7


R34: 
import java.util.Scanner;
public class exec34 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro inteiro: ");
        int valor1 = sc.nextInt();
        System.out.println("\"Insira o segundo inteiro: ");
        int valor2 = sc.nextInt();
        System.out.println(valor1 / valor2);
        System.out.println(valor1 % valor2);
        sc.close();
    }
}




R35: import java.util.Scanner;
public class exec35 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma quantidade de minutos: ");
        int minutos = sc.nextInt();
        int contH = 0;
        while(minutos>= 60){
            minutos = minutos - 60;
            contH ++;
        }
        System.out.println(contH+" horas / "+minutos+" minutos");
        sc.close();
    }
}




R36:
import java.util.Scanner;
public class exec36 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um numero inteiro com centena: ");
        int num = sc.nextInt();
        boolean valida = false;
        if (num >= 100){
            valida = true;
        }
        else{
            System.out.println("Erro, numero nao possui centena");
        }
        int contC = 0;
        int contD = 0;
        while(num >= 100){
            if(!valida){
                break;
            }
            num = num - 100;
            contC ++;
        }
        while(num >= 10){
            if(!valida){
                break;
            }
            num = num - 10;
            contD ++;
        }
        if (valida){
            System.out.println(contC+" "+contD+" "+num);

        }
        sc.close();
    }
}




R37:
import java.util.Scanner;
public class exec37 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro valor inteiro: ");
        int num1 = sc.nextInt();
        System.out.println("Insira o segundo valor inteiro: ");
        int num2 = sc.nextInt();
        int auxilo = num1;
        int num1 = num2;
        int num2 = auxilo;
        //Ao trocar o valor de num1 para num2, o valor original de num1 é perdido pois os dois agora tem o mesmo valor
        sc.close();
    }
}




R38:
    double largura = 8.0;
    double altura = 3.0;
        
    double perimetro = 2 * (largura + altura);
    double area = largura * altura;

    System.out.println("Perímetro: " + perimetro);
    System.out.println("Área: " + area);

R39:
Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor da compra: ");
        double valor = sc.nextDouble();
        if( valor >= 100){
            valor = valor * 0.90;
        }
        System.out.println("Valor finaol da compra: "+valor);
        //Uma loja oferece 10% de desconto em compras a partir de R$ 100,00. Receba o valor da compra e calcule o preço final.
        sc.close();




R40:
Usando variavel de auxilio:
System.out.println("Insira o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Insira o segundo numero: ");
        int num2 = sc.nextInt();
        int auxilio = (num1 + num2) * 2;

Nao Usando:
System.out.println("Insira o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Insira o segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println((num1 + num2) * 2);
A versao usando e mais facil de entender, porem acho que vai de gosto.



R41: 
 Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma quantidade de segundos: ");
        int sec = sc.nextInt();
        int horas = sec / 3600;
        int segundosRestantes = sec % 3600;

        int minutos = segundosRestantes / 60;
        int segundos = segundosRestantes % 60;
        
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
        sc.close();
    



R42:
   Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do troco em centavos: ");
        int trocoCentavos = sc.nextInt();

        int moeda1Real = 100;
        int moeda50Centavos = 50;
        int moeda25Centavos = 25;
        int moeda10Centavos = 10;
        int moeda5Centavos = 5;

        int qtd1Real = trocoCentavos / moeda1Real;
        trocoCentavos = trocoCentavos % moeda1Real;

        int qtd50Centavos = trocoCentavos / moeda50Centavos;
        trocoCentavos %= moeda50Centavos;

        int qtd25Centavos = trocoCentavos / moeda25Centavos;
        trocoCentavos %= moeda25Centavos;

        int qtd10Centavos = trocoCentavos / moeda10Centavos;
        trocoCentavos %= moeda10Centavos;

        int qtd5Centavos = trocoCentavos / moeda5Centavos;
        int centavosSobrando = trocoCentavos % moeda5Centavos; 

        
        System.out.println("\nDistribuição do troco:");
        System.out.println("Moedas de R$ 1,00: " + qtd1Real);
        System.out.println("Moedas de R$ 0,50: " + qtd50Centavos);
        System.out.println("Moedas de R$ 0,25: " + qtd25Centavos);
        System.out.println("Moedas de R$ 0,10: " + qtd10Centavos);
        System.out.println("Moedas de R$ 0,05: " + qtd5Centavos);
        if (centavosSobrando > 0) {
            System.out.println("Valor não devolvido (inferior a 5 centavos): " + centavosSobrando + " centavo(s)");
        }
        sc.close();




R43: 
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite tres valores inteiros: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if (A + B > C && A + C > B && B + C > A) {
            System.out.println("Eles podem formar um triângulo.");
        }
        else {
            System.out.println("Eles nao podem formar um triângulo.");
        }
        //Receba três comprimentos inteiros positivos e determine se eles podem formar um triângulo.
        sc.close();




R44:
        boolean[] valores = {false, true};
        boolean saoTodasEquivalentes = true;

        for (boolean A : valores) {
            for (boolean B : valores) {

                boolean expr1 = !(A || B);
                boolean expr2 = !A && !B;

                boolean equivalentesNestaLinha = (expr1 == expr2);
                if (!equivalentesNestaLinha) {
                    saoTodasEquivalentes = false;
                }


                System.out.println(A + "\t" + B + "\t" + expr1 + "\t\t" + expr2 + "\t\t" + equivalentesNestaLinha);
            }
        }

        System.out.println("------------------------------------------------------------------");
        if (saoTodasEquivalentes) {
            System.out.println("Conclusão: As expressões são EQUIVALENTES para todas as combinações.");
        } else {
            System.out.println("Conclusão: As expressões NÃO são equivalentes.");
        }




R45:
    Scanner sc = new Scanner(System.in);
         System.out.println("Insira a quantidade de horas trabalhadas: ");
        int horas = sc.nextInt();
            
        System.out.println("Insira o valor pago por hora");
        double valorHora = sc.nextDouble();
            
        int horasExtras = 0;
            
        if(horas > 40){
            horasExtras = horas - 40;
            horas = 40;
        }
            
        double valorNormal = horas * valorHora;
        double valorBonus = horasExtras * (valorHora * 1.50);
        valorNormal = valorNormal + valorBonus;
            
        System.out.println(valorNormal);
        sc.close();
    



R46:
Scanner sc = new Scanner(System.in);

        System.out.println("Insira seu saldo: ");
        double saldo = sc.nextDouble();
        System.out.println("Insira um valor de deposito: ");
        double deposito = sc.nextDouble();
        System.out.println("Insira um valor de saque: ");
        double saque = sc.nextDouble();

        System.out.println("Saldo final: "+ ((saldo + deposito) - saque));
        sc.close();




R47:
   Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numeroOriginal = sc.nextInt();

        int temp = numeroOriginal;
        int numeroInvertido = 0;

        
        while (temp > 0) {
            int digito = temp % 10;                     // Pega o último dígito
            numeroInvertido = (numeroInvertido * 10) + digito; // Adiciona o dígito ao número invertido
            temp /= 10;                                 // Remove o último dígito
        }

        
        if (numeroOriginal == numeroInvertido) {
            System.out.println(numeroOriginal + " e um palíndromo numérico");
        } else {
            System.out.println(numeroOriginal + " nao é um palíndromo numérico.");
        }
        sc.close();
        



48:
 Scanner sc = new Scanner(System.in);
        System.out.print("Digite as Horas do primeiro horario: ");
        int horas1 = sc.nextInt();
        System.out.print("Digite os minutos do primeiro horario: ");
        int min1 = sc.nextInt();

        System.out.print("Digite as Horas do segundo horario: ");
        int horas2 = sc.nextInt();
        System.out.print("Digite os minutos do segundo horario: ");
        int min2 = sc.nextInt();
        min1 = (horas1 * 60) + min1;
        min2 = (horas2 * 60) + min2;
        if(min1 > min2){
            System.out.println("Esses horarios estao a "+(min1 - min2+" de distancia"));
        }
        else{
            System.out.println("Esses horarios estao a "+(min2 - min1+" de distancia"));
        }
        sc.close();




49:
 Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor total da compra: ");
        double valorTotalReais = sc.nextDouble();

        System.out.print("Digite a quantidade de parcelas: ");
        int numParcelas = sc.nextInt();

        
        int totalCentavos = (int) Math.round(valorTotalReais * 100);

        int valorBaseCentavos = totalCentavos / numParcelas;
        int resto = totalCentavos % numParcelas;

        System.out.println("\n--- Distribuição das Parcelas ---");
        int somaVerificacaoCentavos = 0;

        for (int i = 1; i <= numParcelas; i++) {
            int valorParcelaCentavos = valorBaseCentavos;

            
            if (i <= resto) {
                valorParcelaCentavos += 1;
            }

            somaVerificacaoCentavos += valorParcelaCentavos;

            
            System.out.printf("Parcela %d: R$ %.2f\n", i, valorParcelaCentavos / 100.0);
        }

        System.out.println("---------------------------------");
        System.out.printf("Soma das parcelas: R$ %.2f\n", somaVerificacaoCentavos / 100.0);
        System.out.printf("Total original:    R$ %.2f\n", totalCentavos / 100.0);
        
        sc.close();




50: 
Scanner sc = new Scanner(System.in);
        System.out.println("Insira um valor inteiro: ");
        int valor = sc.nextInt();
        System.out.println("Insira o numero da divisao");
        int div = sc.nextInt();
        if ((valor % div) == 0) {
            System.out.println("Ele é dívisivel");
        }
        else{
            System.out.println("Ele não é");
        }
        sc.close();




51:
 Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int c = sc.nextInt();

        if (a < b && b < c) {
            System.out.println("Os números estão em ordem CRESCENTE.");
        }
        // Verificando se é estritamente decrescente
        else if (a > b && b > c) {
            System.out.println("Os números estão em ordem DECRESCENTE.");
        }
        
        else if (a <= b && b <= c) {
            System.out.println("Os números estão em ordem NÃO DECRESCENTE.");
        }
        else {
            
            System.out.println("Os números NÃO se encaixam em nenhuma das três ordens exclusivas.");
        }
        sc.close();




52:
    Scanner sc = new Scanner(System.in);
        int senha = 123456;

        String user = "Gabriel";
        System.out.println("Insira seu usario: ");
        String user02 = sc.nextLine();

        System.out.println("Insira a senha: ");
        int senha02 = sc.nextInt();
        Boolean verificaUser = false;
        Boolean verificaSenha = false;
        if(user.equals(user02)){
            verificaUser = true;
        }
        if(senha == senha02){
            verificaSenha = true;
        }
        if(verificaSenha && verificaUser){
            System.out.println("Acesso permitido, user e senha compativeis");
        }
        else if(!verificaSenha && !verificaUser){
            System.out.println("Acesso Negado, senha e user errados");
        }
        else if(!verificaSenha){
            System.out.println("Acesso Negado, senha errada");
        }
        else if(!verificaUser){
            System.out.println("Acesso Negado, user errado");
        }
        
        sc.close();



53: 
 Scanner sc = new Scanner(System.in);
        
        System.out.println("TABELA DE TARIFAS ");
        System.out.println("Tarifa Básica: 15 reais, Tarifa por peso: 5 reais por kg e Tarifa por km: 0.50 reais por Km");
        
        System.out.println("Insira o peso da encomenda: ");
        double peso = sc.nextDouble();
        
        System.out.println("insira os Km: ");
        double km = sc.nextDouble();
        
        double custoTotal = 15 + (peso * 5) + (km * 0.50);
        
        System.out.printf("O valor da encomenda vai sair por: %.2f", custoTotal);
        sc.close();



54:
    System.out.print("Digite um número inteiro positivo: ");
        int numero = sc.nextInt();

        int somaDivisores = 0;


        for (int i = 1; i < numero; i++) {

            if (numero % i == 0) {
                somaDivisores += i;
            }


            if (somaDivisores == numero) {
                System.out.println(numero + " A soma dos divisores perfeitos é igual ao numero");
            } else {
                System.out.println(numero + " A soma dos divisores perfeitos nao é igual ao numero");
            }

            sc.close();




R55:
Scanner sc = new Scanner(System.in);
        System.out.print("Digite o coeficiente a: ");
        double a = sc.nextDouble();

        System.out.print("Digite o coeficiente b: ");
        double b = sc.nextDouble();

        System.out.print("Digite o coeficiente c: ");
        double c = sc.nextDouble();

        
        if (a == 0) {
            System.out.println("O coeficiente 'a' deve ser diferente de zero para ser uma equação do segundo grau.");
        } else {
            
            double delta = (b * b) - (4 * a * c);

            System.out.printf("\nValor de Delta (Δ): %.2f\n", delta);

            
            if (delta > 0) {
                System.out.println("A equação possui duas raizes reais e distintas.");
            } else if (delta == 0) {
                System.out.println("A equação possui duas raizes reais e iguais (uma única raiz real).");
            } else {
                System.out.println("A equação nao possui raizes reais (possuirá raízes complexas).");
            }
        }
        sc.close();




R56:
      Scanner sc = new Scanner(System.in);
        int senhaCorreta = 123456;
        Boolean validaIDade = false;
        Boolean validaSenha = false;
        Boolean validaAtiva = false;
        Boolean valida = true;
        System.out.println("O cadastro do usuario esta ativo?(responda com Sim ou Nao): ");
        String esta = sc.nextLine();

        System.out.println("Insira sua senha: ");
        int senha = sc.nextInt();

        System.out.println("Insira sua idade: ");
        int idade = sc.nextInt();

        if(idade >= 18 ){
            validaIDade = true;
        }
        else {
            valida = false;
        }
        if(senha == senhaCorreta){
            validaSenha = true;
        }
        else{
            valida = false;
        }
        if(esta.equals("Sim")){
            validaAtiva = true;
        }
        else {
            valida = false;
        }

        if(valida){
            System.out.print("Acesso Permitido.");
        }
        else{
            System.out.print("Acesso Negado.");
        }

        if(!validaAtiva){
            System.out.print(" Conta não está ativa.");
        }

        if(!validaIDade){
            System.out.print(" Erro: menor de idade.");
        }
        if(!validaSenha){
            System.out.print(" Senha incorreta.");
        }
        
        sc.close();




R57:
     Scanner sc = new Scanner(System.in);
        System.out.println("-----CALCULADORA-----\n 1 -> Soma\n 2 -> Subtração\n 3 -> Multiplicação\n 4 -> Divisão");

        System.out.println("\n Insira a sua operação: ");
        int op = sc.nextInt();

        System.out.println("Insira o primeiro valor: ");
        int num1 = sc.nextInt();

        System.out.println("Insira o segundo valor: ");
        int num2 = sc.nextInt();

        int res = 0;
        switch (op){
            case 1:
                res = num1 + num2;
                System.out.println("Resultado: "+ res);
                break;
            case 2:
                res = num1 - num2;
                System.out.println("Resultado: "+ res);
                break;
            case 3:
                res = num1 * num2;
                System.out.println("Resultado: "+ res);
                break;
            case 4:
                res = num1 / num2;
                System.out.println("Resultado: "+ res);
                break;
            default:
                System.out.println("Erro: Operação Inválida");
                break;
        }
        
        sc.close();




R58:
     Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, insira um número inteiro positivo.");
            return;
        }

        System.out.println("Divisores de " + n + " em ordem crescente:");


        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        
        sc.close();
    }




R59:
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número positivo: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo número positivo: ");
        int b = sc.nextInt();

        if (a <= 0 || b <= 0) {
            System.out.println("Por favor, insira apenas números inteiros positivos.");
            sc.close();
            return;
        }

        int mdc = calcularMDC(a, b);

        System.out.println("O MDC entre " + a + " e " + b + " é: " + mdc);

        sc.close();
    

    public static int calcularMDC(int a, int b) {
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }




R60:
     Scanner sc = new Scanner(System.in);
        System.out.println("Inisra o primeiro numero positivo: ");
        int a = sc.nextInt();
        System.out.println("Inisra o segundo numero positivo: ");
        int b = sc.nextInt();

        int resultadoMdc = calcularMdc(a, b);
        int resultadoMmc = (a * b) / resultadoMdc;

        System.out.println(resultadoMmc);
        sc.close();

    public static int calcularMdc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    sc.close();

R61: 
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numeros = new int[n];
        int maior = 0;
        
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
            if (i == 0 || numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        
        System.out.println(maior);
        sc.close();




R62: 
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numeros = new int[n];
        
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }
        
        boolean crescente = true;
        boolean decrescente = true;
        
        for (int i = 0; i < n - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                crescente = false;
            }
            if (numeros[i] < numeros[i + 1]) {
                decrescente = false;
            }
        }
        
        if (crescente && decrescente) {
            System.out.println("ordenada");
        } else if (crescente) {
            System.out.println("crescente");
        } else if (decrescente) {
            System.out.println("decrescente");
        } else {
            System.out.println("nao-ordenada");
        }
        
        sc.close();




R63:
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Inisra o numero: ");
        int num1 = sc.nextInt();
        
        System.out.println("Insira sua potencia: ");
        int pot = sc.nextInt();
        
        int res = num1;
        
        for(int i = 1; i < pot; i++){
            res = res * num1;
        }
        
        System.out.println(res);
        
        sc.close();



R64:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int numero = sc.nextInt();
            System.out.println(decimalParaRomano(numero));
        } else if (sc.hasNext()) {
            String romano = sc.next();
            System.out.println(romanoParaDecimal(romano));
        }
        
        sc.close();
    }




    public static String decimalParaRomano(int num) {
        if (num < 1 || num > 4000) {
            return "Valor fora do intervalo (1 a 4000)";
        }

        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] simbolos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < valores.length; i++) {
            while (num >= valores[i]) {
                num -= valores[i];
                resultado.append(simbolos[i]);
            }
        }
        return resultado.toString();
    }



    public static int romanoParaDecimal(String s) {
        int total = 0;
        int valorAnterior = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int valorAtual = 0;
            switch (s.charAt(i)) {
                case 'I': valorAtual = 1; break;
                case 'V': valorAtual = 5; break;
                case 'X': valorAtual = 10; break;
                case 'L': valorAtual = 50; break;
                case 'C': valorAtual = 100; break;
                case 'D': valorAtual = 500; break;
                case 'M': valorAtual = 1000; break;
            }

            if (valorAtual < valorAnterior) {
                total -= valorAtual;
            } else {
                total += valorAtual;
                valorAnterior = valorAtual;
            }
        }
        return total;



R65:
    Scanner sc = new Scanner(System.in);
        
        String texto = sc.nextLine();
        int vogais = 0;
        int consoantes = 0;
        int digitos = 0;
        int espacos = 0;
        
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            
            if (Character.isDigit(c)) {
                digitos++;
            } else if (Character.isWhitespace(c)) {
                espacos++;
            } else if (Character.isLetter(c)) {
                char lower = Character.toLowerCase(c);
                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                    vogais++;
                } else {
                    consoantes++;
                }
            }
        }
        
        System.out.println("Vogais: " + vogais);
        System.out.println("Consoantes: " + consoantes);
        System.out.println("Digitos: " + digitos);
        System.out.println("Espacos: " + espacos);
        
        sc.close();




R66:
    Scanner sc = new Scanner(System.in);
        
        String texto = sc.nextLine();
        String limpo = "";
        
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                limpo += Character.toLowerCase(c);
            }
        }
        
        boolean palindromo = true;
        int n = limpo.length();
        
        for (int i = 0; i < n / 2; i++) {
            if (limpo.charAt(i) != limpo.charAt(n - 1 - i)) {
                palindromo = false;
                break;
            }
        }
        
        if (palindromo && !limpo.isEmpty()) {
            System.out.println("Palindromo");
        } else {
            System.out.println("Nao palindromo");
        }
        
        sc.close();



R67:N é possível mn.

R68:
Scanner sc = new Scanner(System.in);
        
        String texto = sc.nextLine().toLowerCase();
        
        String limpo = "";
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isLetterOrDigit(c) || Character.isWhitespace(c)) {
                limpo += c;
            } else {
                limpo += " ";
            }
        }
        
        String[] palavras = limpo.trim().split("\\s+");
        
        if (palavras.length == 1 && palavras[0].isEmpty()) {
            sc.close();
            return;
        }
        
        boolean[] processadas = new boolean[palavras.length];
        
        for (int i = 0; i < palavras.length; i++) {
            if (processadas[i]) {
                continue;
            }
            
            int contador = 1;
            for (int j = i + 1; j < palavras.length; j++) {
                if (palavras[i].equals(palavras[j])) {
                    contador++;
                    processadas[j] = true;
                }
            }
            
            System.out.println(palavras[i] + ": " + contador);
        }
        
        sc.close();



69:
    Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int numeroSecreto = random.nextInt(100) + 1;
        int tentativas = 0;
        int maxTentativas = 100;
        int[] historico = new int[maxTentativas];
        
        System.out.println("Adivinhe o número entre 1 e 100!");
        
        boolean acertou = false;
        
        while (!acertou && tentativas < maxTentativas) {
            int palpite = sc.nextInt();
            historico[tentativas] = palpite;
            tentativas++;
            
            if (palpite == numeroSecreto) {
                acertou = true;
            } else if (palpite < numeroSecreto) {
                System.out.println("O número secreto é maior.");
            } else {
                System.out.println("O número secreto é menor.");
            }
        }
        
        if (acertou) {
            System.out.println("Parabens, Voce acertou em " + tentativas + " tentativas.");
        } else {
            System.out.println("Suas tentativas acabaram. O numero era " + numeroSecreto);
        }
        
        System.out.print("Historico de palpites: ");
        for (int i = 0; i < tentativas; i++) {
            System.out.print(historico[i] + " ");
        }
        System.out.println();
        
        sc.close();




R70:
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n < 0) {
            System.out.println("Nao pertence");
            sc.close();
            return;
        }
        
        boolean pertence = false;
        if (n == 0 || n == 1) {
            pertence = true;
        } else {
            int a = 0;
            int b = 1;
            int atual = 0;
            
            while (atual < n) {
                atual = a + b;
                a = b;
                b = atual;
                if (atual == n) {
                    pertence = true;
                    break;
                }
            }
        }
        
        if (pertence) {
            System.out.println("Pertence");
        } else {
            System.out.println("Nao pertence");
        }
        
        sc.close();




R71:
    Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int encontrado = -1;
        
        for (int i = 0; i < n; i++) {
            int numero = sc.nextInt();
            if (numero % a == 0 && numero % b == 0 && numero % c == 0) {
                encontrado = numero;
                break;
            }
        }
        
        System.out.println(encontrado);
        sc.close();




R72:
Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        double[] numeros = new double[n];
        
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextDouble();
        }
        
        Arrays.sort(numeros);
        
        double mediana = 0;
        if (n % 2 == 1) {
            mediana = numeros[n / 2];
        } else {
            mediana = (numeros[(n / 2) - 1] + numeros[n / 2]) / 2.0;
        }
        
        System.out.println(mediana);
        sc.close();
    




R73: 
    Scanner sc = new Scanner(System.in);
        
        int totalOperacoes = 0;
        int operacoesInvalidas = 0;
        
        System.out.println("Calculadora iniciada. Digite o operador (+, -, *, /) ou 's' para sair.");
        
        while (true) {
            System.out.print("Operador: ");
            String opStr = sc.next();
            
            if (opStr.equalsIgnoreCase("s") || opStr.equalsIgnoreCase("sair")) {
                break;
            }
            
            char op = opStr.charAt(0);
            
            if (op != '+' && op != '-' && op != '*' && op != '/') {
                System.out.println("Operador invalido!");
                operacoesInvalidas++;
                totalOperacoes++;
                continue;
            }
            
            System.out.print("Digite os dois numeros: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            
            boolean invalida = false;
            double resultado = 0;
            
            if (op == '+') {
                resultado = a + b;
            } else if (op == '-') {
                resultado = a - b;
            } else if (op == '*') {
                resultado = a * b;
            } else if (op == '/') {
                if (b == 0) {
                    System.out.println("Erro: Divisao por zero!");
                    invalida = true;
                    operacoesInvalidas++;
                } else {
                    resultado = a / b;
                }
            }
            
            if (!invalida) {
                System.out.println("Resultado: " + resultado);
            }
            
            totalOperacoes++;
        }
        
        System.out.println("--- Resumo das Operacoes ---");
        System.out.println("Total de operacoes: " + totalOperacoes);
        System.out.println("Operacoes invalidas: " + operacoesInvalidas);
        
        sc.close();



R74: ???? oque aconteceu com os numeros entre o 73 e o 81?kkkkkkk



R81:
    public static void exibirMensagem() {
        System.out.println("Mensagem");
    }

    public static void main(String[] args) {
        exibirMensagem();
    }


R82:
     public static void exibirSaudacao(String nome){
        System.out.println("Saudações! me chamo "+ nome);
    }
    public static void main(String[] args) {
        
        exibirSaudacao("Gabriel");
        
    }


R83:
    public static int somar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int resultado = somar(a, b);
        System.out.println(resultado);
        
        sc.close();


R84:
    public static int contarDigitosPares(int n) {
        if (n == 0) {
            return 1;
        }
        
        if (n < 0) {
            n = -n;
        }
        
        int contador = 0;
        
        while (n > 0) {
            int digito = n % 10;
            if (digito % 2 == 0) {
                contador++;
            }
            n /= 10;
        }
        
        return contador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int resultado = contarDigitosPares(n);
        System.out.println(resultado);
        
        sc.close();
    }


R85:
    public static boolean verificarTriangulo(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        if (verificarTriangulo(a, b, c)) {
            System.out.println("Triangulo valido");
        } else {
            System.out.println("Triangulo invalido");
        }
        
        sc.close();
    }




R86:
    public static String removerEspacosRepetidos(String texto) {
        if (texto == null || texto.isEmpty()) {
            return texto;
        }
        
        String resultado = "";
        boolean ultimoFoiEspaco = false;
        
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            
            if (c == ' ') {
                if (!ultimoFoiEspaco) {
                    resultado += c;
                    ultimoFoiEspaco = true;
                }
            } else {
                resultado += c;
                ultimoFoiEspaco = false;
            }
        }
        
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String texto = sc.nextLine();
        String textoLimpo = removerEspacosRepetidos(texto);
        
        System.out.println(textoLimpo);
        
        sc.close();
    }




R87:
    public static String converterBase(int n, int base) {
        if (base < 2 || base > 16) {
            return "Base inválida";
        }
        
        if (n == 0) {
            return "0";
        }
        
        boolean negativo = false;
        if (n < 0) {
            negativo = true;
            n = -n;
        }
        
        char[] simbolos = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String resultado = "";
        
        while (n > 0) {
            int resto = n % base;
            resultado += simbolos[resto];
            n /= base;
        }
        
        if (negativo) {
            resultado += "-";
        }
        
        
        String invertida = "";
        for (int i = resultado.length() - 1; i >= 0; i--) {
            invertida += resultado.charAt(i);
        }
        
        return invertida;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int base = sc.nextInt();
        
        String resposta = converterBase(n, base);
        System.out.println(resposta);
        
        sc.close();
    }





R88:
    public static int potencia(int base, int exp) {
        int resultado = 1;
        for (int i = 0; i < exp; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static boolean ehArmstrong(int n) {
        if (n < 0) {
            return false;
        }
        if (n == 0) {
            return true;
        }
        
        int temp = n;
        int digitos = 0;
        while (temp > 0) {
            digitos++;
            temp /= 10;
        }
        
        temp = n;
        int soma = 0;
        while (temp > 0) {
            int digito = temp % 10;
            soma += potencia(digito, digitos);
            temp /= 10;
        }
        
        return soma == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        if (ehArmstrong(n)) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Nao Armstrong");
        }
        
        sc.close();
    }





R89:
public static int primeiroNegativo(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                return i;
            }
        }
        return -1;
    }

    public static int primeiroAcimaDoLimite(int[] vetor, int limite) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > limite) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        int[] vetor = new int[n];
        
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextInt();
        }
        
        int posNegativo = primeiroNegativo(vetor);
        System.out.println("Posicao do primeiro negativo: " + posNegativo);
        
        System.out.print("Digite o valor limite para a busca: ");
        int limite = sc.nextInt();
        
        int posAcima = primeiroAcimaDoLimite(vetor, limite);
        System.out.println("Posicao do primeiro acima do limite: " + posAcima);
        
        sc.close();
    }




R90:
    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int proximoPrimo(int n) {
        int atual = n + 1;
        while (true) {
            if (ehPrimo(atual)) {
                return atual;
            }
            atual++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int resultado = proximoPrimo(n);
        
        System.out.println(resultado);
        
        sc.close();
    }