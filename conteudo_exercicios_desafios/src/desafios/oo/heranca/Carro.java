package desafios.oo.heranca;

public class Carro {

	// Declaração do atributo VELOCIDADE_MAXIMA como final para ser uma constante e protegido para ser acessível por subclasses
	public final int VELOCIDADE_MAXIMA;
	protected double velocidadeAtual;
	protected int delta = 5;

	// Construtor da classe Carro que recebe a velocidade máxima como parâmetro
	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	// Método para acelerar o carro
	public void acelerarCarro() {
		// Verifica se a velocidade atual somada ao delta ultrapassa a velocidade máxima
		if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			// Se sim, define a velocidade atual como a velocidade máxima
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}

		else {
			// Caso contrário, aumenta a velocidade atual pelo valor de delta
			velocidadeAtual += delta;
		}
	}

	// Método para desacelerar o carro
	public void desacelerarCarro() {
		// Verifica se a velocidade atual é maior ou igual a 5
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
	}

	// Método para exibir a velocidade atual do carro
	public String exibirVelocidadeCarro() {
		return String.format("Sua velocidade é de %.2fKm/h \n", velocidadeAtual);
	}

}
