package desafios.streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

	public static void main(String[] args) {
		
		
		//Criação de um Consumer que recebe uma referência para print
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BWM ", "Audi ", "Honda ");
		
		//Build Operation - Contruindo a stream
		//forEach nesse caso é uma operação terminal
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		//Esta função recebe uma string e retorna a mesma string em letras maiúsculas.
		UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		
		//Esta função recebe uma string e retorna a primeira letra dessa string.
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		
		//Esta função recebe uma string e retorna a mesma string com três pontos de exclamação adicionados ao final.
		UnaryOperator<String> grito = n -> n + "!!!";
		
		//System.out.println(maiuscula.andThen(primeiraLetra).andThen(grito).apply("BMW"));
	
		
		System.out.println("\n\nUsando composição");
		marcas.stream()
		.map(Utilitarios.maiuscula) //Utilizando a classe Utilitários com os métodos contidos
		.map(primeiraLetra)
		.map(Utilitarios::grito) // Utilizando Method Reference
		.forEach(print);
		
	}

}
