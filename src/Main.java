import java.util.Arrays;
import java.util.Random;
import java.time.LocalDate;

public class Main {
	public static Random random = new Random();

	public static void main(String[] args) {
		System.out.println("==== Testes Recursividade ====");
		String palavra = "Cavalo";
		System.out.println("Palavra: " + palavra);
		System.out.println("Invertida: " + Recursividade.inverterString(palavra));
		System.out.println("------------------------------");

		int termo = 5;
		System.out.println(termo + "º termo Fibonacci: " + Recursividade.calcularFibonacci(termo));
		System.out.println("------------------------------");
		int[] vetor = gerarArray(8, 9);
		imprimirVetor(vetor);
		System.out.println("Soma Vetor: " + Recursividade.somarArray(vetor, vetor.length - 1));
		System.out.println("------------------------------");

		System.out.println("Palavra: " + palavra);
		char caracter = 'a';
		System.out.println("Caracteres " + caracter + ": " + Recursividade.contarCaracter(palavra, caracter, palavra.length() - 1));
		System.out.println("------------------------------");

		String palavra2 = "arara";
		System.out.println("Palavra 1: " + palavra);
		System.out.println("Palindromo? " + Recursividade.isPalindrom(palavra));
		System.out.println("Palavra 2: " + palavra2);
		System.out.println("Palindromo? " + Recursividade.isPalindrom(palavra2));
		System.out.println("------------------------------");

		System.out.println("====== Testes Merge Sort ======");
		Pessoa[] pessoas = new Pessoa[8];
		pessoas[0] = new Pessoa("Jorge", "Silva", LocalDate.parse("2000-10-20"), LocalDate.parse("2005-07-11"), 2600.0);
		pessoas[1] = new Pessoa("Carla", "Rodrigues", LocalDate.parse("1998-11-07"), LocalDate.parse("2000-05-19"), 5000.0);
		pessoas[2] = new Pessoa("Rubens", "Tavares", LocalDate.parse("1988-02-13"), LocalDate.parse("1999-01-23"), 3200.0);
		pessoas[3] = new Pessoa("Anderson", "Coelho", LocalDate.parse("1981-05-21"), LocalDate.parse("1988-04-20"), 4000.0);
		pessoas[4] = new Pessoa("Ellen", "Spitaletti", LocalDate.parse("1992-07-14"), LocalDate.parse("2001-09-01"), 2200.0);
		pessoas[5] = new Pessoa("Giorgia", "Carvalho", LocalDate.parse("1989-08-28"), LocalDate.parse("1997-02-08"), 10000.0);
		pessoas[6] = new Pessoa("Adriel", "Schneider", LocalDate.parse("2005-10-14"), LocalDate.parse("2007-10-21"), 7000.0);
		pessoas[7] = new Pessoa("Bianca", "Borges", LocalDate.parse("2002-12-01"), LocalDate.parse("2005-07-23"), 6600.0);

		Pessoa[] teste = Arrays.copyOf(pessoas, pessoas.length);
		System.out.println("----- Ordenação por Nome -----");
		Ordenacao.mergeSortPorNome(teste, new Pessoa[pessoas.length], 0, pessoas.length - 1);
		for (int i = 0; i < teste.length; i++) {
			teste[i].imprimirPessoa();
		}

		System.out.println("---- Ordenação Nascimento ----");
		Ordenacao.mergeSortPorNascimento(teste, new Pessoa[pessoas.length], 0, pessoas.length - 1);
		for (int i = 0; i < teste.length; i++) {
			teste[i].imprimirPessoa();
		}

		System.out.println("---- Ordenação por Salário ---");
		Ordenacao.mergeSortPorSalario(teste, new Pessoa[pessoas.length], 0, pessoas.length - 1);
		for (int i = 0; i < teste.length; i++) {
			teste[i].imprimirPessoa();
		}

		System.out.println("---- Ordenar Array Strings ---");
		String[] palavras = {"Ruan", "José", "Aline", "Bruna", "Trevor"};
		imprimirVetor(palavras);
		Ordenacao.mergeSort(palavras, new String[palavras.length], 0, palavras.length - 1);
		imprimirVetor(palavras);

		System.out.println("---- Ordenar Linhas Matriz ---");
		int[][] matrizTeste = gerarMatriz(4, 4, 17);
		imprimirMatriz(matrizTeste);
		Ordenacao.ordenarLinhasMatriz(matrizTeste);
		System.out.println("");
		imprimirMatriz(matrizTeste);

		int[][] matrizDeVetores1 = gerarMatriz(1000, 5, 1001);
		System.out.println("===== Testes Vetores 1000 =====");
		imprimirEstatisticasOrdenacao(matrizDeVetores1);
		int[][] matrizDeVetores2 = gerarMatriz(10000, 5, 10001);
		System.out.println("===== Testes Vetores 10000 ====");
		imprimirEstatisticasOrdenacao(matrizDeVetores2);
		int[][] matrizDeVetores3 = gerarMatriz(100000, 5, 100001);
		System.out.println("==== Testes Vetores 100000 ====");
		imprimirEstatisticasOrdenacao(matrizDeVetores3);
		int[][] matrizDeVetores4 = gerarMatriz(1000000, 5, 100001);
		System.out.println("=== Testes Vetores 1000000 ====");
		imprimirEstatisticasOrdenacao(matrizDeVetores4);
	}

	// Gerar Array Inteiro Aleatório
	public static int[] gerarArray(int tamanho, int valorMax) {
		int[] array = new int[tamanho];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(valorMax);
		}
		return array;
	}

	// Gerar Matriz Inteira Aleatória
	public static int[][] gerarMatriz(int linhas, int colunas, int valorMax) {
		int[][] matriz = new int[colunas][linhas];
		for (int i = 0; i < matriz.length; i++) {
			matriz[i] = gerarArray(linhas, valorMax);
		}
		return matriz;
	}

	// Imprime um Vetor de Inteiros
	public static void imprimirVetor(int[] vetor) {
		System.out.print("{");
		for (int i = 0; i < vetor.length; i++) {
			if (i < vetor.length - 1) {
				System.out.print(vetor[i] + ", ");
			} else {
				System.out.print(vetor[i]);
			}
		}
		System.out.print("} \n");
	}

	// Imprime um Vetor de Strings
	public static void imprimirVetor(String[] vetor) {
		System.out.print("{");
		for (int i = 0; i < vetor.length; i++) {
			if (i < vetor.length - 1) {
				System.out.print(vetor[i] + ", ");
			} else {
				System.out.print(vetor[i]);
			}
		}
		System.out.print("} \n");
	}

	// Imprime uma Matriz por Linhas
	public static void imprimirMatriz(int[][] matriz) {
		System.out.print("{");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (j < matriz[i].length - 1) {
					System.out.print(matriz[i][j] + ", ");
				} else {
					System.out.print(matriz[i][j]);
				}
			}
			if (i < matriz.length - 1) {
				System.out.println("");
			}
		}
		System.out.println("}");
	}

	// Imprime Estatísticas dos Algorítmos de Ordenação
	public static void imprimirEstatisticasOrdenacao(int[][] matrizDeVetores) {
		int[] aquecerJVM = gerarArray(100, 101);
		for (int i = 0; i < 10; i++) {
			int[] vetorTeste = Arrays.copyOf(aquecerJVM, aquecerJVM.length);
			Ordenacao.mergeSort(vetorTeste, new int[aquecerJVM.length], 0, aquecerJVM.length - 1);
		}

		System.out.println("------ Testes Merge Sort ------");
		double totalTempo = 0;
		for (int i = 0; i < matrizDeVetores.length; i++) {
			int[] vetorTeste = Arrays.copyOf(matrizDeVetores[i], matrizDeVetores[i].length);
			long inicio = System.nanoTime();
			Ordenacao.mergeSort(vetorTeste, new int[matrizDeVetores[i].length], 0, matrizDeVetores[i].length - 1);
			long fim = System.nanoTime();
			double tempoMs = (fim - inicio) / 1_000_000.0;
			totalTempo += tempoMs;
			System.out.println("Tempo para vetor " + (i + 1) + ": " + tempoMs + " ms");
		}
		System.out.printf("Média: %.2f ms %n", (totalTempo/matrizDeVetores.length));

		aquecerJVM = gerarArray(100, 101);
		for (int i = 0; i < 10; i++) {
			int[] vetorTeste = Arrays.copyOf(aquecerJVM, aquecerJVM.length);
			Ordenacao.insertionSort(vetorTeste);
		}

		System.out.println("--- Testes Insertion Sort ----");
		totalTempo = 0;
		for (int i = 0; i < matrizDeVetores.length; i++) {
			int[] vetorTeste = Arrays.copyOf(matrizDeVetores[i], matrizDeVetores[i].length);
			long inicio = System.nanoTime();
			Ordenacao.insertionSort(vetorTeste);
			long fim = System.nanoTime();
			double tempoMs = (fim - inicio) / 1_000_000.0;
			totalTempo += tempoMs;
			System.out.println("Tempo para vetor " + (i + 1) + ": " + tempoMs + " ms");
		}
		System.out.printf("Média: %.2f ms %n", (totalTempo/matrizDeVetores.length));

		aquecerJVM = gerarArray(100, 101);
		for (int i = 0; i < 10; i++) {
			int[] vetorTeste = Arrays.copyOf(aquecerJVM, aquecerJVM.length);
			Ordenacao.selectionSort(vetorTeste);
		}

		System.out.println("--- Testes Selection Sort ----");
		totalTempo = 0;
		for (int i = 0; i < matrizDeVetores.length; i++) {
			int[] vetorTeste = Arrays.copyOf(matrizDeVetores[i], matrizDeVetores[i].length);
			long inicio = System.nanoTime();
			Ordenacao.selectionSort(vetorTeste);
			long fim = System.nanoTime();
			double tempoMs = (fim - inicio) / 1_000_000.0;
			totalTempo += tempoMs;
			System.out.println("Tempo para vetor " + (i + 1) + ": " + tempoMs + " ms");
		}
		System.out.printf("Média: %.2f ms %n", (totalTempo/matrizDeVetores.length));

		aquecerJVM = gerarArray(100, 101);
		for (int i = 0; i < 10; i++) {
			int[] vetorTeste = Arrays.copyOf(aquecerJVM, aquecerJVM.length);
			Ordenacao.bubbleSort(vetorTeste);
		}

		System.out.println("----- Testes Bubble Sort -----");
		totalTempo = 0;
		for (int i = 0; i < matrizDeVetores.length; i++) {
			int[] vetorTeste = Arrays.copyOf(matrizDeVetores[i], matrizDeVetores[i].length);
			long inicio = System.nanoTime();
			Ordenacao.bubbleSort(vetorTeste);
			long fim = System.nanoTime();
			double tempoMs = (fim - inicio) / 1_000_000.0;
			totalTempo += tempoMs;
			System.out.println("Tempo para vetor " + (i + 1) + ": " + tempoMs + " ms");
		}
		System.out.printf("Média: %.2f ms %n", (totalTempo/matrizDeVetores.length));
	}
}