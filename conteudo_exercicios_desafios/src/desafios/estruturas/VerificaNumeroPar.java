package desafios.estruturas;
import java.util.Scanner;

/*
 * Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
 * */

public class VerificaNumeroPar {

	public static void main(String[] args) {
		
		// Criação de um objeto Scanner para leitura de dados do console
		Scanner entrada = new Scanner(System.in);
		
		 // Solicita ao usuário que insira um número
        System.out.println("Digite um número:");
        int numero = entrada.nextInt();

     // Verifica se o número está no intervalo de 0 a 10
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
