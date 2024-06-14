package desafios.fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		// Declaração e inicialização das variáveis
		String nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		double salario = 1234.987;
		
		// Concatenação de strings utilizando o método String.format()
		String frase = String.format("O senhor %s %s tem %d anos e ganha R$ %.2f", nome, sobrenome, idade, salario);
		
		// Imprime a frase 
		System.out.println(frase);
		
		
		
	}

}
