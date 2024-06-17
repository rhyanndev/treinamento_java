package br.com.cod3r.app.financeiro;

import java.util.Arrays;

public class CalcImpl2 implements Calc{

	//Abordagem mais funcional de uma soma
	
	@Override
	public double soma(double... nums) {
	
		return Arrays.stream(nums).reduce(0.0, (total, atual) -> total + atual);
	}
	
	

}
