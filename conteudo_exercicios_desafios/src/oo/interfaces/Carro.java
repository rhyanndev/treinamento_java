package oo.interfaces;

public class Carro {
	
	public final int VELOCIDADE_MAXIMA;
	protected double velocidadeAtual;
	private int delta = 5;
	
	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public void acelerarCarro() {
		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}
		
		else {
			velocidadeAtual += delta;
		}
	}
	
	public void desacelerarCarro() {
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		}
		else {
			velocidadeAtual = 0;
		}
	}
	

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	
	
	public String exibirVelocidadeCarro() {
		return String.format("Sua velocidade é de %.2fKm/h \n", velocidadeAtual);
	}

}
