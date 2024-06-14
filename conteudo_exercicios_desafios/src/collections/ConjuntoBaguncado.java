package collections;

import java.util.HashSet;
import java.util.Set;

// o código irá gerar advertencias, pode ser adicionado o SuppressWarning, para "silenciar" as advertencias.

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // tipo primitivo double -> Double (converter automaticamente para a classe do tipo Double (objeto))
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // string -> String
		conjunto.add(1); // int -> Integer
		conjunto.add('x');
		
		
		System.out.println("tamanho é: " + conjunto.size());
		
		conjunto.add("teste");
		
		System.out.println("tamanho é: " + conjunto.size());
		
		conjunto.add('x');
		
		System.out.println("tamanho é: " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		
		System.out.println("tamanho é: " + conjunto.size());	
		
		System.out.println(conjunto.contains("teste"));
		System.out.println(conjunto.contains(true));
		
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		// União entre conjuntos
		
		//conjunto.addAll(nums);
		
		//System.out.println(conjunto);
	
		conjunto.retainAll(nums); // reter apenas o conteúdo em commum entre os dois conjuntos
		
		System.out.println(conjunto);
		
		conjunto.clear();
		
		System.out.println(conjunto);
	}

}
