package desafios.fundamentos.exercicios;

/*
 * Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
 */

import java.util.Scanner;

import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {

		final double DESLOCAMENTO_FAHRENHEIT = 32;
		final double FAHRENHEIT_PARA_CELSIUS_FATOR = 5 / 9.0;

		Scanner scanner = new Scanner(System.in);

		// Solicita ao usuário que informe o valor em Fahrenheit
		System.out.println("Informe o valor em Fahrenheit: ");
		double valorFahrenheit = scanner.nextDouble();

		// Calcula o valor em Celsius usando a fórmula de conversão
		double valorCelsius = (valorFahrenheit - DESLOCAMENTO_FAHRENHEIT) * FAHRENHEIT_PARA_CELSIUS_FATOR;

		// Imprime o valor convertido em Celsius
		System.out.printf("Valor em Celsius: %.4f °C%n", valorCelsius);

		scanner.close();

	}

}
