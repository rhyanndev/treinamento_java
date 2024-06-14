package estruturas;
import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o dia da semana:");
		String valor = entrada.next();
		
		int resultado;
		
		if(valor.equalsIgnoreCase("domingo")) {
			System.out.println(1);
		}
		else if(valor.equalsIgnoreCase("segunda")) {
			System.out.println(2);
		}
		else if(valor.equalsIgnoreCase("terça")) {
			System.out.println(3);
		}
		else if(valor.equalsIgnoreCase("quarta")) {
			System.out.println(4);
		}
		else if(valor.equalsIgnoreCase("quinta")) {
			System.out.println(5);
		}
		else if(valor.equalsIgnoreCase("sexta")) {
			System.out.println(6);
		}
		else if (valor.equalsIgnoreCase("sábado")) {
			System.out.println(7);
		}
		else {
			System.out.println("Dia inválido!");
		}
		
		
		
		entrada.close();
		
	}
	
	
	
	
	

}
