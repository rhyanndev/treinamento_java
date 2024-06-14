package desafios.array;
import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// Solicita a quantidade de notas
		System.out.println("Quantas notas você quer informar?");
		int quantidadeNotas = entrada.nextInt();
		
		double [] notas = new double[quantidadeNotas];
		double totalNotas = 0;
		
		 System.out.printf("Quantidade de notas: %d%n", quantidadeNotas);
		 
		 // Recebe as notas do usuário
		 for (int i = 0; i < notas.length; i++) {
			 System.out.printf("Insira a %dª nota: ", i + 1);
			 
			 notas[i] = entrada.nextDouble();
		}
		 
		 // Calcula o total das notas
		 for (double nota : notas) {
			 totalNotas += nota;
		 }
		 
		 // Calcula e exibe a média das notas
		 double media = totalNotas / quantidadeNotas;
		 System.out.printf("Média das notas: %.2f%n", media);

		entrada.close();
		
	}

}
