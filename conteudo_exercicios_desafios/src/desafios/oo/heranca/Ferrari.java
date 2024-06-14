package desafios.oo.heranca;

public class Ferrari extends Carro {

	// Atributo delta específico para a classe Ferrari
	int delta = 35;

	// Construtor que chama o construtor da classe pai passando a velocidade máxima
	// específica para o modelo Ferrari
	public Ferrari() {
		super(315);

	}

	// Construtor para definir uma velocidade máxima personalizada para o modelo
	// Ferrari
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);

	}

	// Sobrescrita do método acelerarCarro da classe pai (Carro) para considerar o
	// delta específico da classe Ferrari
	@Override
	public void acelerarCarro() {
		if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += delta;
		}
	}

}
