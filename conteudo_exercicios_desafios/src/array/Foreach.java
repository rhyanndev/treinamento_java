package array;

public class Foreach {
	
	public static void main(String[] args) {
		double [] notas = { 9.9, 8.7, 7.2, 9.4 };
		
		// Imprime as notas usando um loop for
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		
		System.out.println();
		
		// Imprime as notas usando um loop foreach
		for(double nota: notas) {
			System.out.print(nota + " ");
			
		}
	}

}
