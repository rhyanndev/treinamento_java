package desafios.streams.map;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;
import java.util.stream.Collectors;

public class DesafioMap {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		/*
		 * 1. Número para string binária... 6 => "110"
		 * 2. Reverter a string... "110" => "011"
		 * 3. Converter de volta para inteiro => "011" => 3
		 * */
				
		
		// Conversão dos números para string binária
        List<String> binarios = nums.stream()
                                    .map(n -> Integer.toBinaryString(n))
                                    .collect(Collectors.toList());
     
        // Reversão das strings binárias
        List<String> binariosRevertidos = binarios.stream()
                                                  .map(binario -> new StringBuilder(binario)
                                                		  .reverse()
                                                		  .toString())
                                                  .collect(Collectors
                                                		  .toList());
  
		// Convertendo valores de volta para inteiro
		List<Integer> valorConvertidoDeVolta = binariosRevertidos
				.stream()
				.map(binarioRevertidos -> Integer.parseInt(binarioRevertidos, 2))
                .collect(Collectors.toList());

		//Imprimindo o resultado
		for (int i = 0; i < nums.size(); i++) {
            System.out.println("Número para string binária... " + nums.get(i) + " => \"" + binarios.get(i) + "\" => Revertido: \"" + binariosRevertidos.get(i) + "\" => De volta para inteiro: " + valorConvertidoDeVolta.get(i));
        }

	}

}
