package br.com.cod3r.app.financeiro;

import java.util.Iterator;

public class CalcImpl1 implements Calc {

	//Abordagem mais declarativa de uma soma
	
	@Override
	public double soma(double... nums) {
		
		double total = 0;
		for (int i = 0; i < nums.length; i++) {
			total += nums[i];
		}
		
		return total;
	}

}
