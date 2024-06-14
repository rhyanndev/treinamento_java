package desafios.oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {

		// Criação de uma instância de Pessoa, Arroz e Feijao
		Pessoa convidado = new Pessoa(99.65);
		Arroz ingrediente1 = new Arroz(0.2);
		Feijao ingrediente2 = new Feijao(0.1);

		// Imprime do peso inicial
		System.out.println(convidado.imprimirPeso());

		// O convidado come o arroz e o feijão
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);

		// Imprime do peso após comer arroz e feijão
		System.out.println(convidado.imprimirPeso());

		Sorvete sobremesa = new Sorvete(0.4);
		// O convidado come a sobremesa
		convidado.comer(sobremesa);

		// Imprime o peso do convidado após comer a sobremesa
		System.out.println(convidado.imprimirPeso());

	}

}
