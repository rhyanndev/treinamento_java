package desafios.streams.map;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class DesafioMap2 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		/*
		 * 1. Número para string binária... 6 => "110"
		 * 2. Reverter a string... "110" => "011"
		 * 3. Converter de volta para inteiro => "011" => 3
		 * */
				
		
		
		
		// Revertendo a string binária
		UnaryOperator<String> inverter = 
				s -> new StringBuilder(s)
				.reverse()
				.toString();
				
				
		//Passando de string binária para inteiro
		Function<String, Integer> binarioParaInt = 
				s -> Integer.parseInt(s, 2);
		
				
		
		nums.stream()
		.map(Integer::toBinaryString) //Passando para string binária
		.map(inverter)
		.map(binarioParaInt)
		.forEach(System.out::println);
		
		

	}

}
