# Introdução

Esse repositório visa explicar um pouco sobre o QuickSort: como exatamente ele funciona, em que casos é favorável usá-lo (ou não) e a importância da escolha de um algorítmo de ordenação adequado para a aplicação, tomando como parâmetro de comparação o BubbleSort.

# Parte 1: O Que é o QuickSort (e o BubbleSort)

QuickSort e BubbleSort são algorítmos de ordenação. Eles recebem uma lista de valores e os ordena, geralmente em ordem crescente. Parece ser algo simples, mas existem infinitas formas de simplesmente colocar uma sequência de números em ordem. O QuickSort é uma das formas mais eficientes de executar essa tarefa. Por mais que tenha uma lógica mais difícil de entender e sua implementação seja mais complicada, o QuickSort se destaca pela velocidade para listas com grande número de elementos, diferente do BubbleSort, que se destaca pela sua simplicidade e facilidade.

## BubbleSort

Para termos parâmetro, vou falar sobre o BubbleSort primeiro.

O BubbleSort é uma das maneiras mais simples para executar essa tarefa. Ele lê a lista em sequência, e compara dois valores vizinhos. Se o anterior for maior que o posterior, eles trocam de lugar. Isso faz com que cada vez que ele varre a lista inteira, o maior elemento fora de posição se torne ordenado. O programa faz isso até que não haja uma troca em uma das vezes que ele varre a lista, significando que todos os elementos da lista estão em suas respectivas posições.

Esse algorítmo é facil de entender e de implementar. Ele brilha quando a lista de elementos é pequena, também não requerendo nenhum espaço adicional na memória para variáveis, porém na vida real, onde quase sempre o número de elementos é enorme, não há quase nenhuma aplicação real para ele.

## QuickSort

O algorítmo em si que o QuickSort utiliza para ordenar uma lista segue a lógica de "dividir para conquistar". O programa escolhe um elemento para ser o pivô, que optei, por motivos de simplicidade de implementação, por ser o último elemento da lista, e troca os elementos da lista de posição de maneira que todos os elementos menores que o pivô fiquem antes dele, e todos os maiores após. Então, o algorítmo quebra a lista original em duas listas menores, uma com os elementos menores e outra com os elementos maiores que o pivô. Assim, o código repete a mesma sequência com as listas menores recursivamente, até que não tenha ocorrido nenhuma troca.

Por mais que pareça uma solução complexa demais para um problema tão simples, por mais que para uma lista com poucos elementos algo simples como o BubbleSort seja tanto eficiente quanto (se não mais eficiente), quando se trata de listas com dezenas ou até centenas de milhares de elementos, é necessário um algorítmo suficientemente efetivo, simplesmente comparar cada elemento (como faz o BubbleSort) seria demorado demais.

# Parte 2: Comparação

Agora que temos noção sobre o que um algoritmo de ordenação faz e como ele funciona, podemos começar a comparar alguns resultados sob uma perspectiva matemática sobre como cada um dos algorítmos se comporta quando a amostra de dados a ser analizada cresce, utilizando da notação Big O. Será sempre analisado os melhores e piores casos, além de um caso médio mais realista, para cada algorítmo sob uma ótica exclusivamente temporal, visto que ambos os algorítmos do trabalho têm complexidade espacial de $O(n)$.

Preliminarmente, seja n o número de elementos em uma lista.

## Análise do BubbleSort

Começando pelo BubbleSort, percebemos que para cada loop no algorítmo, precisamos comparar todos os pares vizinhos de elementos do array. Então, para n elementos, temos que fazer $n-1$ comparações por passagem.

Assim, no melhor dos casos, que para o BubbleSort acontece quando a lista já está ordenada, precisamos varrer apenas uma vez, fazendo com que tenha uma complexidade no melhor caso de $O(n)$.

Já para o pior caso possível, para ordenar um único elemento teremos que passar por toda a lista, ou seja, fazer $n-1$ comparações. Como temos n elementos, e para cada um temos que fazer $n-1$ comparações, no pior caso a complexidade temporal é dada por $n(n-1)$. Arredondando, e utilizando a notação correta, temos que a complexidade no pior dos casos é $O(n^2)$.

Utilizando da mesma lógica do pior caso, é possível estimar que, para cada passagem na lista ordenaremos apenas um elemento, como apenas colocamos o maior número ao final da lista (antes dos elementos ordenados), não podendo nos apoiar na possibilidade de haver um elemento já ordenado ou uma troca que, por coincidência, ordene dois elementos simultaneamente. Assim, podemos inferir que o caso médio para esse algorítmo é, também, $O(n^2)$.

## Análise do QuickSort

Para calcular a complexidade temporal do QuickSort, podemos definí-la como a soma das complexidades das duas listas criadas. Para cada recursão, varremos a lista inteira uma única vez, e criamos duas listas de tamanho $n/2$, e repetimos esse processo para cada partição criada. Além disso, para n elementos precisamos fazer n comparações cada vez que a lista é varrida.

Começando pelo melhor cenário, ele acontece quando escolhemos como valor de pivô o valor mediano, ou seja, ele já é o termo central. Isso ocorre pois sempre dividimos a lista em duas de tamanho idêntico, ou seja, dividimos n por 2 para cada loop, ou seja, para esta parcela temos complexidade $\log n$. Para cada uma dessas listas, temos que varrer a lista uma unica vez, assim chegando no resultado de $O(n \log n)$.

O caso em que a complexidade temporal é maior acontece quando o pivô é sempre um valor de uma das pontas, ou seja, o menor elemento ou o maior elemento. Isso geralmente acontece, irônicamente, em arrays já ordenadas ou em ordem reversa. Isso acontece pois o código cria uma lista vazia e outra com todo o resto dos elementos, ordenando apenas um elemento a cada vez que roda. Como foi discutido com o BubbleSort, ordenar apenas um elemento por vez causa complexidade temporal $O(n^2)$.

A complexidade baixa do melhor caso vem dos elementos serem divididos sempre igualmente (50 : 50), otimizando o processo. Porém, no caso médio, mesmo com uma discrepância grande de tamanho entre as listas, como 90 : 10, a profundidade da árvore de listas criada ainda se mantém proporcional a $\log n$, então podemos dizer que a complexidade média é, também, $O(n \log n)$.

# Parte 3: Conclusão

Cada algorítmo de ordenação tem seu propósito prático, e no caso do QuickSort, após certo ponto, ele consegue manter sua efetividade mesmo com amostras cada vez maiores, visto que a função log tem taxa de crescimento baixa comparada com uma função quadrática ou linear. No entanto, a função log em valores baixos cresce rapidamente, e por isso com número pequeno de elementos muitas vezes demora mais que o BubbleSort ou outros algorítmos que sofrem com valores maiores.

Todos os algorítmos tem suas próprias peculiaridades, como a mencionada anteriormente, e por isso um bom entendimento sobre cada um é necessário para implementação adequada. A diversidade de tais métodos de ordenação surge das diferentes necessidades de cada sistema, como por exemplo poupar memória, energia, ou tempo. Entender o funcionamento e as especificidades de alguns algorítmos é importante para saber qual implementar, e porque, garantindo a otimização da implementação. 
