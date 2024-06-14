package desafios.fundamentos;
import java.util.Scanner;
import java.util.Locale;

public class DesafioConversao {

	//Pegar 3 strings e calcular a media dos salários
	
	public static void main(String[] args) {
		
		// Imprime o Locale padrão do sistema
		System.out.println(Locale.getDefault());
		
		Scanner scanner = new Scanner(System.in);
		
		//Solicita informações do usuário e substitui vírgula por ponto
		System.out.println("Informe o primeiro valor:\n");
		String v1 = scanner.next().replace(",",".");
		
		System.out.println("Informe o segundo valor:\n");
		String v2 = scanner.next().replace(",",".");
		
		System.out.println("Informe o terceiro valor:\n");
		String v3 = scanner.next().replace(",",".");
		
		
		scanner.close();
		
		// Converte as strings para valores double
		double valor1 = Double.parseDouble(v1);
		double valor2 = Double.parseDouble(v2);
		double valor3 = Double.parseDouble(v3);
		
		// Calcula a média e imprime o resultado
		double media = (valor1 + valor2 + valor3) / 3;
		
		System.out.printf("O valor é R$: %.2f", media);
		
				
		
		
		
	}
	
}
