package desafios.estruturas;

import java.util.Scanner;

public class CalculaMediaFinal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Solicita ao usuário que digite a primeira e segunda nota
		System.out.println("Digite a primeira nota:");
		double nota1 = entrada.nextDouble();

		System.out.println("Digite a segunda nota:");
		double nota2 = entrada.nextDouble();

		// Calcula a média das duas notas
		double media = (nota1 + nota2) / 2;

		// Determina o status do aluno com base na média calculada
		String status;
		if (media >= 7.0) {
			status = "Aprovado";
		} else if (media > 4.0) {
			status = "Recuperação";
		} else {
			status = "Reprovado";
		}

		// Imprime a média final e o status do aluno
		System.out.println("Média final: " + media);
		System.out.println("Status do aluno: " + status);

		entrada.close();

	}

}
