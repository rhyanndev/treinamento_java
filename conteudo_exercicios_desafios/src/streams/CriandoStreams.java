package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		//Consumer<T> - > Recebe um parâmetro e não retorna nada.
		
		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;
		 
		Stream<String> langs = Stream.of("Java ", "Lua ", "C ", "JavaScript\n");
		langs.forEach(print);
		
		
		String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };
		
		//Criando uma stream a partir de um array encadeando um forEach
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		
		//Subconjunto dos arrays, não pega o último elemento
		Arrays.stream(maisLangs, 1, 3).forEach(print);
		
		//Gerando Streams a partir de collections
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		
		//Em um parallelStream, os dados não são processados na ordem
		outrasLangs.parallelStream().forEach(print);
		
		//Método generate -> Vai gerar uma stream "infinita" sem ordenação
		//Stream.generate(() -> "a").forEach(print);
		
		//Método generate -> Vai gerar uma stream "infinita" com ordenação
		//Stream.iterate(0, n -> n + 1).forEach(println);
		// 0 -> "semente incial" (seed) para começar a gerar os números
		
		

	}

}
