package desafios.oo.composicao;

import java.util.ArrayList;

public class Compra {

	// Declaração da lista de itens 
	final ArrayList<Item> listaDeItens = new ArrayList<>();

	// Método para adicionar um item à lista com base em um produto e sua quantidade
	void adicionarItem(Produto p, int qtd) {
		this.listaDeItens.add(new Item(p, qtd));
	}

	// Método para adicionar um item à lista com base em nome, preço e quantidade
	void adicionarItem(String nome, double preco, int qtd) {
		var produto = new Produto(nome, preco);
		// Adiciona um novo item à lista utilizando o produto criado e a quantidade informada
		this.listaDeItens.add(new Item(produto, qtd));
	}

	// Método para calcular o valor total da compra
	double obterValorTotal() {
		double total = 0;

		// Itera sobre cada item na lista de itens
		for (Item item : listaDeItens) {
			// Calcula o preço total do item (preço do produto multiplicado pela quantidade)
			total += item.qtd * item.produto.preco;
		}

		return total;
	}

}
