package desafios.classes;

public class Jantar {

	// Criar uma pessoa, instanciar duas comidas e fazer com que a pessoa coma a
	// comida

	public static void main(String[] args) {

		// Criando uma pessoa e as comidas
		Pessoa pessoa = new Pessoa("Rhyann", 70.00);
		
		Comida pizza = new Comida("Pizza", 0.400);
		Comida pastel = new Comida("Pastel", 0.100);
		
		//Adicionando no método comer e exibindo 
		pessoa.comer(pizza);
		pessoa.comer(pastel);

		System.out.println(pessoa.apresentar());

	}

}
