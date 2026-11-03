# Assignment

## Aula I

1. Qual é a diferença entre problema computacional, algoritmo e código-fonte?

2. Qual é o papel do compilador (javac) e da Máquina Virtual Java (JVM) na execução de um programa em Java?

3. Qual é o propósito do método `main` em Java?

4. Ordene: JVM, arquivo `.class`, `javac`, arquivo `.java`, programa em execução.

5. Qual é a diferença entre declarar e inicializar uma variável?

6. Por que Java é considerada uma linguagem "de tipagem forte"? Que diferença há na prática ao criar variáveis?

7. Defina o tipo de variável para: idade, altura, letra da turma, nome completo e status de matrícula.

8. Explique porquê `char resposta = "S";` não compila e apresente duas correções.

9. Qual é a saída do código?

    ```java
    System.out.println("hii");
    System.out.print("world");
    System.out.println("!");
    ```

10. Qual é a saída do código?

   ```java
   int a = 5;
   int b = 2;
   System.out.println(a / b);
   ```

11. Qual é a saída do código?

    ```java
    int x = 10;
    int y = 3;
    System.out.println("Resultado: " + x + y);
    ```

12. Qual é a saída do código?

    ```java
    int x = 10;
    int y = 3;
    System.out.println("Resultado: " + (x + y));
    ```

13. Qual é a saída do código?

    ```java
    double a = 5 / 2;
    System.out.println(a);
    ```

14. Quais são os valores finais de `x` e `y`?

    ```java
    int x = 10;
    int y = x;
    x = 20;
    ```

15. Crie `exec15`, com classe pública `exec15` e exiba o nome do curso em duas linhas.

16. Escreva um programa que declare nome, semestre e status de matrícula e exiba os dados com `printf`.

17. Escreva um cartão de produto com descrição, código inteiro, preço, categoria e disponibilidade.

18. Escreva um programa que leia dois números inteiros do usuário e exiba a soma, subtração e multiplicação entre eles.

19. Escreva um programa que leia o ano de nascimento de um usuário e o ano atual, calcula a idade aproximada da pessoa (sem considerar o mês)

20. Declare uma constante para o valor de PI. Leia o raio de um círculo e calcule a área.

21. Escreva um programa que leia um número inteiro e exiba se o valor é maior que 100.

22. Leia uma temperatura em °C (Celsius) e converta para °F (Fahrenheit).

23. Leia três notas de um aluno e seus respectivos pesos. Calcule e exiba a média ponderada.

24. Leia um valor inteiro em reais que um usuário deseja sacar. Supondo que o caixa só tem notas de R$50, exiba quantas notas ele receberá e qual é o valor do "troco" que não pode ser sacado.

25. Leia uma temperatura e armazene em três variáveis (booleanas) se `temperatura < 0`, `temperatura == 0` e `temperatura > 30`. Exiba os dados. Não use `if`.

26. Leia um número inteiro representando uma quantidade total de segundos. Converta esse valor para horas, minutos e segundos.

27. Leia um número inteiro de dois dígitos. Extraia a dezena e a unidade e exiba o número invertido.

28. Identifique o erro, explique o motivo e reescreva o código com a correção.

    ```java
    // o objetivo é calcular a porcentagem de aprovação

    int totalAlunos = 25;
    int alunosAprovados = 15;
    double taxaAprovacao = alunosAprovados / totalAlunos;
    System.out.println("Taxa de aprovação: " + taxaAprovacao);
    ```

## Sessão II

29. Qual é a saída do código?

    ```java
    int a = 4;
    int b = a + 3;
    a = b *2;
    b = a - b;
    System.out.println(a + " " + b)
    ```

30. Identifique o erro de compilação. Corrija sem remover nenhuma das variáveis.

    ```java
    int idade;
    idade = 20;
    int ano = idade + 2000;
    int idade = 21;
    System.out.println(idade + ano);
    ```

31. Um programa precisa armazenar a quantidade de produtos em estoque, o preço unitário, a letra da categoria e se o produto está disponível. Escolha um tipo adequado para cada informação, declare e inicialize as variáveis.

32. Corrija o código, preserve o armazenamento da média de duas notas.

    ```java
    int nota1 = 7;
    int nota2 = 8;
    double media = (nota1 + nota2) / 2;
    System.out.println(media);
    ```

33. Qual é a saída do código?

    ```java
    int x = 5;
    int y = 2;
    
    System.out.println(x + y);
    System.out.println("Resultado: " + x + y);
    System.out.println("Resultado: " + (x + y));
    ```

34. Escreva um programa que recebe dois números inteiros, imprima o quociente inteiro e o resto da divisão.

35. Escreva um programa que recebe uma quantidade de minutos e converta ela em horas e minutos restantes.

36. Receba um número inteiro positivo de três algarismos e imprima a centena, a dezena e a unidade. Resolva com divisão inteira e operador de resto.

37. Receba dois números inteiros e troque seu valores. Explique porquê duas atribuições, sem variável de auxílio, não preservam os dois valores.

38. Refatore o código com nomes descritivos e sem cálculos duplicados.

    ```java
    double x = 8;
    double y = 3;
    System.out.println(2 * x + 2 * y);
    System.out.println(x * y);
    ```

39. Uma loja oferece 10% de desconto em compras a partir de R$ 100,00. Receba o valor da compra e calcule o preço final.

40. Implemente o cálculo do dobro da soma de dois números de duas maneiras:

- utilizando uma variável de auxílio para guardar a soma
- realizando o cálculo através de uma expressão

Compare as versões e explique qual versão é mais fácil de entender.

41. Receba um número inteiro representando uma duração em segundos e exiba no formato `HH:MM:SS`. Por exemplo, `3672` deve resultar em `01:01:12`.

42. Um caixa precisa devolver um troco utilizando moedas de R$ 1,00, R$ 0,50, R$ 0,25, R$ 0,10 e R$ 0,05. Receba o valor do troco em centavos e determine a quantidade de moedas de cada valor.

43. Receba três comprimentos inteiros positivos e determine se eles podem formar um triângulo.

44. Duas expressões booleanas representam regras de acesso de um sistema. Construa uma tabela-verdade para cada expressão e determine se elas são equivalentes para todas as combinações possíveis das variáveis. Implement um programa que compare os resultados das expressões.

45. Um programa recebe a quantidade de horas trabalhadas por um funcionário e o valor pago por hora. Calcule o salário bruto e, caso a jornada ultrapasse 40 horas, pague as horas excedentes com adicional de 50%.

46. Uma conta bancária começa com um saldo informado pelo usuário. Receba um valor de depósito e um valor de saque e calcule o saldo final.

47. Receba um número inteiro positivo e determine se ele é um palíndromo numérico.

48. Receba dois horários, representados por horas e minutos, e calcule quantos minutos se passaram entre eles dentro de um mesmo dia.

49. Um sistema de cobrança recebe o valor de uma compra e a quantidade de parcelas. Calcule o valor de cada parcela, considerando que o valor deve ser distribuído em centavos inteiros. Se houver um resto da divisão, distribua os centavos excedentes entre as primeiras parcelas e demonstre que a soma das parcelas corresponde ao total.

50. Receba um número inteiro e determine se ele é divisível por outro número informado pelo usuário.

51. Receba três números e determine se podem ser organizados em ordem crescente, não decrescente ou decrescente. As três classificações devem ser exclusivas.

52. Um sistema de autenticação recebe um nome de usuário e uma senha. Além de verificar se ambos correspondem aos valores esperados, informe se o usuário está correto, a senha está correta, ambos estão corretos ou nenhum está correto.

53. Uma empresa calcula o frete de uma encomenda com base no peso e na distância. Defina uma tabela de tarifas, implemente as regras e apresente o custo final.

54. Receba um número inteiro e determine se a soma de seus divisores positivos próprios é igual ao próprio número.

55. Reeba os coeficientes de uma equação do segundo grau e determine a natureza das raízes com base no discriminante.

56. Um sistema de acesso exige que o usuário tenha cadastro ativo, senha correta e idade mínima de 18 anos. Implemente a regra e construa testes para cada combinação.

57. Um programa recebe um código de operação e dois valores numéricos. O código determina se deve realizar soma, subtração, multiplicação ou divisão. Impleemente a seleção da operação.

## Sessão III

58. Receba um número inteiro positivo e imprima todos os seus divisores positivos em ordem crescente.

59. Receba um número inteiro positivo e calcule o máximo divisor comum (MDC) entre ele e outro inteiro positivo, utilizando o algoritmo de Euclides.

60. Receba dois inteiros positivos e determine o mínimo múltiplo comum (MMC). Utilize o MDC calculado.

61. Receba números inteiros até que o usuário encerre. Determine quantas vezes um valor é maior que o anterior.

62. Receba uma sequência de números e identifique se ela está em ordem crescente, decrescente ou não-ordenada.

63. Receba dois números inteiros positivos e calcule a potência do primeiro elevado ao segundo.

64. Implemente um conversor entre números decimais e algarismos romando para valores entre 1 e 4000.

65. Receba uma sequência de caracteres e conte quantas vogais, consolantes, dígitos e espaços existem.

66. Receba um texto e determine se ele é palíndromo, ignore espaços, pontuações e diferenças maiúsculas/minúsculas.

67. six seven

68. Receba um texto e conte quantas vezes cada palavra aparece.

69. Implemente um jogo de adivinhação em que o programa sorteia um número e o usuário recebe dicas se o número é maior/menor que o chute. Conte as tentativas e o histórico dos palpites.

70. Receba um número inteiro positivo e verifique se ele pertence à sequência de Fibonacci.

71. Um programa precisa encontrar o primeiro número de uma sequência que seja divisível por três valores fornecidos pelo usuário.

72. Receba uma quantidade de números e calcule a mediana.

73. Implemente uma calculadora que receba operações até o usuário encerrar. Além de calcular os resultados, mantenha o total de operações realizadas e a quantidade de operações inválidas.

## Sessão IV

81. Crie uma classe com uma função `static void exibirMensagem()` que imprime uma mensagem.

82. Crie uma função `exibirSaudacao(String nome)` que recebe um nome e imprime uma saudação.

83. Crie uma função `somar(int a, int b)` que retorne a soma dos dois parâmetros.

84. Implemente uma função que reeba um número inteiro e retorne a quantidade de algarismos pares que ele possui.

85. Implemente uma função que receba três comprimentos e retorne um resultado que indique se eles formam um triângulo válido.

86. Crie uma função que recebe uma `String` e retorne uma nova `String` sem espaços repetidos consecutivos.

87. Implemente uma função que recebe um valor inteiro e uma base entre 2 e 16 e retorne a representação do valor naquela base.

88. Implemente uma função que recebe um número inteiro e determine se ele é um número de Armstrong.

89. Uma função recebe um vetor e deve retornar a posição do primeiro elemento que saitisfaz uma condição definida pelo usuário ou `-1` quando nenhum elemento satisfaz a condição. Implemente uma versão para encontrar o primeiro valor negativo e outra para encontrar o primeiro valor acima de um limite.

90. Implemente uma função que recebe um número inteiro e retorne o próximo número primo maior que ele. Reutilize uma função auxiliar para testar a primalidade.

## Sessão VI

projetos miau



## PROJETO

Escolha um problema de verdade ou fictício que possa ser resolvido por um programa Java. Escreva uma proposta com o objetivo, o público que utilizará o programa, as entradas necessárias, o processamento e as saídas produzidas. Liste os requisitos funcionais, as restrições e, no mínimo, 5 casos de teste planejados antes da implementação.

Utilize os tipos adequados, expressões, condicionais, laços e funções conforme as necessidades do problema. Utilize vetores ou matrizes quando forem úteis, não apenas para cumprir uma exigência que é artificial. Após produzir uma versão funcional, revise o código em busca de duplicações, nomes ambíguos, validações ausentes e funções com responsabilidades excessivas. Registre as mudanças realizadas e justifique porquê cada uma melhora a solução.

Finalize o projeto e faça uma apresentação para demonstrar o funcionamento.

- Problema
- Solução
- Organização
- Testes
- Depuração
- Qualidade
- Avaliação Crítica

### Sugestões

1. Análise de Gastos

Registra despesas por categoria, calcula os totais, identifica os maiores gastos e compara os períodos.

2. Planejador de Estudos com Análise de Progresso

3. Análise de Logs

