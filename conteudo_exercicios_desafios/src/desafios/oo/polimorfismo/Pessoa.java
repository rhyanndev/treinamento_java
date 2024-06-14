package desafios.oo.polimorfismo;

public class Pessoa {

	private double peso;

	// Construtor da classe Pessoa que recebe o peso como parâmetro e o atribui usando o método setPeso
	public Pessoa(double peso) {
		setPeso(peso);
	}

	public double getPeso() {
		return peso;
	}

	// Método para permitir que a pessoa coma uma comida, aumentando seu peso
	public void comer(Comida comida) {
		this.peso += comida.getPeso();

	}
	
	// Método para definir o peso da pessoa, garantindo que seja um valor não negativo
	public void setPeso(double peso) {
		if (peso >= 0)
			this.peso = peso;
	}
	
	// Imprime o peso do usuário
	public String imprimirPeso() {
	    return "Peso atual: " + String.format("%.2f", getPeso()) + " kg";
	}

}
