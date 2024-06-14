package desafios.fundamentos;

import java.util.Scanner;

public class Ternario {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Solicita ao usuário que informe a média
		System.out.println("Informe a média do aluno:");
		double media = entrada.nextDouble();

		// Uso do operador ternário para determinar o resultado com base na média
		String resultadoParcial = media >= 5.0 ? "em recuperacação" : "reprovado";
		String resultado = media >= 7.0 ? "aprovado" : resultadoParcial;

		// Imprime o resultado
		System.out.println("O aluno está " + resultado);
		
		entrada.close();

	}

}
