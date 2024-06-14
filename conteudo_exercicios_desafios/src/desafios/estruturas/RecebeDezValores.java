package desafios.estruturas;
import java.util.Scanner;

public class RecebeDezValores {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
			
		int maiorValor = 0;
		int contador = 0;
		
		// O loop vai receber 10 valores do usuário
		do {
			System.out.println("\nDigite um numero: ");
			int valor = entrada.nextInt();
			
			// Verifica se o valor digitado é maior que o maior valor atual
			if (valor > maiorValor) {
				maiorValor = valor;
			}

			contador++;
		} while (contador != 10);

		System.out.printf("O maior valor foi: " + maiorValor);

		entrada.close();
	}

}
