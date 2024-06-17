package br.com.cod3r.app.calculo.interno;

import java.util.Arrays;

public class OperacoesAritmeticas {
	
	public double soma(double... nums) {
		
		//Reduzir o array que representa a soma de cada um deles
		//Começando em 0.0
		return Arrays.stream(nums).reduce(0.0, (total, atual) -> total + atual);
		
	}

}
