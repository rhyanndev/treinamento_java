package desafios.fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {

		String s = "Bom dia X";

		// Substitui "X" por "Senhora" na string 
		s = s.replace("X", "Senhora");

		// Converte a string para maiúsculas
		s = s.toUpperCase();

		// Concatena "!!!" à string 
		s = s.concat("!!!");

		// Imprime o valor da string 
		System.out.println(s);

	}

}
