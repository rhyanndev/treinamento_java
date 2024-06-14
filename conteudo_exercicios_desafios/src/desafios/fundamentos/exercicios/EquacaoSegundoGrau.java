package desafios.fundamentos.exercicios;

import java.util.Scanner;

public class EquacaoSegundoGrau {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Solicita ao usuário que informe os coeficientes da equação do segundo grau
		System.out.println("Equação: ax² + bx + c = 0");

		System.out.println("\nDigite o valor de A: ");
		int a = entrada.nextInt();

		System.out.println("\nDigite o valor de B: ");
		int b = entrada.nextInt();

		System.out.println("\nDigite o valor de C: ");
		int c = entrada.nextInt();

		// Calcula o delta da equação do segundo grau
		int delta = (b * b) - (4 * a * c);

		// Imprime a equação do segundo grau informada pelo usuário e o valor de delta
		System.out.printf("\nSua equação é: %dx² + %dx + %d = 0", a, b, c);
		System.out.println("\nO delta é: " + delta);

		// Verifica as condições para encontrar as raízes da equação do segundo grau
		if (delta > 0) {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.printf("O x1 da equação é: %.2f", x1);
			System.out.printf("\nO x2 da equação é: %.2f", x2);
		} else if (delta == 0) {
			// Calcula a raiz real da equação
			double x = -b / (2.0 * a);

			// Exibe a raiz formatada com duas casas decimais
			System.out.printf("A equação tem uma raiz real: x = %.2f\n", x);
		}
		// Se o delta for diferente de zero
		else {
			// Imprime a mensagem indicando que não há raízes reais
			System.out.println("A equação não tem raízes reais");
		}

		entrada.close();

	}

}
