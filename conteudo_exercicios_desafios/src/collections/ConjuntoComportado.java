package collections;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
		// Set<String> listaAprovados = new HashSet<String>();
		
		Set<String> listaAprovados = new TreeSet<String>();
		listaAprovados.add("Ana");
		listaAprovados.add("Breno");
		listaAprovados.add("Carlos");
		listaAprovados.add("Danubio");
		
		
		for (String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(4);
		nums.add(23);
		nums.add(52);
		
		//nums.get(1); Não é possível acessar pelo índice
		
		for (int n : nums) {
			System.out.println(n);
		}

		
	}

}
