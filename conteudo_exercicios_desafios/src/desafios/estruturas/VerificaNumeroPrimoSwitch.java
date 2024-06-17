package desafios.estruturas;

import java.util.Scanner;

/*
 * Refatorar o exercício VerificaNumeroPrimo, utilizando a estrutura switch.
 * */

public class VerificaNumeroPrimoSwitch {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Solicita ao usuário que digite um número
		System.out.println("Digite um número:");
		int numero = entrada.nextInt();

		boolean primo;

		// Determina se o número é primo
		switch (numero) {
		case 0:
		case 1:
			primo = false;
			break;
		case 2:
		case 3:
			primo = true;
			break;
		default:
			primo = true;
			// Para outros números verifica se é divisível por algum número até a raiz
			// quadrada do número
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
