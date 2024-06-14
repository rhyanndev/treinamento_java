package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {

	// Esta função recebe uma string e retorna a mesma string em letras maiúsculas.
	public final static UnaryOperator<String> maiuscula = 
			n -> n.toUpperCase();

	// Esta função recebe uma string e retorna a primeira letra dessa string.
	public final static UnaryOperator<String> primeiraLetra = 
			n -> n.charAt(0) + "";

	// Esta função recebe uma string e retorna a mesma string com três pontos de
	// exclamação adicionados ao final.
	//public final static UnaryOperator<String> grito = n -> n + "!!!";
	
	public final static String grito(String n) {
		return n + "!!!";
	}
		

}
