package desafios.estruturas;

/*
 * Criar um programa que enquanto estiver recebendo números positivos, 
 * imprime no console a soma dos números inseridos, caso receba um número 
 * negativo, encerre o programa. Tente utilizar a estrutura do while.
 * */

import java.util.Scanner;

public class RecebePositivos {

	public static void main(String[] args) {

		// Criação de um Scanner para a entrada do dado
		Scanner entrada = new Scanner(System.in);

		int somadorDeNumeros = 0;
		int numero = 0;

		// Loop que continuará solicitando números até que um número negativo seja
		// inserido
		while (numero >= 0) {
			System.out.println("Digite um numero inteiro (ou negativo para sair): ");

			// Lê o próximo número inteiro inserido pelo usuário
			numero = entrada.nextInt();
			if (numero >= 0) {
				somadorDeNumeros += numero;

				// Exibe a soma acumulada até o momento
				System.out.printf("\nSoma até o momento: %d\n", somadorDeNumeros);
			}
		}
		entrada.close();

	}

}
