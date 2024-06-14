package array;
import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		// Solicita a quantidade de alunos
		System.out.println("Quantos alunos?");
		int quantidadeAlunos = entrada.nextInt();
		
		// Solicita a quantidade de notas por aluno
		System.out.println("Quantas notas por alunos?");
		int quantidadeNotas = entrada.nextInt();
		
		
		double[][] notasDaTurma = new double[quantidadeAlunos][quantidadeNotas];
		
		double total = 0;
		
		// Recebe as notas dos alunos
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				
				System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
				notasDaTurma[a][n] = entrada.nextDouble();
				total += notasDaTurma[a][n];
				
			}
			
		}
		
		// Calcula e exibe a média da turma
		double media = total / (quantidadeAlunos * quantidadeNotas);
		System.out.printf("Média da turma é %.2f%n", media);
		
		// Exibe as notas de cada aluno
		for(double[] notasDoAluno : notasDaTurma) {
			
			System.out.println(Arrays.toString(notasDoAluno));
		}
		

		entrada.close();
		
	}

}
