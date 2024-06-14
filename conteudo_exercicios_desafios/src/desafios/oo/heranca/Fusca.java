package desafios.oo.heranca;

public class Fusca extends Carro {
	
	// Construtor que chama o construtor da classe pai passando a velocidade máxima
	// específica para o modelo Fusca
	public Fusca() {
		super(112);
	}
	
	// Construtor que define uma velocidade máxima personalizada para o modelo Fusca
	public Fusca(int velocidadeMaxima) {
		super(velocidadeMaxima);
	}

}
