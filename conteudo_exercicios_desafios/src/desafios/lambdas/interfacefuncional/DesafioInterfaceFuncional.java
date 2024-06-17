package desafios.lambdas.interfacefuncional;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioInterfaceFuncional {

	public static void main(String[] args) {

		/*
		 * 1. A partir do produto calcular o preco real (com desconto) 2. Imposto
		 * municipal: >= 2500 (8,5%)/<2500(isento) 3. Frete: >= 3000 (100) / < 3000 (50)
		 * 4. Arredondar, deixar duas casas decimais 5. Formatar: R$ 1234,5 u
		 */

		Function<Produto, Double> precoReal = produto -> produto.preco * (1 - produto.desconto);

		UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;

		UnaryOperator<Double> freteDoProduto = preco -> preco >= 3000 ? preco + 100 : preco + 50;

		Produto produto = new Produto("iPad", 3235.89, 0.50);

		Double preco = precoReal.andThen(impostoMunicipal).andThen(freteDoProduto).apply(produto);

		System.out.printf("O preço do produto é: R$ %.2f", preco);

	}

}
