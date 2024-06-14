package oo.composicao;

import java.util.ArrayList;

public class Compra {

	final ArrayList<Item> listaDeItens = new ArrayList<>();
	
	
	void adicionarItem(Produto p, int qtd) {
		this.listaDeItens.add(new Item(p, qtd));
	}
	
	void adicionarItem(String nome, double preco, int qtd) {
		var produto = new Produto(nome, preco);
		this.listaDeItens.add(new Item(produto, qtd));
	}
	
	
	
	double obterValorTotal() {
		double total = 0;
		
		for (Item item : listaDeItens) {
			
			total += item.qtd * item.produto.preco;
			
		}
		
		return total;
	}
	
}
