package desafios.streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import streams.Aluno;

public class DesafioFilterUm {

	public static void main(String[] args) {
		
		// Criando as passagens
		Passagem passagem1 = new Passagem("Argélia", 3300.30);
		Passagem passagem2 = new Passagem("China", 7500.50);
		Passagem passagem3 = new Passagem("Estados Unidos", 12300.30);
		Passagem passagem4 = new Passagem("Rússia", 5800.20);
		Passagem passagem5 = new Passagem("Taiwan", 6950.40);
		Passagem passagem6 = new Passagem("Chile", 3450.40);
		
		 // Criando uma lista de Passagem 
		List<Passagem> passagens = Arrays
				.asList(passagem1, passagem2, passagem3, passagem4, passagem5, passagem6);

		// Definindo um Predicate para verificar se o valor da passagem é maior ou igual a 4000
		Predicate<Passagem> caro = a -> a.valorPassagem >= 4000;
		
		// Definindo uma Function para transformar uma Passagem em uma mensagem indicando que a passagem para aquele país é cara
		Function<Passagem, String> paisCaro = a -> "A Passagem para o país " + a.pais + " é cara!";
		
		// Utilizando a Stream API para filtrar as passagens caras e imprimir uma mensagem para cada uma delas
		passagens.stream()
		.filter(caro)
		.map(paisCaro)
		.forEach(System.out::println);;
		

	}

}
