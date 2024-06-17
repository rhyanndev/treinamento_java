package br.com.cod3r.app.financeiro;

import java.lang.reflect.Field;

import br.com.cod3r.app.calculo.CalculadoraImpl;
import br.com.cod3r.app.calculo.interno.OperacoesAritmeticas;

public class Teste {

	public static void main(String[] args) {

		//Utilizando o módulo app_calculo
		
		CalculadoraImpl calc = new CalculadoraImpl();

		// A classe OperacoesAritmeticas está inacessível (não foi exportada no módulo
		// app_calculo)
		// OperacoesAritmeticas op = null

		// Foi exportada (export to)
		OperacoesAritmeticas op = new OperacoesAritmeticas();
		System.out.println(op.soma(4, 5, 6));

		// Nesse caso, está tentando ser feita uma alteração na classe Calculadora no
		// módulo app_calculo
		// O módulo temq que está "open"

		// Field - utilizado para fazer esse tipo de alteração
		Field fieldId;
		try {
			// Pegando o atributo "id" em Calculadora
			fieldId = CalculadoraImpl.class.getDeclaredFields()[0];

			// Deixando acessível
			fieldId.setAccessible(true);

			// Redefinir de "calc" para "def"
			fieldId.set(calc, "def");

			// Qual o valor de def na instância calc?
			System.out.println(fieldId.get(calc));

			// Outra forma de printar utilizando o método criado na classe Calculadora
			// System.out.println((calc.getId()));

			// Deixando inacessível novamente
			fieldId.setAccessible(false);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
