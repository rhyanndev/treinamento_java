package desafios.fundamentos.exercicios;

/*
 * Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
 */

import java.util.Scanner;

public class Celsius {

	public static void main(String[] args) {

		// °F = °C * 9/5 + 32

		// Constantes para as fórmulas de conversão
		final double DESLOCAMENTO_CELSIUS = 32;
		final double CELSIUS_PARA_FAHRENHEIT_FATOR = 9.0 / 5.0;

		Scanner scanner = new Scanner(System.in);

		// Solicita ao usuário que informe o valor em Celsius
		System.out.println("Informe o valor em Celsius:");
		double valorCelsius = scanner.nextDouble();

		// Calcula o valor em Fahrenheit
		double valorFahrenheit = valorCelsius * CELSIUS_PARA_FAHRENHEIT_FATOR + DESLOCAMENTO_CELSIUS;

		// Imprime o valor convertido em Fahrenheit
		System.out.printf("\nValor em Fahrenheit: %.2f°F", valorFahrenheit);

	}

}
