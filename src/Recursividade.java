
public class Recursividade {
    // Inverte String - Recursividade
	public static String inverterString(String string){
		if (string.length() - 1 == 0) { 
			return string;
		}
		return string.charAt(string.length() - 1) + inverterString(string.substring(0, string.length() - 1));
	}

	// Calcular Fibonacci - Recursividade
	public static int calcularFibonacci(int posicao) {
		if(posicao == 0) { 
			return 0;
		} else if (posicao == 1) {
			return 1;
		}
		return calcularFibonacci(posicao - 1) + calcularFibonacci(posicao - 2);
	}
		
	// Somar Array - Recursividade
	public static int somarArray(int[] array, int fim) {
		if (fim == 0) {
			return array[0];
		} 
		return array[fim] + somarArray(array, fim - 1);
	}

	// Contar Ocorrência de Caracter - Recursividade
	public static int contarCaracter(String palavra, char caracter, int fim) {
		if(fim == 0) {
			if (palavra.charAt(fim) == caracter) {
				return 1;
			} else {
				return 0;
			}
		} else if (palavra.charAt(fim) == caracter) {
			return 1 + contarCaracter(palavra, caracter, fim - 1);
		} else {
			return contarCaracter(palavra, caracter, fim - 1);
		}
	}

	// Somar Algarismos - Recursividade
	public static int somarDigitos(int numero) {
		if (numero / 10 == 0) {
			return numero;
		}
		return (numero % 10) + somarDigitos(numero / 10);
	}

	// Verificar Palindromo - Recursividade 
	public static boolean isPalindrom(String string) {
		if(string.length() <= 1) {
			return true;
		} 
		if(string.charAt(0) != string.charAt(string.length() - 1)) {
			return false;
		} 
		return isPalindrom(string.substring(1, string.length() - 1));
	}
}
