package br.com.cod3r.cm;

import br.com.cod3r.cm.model.Tabuleiro;
import br.com.cod3r.cm.view.TabuleiroConsole;

public class Aplicacao {
	
	public static void main(String[] args) {
	
		Tabuleiro tabuleiro = new Tabuleiro(5, 5, 6);
		
		//Classe que ficará responsável em fazer o loop do jogo
		new TabuleiroConsole(tabuleiro);	
		
	}

}
