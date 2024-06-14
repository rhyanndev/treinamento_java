package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {
		
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		
		//Acumulador e valor
		BinaryOperator<Integer> soma = (ac, n) -> ac + n;
		
		
		int total1 = nums.stream().reduce(soma).get();
		System.out.println(total1); // 45
		
		
		Integer total2 = nums.stream().reduce(100, soma);
		System.out.println(total2); // 145
		
		//executar a chamada dos elementos de forma paralela passando valor inicial
		// 100 * 9 
		Integer total3 = nums.parallelStream().reduce(100, soma);
		System.out.println(total3); // 945
		
		
		//executar a chamada dos elementos de forma paralela sem passar valor inicial
		int total4 = nums.parallelStream().reduce(soma).get();
		System.out.println(total4); // 45

		// Resultado foi um Opcional<Integer>...
		nums.stream()
			.filter(n -> n > 5)
			.reduce(soma)
			.ifPresent(System.out::println);
		
	}

}
