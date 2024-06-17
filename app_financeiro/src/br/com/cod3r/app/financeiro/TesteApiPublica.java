package br.com.cod3r.app.financeiro;

import java.lang.reflect.Field;
//import java.lang.reflect.Field;
import java.util.ServiceLoader;

import br.com.cod3r.app.Calculadora;

public class TesteApiPublica {
	
	//Usando diretamente a interface Calculadora

	public static void main(String[] args) {
		
		//Acaba não dependendo da implementação e sim da interface
		Calculadora calc = ServiceLoader
				.load(Calculadora.class)
				.findFirst()
				.get();
		
		System.out.println(calc.soma(2, 3, 4));
		
		try {
			Field fieldId = calc.getClass().getDeclaredFields()[0];

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
