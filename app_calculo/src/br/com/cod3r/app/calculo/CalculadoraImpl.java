package br.com.cod3r.app.calculo;

import br.com.cod3r.app.Calculadora;
import br.com.cod3r.app.calculo.interno.OperacoesAritmeticas;
import br.com.cod3r.app.logging.Logger;

public class CalculadoraImpl implements Calculadora{
	
	private String id = "abc";

	private OperacoesAritmeticas operacoesAritmeticas = new OperacoesAritmeticas();

	// Esse método só faz chamar o método de outra classe
	public double soma(double... nums) {
		// Chamando o método info do projeto app_logging
		Logger.info("Somando...");
		return operacoesAritmeticas.soma(nums);
		
		
	}
	
	//Criado uma forma de acessa o valor diretamente
	public String getId() {
		return id;
	}

}
