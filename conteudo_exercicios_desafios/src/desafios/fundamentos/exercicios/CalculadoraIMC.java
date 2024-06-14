package desafios.fundamentos.exercicios;

import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Solicita ao usuário que informe o seu peso
		System.out.println("Informe o seu peso em quilogramas:");
		double peso = entrada.nextDouble();

		// Solicita ao usuário que informe sua altura
		System.out.println("Informe a sua altura em metros:");
		double altura = entrada.nextDouble();

		// Calcula o Índice de Massa Corporal (IMC)
		double imc = peso / (altura * altura);

		// Imprime o valor do IMC
		System.out.printf("Seu IMC é: %.2f\n", imc);

		entrada.close();

	}

}
