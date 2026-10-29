**Gustavo Costa**\
**RA:** 22653426\
**Email:** gustavo.cs@sempreceub.com

---

# Assignment

## Seção I

**1.** Problema computacional é uma tarefa que precisa ser resolvida, através de um computador, descrita por entradas, processamento de dados e saída esperada. Algoritmo é uma sequencial finita de passos que resolve todas as possibilidades de um problema. Código-fonte é o algoritmo escrito em uma linguagem de programação como o Java.

**2.** O javac lê o código-fonte, confere a sintaxe e os tipos para verificar se há erros e ao final gera um bytecode no arquivo .class. A Java Virtual Machine (JVM) executa o bytecode gerado e traduz para a linguagem de máquina em que está rodando, por isso a linguagem Java consegue rodar em diferentes sistemas operacionais.

**3.** O main é o ponto de partida do programa, ao rodar o public class a JVM procura o método `public static void main(String[] args)` e começa a execução por ele. Sem o main a classe não pode ser executada diretamente.

**4.** arquivo `.java` → `javac` → arquivo `.class` → JVM → programa em execução.

**5.** Na declaração escolhermos o tipo da variável e o nome que daremos a ela. Inicializar é atribuir o primeiro valor a ela. Uma variável declarada e não inicializada não pode ser usada e na hora de compilar apresenta um erro.

**6.** É de tipagem forte porque toda variável tem um tipo definido na declaração, o compilador não deixa misturar tipos incompatíveis sem conversão.

**7.**

- `int idade`
- `double altura`
- `char letraDaTurma`
- `String nomeCompleto`
- `boolean statusDeMatricula` (matriculado ou não).

**8.** Quando uma variável é declarada usando char o valor atribuído a ela deve vir entre aspas simples, ao colocar aspas duplas é referente à uma String então o compilador acusa "incompatible types: String cannot be converted to char".

Correção:

1. `char resposta = 'S';`
2. `String resposta = "S";`

**9.**

```
hii
world!
```

**10.** A saída esperada é 2 porque como as variáveis são declaradas como inteiro o programa desconsidera o que vem depois do ponto então 2.5 passa a ser 2.

**11.** Resultado: 103. Ao utilizar o x + y sem parênteses o programa concatena as variáveis então x + y gera 103.

**12.** Resultado: 13. Os parênteses fazem a soma acontecer antes de concatenar com o restante do println.

**13.** 2. Ao colar o 5 e o 2 sem "." (5.0 e 2.0) o programa primeiro calcula a divisão com 5 e 2 sendo inteiros e só depois ele atribui o tipo double a essa variável. Portanto primeiro chega-se ao resultado 2 e só depois ele passa a ser do tipo double.

**14.**

- x = 20
- y = 10

O y recebe uma "cópia de x", portanto alterar o x depois não altera o valor de y.

**15.**

```java
public class OlaCurso {
    public static void main(String[] args) {
        System.out.print("Engenharia de ");
        System.out.println("Software");
    }
}
```

**16.**

```java
public class Q16Matricula {
    public static void main(String[] args) {

        String nome = "Gustavo Costa";
        int semestre = 1;
        boolean matriculado = true;

        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Semestre: %d\n", semestre);
        System.out.printf("Matriculado: %b\n", matriculado);
    }
}
```

**17.**

```java
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
```

**18.**

```java
import java.util.Scanner;

public class Q18Operacoes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));

        sc.close();
    }
}
```

**19.**

```java
import java.util.Scanner;

public class Q19Idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = sc.nextInt();
        System.out.print("Digite o ano atual: ");
        int anoAtual = sc.nextInt();

        int idade = anoAtual - anoNascimento;
        System.out.println("Idade: " + idade);

        sc.close();
    }
}
```

**20.**

```java
import java.util.Scanner;

public class Q20AreaCirculo {

    static final double PI = 3.14159;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = sc.nextDouble();

        double area = PI * raio * raio;
        System.out.printf("Área do círculo: %.2f\n", area);

        sc.close();
    }
}
```

**21.**

```java
import java.util.Scanner;

public class Q21MaiorQue100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero>100) {
            System.out.println("O número é maior que 100.");
        } else if (numero==100){
            System.out.println("O número é igual a 100.");
        } else {
            System.out.println("O número é menor que 100.");
        }
        sc.close();
    }
}
```

**22.**

```java
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
```

**23.**

```java
import java.util.Scanner;

public class Q23MediaPonderada {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite o peso da primeira nota: ");
        double peso1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite o peso da segunda nota: ");
        double peso2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();
        System.out.print("Digite o peso da terceira nota: ");
        double peso3 = sc.nextDouble();

        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
        System.out.printf("Média ponderada: %.2f\n", mediaPonderada);

        sc.close();
    }
}
```

**24.**

```java
import java.util.Scanner;

public class Q24SaqueTroco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do saque: ");
        int saque = sc.nextInt();
        int notas50 = saque / 50;
        int troco = saque % 50;

        System.out.printf("Notas de 50: %d%n", notas50);
        System.out.printf("Troco: %d%n", troco);

        sc.close();
    }
}
```

**25.**

Para guardar o resultado sem usar if basta atribuir a comparação direto na variável boolean, porque a comparação já devolve true ou false. Então temperatura < 0, temperatura == 0 e temperatura > 30 vão direto para as variáveis abaixoDeZero, igualAZero e acimaDe30.

```java
import java.util.Scanner;

public class Q25TemperaturaBooleans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Temperatura: ");
        double temperatura = sc.nextDouble();

        boolean abaixoDeZero = temperatura < 0;
        boolean igualAZero = temperatura == 0;
        boolean acimaDe30 = temperatura > 30;

        System.out.println("Abaixo de zero: " + abaixoDeZero);
        System.out.println("Igual a zero: " + igualAZero);
        System.out.println("Acima de 30: " + acimaDe30);

        sc.close();
    }
}
```

**26.**

Para converter os segundos precisamos dividir o total por 3600 para obter as horas, depois pegamos o resto dessa divisão e dividimos por 60 para obter os minutos e ao final o resto da divisão do total por 60 são os segundos que sobram.

```java
import java.util.Scanner;

public class Q26Segundos {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Segundos: ");
        int segundos = sc.nextInt();

        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = segundos % 60;

        System.out.println("Horas: " + horas + "h" + minutos + "m" + segundosRestantes + "s");
        
        sc.close();
}
}
```

**27.**

Para separar o número dividimos ele por 10 para obter a dezena e usamos o % 10 para obter a unidade. Para mostrar o número invertido imprimimos primeiro a unidade e depois a dezena, como os dois estão sendo concatenados com o texto eles aparecem lado a lado em vez de serem somados.

```java
import java.util.Scanner;

public class Q27DezenasUnidades {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número entre 1 e 100: ");
        int numero = sc.nextInt();
        
            int dezenas = numero / 10;
            int unidades = numero % 10;

            System.out.println("Número invertido: " + unidades + dezenas );
    }
}
```

**28.**

Existem dois erros no código exibido. 1) o tipo atribuído pra totalAlunos e alunosAprovados são inteiros então primeiro se calcula a divisão em inteiro e só depois esse número é transformado em double portanto ao dividir 15/25 fica 0 e só depois ele vira um double. 2) Para se calcular uma porcentagem precisamos multiplicar a dividas de alunosAprovados e totalAlunos por 100 e isso não ocorre no código.

```java
public class Q28Aprovacao {
    public static void main(String[] args) {
        int totalAlunos = 25;
        int alunosAprovados = 15;
        double taxaAprovacao = (double) alunosAprovados / totalAlunos * 100;
        System.out.println("Taxa de aprovação: " + taxaAprovacao + "%");
    }
}
```

## Seção II

**29.**

Está faltando o ; no final do System.out.println(a + " " + b) então é gerado um erro de compilação. Com o ; ao final a saída do código passa a ser: 14 7


**30.**

A variável idade está sendo declarada duas vezes (linha 1 e 4) então ao rodar o código o Java não permite duas variáveis com o mesmo nome e aparece o erro variable idade is already defined. Para corrigir basta atribuir o novo valor na quarta linha sem o int:

```java 
int idade;
idade = 20;
int ano = idade + 2000;
idade = 21;
System.out.println(idade + ano);
```

Com a correção a saída passa a ser 2041, porque idade e ano são int então o + soma os dois valores (21 + 2020) em vez de concatenar.


**31.**

Para a quantidade de produtos usamos int porque é sempre um número inteiro, para o preço double porque tem centavos, para a letra da categoria char porque é um único caractere e para a disponibilidade boolean porque só pode ser verdadeiro ou falso.

int quantidadeProdutos;
double precoUnitarioProduto;
char categoriaProduto;
boolean disponibilidadeProduto;


**32.**

O problema é que a media que devia ser calculada em double esta recebendo um valor de soma de dois inteiros e dividindo por um número inteiro o que gera uma divisão sem levar em conta as casas decimais. Para corrigir podemos substituir o 2 por 2.0.

```java
public class Q32Media {
    public static void main(String[] args) {
        int nota1 = 7;
        int nota2 = 8;
        double media = (nota1 + nota2) / 2.0;
        System.out.println(media);
    }
}
```

**33.**

A primeira linha soma os dois números porque x e y são int, então aparece 7. Na segunda o texto vem primeiro então o 5 e o 2 são concatenados como texto e aparece 52. Na terceira os parênteses fazem a soma acontecer antes de concatenar então aparece 7.

```
7
Resultado: 52
Resultado: 7
```

**34.**

Para achar o quociente inteiro usamos o / entre dois int e para o resto usamos o %, mas antes precisamos verificar se o denominador é 0 porque não existe divisão por zero.

```java
import java.util.Scanner;

public class Q34Divisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numerador: ");
        int numerador = sc.nextInt();
        System.out.print("Digite o denominador: ");
        int denominador = sc.nextInt();

        if (denominador == 0) {
            System.out.println("Não existe divisão por zero.");
        } else {
            System.out.println("Quociente: " + (numerador / denominador));
            System.out.println("Resto: " + (numerador % denominador));
        }
        sc.close();
    }
}
```

**35.**

Para converter os minutos em horas dividimos o total por 60, como a divisão é entre int ela já descarta o que sobra, e o resto da divisão por 60 são os minutos que não completam uma hora.

```java
import java.util.Scanner;

public class Q35MinutosHoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de minutos: ");
        int minutos = sc.nextInt();

        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;

        System.out.println(minutos + " minutos equivalem a " + horas + " horas e " + minutosRestantes + " minutos.");
    }
}
```

**36.**

Para separar os algarismos precisamos usar a divisão inteira e o resto. A centena é o número dividido por 100, a dezena é o número dividido por 10 e depois o resto dessa divisão por 10 e a unidade é o resto da divisão do número por 10. Antes disso verificamos se o número tem mesmo três algarismos, ou seja se está entre 100 e 999.

```java
import java.util.Scanner;

public class Q36UnidadesDezenasCentenas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro de três algarismos: ");
        int numero = sc.nextInt();

        if (numero < 100 || numero > 999) {
            System.out.println("O número precisa ter três algarismos.");} 
        else {
            int centena = numero / 100;
            int dezena = (numero / 10) % 10;
            int unidade = numero % 10;

            System.out.println("Centena: " + centena);
            System.out.println("Dezena: " + dezena);
            System.out.println("Unidade: " + unidade);
        }
        sc.close();
    }
}
```

**37.**

Sem a variável auxiliar ao atribuir o valor do número 2 ao número 1 (numero1 = numero2) o valor original do número 1 se perde, quando vem numero2 = numero1 as duas variáveis ficam com o valor do numero2. Para resolver isso devemos criar uma variável auxiliar que recebe o valor do numero1 temporariamente e depois fazemos as seguintes atribuições: numero1 = numero2 e numero2 = aux.

```java
import java.util.Scanner;

public class Q37Troca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = sc.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = sc.nextInt();

        int aux = numero1;
        numero1 = numero2;
        numero2 = aux;

        System.out.println("Após a troca:");
        System.out.println("Primeiro número: " + numero1);
        System.out.println("Segundo número: " + numero2);

        sc.close();
    }
}
```

**38.**

Imaginei que o código calculava o perímetro e a área de um retângulo já que 2 * base + 2 * altura (2 * x + 2 * y) equivale ao cálculo de um perímetro de um retângulo e base * altura (x * y) equivale a área do retângulo, portanto refatorei para ficar assim:

```java
public class Q38Retangulo {
    public static void main(String[] args) {
        double base = 8;
        double altura = 3;
        
        System.out.println("O perímetro do retângulo é: " + (2 * (base + altura)));
        System.out.println("Área do retângulo: " + (base * altura));
    }
}
```

**39.**

Para aplicar o desconto guardamos os 10% na variável desconto e verificamos se a compra é de pelo menos 100 reais, se for multiplicamos o valor por (1 - desconto) que é o mesmo que pagar 90% do valor. Para mostrar o valor com duas casas decimais usamos o printf com %.2f.

```java
import java.util.Scanner;

public class Q39Desconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = sc.nextDouble();

        double desconto = 0.10; 

        if (valorCompra >= 100) { 
            double valorComDesconto = valorCompra * (1 - desconto);
            System.out.printf("O valor da compra com desconto é: %.2f%n", valorComDesconto);
        } 
        else {
            System.out.printf("O valor da compra não tem desconto. Valor: %.2f%n", valorCompra);
        }
        sc.close();
    }
}
```

**40.**

Na primeira versão a soma fica guardada na variável soma e depois multiplicamos por 2, na segunda o cálculo é feito direto na expressão 2 * (numero1 + numero2). A versão com a variável auxiliar é mais fácil de entender porque cada passo tem um nome e dá pra ver o que está sendo calculado, a versão direta é mais curta mas depende dos parênteses porque sem eles 2 * numero1 + numero2 daria um resultado diferente.

```java
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
```

**41.**

Para passar de um número em segundos para HH:MM:SS precisamos dividir os segundos por 3600 para obter as horas, o resto da divisão que sobra devemos transformar em minutos portanto dividir apenas o resto por 60 (totalSegundos % 3600) / 60 e depois devemos pegar o resto da divisão do total de segundos por 60 e atribuir aos segundos. Para apresentar devemos usar o printf com o parâmetro %02d:%02d:%02d%n que recebem horas, minutos e segundos e mostra o numero com dois dígitos.

```java
import java.util.Scanner;   

public class Q41Relogio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de segundos: ");
        int totalSegundos = sc.nextInt();

        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;

        System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);

    
        sc.close();
    }
}
```

**42.**

Para dar o troco começamos pela moeda maior, dividimos o troco pelo valor da moeda para saber quantas moedas vão e depois atualizamos o troco com o resto da divisão, então a próxima moeda é calculada só com o que ainda falta devolver. Como a menor moeda é de 5 centavos, se sobrar algum valor no final ele é mostrado como os centavos que não dá para devolver.

```java
import java.util.Scanner;

public class Q42Moedas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Troco em centavos: ");
        int troco = sc.nextInt();

        int moedas1Real = troco / 100;
        troco = troco % 100;
        int moedas50Centavos = troco / 50;
        troco = troco % 50;
        int moedas25Centavos = troco / 25;
        troco = troco % 25;
        int moedas10Centavos = troco / 10;
        troco = troco % 10;
        int moedas5Centavos = troco / 5;
        troco = troco % 5;

        System.out.printf("Moedas de 1 real: %d%n", moedas1Real);
        System.out.printf("Moedas de 50 centavos: %d%n", moedas50Centavos);
        System.out.printf("Moedas de 25 centavos: %d%n", moedas25Centavos);
        System.out.printf("Moedas de 10 centavos: %d%n", moedas10Centavos);
        System.out.printf("Moedas de 5 centavos: %d%n", moedas5Centavos);

        if (troco > 0) {
            System.out.printf("Centavos que não dá para devolver: %d%n", troco);
        }
        
        sc.close();
    }
}
```

**43.**

Para se formar um triângulo um lado nunca pode ser superior a soma dos outros dois lados.

```java
import java.util.Scanner;

public class Q43Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo lado: ");
        int b = sc.nextInt();
        System.out.print("Digite o terceiro lado: ");
        int c = sc.nextInt();

        if (a <= 0 || b <= 0 || c <= 0){
            System.out.println("Os comprimentos precisam ser positivos");
        }
        else if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Podem formar um triângulo");
        }
        else { 
            System.out.println("Não podem formar um triângulo.");
        }
        sc.close();
    }
}
```

**44. Duas expressões booleanas representam regras de acesso de um sistema. Construa uma tabela-verdade para cada expressão e determine se elas são equivalentes para todas as combinações possíveis das variáveis. Implemente um programa que compare os resultados das expressões.**

Como o enunciado não informa quais são as expressões, criei duas regras de acesso:

- Regra 1: ativo && (admin || dono), o usuário precisa estar ativo e ser administrador ou dono.
- Regra 2: (ativo && admin) || dono

**Tabela-verdade da Regra 1:** `ativo && (admin || dono)`

| ativo | admin | dono | Regra 1 |
|---|---|---|---|
| F | F | F | F |
| F | F | V | F |
| F | V | F | F |
| F | V | V | F |
| V | F | F | F |
| V | F | V | V |
| V | V | F | V |
| V | V | V | V |

**Tabela-verdade da Regra 2:** `(ativo && admin) || dono`

| ativo | admin | dono | Regra 2 |
|---|---|---|---|
| F | F | F | F |
| F | F | V | **V** |
| F | V | F | F |
| F | V | V | **V** |
| V | F | F | F |
| V | F | V | V |
| V | V | F | V |
| V | V | V | V |

Comparando as duas tabelas linha por linha as regras não são equivalentes, porque quando o ativo é falso e o dono é verdadeiro a regra 1 dá falso e a regra 2 dá verdadeiro (linhas em negrito), então na regra 2 um dono com o cadastro inativo consegue acessar o sistema.

Para comparar as regras no programa usamos três for, um para cada variável, que passam pelos valores false e true e testam as 8 combinações, se em alguma delas as regras derem resultados diferentes elas não são equivalentes.

```java
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
```

**45.**

Para calcular o salário precisamos verificar se a pessoa trabalhou mais de 40 horas, se trabalhou as 40 primeiras horas são pagas com o valor normal e as horas que passaram de 40 são pagas com 50% a mais, ou seja valor da hora * 1.5. Se não passou de 40 horas basta multiplicar as horas pelo valor da hora. Por exemplo 45 horas a 20 reais dão 40 * 20 + 5 * 30 = 950 reais.

```java
import java.util.Scanner;

public class Q45Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Horas trabalhadas: ");
        double horas = sc.nextDouble();
        System.out.print("Valor da hora: R$ ");
        double valorHora = sc.nextDouble();

        double salario;
        if (horas > 40) {
            double horasExtras = horas - 40;
            salario = 40 * valorHora + horasExtras * valorHora * 1.5;
        } else {
            salario = horas * valorHora;
        }

        System.out.printf("Salário bruto: R$ %.2f%n", salario);

        sc.close();
    }
}
```

**46.**

Para calcular o saldo final somamos o depósito ao saldo inicial e depois tiramos o saque, mas antes de tirar precisamos verificar se tem saldo suficiente, se o saque for maior que o saldo ele não é feito.

```java
import java.util.Scanner;

public class Q46Conta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Saldo inicial: R$ ");
        double saldo = sc.nextDouble();
        System.out.print("Depósito: R$ ");
        double deposito = sc.nextDouble();
        System.out.print("Saque: R$ ");
        double saque = sc.nextDouble();

        saldo = saldo + deposito;

        if (saque > saldo) {
            System.out.println("Saldo insuficiente, o saque não foi feito.");
        } else {
            saldo = saldo - saque;
        }

        System.out.printf("Saldo final: R$ %.2f%n", saldo);

        sc.close();
    }
}
```

**47.**

Para saber se um número é palíndromo precisamos inverter ele, então dentro do while pegamos o último algarismo com o % 10, colocamos no invertido e depois tiramos esse algarismo do número com o / 10. Ao final se o número invertido for igual ao original ele é um palíndromo.

```java
import java.util.Scanner;

public class Q47Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número inteiro positivo: ");
        int numero = sc.nextInt();

        int n = numero;
        int invertido = 0;
        while (n > 0) {
            invertido = invertido * 10 + n % 10;
            n = n / 10;
        }

        if (numero == invertido) {
            System.out.println(numero + " é palíndromo.");
        } else {
            System.out.println(numero + " não é palíndromo.");
        }

        sc.close();
    }
}
```

**48.**

Para calcular os minutos entre dois horários precisamos transformar cada horário em minutos desde a meia-noite, então multiplicamos as horas por 60 e somamos os minutos, depois é só subtrair o primeiro do segundo. Também verificamos se os horários são válidos e se o segundo vem depois do primeiro.

```java
import java.util.Scanner;

public class Q48Horarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro horário (horas): ");
        int h1 = sc.nextInt();
        System.out.print("Primeiro horário (minutos): ");
        int m1 = sc.nextInt();
        System.out.print("Segundo horário (horas): ");
        int h2 = sc.nextInt();
        System.out.print("Segundo horário (minutos): ");
        int m2 = sc.nextInt();

        int inicio = h1 * 60 + m1;
        int fim = h2 * 60 + m2;

        if (h1 < 0 || h1 > 23 || h2 < 0 || h2 > 23 || m1 < 0 || m1 > 59 || m2 < 0 || m2 > 59) {
            System.out.println("Horário inválido.");
        } else if (fim < inicio) {
            System.out.println("O segundo horário precisa ser depois do primeiro.");
        } else {
            System.out.println("Passaram " + (fim - inicio) + " minutos.");
        }

        sc.close();
    }
}
```

**49.**

Para não ter problema com as casas decimais do double transformamos o valor em centavos (int) e dividimos pela quantidade de parcelas, o resto dessa divisão são os centavos que sobram então cada uma das primeiras parcelas recebe 1 centavo a mais até acabar o resto. Ao final somamos as parcelas para mostrar que a soma é igual ao total, por exemplo 100 reais em 3 parcelas fica 33,34 + 33,33 + 33,33 = 100,00.

```java
import java.util.Scanner;

public class Q49Parcelas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da compra: R$ ");
        double valor = sc.nextDouble();
        System.out.print("Quantidade de parcelas: ");
        int parcelas = sc.nextInt();

        if (parcelas <= 0) {
            System.out.println("A quantidade de parcelas precisa ser maior que zero.");
        } else {
            // trabalha em centavos para não ter erro de arredondamento
            int totalCentavos = (int) Math.round(valor * 100);
            int base = totalCentavos / parcelas;
            int resto = totalCentavos % parcelas;
            int soma = 0;

            for (int i = 1; i <= parcelas; i++) {
                int parcela = base;
                if (i <= resto) {
                    parcela = parcela + 1;
                }
                soma = soma + parcela;
                System.out.printf("Parcela %d: R$ %.2f%n", i, parcela / 100.0);
            }

            System.out.printf("Soma das parcelas: R$ %.2f%n", soma / 100.0);
            System.out.printf("Total da compra: R$ %.2f%n", totalCentavos / 100.0);

            if (soma == totalCentavos) {
                System.out.println("A soma das parcelas é igual ao total.");
            }
        }

        sc.close();
    }
}
```

**50.**

Para saber se um número é divisível por outro usamos o %, se o resto da divisão for 0 ele é divisível. Antes precisamos verificar se o divisor é 0 porque não existe divisão por zero.

```java
import java.util.Scanner;

public class Q50Divisivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número: ");
        int numero = sc.nextInt();
        System.out.print("Divisor: ");
        int divisor = sc.nextInt();

        if (divisor == 0) {
            System.out.println("Não existe divisão por zero.");
        } else if (numero % divisor == 0) {
            System.out.println(numero + " é divisível por " + divisor);
        } else {
            System.out.println(numero + " não é divisível por " + divisor);
        }

        sc.close();
    }
}
```

**51.**

Para as três classificações serem exclusivas considerei que 1) crescente é quando cada número é maior que o anterior (1, 2, 3), 2) não decrescente é quando nenhum número é menor que o anterior mas tem algum repetido (1, 2, 2) e 3) decrescente é quando cada número é menor que o anterior (3, 2, 1). Como o else if só é testado quando a condição anterior deu falso, uma sequência crescente nunca cai no não decrescente, e os outros casos como 3, 1, 2 não se encaixam em nenhuma das três.

```java
import java.util.Scanner;

public class Q51Ordem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        double a = sc.nextDouble();
        System.out.print("Segundo número: ");
        double b = sc.nextDouble();
        System.out.print("Terceiro número: ");
        double c = sc.nextDouble();

        if (a < b && b < c) {
            System.out.println("Ordem crescente.");
        } else if (a <= b && b <= c) {
            System.out.println("Ordem não decrescente (tem valores repetidos).");
        } else if (a > b && b > c) {
            System.out.println("Ordem decrescente.");
        } else {
            System.out.println("Não está em nenhuma das três ordens.");
        }

        sc.close();
    }
}
```

**52.**

Para verificar o login comparamos o usuário e a senha digitados com os valores certos usando o .equals, porque são String, e guardamos cada resultado em uma variável boolean. Depois com if e else if testamos as quatro possibilidades, os dois certos, só o usuário certo, só a senha certa ou nenhum dos dois. Em um sistema de verdade não é bom informar qual dos dois está errado porque isso ajuda quem está tentando descobrir os usuários do sistema.

```java
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
```

**53.**

Para calcular o frete defini uma tarifa de acordo com o peso e um multiplicador de acordo com a distância, o custo final é a tarifa multiplicada pelo multiplicador.

| Peso | Tarifa |
|---|---|
| até 1 kg | R$ 15,00 |
| até 5 kg | R$ 25,00 |
| até 10 kg | R$ 40,00 |
| acima de 10 kg | R$ 40,00 + R$ 5,00 por kg acima de 10 |

| Distância | Multiplicador |
|---|---|
| até 100 km | 1,0 |
| até 500 km | 1,5 |
| acima de 500 km | 2,0 |

Por exemplo uma encomenda de 12 kg para 300 km fica (40 + 2 * 5) * 1,5 = 75 reais.

```java
import java.util.Scanner;

public class Q53Frete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Peso da encomenda (kg): ");
        double peso = sc.nextDouble();
        System.out.print("Distância (km): ");
        double distancia = sc.nextDouble();

        if (peso <= 0 || distancia <= 0) {
            System.out.println("Peso e distância precisam ser maiores que zero.");
        } else {
            double tarifa;
            if (peso <= 1) {
                tarifa = 15;
            } else if (peso <= 5) {
                tarifa = 25;
            } else if (peso <= 10) {
                tarifa = 40;
            } else {
                tarifa = 40 + (peso - 10) * 5;
            }

            double multiplicador;
            if (distancia <= 100) {
                multiplicador = 1.0;
            } else if (distancia <= 500) {
                multiplicador = 1.5;
            } else {
                multiplicador = 2.0;
            }

            double custo = tarifa * multiplicador;

            System.out.printf("Tarifa pelo peso: R$ %.2f%n", tarifa);
            System.out.println("Multiplicador da distância: " + multiplicador);
            System.out.printf("Custo do frete: R$ %.2f%n", custo);
        }

        sc.close();
    }
}
```

**54.**

Divisores próprios são os divisores de um número menores que ele, então percorremos com o for todos os números de 1 até o número - 1 e somamos os que dividem ele sem deixar resto. Se a soma for igual ao número ele é um número perfeito, por exemplo 28 = 1 + 2 + 4 + 7 + 14.

```java
import java.util.Scanner;

public class Q54NumeroPerfeito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número inteiro: ");
        int numero = sc.nextInt();

        int soma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                soma = soma + i;
            }
        }

        System.out.println("Soma dos divisores próprios: " + soma);
        if (numero > 0 && soma == numero) {
            System.out.println(numero + " é igual à soma dos seus divisores (número perfeito).");
        } else {
            System.out.println(numero + " não é igual à soma dos seus divisores.");
        }

        sc.close();
    }
}
```

**55.**

A natureza das raízes depende do delta, que é b * b - 4 * a * c. Se o delta for maior que 0 a equação tem duas raízes reais diferentes, se for igual a 0 tem duas raízes reais iguais e se for menor que 0 não tem raízes reais. Antes verificamos se o a é 0 porque nesse caso a equação não é do segundo grau.

```java
import java.util.Scanner;

public class Q55Bhaskara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("Com a = 0 a equação não é do segundo grau.");
        } else {
            double delta = b * b - 4 * a * c;
            System.out.println("Delta: " + delta);

            if (delta > 0) {
                System.out.println("Duas raízes reais e diferentes.");
            } else if (delta == 0) {
                System.out.println("Duas raízes reais e iguais.");
            } else {
                System.out.println("Não tem raízes reais.");
            }
        }

        sc.close();
    }
}
```

**56.**

Para testar a regra coloquei ela em uma função podeAcessar e criei outra função testar que compara o resultado com o esperado e mostra OK ou FALHOU. As 8 primeiras chamadas testam todas as combinações, usando 16 anos para menor de idade e 20 para maior, e as duas últimas testam o limite de 18 anos.

```java
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
```

Saída:

```
ativo  | senha  | idade | esperado | obtido | teste
false  | false  | 16    | false    | false  | OK
false  | false  | 20    | false    | false  | OK
false  | true   | 16    | false    | false  | OK
false  | true   | 20    | false    | false  | OK
true   | false  | 16    | false    | false  | OK
true   | false  | 20    | false    | false  | OK
true   | true   | 16    | false    | false  | OK
true   | true   | 20    | true     | true   | OK
true   | true   | 18    | true     | true   | OK
true   | true   | 17    | false    | false  | OK
```

**57.**

Para escolher a operação lemos o código como String e comparamos com o .equals em cada if e else if, se for + soma, se for - subtrai, se for * multiplica e se for / divide. Na divisão precisamos verificar se o segundo valor é 0 e se o código não for nenhum dos quatro mostramos que ele é inválido.

```java
import java.util.Scanner;

public class Q57Operacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Código da operação (+, -, * ou /): ");
        String operacao = sc.next();
        System.out.print("Primeiro valor: ");
        double a = sc.nextDouble();
        System.out.print("Segundo valor: ");
        double b = sc.nextDouble();

        if (operacao.equals("+")) {
            System.out.println("Resultado: " + (a + b));
        } else if (operacao.equals("-")) {
            System.out.println("Resultado: " + (a - b));
        } else if (operacao.equals("*")) {
            System.out.println("Resultado: " + (a * b));
        } else if (operacao.equals("/")) {
            if (b == 0) {
                System.out.println("Não existe divisão por zero.");
            } else {
                System.out.println("Resultado: " + (a / b));
            }
        } else {
            System.out.println("Código de operação inválido.");
        }

        sc.close();
    }
}
```

## Seção III

**58.**

Para achar os divisores percorremos com o for todos os números de 1 até o próprio número e imprimimos os que dividem ele sem deixar resto (numero % i == 0), como o for vai em ordem crescente os divisores já aparecem em ordem.

```java
import java.util.Scanner;

public class Q58Divisores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número inteiro positivo: ");
        int numero = sc.nextInt();

        if (numero <= 0) {
            System.out.println("O número precisa ser positivo.");
        } else {
            System.out.print("Divisores de " + numero + ":");
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    System.out.print(" " + i);
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
```

**59.**

Pelo algoritmo de Euclides o MDC de dois números é igual ao MDC do segundo número com o resto da divisão do primeiro pelo segundo, então dentro do while calculamos o resto, o segundo número passa a ser o primeiro e o resto passa a ser o segundo. Repetimos isso até o resto dar 0 e o último divisor é o MDC.

```java
import java.util.Scanner;

public class Q59Mdc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Segundo número: ");
        int b = sc.nextInt();

        if (a <= 0 || b <= 0) {
            System.out.println("Os dois números precisam ser positivos.");
        } else {
            int x = a;
            int y = b;
            while (y != 0) {
                int resto = x % y;
                x = y;
                y = resto;
            }
            System.out.println("MDC(" + a + ", " + b + ") = " + x);
        }

        sc.close();
    }
}
```

**60.**

Para calcular o MMC usamos o MDC, porque MMC = a * b / MDC. Primeiro calculamos o MDC pelo algoritmo de Euclides igual na questão anterior e depois dividimos o a pelo MDC antes de multiplicar pelo b para o número não ficar grande demais.

```java
import java.util.Scanner;

public class Q60Mmc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Segundo número: ");
        int b = sc.nextInt();

        if (a <= 0 || b <= 0) {
            System.out.println("Os dois números precisam ser positivos.");
        } else {
            // MDC pelo algoritmo de Euclides
            int x = a;
            int y = b;
            while (y != 0) {
                int resto = x % y;
                x = y;
                y = resto;
            }
            int mdc = x;

            int mmc = a / mdc * b;

            System.out.println("MDC(" + a + ", " + b + ") = " + mdc);
            System.out.println("MMC(" + a + ", " + b + ") = " + mmc);
        }

        sc.close();
    }
}
```

**61.**

Para ler números até o usuário encerrar usamos um while que para quando ele digita 0, então o 0 não entra na contagem. A cada número comparamos com o anterior e se for maior somamos 1 na contagem, no primeiro número não tem anterior então usamos a variável primeiro para pular a comparação.

```java
import java.util.Scanner;

public class Q61MaiorQueAnterior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vezes = 0;
        int anterior = 0;
        boolean primeiro = true;

        System.out.print("Número (0 para encerrar): ");
        int numero = sc.nextInt();

        while (numero != 0) {
            if (!primeiro && numero > anterior) {
                vezes++;
            }
            anterior = numero;
            primeiro = false;

            System.out.print("Número (0 para encerrar): ");
            numero = sc.nextInt();
        }

        System.out.println("Vezes em que um valor foi maior que o anterior: " + vezes);

        sc.close();
    }
}
```

**62.**

Para identificar a ordem começamos considerando que a sequência é crescente e decrescente ao mesmo tempo e a cada número comparamos com o anterior, se ele for menor ou igual ao anterior ela deixa de ser crescente e se for maior ou igual deixa de ser decrescente. Ao final se nenhuma das duas sobrou ela não está ordenada, por isso valores repetidos como 1, 1, 2 contam como não ordenada.

```java
import java.util.Scanner;

public class Q62Ordenacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números? ");
        int quantidade = sc.nextInt();

        if (quantidade < 2) {
            System.out.println("Digite pelo menos 2 números.");
        } else {
            boolean crescente = true;
            boolean decrescente = true;

            System.out.print("Número 1: ");
            int anterior = sc.nextInt();

            for (int i = 2; i <= quantidade; i++) {
                System.out.print("Número " + i + ": ");
                int atual = sc.nextInt();

                if (atual <= anterior) {
                    crescente = false;
                }
                if (atual >= anterior) {
                    decrescente = false;
                }
                anterior = atual;
            }

            if (crescente) {
                System.out.println("A sequência está em ordem crescente.");
            } else if (decrescente) {
                System.out.println("A sequência está em ordem decrescente.");
            } else {
                System.out.println("A sequência não está ordenada.");
            }
        }

        sc.close();
    }
}
```

**63.**

Para calcular a potência começamos o resultado em 1 e multiplicamos ele pela base dentro do for a quantidade de vezes do expoente. O resultado é long porque a potência cresce muito rápido e passa do limite do int.

```java
import java.util.Scanner;

public class Q63Potencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Base: ");
        int base = sc.nextInt();
        System.out.print("Expoente: ");
        int expoente = sc.nextInt();

        if (base <= 0 || expoente < 0) {
            System.out.println("Use base positiva e expoente maior ou igual a zero.");
        } else {
            long resultado = 1;
            for (int i = 0; i < expoente; i++) {
                resultado = resultado * base;
            }
            System.out.println(base + " elevado a " + expoente + " = " + resultado);
        }

        sc.close();
    }
}
```

**64.**

Para passar de decimal para romano usamos dois vetores, um com os valores e outro com os símbolos (incluindo os casos como CM, XC e IV), e vamos tirando do número o maior valor que couber e colocando o símbolo dele no resultado. Para passar de romano para decimal somamos o valor de cada letra, mas quando a letra vale menos que a próxima ela é subtraída, como o I do IV. Para saber se o romano digitado está certo convertemos o resultado de volta para romano e se não der o mesmo texto ele estava errado, como IIII ou VX. Os números romanos tradicionais vão até 3999 (MMMCMXCIX) então para 4000 o programa usa MMMM.

```java
import java.util.Scanner;

public class Q64Romanos {

    static int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    static String[] simbolos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String paraRomano(int numero) {
        String romano = "";
        for (int i = 0; i < valores.length; i++) {
            while (numero >= valores[i]) {
                romano = romano + simbolos[i];
                numero = numero - valores[i];
            }
        }
        return romano;
    }

    public static int valorDaLetra(char letra) {
        if (letra == 'I') return 1;
        if (letra == 'V') return 5;
        if (letra == 'X') return 10;
        if (letra == 'L') return 50;
        if (letra == 'C') return 100;
        if (letra == 'D') return 500;
        if (letra == 'M') return 1000;
        return 0;
    }

    public static int paraDecimal(String romano) {
        int total = 0;
        for (int i = 0; i < romano.length(); i++) {
            int atual = valorDaLetra(romano.charAt(i));
            if (atual == 0) {
                return -1; // letra que não existe nos romanos
            }
            if (i + 1 < romano.length() && atual < valorDaLetra(romano.charAt(i + 1))) {
                total = total - atual;
            } else {
                total = total + atual;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Decimal para romano");
        System.out.println("2 - Romano para decimal");
        System.out.print("Opção: ");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.print("Número (1 a 4000): ");
            int numero = sc.nextInt();
            if (numero < 1 || numero > 4000) {
                System.out.println("O número precisa estar entre 1 e 4000.");
            } else {
                System.out.println(numero + " = " + paraRomano(numero));
            }
        } else if (opcao == 2) {
            System.out.print("Número romano: ");
            String romano = sc.next().toUpperCase();
            int numero = paraDecimal(romano);
            // se converter de volta e não der o mesmo texto, o romano estava escrito errado (ex.: IIII, VX)
            if (numero < 1 || numero > 4000 || !paraRomano(numero).equals(romano)) {
                System.out.println("Número romano inválido.");
            } else {
                System.out.println(romano + " = " + numero);
            }
        } else {
            System.out.println("Opção inválida.");
        }

        sc.close();
    }
}
```

**65.**

Para contar passamos o texto para minúsculas e percorremos ele com o for, caractere por caractere. Se o caractere estiver na lista de vogais (incluindo as acentuadas) contamos como vogal, se for outra letra contamos como consoante, se estiver entre 0 e 9 como dígito e se for um espaço como espaço.

```java
import java.util.Scanner;

public class Q65Caracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = sc.nextLine().toLowerCase();

        String listaVogais = "aeiouáàâãéêíóôõú";
        int vogais = 0;
        int consoantes = 0;
        int digitos = 0;
        int espacos = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (listaVogais.indexOf(c) >= 0) {
                vogais++;
            } else if (Character.isLetter(c)) {
                consoantes++;
            } else if (c >= '0' && c <= '9') {
                digitos++;
            } else if (c == ' ') {
                espacos++;
            }
        }

        System.out.println("Vogais: " + vogais);
        System.out.println("Consoantes: " + consoantes);
        System.out.println("Dígitos: " + digitos);
        System.out.println("Espaços: " + espacos);

        sc.close();
    }
}
```

**66.**

Para ignorar espaços, pontuação e maiúsculas passamos o texto para minúsculas e guardamos só as letras e números em outra String. Depois comparamos a primeira letra com a última, a segunda com a penúltima e assim por diante, se alguma for diferente não é palíndromo. Por exemplo "Anotaram a data da maratona" é palíndromo.

```java
import java.util.Scanner;

public class Q66PalindromoTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = sc.nextLine().toLowerCase();

        // guarda só letras e números
        String limpo = "";
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                limpo = limpo + c;
            }
        }

        boolean palindromo = true;
        int inicio = 0;
        int fim = limpo.length() - 1;

        while (inicio < fim && palindromo) {
            if (limpo.charAt(inicio) != limpo.charAt(fim)) {
                palindromo = false;
            }
            inicio++;
            fim--;
        }

        if (palindromo) {
            System.out.println("É palíndromo.");
        } else {
            System.out.println("Não é palíndromo.");
        }

        sc.close();
    }
}
```

**67.** Sem enunciado.

**68.**

Para contar as palavras primeiro trocamos a pontuação por espaço e separamos o texto em palavras com o split. Depois usamos dois vetores, um guarda as palavras diferentes e o outro na mesma posição guarda quantas vezes cada uma apareceu, então para cada palavra procuramos ela no primeiro vetor, se já estiver somamos 1 na contagem e se não estiver adicionamos ela.

```java
import java.util.Scanner;

public class Q68ContaPalavras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = sc.nextLine().toLowerCase();

        // troca pontuação por espaço
        String limpo = "";
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                limpo = limpo + c;
            } else {
                limpo = limpo + ' ';
            }
        }

        String[] palavras = limpo.trim().split(" +");
        String[] diferentes = new String[palavras.length];
        int[] contagem = new int[palavras.length];
        int total = 0;

        for (int i = 0; i < palavras.length; i++) {
            if (!palavras[i].isEmpty()) {
                int posicao = -1;
                for (int j = 0; j < total; j++) {
                    if (diferentes[j].equals(palavras[i])) {
                        posicao = j;
                    }
                }

                if (posicao == -1) {
                    diferentes[total] = palavras[i];
                    contagem[total] = 1;
                    total++;
                } else {
                    contagem[posicao]++;
                }
            }
        }

        if (total == 0) {
            System.out.println("Nenhuma palavra encontrada.");
        }
        for (int i = 0; i < total; i++) {
            System.out.println(diferentes[i] + ": " + contagem[i]);
        }

        sc.close();
    }
}
```

**69.**

Para o jogo sorteamos um número de 1 a 100 com o Random e dentro do while pedimos palpites até o usuário acertar, a cada palpite falamos se o número secreto é maior ou menor. Cada palpite é guardado no vetor historico e a variável tentativas conta quantos foram, ao final mostramos as tentativas e o histórico.

```java
import java.util.Random;
import java.util.Scanner;

public class Q69Adivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secreto = random.nextInt(100) + 1;
        int[] historico = new int[100];
        int tentativas = 0;
        int palpite = 0;

        System.out.println("Adivinhe o número entre 1 e 100.");

        while (palpite != secreto && tentativas < historico.length) {
            System.out.print("Seu palpite: ");
            palpite = sc.nextInt();

            historico[tentativas] = palpite;
            tentativas++;

            if (palpite < secreto) {
                System.out.println("O número secreto é maior.");
            } else if (palpite > secreto) {
                System.out.println("O número secreto é menor.");
            } else {
                System.out.println("Acertou!");
            }
        }

        System.out.println("Tentativas: " + tentativas);
        System.out.print("Histórico dos palpites:");
        for (int i = 0; i < tentativas; i++) {
            System.out.print(" " + historico[i]);
        }
        System.out.println();

        sc.close();
    }
}
```

**70.**

Para saber se o número está na sequência de Fibonacci geramos os termos da sequência (0, 1, 1, 2, 3, 5, 8, 13...) somando sempre os dois anteriores até chegar no número ou passar dele. Se algum termo for igual ao número ele pertence à sequência.

```java
import java.util.Scanner;

public class Q70Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número inteiro positivo: ");
        int numero = sc.nextInt();

        long a = 0;
        long b = 1;
        while (a < numero) {
            long proximo = a + b;
            a = b;
            b = proximo;
        }

        if (a == numero) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }

        sc.close();
    }
}
```

**71.**

Considerei a sequência como os números a partir do valor que o usuário escolher, de 1 em 1, então dentro do while testamos cada número até achar um que seja divisível pelos três valores ao mesmo tempo. Começando do 1 o resultado é o MMC dos três valores.

```java
import java.util.Scanner;

public class Q71PrimeiroDivisivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Começar a sequência em: ");
        int inicio = sc.nextInt();
        System.out.print("Primeiro valor: ");
        int a = sc.nextInt();
        System.out.print("Segundo valor: ");
        int b = sc.nextInt();
        System.out.print("Terceiro valor: ");
        int c = sc.nextInt();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Os três valores precisam ser positivos.");
        } else {
            int numero = inicio;
            while (!(numero % a == 0 && numero % b == 0 && numero % c == 0)) {
                numero++;
            }
            System.out.println("Primeiro número divisível por " + a + ", " + b + " e " + c + ": " + numero);
        }

        sc.close();
    }
}
```

**72.**

Para calcular a mediana precisamos colocar os números em ordem, para isso usei o bubble sort que compara os vizinhos e troca eles de lugar quando estão fora de ordem. Depois de ordenar, se a quantidade for ímpar a mediana é o número do meio e se for par é a média dos dois do meio.

```java
import java.util.Scanner;

public class Q72Mediana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de números: ");
        int quantidade = sc.nextInt();

        if (quantidade <= 0) {
            System.out.println("A quantidade precisa ser maior que zero.");
        } else {
            double[] numeros = new double[quantidade];
            for (int i = 0; i < quantidade; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                numeros[i] = sc.nextDouble();
            }

            // ordena com bubble sort
            for (int i = 0; i < quantidade - 1; i++) {
                for (int j = 0; j < quantidade - 1 - i; j++) {
                    if (numeros[j] > numeros[j + 1]) {
                        double aux = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = aux;
                    }
                }
            }

            double mediana;
            if (quantidade % 2 == 1) {
                mediana = numeros[quantidade / 2];
            } else {
                mediana = (numeros[quantidade / 2 - 1] + numeros[quantidade / 2]) / 2;
            }

            System.out.print("Ordenados:");
            for (int i = 0; i < quantidade; i++) {
                System.out.print(" " + numeros[i]);
            }
            System.out.println();
            System.out.println("Mediana: " + mediana);
        }

        sc.close();
    }
}
```

**73.**

Para a calculadora usamos um while que continua até o usuário digitar sair. A cada operação verificamos se ela é válida e se não for somamos 1 nas inválidas, a divisão por zero também conta como inválida. As operações que dão certo somam 1 nas realizadas e ao final mostramos as duas contagens e o total.

```java
import java.util.Scanner;

public class Q73Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int realizadas = 0;
        int invalidas = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.print("Operação (+, -, *, / ou sair): ");
            String operacao = sc.next();

            if (operacao.equals("sair")) {
                continuar = false;
            } else if (!(operacao.equals("+") || operacao.equals("-") || operacao.equals("*") || operacao.equals("/"))) {
                System.out.println("Operação inválida.");
                invalidas++;
            } else {
                System.out.print("Primeiro valor: ");
                double a = sc.nextDouble();
                System.out.print("Segundo valor: ");
                double b = sc.nextDouble();

                if (operacao.equals("/") && b == 0) {
                    System.out.println("Não existe divisão por zero.");
                    invalidas++;
                } else {
                    double resultado = 0;
                    if (operacao.equals("+")) {
                        resultado = a + b;
                    } else if (operacao.equals("-")) {
                        resultado = a - b;
                    } else if (operacao.equals("*")) {
                        resultado = a * b;
                    } else {
                        resultado = a / b;
                    }
                    System.out.println("Resultado: " + resultado);
                    realizadas++;
                }
            }
        }

        System.out.println("Operações realizadas: " + realizadas);
        System.out.println("Operações inválidas: " + invalidas);
        System.out.println("Total de tentativas: " + (realizadas + invalidas));

        sc.close();
    }
}
```

## Seção IV

**81.**

Para criar a função usamos static void porque ela não devolve nenhum valor, só imprime a mensagem, e para usar basta chamar exibirMensagem() dentro do main.

```java
public class Q81Mensagem {

    static void exibirMensagem() {
        System.out.println("Olá! Esta mensagem foi impressa por uma função.");
    }

    public static void main(String[] args) {
        exibirMensagem();
    }
}
```

**82.**

A função exibirSaudacao recebe o nome como parâmetro e imprime a saudação com ele, no main lemos o nome com o Scanner e passamos para a função.

```java
import java.util.Scanner;

public class Q82Saudacao {

    static void exibirSaudacao(String nome) {
        System.out.println("Olá, " + nome + "! Seja bem-vindo(a).");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Seu nome: ");
        String nome = sc.nextLine();

        exibirSaudacao(nome);

        sc.close();
    }
}
```

**83.**

A função somar é do tipo int porque devolve um número inteiro, ela recebe a e b como parâmetros e devolve a soma com o return. No main o resultado da função é guardado na variável resultado.

```java
public class Q83Somar {

    static int somar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int resultado = somar(7, 5);
        System.out.println("7 + 5 = " + resultado);
    }
}
```

**84.**

Para contar os algarismos pares pegamos o último algarismo com o % 10, verificamos se ele é par com o % 2 e depois tiramos ele do número com o / 10, repetindo até o número acabar. Usei o do while para o 0 também ser contado como um algarismo par e se o número for negativo transformamos ele em positivo antes.

```java
import java.util.Scanner;

public class Q84AlgarismosPares {

    static int contarAlgarismosPares(int numero) {
        if (numero < 0) {
            numero = -numero;
        }

        int pares = 0;
        do {
            int algarismo = numero % 10;
            if (algarismo % 2 == 0) {
                pares++;
            }
            numero = numero / 10;
        } while (numero > 0);

        return pares;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número inteiro: ");
        int numero = sc.nextInt();

        System.out.println("Algarismos pares: " + contarAlgarismosPares(numero));

        sc.close();
    }
}
```

**85.**

A função formaTriangulo devolve um boolean, true se os três lados formam um triângulo e false se não formam. Para formar um triângulo os lados precisam ser positivos e cada lado precisa ser menor que a soma dos outros dois.

```java
import java.util.Scanner;

public class Q85TrianguloValido {

    static boolean formaTriangulo(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }
        return a < b + c && b < a + c && c < a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lado 1: ");
        double a = sc.nextDouble();
        System.out.print("Lado 2: ");
        double b = sc.nextDouble();
        System.out.print("Lado 3: ");
        double c = sc.nextDouble();

        if (formaTriangulo(a, b, c)) {
            System.out.println("Formam um triângulo válido.");
        } else {
            System.out.println("Não formam um triângulo.");
        }

        sc.close();
    }
}
```

**86.**

Para tirar os espaços repetidos percorremos o texto e copiamos cada caractere para o resultado, menos quando ele é um espaço e o caractere anterior também é um espaço. Os colchetes na saída servem para mostrar onde o texto começa e termina.

```java
import java.util.Scanner;

public class Q86EspacosRepetidos {

    static String removerEspacosRepetidos(String texto) {
        String resultado = "";
        for (int i = 0; i < texto.length(); i++) {
            char atual = texto.charAt(i);
            boolean repetido = atual == ' ' && i > 0 && texto.charAt(i - 1) == ' ';
            if (!repetido) {
                resultado = resultado + atual;
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = sc.nextLine();

        System.out.println("[" + removerEspacosRepetidos(texto) + "]");

        sc.close();
    }
}
```

**87.**

Para converter para outra base dividimos o número pela base várias vezes e cada resto da divisão é um dígito, então os restos lidos de trás para frente formam o resultado. Nas bases maiores que 10 os restos de 10 a 15 viram as letras de A a F, por isso usamos a String digitos. Por exemplo 255 na base 16 fica FF e na base 2 fica 11111111.

```java
import java.util.Scanner;

public class Q87ConversorBase {

    static String converterBase(int valor, int base) {
        String digitos = "0123456789ABCDEF";

        if (valor == 0) {
            return "0";
        }

        boolean negativo = valor < 0;
        if (negativo) {
            valor = -valor;
        }

        String resultado = "";
        while (valor > 0) {
            int resto = valor % base;
            resultado = digitos.charAt(resto) + resultado;
            valor = valor / base;
        }

        if (negativo) {
            resultado = "-" + resultado;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor inteiro: ");
        int valor = sc.nextInt();
        System.out.print("Base (2 a 16): ");
        int base = sc.nextInt();

        if (base < 2 || base > 16) {
            System.out.println("A base precisa estar entre 2 e 16.");
        } else {
            System.out.println(valor + " na base " + base + " = " + converterBase(valor, base));
        }

        sc.close();
    }
}
```

**88.**

Um número de Armstrong é igual à soma dos seus dígitos elevados à quantidade de dígitos que ele tem, por exemplo 153 tem 3 dígitos e 1 + 125 + 27 = 153, que são 1, 5 e 3 elevados a 3. Para verificar usei uma função para contar os dígitos, outra para calcular a potência e a função ehArmstrong que soma as potências de cada dígito e compara com o número.

```java
import java.util.Scanner;

public class Q88Armstrong {

    static int contarDigitos(int numero) {
        int quantidade = 0;
        do {
            quantidade++;
            numero = numero / 10;
        } while (numero > 0);
        return quantidade;
    }

    static int potencia(int base, int expoente) {
        int resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado = resultado * base;
        }
        return resultado;
    }

    static boolean ehArmstrong(int numero) {
        if (numero < 0) {
            return false;
        }

        int quantidadeDigitos = contarDigitos(numero);
        int soma = 0;
        int n = numero;

        while (n > 0) {
            int digito = n % 10;
            soma = soma + potencia(digito, quantidadeDigitos);
            n = n / 10;
        }

        return soma == numero;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número inteiro: ");
        int numero = sc.nextInt();

        if (ehArmstrong(numero)) {
            System.out.println(numero + " é um número de Armstrong.");
        } else {
            System.out.println(numero + " não é um número de Armstrong.");
        }

        sc.close();
    }
}
```

**89.**

As duas funções percorrem o vetor com o for e devolvem a posição do primeiro elemento que satisfaz a condição, a primeira procura um valor negativo e a segunda um valor maior que o limite que o usuário digitar. Se o for terminar sem achar nenhum a função devolve -1. As posições começam em 0, então no vetor do exemplo o primeiro negativo (-4) está na posição 3.

```java
import java.util.Scanner;

public class Q89Busca {

    static int primeiroNegativo(int[] v) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] < 0) {
                return i;
            }
        }
        return -1;
    }

    static int primeiroAcimaDe(int[] v, int limite) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] > limite) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = {12, 5, 30, -4, 18, -7};

        System.out.print("Vetor:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(" " + numeros[i]);
        }
        System.out.println();

        System.out.println("Posição do primeiro negativo: " + primeiroNegativo(numeros));

        System.out.print("Limite: ");
        int limite = sc.nextInt();
        System.out.println("Posição do primeiro valor acima de " + limite + ": " + primeiroAcimaDe(numeros, limite));

        sc.close();
    }
}
```

**90.**

A função ehPrimo verifica se o número é primo testando os divisores de 2 até a raiz do número (i * i <= n), porque se ele tivesse um divisor maior que a raiz também teria um menor que já teria sido encontrado. A função proximoPrimo começa no número + 1 e vai somando 1 até a ehPrimo dizer que encontrou um primo.

```java
import java.util.Scanner;

public class Q90ProximoPrimo {

    static boolean ehPrimo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int proximoPrimo(int n) {
        int candidato = n + 1;
        while (!ehPrimo(candidato)) {
            candidato++;
        }
        return candidato;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número inteiro: ");
        int numero = sc.nextInt();

        System.out.println("Próximo primo depois de " + numero + ": " + proximoPrimo(numero));

        sc.close();
    }
}
```

## Projeto

**PlanilhaGastos.java**

Registra gastos por categoria em dois meses, mostra os totais, o maior gasto de cada mês e compara os meses (sugestão 1, Análise de Gastos).

```java
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
```

**AdivinheNumero.java**

Jogo de adivinhação de um número entre 1 e 100.

```java
import java.util.Scanner;
import java.util.Random;

public class AdivinheNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int tentativas = 0;
        int palpite;

        System.out.println("Bem-vindo ao jogo Adivinhe o Número!");
        System.out.println("Tente adivinhar o número secreto entre 1 e 100.");

        do {
            System.out.print("Digite seu palpite: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                scanner.next(); // Limpa a entrada inválida
            }
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("Muito baixo! Tente novamente.");
            } else if (palpite > numeroSecreto) {
                System.out.println("Muito alto! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número secreto em " + tentativas + " tentativas.");
            }
        } while (palpite != numeroSecreto);

        scanner.close();
    }
}
```

**PedraPapelTesoura.java**

Jogo de pedra, papel e tesoura contra o computador.

```java
import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};

        System.out.println("Bem-vindo ao jogo Pedra, Papel e Tesoura!");
        System.out.println("Escolha uma opção: 0 - Pedra, 1 - Papel, 2 - Tesoura");

        int escolhaUsuario = -1;
        while (escolhaUsuario < 0 || escolhaUsuario > 2) {
            System.out.print("Digite sua escolha (0, 1 ou 2): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                scanner.next(); // Limpa a entrada inválida
            }
            escolhaUsuario = scanner.nextInt();
            if (escolhaUsuario < 0 || escolhaUsuario > 2) {
                System.out.println("Escolha inválida. Tente novamente.");
            }
        }

        int escolhaComputador = random.nextInt(3);
        System.out.println("Você escolheu: " + opcoes[escolhaUsuario]);
        System.out.println("O computador escolheu: " + opcoes[escolhaComputador]);

        if (escolhaUsuario == escolhaComputador) {
            System.out.println("Empate!");
        } else if ((escolhaUsuario == 0 && escolhaComputador == 2) ||
                   (escolhaUsuario == 1 && escolhaComputador == 0) ||
                   (escolhaUsuario == 2 && escolhaComputador == 1)) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("O computador venceu!");
        }

        scanner.close();
    }
}
```
