package desafios.fundamentos.exercicios;

/*
 * Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
 * */

import java.util.Scanner;

public class Potencias {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Solicita ao usuário que informe um valor
		System.out.println("Informe um valor:");
		double valor = entrada.nextDouble();

		// Calcula o quadrado e o cubo do valor utilizando a função Math.pow()
		double valorQuadrado = Math.pow(valor, 2);
		double valorCubo = Math.pow(valor, 3);

		// Imprime o valor ao quadrado e ao cubo, formatados com duas casas decimais
		System.out.printf("O valor ao quadrado é: %.2f\n", valorQuadrado);
		System.out.printf("O valor ao cubo é: %.2f\n", valorCubo);

		entrada.close();

	}

}
