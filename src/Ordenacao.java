
public class Ordenacao {
    // Merge Sort Inteiros - Ordenação
    public static void mergeSort(int[] vetor, int[] auxiliar, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(vetor, auxiliar, inicio, meio);
            mergeSort(vetor, auxiliar, meio + 1, fim);
            ordenar(vetor, auxiliar, inicio, meio, fim);
        }
    }

    // Swap Merge Sort Inteiros - Ordenação
    public static void ordenar(int[] vetor, int[] auxiliar, int inicio, int meio, int fim) {
        for (int i = inicio; i <= fim; i++) {
            auxiliar[i] = vetor[i];
        }
        int esquerda = inicio;
        int direita = meio + 1;

        for (int i = inicio; i <= fim; i++) {
            if (esquerda > meio) {
                vetor[i] = auxiliar[direita++];
            } else if (direita > fim) {
                vetor[i] = auxiliar[esquerda++];
            } else if (auxiliar[esquerda] < auxiliar[direita]) {
                vetor[i] = auxiliar[esquerda++];
            } else {
                vetor[i] = auxiliar[direita++];
            }
        }

    }

    // Merge Sort Strings - Ordenação
    public static void mergeSort(String[] palavras, String[] auxiliar, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(palavras, auxiliar, inicio, meio);
            mergeSort(palavras, auxiliar, meio + 1, fim);
            ordenar(palavras, auxiliar, inicio, meio, fim);
        }
    }

    // Swap Merge Sort Strings - Ordenação
    public static void ordenar(String[] palavras, String[] auxiliar, int inicio, int meio, int fim) {
        for (int i = inicio; i <= fim; i++) {
            auxiliar[i] = palavras[i];
        }
        int esquerda = inicio;
        int direita = meio + 1;

        for (int i = inicio; i <= fim; i++) {
            if (esquerda > meio) {
                palavras[i] = auxiliar[direita++];
            } else if (direita > fim) {
                palavras[i] = auxiliar[esquerda++];
            } else if (auxiliar[esquerda].compareTo(auxiliar[direita]) <= 0) {
                palavras[i] = auxiliar[esquerda++];
            } else {
                palavras[i] = auxiliar[direita++];
            }
        }
    }

    // Ordenar Objetos Por Nascimento - Merge Sort
    public static void mergeSortPorNascimento(Pessoa[] pessoas, Pessoa[] auxiliar, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSortPorNascimento(pessoas, auxiliar, inicio, meio);
            mergeSortPorNascimento(pessoas, auxiliar, meio + 1, fim);
            ordenarPorNascimento(pessoas, auxiliar, inicio, meio, fim);
        }
    }

    // Swap Merge Sort Nascimento - Ordenação
    public static void ordenarPorNascimento(Pessoa[] pessoas, Pessoa[] auxiliar, int inicio, int meio, int fim) {
        System.arraycopy(pessoas, inicio, auxiliar, inicio, fim - inicio + 1);

        int esquerda = inicio;
        int direita = meio + 1;
        for (int i = inicio; i <= fim; i++) {
            if (esquerda > meio) {
                pessoas[i] = auxiliar[direita++];
            } else if (direita > fim) {
                pessoas[i] = auxiliar[esquerda++];
            } else if (auxiliar[esquerda].getDataNascimento().isBefore(auxiliar[direita].getDataNascimento())) {
                pessoas[i] = auxiliar[esquerda++];
            } else {
                pessoas[i] = auxiliar[direita++];
            }
        }
    }

    // Ordenar Objetos Por Salario - Merge Sort
    public static void mergeSortPorSalario(Pessoa[] pessoas, Pessoa[] auxiliar, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSortPorSalario(pessoas, auxiliar, inicio, meio);
            mergeSortPorSalario(pessoas, auxiliar, meio + 1, fim);
            ordenarPorSalario(pessoas, auxiliar, inicio, meio, fim);
        }
    }

    // Swap Merge Sort Salario - Ordenação
    public static void ordenarPorSalario(Pessoa[] pessoas, Pessoa[] auxiliar, int inicio, int meio, int fim) {
        System.arraycopy(pessoas, inicio, auxiliar, inicio, fim - inicio + 1);

        int esquerda = inicio;
        int direita = meio + 1;
        for (int i = inicio; i <= fim; i++) {
            if (esquerda > meio) {
                pessoas[i] = auxiliar[direita++];
            } else if (direita > fim) {
                pessoas[i] = auxiliar[esquerda++];
            } else if (auxiliar[esquerda].getSalario() >= auxiliar[direita].getSalario()) {
                pessoas[i] = auxiliar[esquerda++];
            } else {
                pessoas[i] = auxiliar[direita++];
            }
        }
    }

    // Ordenar Objetos Por Nome - Merge Sort
    public static void mergeSortPorNome(Pessoa[] pessoas, Pessoa[] auxiliar, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSortPorNome(pessoas, auxiliar, inicio, meio);
            mergeSortPorNome(pessoas, auxiliar, meio + 1, fim);
            ordenarPorNome(pessoas, auxiliar, inicio, meio, fim);
        }
    }

    // Swap Merge Sort Nome - Ordenação
    public static void ordenarPorNome(Pessoa[] pessoas, Pessoa[] auxiliar, int inicio, int meio, int fim) {
        System.arraycopy(pessoas, inicio, auxiliar, inicio, fim - inicio + 1);

        int esquerda = inicio;
        int direita = meio + 1;
        for (int i = inicio; i <= fim; i++) {
            if (esquerda > meio) {
                pessoas[i] = auxiliar[direita++];
            } else if (direita > fim) {
                pessoas[i] = auxiliar[esquerda++];
            } else if (auxiliar[esquerda].getNome().compareTo(auxiliar[direita].getNome()) <= 0) {
                pessoas[i] = auxiliar[esquerda++];
            } else {
                pessoas[i] = auxiliar[direita++];
            }
        }
    }

    // Bubble Sort Inteiros - Ordenação
    public static void bubbleSort(int[] vetor) {
        boolean trocou = true;
        do {
            trocou = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                int valor = vetor[i];
                if(valor > vetor[i+1]) {
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = valor;
                    trocou = true;
                }
            }
        } while (trocou);
    }

    // Insertion Sort Inteiros - Ordenação
    public static void insertionSort(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int j = i - 1;
            int valor = vetor[i];
            while (j >= 0 && valor < vetor[j]) {
                vetor[j+1] = vetor[j];
                j--;
            } 
            vetor[j+1] = valor;
        }
    }

    // Selection Sort Inteiros - Ordenação
    public static void selectionSort(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            int menor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if(vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }
            if (menor != i) {
                int swap = vetor[i];
                vetor[i] = vetor[menor];
                vetor[menor] = swap;
            }
        }
    }

    // Ordenar Linhas da Matriz
    public static void ordenarLinhasMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            Ordenacao.mergeSort(matriz[i], new int[matriz[i].length], 0, matriz[i].length - 1);
        }
    }

}
