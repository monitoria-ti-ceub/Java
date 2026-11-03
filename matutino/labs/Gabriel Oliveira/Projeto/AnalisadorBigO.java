import java.util.Arrays;
import java.util.Random;

public class AnalisadorBigO {

    // 1. Bubble Sort - Complexidade O(n^2) no pior/médio caso
    // Esse aqui e terrivel, ele basicamente funciona com dois for, o primeiro vai pegar um numero do array
    // e o segundo vai compara-lo com cada numero da lista tentando achar o maior, ele acaba repitindo essas comparações muitas vezes
    // O tempo dele pode nao ter mt diferenca dos outros algoritimos com vetores pequenos.
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean trocou;
        for (int i = 0; i < n - 1; i++) {
            trocou = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    trocou = true;
                }
            }
            // Otimização: se não houve trocas, o array já está ordenado e ele sai mais cedo
            if (!trocou) break;
        }
    }

    // 2. Insertion Sort - Complexidade O(n^2) no pior/médio caso
    // Esse aqui basicamente assume q a parte esquerda do vetor esta meio q ja arrumado, meio q "empurrando"
    // os numeros maiores para direita, nao precisando pensar na parte da esquerda q na teoria ja esta arrumada.
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int chave = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > chave) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = chave;
        }
    }

    // 3. Merge Sort - Complexidade O(n log n) em todos os casos
    // Essa funcao vai basicamente descobrir o meio da funcao e ir cortando ela ate virar grupos ordenados
    // de um valor, pq ja q n tem com quem brigar pra ordenar, eles ja estao ordenados.
    public static void mergeSort(int[] arr, int inicio, int fim) {
        if (inicio < fim) {
            int meio = inicio + (fim - inicio) / 2;
            mergeSort(arr, inicio, meio);
            mergeSort(arr, meio + 1, fim);
            merge(arr, inicio, meio, fim);
        }
    }

    // Função auxiliar do Merge Sort: pega os pedaços fatiados e costura de volta
    // Aqui ele pega dois pedaços q ja estao ordenados e junta eles, colocando o menor elemento na frente
    // de forma organizada, sem precisar fazer comparações cegas igual o Bubble.
    private static void merge(int[] arr, int inicio, int meio, int fim) {
        int n1 = meio - inicio + 1;
        int n2 = fim - meio;

        int[] esquerda = new int[n1];
        int[] direita = new int[n2];

        for (int i = 0; i < n1; i++) esquerda[i] = arr[inicio + i];
        for (int j = 0; j < n2; j++) direita[j] = arr[meio + 1 + j];

        int i = 0, j = 0, k = inicio;
        while (i < n1 && j < n2) {
            if (esquerda[i] <= direita[j]) {
                arr[k++] = esquerda[i++];
            } else {
                arr[k++] = direita[j++];
            }
        }
        while (i < n1) arr[k++] = esquerda[i++];
        while (j < n2) arr[k++] = direita[j++];
    }

    // Utilitário para medir o tempo de execução de um trecho de código
    // Funciona como um cronômetro de alta precisão (em nanossegundos) que converte o resultado para milissegundos
    public static long medirTempo(Runnable algoritmo) {
        long inicio = System.nanoTime();
        algoritmo.run();
        long fim = System.nanoTime();
        return (fim - inicio) / 1_000_000;
    }

    // Geração de massa de dados auxiliar
    // Cria um vetor com o tamanho que a gente mandar, preenchendo com números aleatórios
    public static int[] gerarVetorAleatorio(int tamanho) {
        Random rand = new Random();
        return rand.ints(tamanho, 1, 100000).toArray();
    }

    // O coração do programa: onde a mágica acontece e os testes rodam
    public static void main(String[] args) {
        int[] tamanhos = {1000, 5000, 20000};

        System.out.println("==================================================");
        System.out.println("       RELATÓRIO DE DESEMPENHO E BIG O            ");
        System.out.println("==================================================");

        // Passa por cada tamanho de lista estipulado
        for (int n : tamanhos) {
            int[] original = gerarVetorAleatorio(n);
            System.out.println("\n--- Tamanho da Entrada (n) = " + n + " ---");

            // Testa o Bubble Sort com uma cópia exata da bagunça original
            int[] arrBubble = Arrays.copyOf(original, original.length);
            long tempoBubble = medirTempo(() -> bubbleSort(arrBubble));
            System.out.printf("  * Bubble Sort    (O(n^2))     : %d ms\n", tempoBubble);

            // Testa o Insertion Sort com a mesma cópia
            int[] arrInsertion = Arrays.copyOf(original, original.length);
            long tempoInsertion = medirTempo(() -> insertionSort(arrInsertion));
            System.out.printf("  * Insertion Sort (O(n^2))     : %d ms\n", tempoInsertion);

            // Testa o Merge Sort com a mesma cópia (passando do índice 0 até o último)
            int[] arrMerge = Arrays.copyOf(original, original.length);
            long tempoMerge = medirTempo(() -> mergeSort(arrMerge, 0, arrMerge.length - 1));
            System.out.printf("  * Merge Sort     (O(n log n)) : %d ms\n", tempoMerge);
        }
    }
}