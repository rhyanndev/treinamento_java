package desafios.fundamentos.exercicios;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Solicita ao usuário que informe o valor da base
		System.out.println("Informe o valor da base do triângulo:");
		double baseTriangulo = entrada.nextDouble();

		// Solicita ao usuário que informe o valor da altura
		System.out.println("Informe o valor da altura:");
		double alturaTriangulo = entrada.nextDouble();

		// Calcula a área do triângulo
		double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;

		// Imprime a área do triângulo
		System.out.printf("A área do triângulo é: %.2f m²\n", areaTriangulo);

		entrada.close();

	}

}
