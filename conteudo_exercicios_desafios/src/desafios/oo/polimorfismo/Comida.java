package desafios.oo.polimorfismo;

public class Comida {
	
	private double peso;

	// Construtor da classe Comida que recebe o peso como parâmetro
	public Comida(double peso) {
		// Chama o método setPeso para atribuir o peso
		setPeso(peso);
	}

	// Método para obter o peso da comida
	public double getPeso() {
		return peso;
	}

	// Método para definir o peso da comida, garantindo que seja um valor não negativo
	public void setPeso(double peso) {
		if (peso >= 0)
			this.peso = peso;
	}
	
	
}
