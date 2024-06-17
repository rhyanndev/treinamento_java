package desafios.estruturas;

import java.util.Scanner;

/*
 * Criar um programa que receba uma palavra e imprime no console letra por letra.
 * */

public class RecebePalavra {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Solicita ao usuário que digite uma palavra
		System.out.println("Digite a palavra: ");
		String palavra = entrada.nextLine();

		// Converte a palavra em um array de caracteres
		char letras[] = palavra.toCharArray();

		// Imprimir cada letra da palavra
		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}

		entrada.close();

	}

}
