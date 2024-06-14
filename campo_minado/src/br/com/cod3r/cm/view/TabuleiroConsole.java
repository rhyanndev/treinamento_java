package br.com.cod3r.cm.view;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import br.com.cod3r.cm.excecao.ExplosaoException;
import br.com.cod3r.cm.excecao.SairException;
import br.com.cod3r.cm.model.Tabuleiro;

public class TabuleiroConsole {

	private Tabuleiro tabuleiro;
	private Scanner entrada = new Scanner(System.in);

	public TabuleiroConsole(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;

		executarJogo();
	}

	private void executarJogo() {
		try {
			boolean continuar = true;

			while (continuar) {

				cicloDoJogo();

				System.out.println("Outra partida? (S/N)");
				String resposta = entrada.nextLine();

				if ("n".equalsIgnoreCase(resposta)) {
					continuar = false;
				} else {
					tabuleiro.reiniciar();
				}

			}

		} catch (SairException e) {
			System.out.println("Bye bye!");
		} finally {
			entrada.close();
		}
	}

	private void cicloDoJogo() {
		try {

			// O objetivo foi alcançado? Enquanto não...
			while (!tabuleiro.objetivoAlcancado()) {

				// Mostrar o tabuleiro
				System.out.println(tabuleiro);

				// Pegue os valores das coordenadas X e Y
				String digitado = capturarValorDigitado("Digite (x, y):");

				// Gerando uma stream a partir de um array
				// Transforma o valor da coordenada para um inteiro
				Iterator<Integer> xy = Arrays.stream(digitado.split(",")).map(e -> Integer.parseInt(e.trim()))
						.iterator();

				// Abrir o campo que acabou de pegar a coordenada ou desmarcar
				digitado = capturarValorDigitado("1 - Abrir ou 2 - (Des)Marcar: ");

				if ("1".equals(digitado)) {
					// Vai abrir o tabuleiro pegando os dois valores de X e Y
					tabuleiro.abrir(xy.next(), xy.next());
				} else if ("2".equals(digitado)) {

					tabuleiro.alternarMarcacao(xy.next(), xy.next());

				}

			}

			// Mostrar a última versão do tabuleiro
			System.out.println(tabuleiro);
			System.out.println("Você ganhou!!!");
		} catch (ExplosaoException e) {
			System.out.println(tabuleiro);
			System.out.println("Você perdeu!!!");
		}

	}

	private String capturarValorDigitado(String texto) {
		System.out.println(texto);
		String digitado = entrada.nextLine();
		if ("sair".equalsIgnoreCase(digitado)) {

			throw new SairException();
		}

		return digitado;

	}

}
