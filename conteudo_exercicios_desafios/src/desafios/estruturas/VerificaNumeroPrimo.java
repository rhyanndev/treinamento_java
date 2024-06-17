package desafios.estruturas;

import java.util.Scanner;

/*
 * Criar um programa que receba um número e diga se ele é um número primo
 * */

public class VerificaNumeroPrimo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Solicita que o usuário informe o número
		System.out.println("Digite um número:");
		int numero = entrada.nextInt();

		// Variável para armazenar se o número é primo ou não
		boolean primo = true;

		if (numero <= 1) {
			primo = false;
		} else {
			// Verifica se o número é divisível por algum número até a raiz quadrada do
			// número
			for (int i = 2; i <= Math.sqrt(numero); i++) {
				if (numero % i == 0) {
					primo = false;
					break;
				}
			}
		}

		// Imprime se o número é primo ou não
		if (primo) {
			System.out.println("O número " + numero + " é primo");
		} else {
			System.out.println("O número " + numero + " não é primo");
		}

		entrada.close();
	}

}
