package desafios.streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilterDois {
	
	public static void main(String[] args) {
		
		// Criando os Produtos
		Produto p1 = new Produto("Caneta", 199, 0.15, 0.32);
		Produto p2 = new Produto("Kindle", 950, 0.15, 0);
		Produto p3 = new Produto("Livro", 452, 0.22, 0);
		Produto p4 = new Produto("Impressora", 1229, 0.60, 0);
		Produto p5 = new Produto("Apontador", 129, 0.02, 0);
		Produto p6 = new Produto("Quadro", 309, 0.20, 0);
		Produto p7 = new Produto("Estojo", 699, 0.17, 0);
		
		// Criando uma lista de Produtos
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
		
		// Filter, filter, map
		Predicate<Produto> superPromocao = p -> p.desconto >= 0.1;
		Predicate<Produto> freteGratis = p -> p.valorFrete == 0;
		Predicate<Produto> produtoRelevante = p -> p.preco >= 500;
		
		//Function que faz a conversão do produto para String
		Function<Produto, String> chamadaPromocional = 
				p -> "Aproveite! " + p.nome + " por R$" + p.preco;
	
		// Cria um stream a partir da lista de produto
		produtos.stream()
		.filter(superPromocao)
		.filter(freteGratis)
		.filter(produtoRelevante)
		.map(chamadaPromocional)
		.forEach(p -> System.out.printf("%s%n", p));
		

		
		}

}
