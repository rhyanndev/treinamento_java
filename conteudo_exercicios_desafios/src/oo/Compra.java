package oo;

import java.util.ArrayList;

public class Compra {

	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();

	void adicionarItem(Item item) {
		// Não somente adiciona o item na lista de itens
		itens.add(item);
		item.compra = this;

	}

	void adicionarItem(String nome, int quantidade, double preco) {
		// Como pega o próprio objeto atual "this" como sendo referencia de comprar
		// dentro de item
		this.adicionarItem(new Item(nome, quantidade, preco));

	}

	double obtervalorTotal() {
		double total = 0;

		for (Item item : itens) {
			total += item.quantidade * item.preco;
		}

		return total;
	}

}
