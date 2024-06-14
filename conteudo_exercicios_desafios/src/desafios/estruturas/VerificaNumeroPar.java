package desafios.estruturas;
import java.util.Scanner;

public class VerificaNumeroPar {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = entrada.nextInt();

       
        if (numero >= 0 && numero <= 10) {
            if (numero % 2 == 0) {
                System.out.println("O número está entre 0 e 10 e é par");
            } else {
                System.out.println("O número está entre 0 e 10, mas não é par");
            }
        } else {
            System.out.println("O número não está entre 0 e 10");
        }
		

		entrada.close();
		
	}
	
}
