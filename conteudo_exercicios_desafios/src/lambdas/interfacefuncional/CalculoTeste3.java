package lambdas.interfacefuncional;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		// Java não permite: int -> Double do tipo classe
		
		Double a = 1.0;
		
		// double -> Double
		
		BinaryOperator<Double> calculo1 = (x, y) -> {
			return x + y;
		};
		System.out.println(calculo1.apply(2.0, 3.0));
		
		
		BinaryOperator<Integer> calculo2 = (x, y) -> {
			return x + y;
		};
		
		calculo2 = (x, y) -> x * y;
		System.out.println(calculo2.apply(5,2));
		

		
		

	}

}
