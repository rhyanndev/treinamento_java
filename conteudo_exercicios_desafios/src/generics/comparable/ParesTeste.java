package generics.comparable;

public class ParesTeste {

	public static void main(String[] args) {
		
		
		Pares<Integer, String> resultadoConcursoPares = new Pares<>();
		
		resultadoConcursoPares.adicionar(1, "Maria");
		resultadoConcursoPares.adicionar(2, "João");
		resultadoConcursoPares.adicionar(3, "Gabriela");
		resultadoConcursoPares.adicionar(4, "Rodrigo");
		resultadoConcursoPares.adicionar(2, "Rebeca");
		
		System.out.println(resultadoConcursoPares.getValor(1));
		System.out.println(resultadoConcursoPares.getValor(2));
		

	}

}
