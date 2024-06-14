package desafios.estruturas;
import java.time.Year;

public class VerificaAno {

	public static void main(String[] args) {
		
		int anoAtual = Year.now().getValue();

        // Verifica se o ano atual é bissexto
        boolean bissexto = false;

        if ((anoAtual % 4 == 0 && anoAtual % 100 != 0) || (anoAtual % 400 == 0)) {
            bissexto = true;
        }

        // Exibe o resultado
        if (bissexto) {
            System.out.println("O ano atual (" + anoAtual + ") é um ano bissexto.");
        } else {
            System.out.println("O ano atual (" + anoAtual + ") não é um ano bissexto.");
        }
		
	}
	
}
