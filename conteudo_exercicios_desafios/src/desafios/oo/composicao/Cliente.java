package desafios.oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	final String nome;
	final List<Compra> listadeCompra = new ArrayList<>();

	public Cliente(String nome) {

		this.nome = nome;
	}

	// Método para adicionar uma compra à lista
	void adicionarCompra(Compra compra) { // Adiciona a compra à lista de compras do cliente
		this.listadeCompra.add(compra);

	}

	// Método para obter o valor total das compras do cliente
	double obterValorTotal() {
		double total = 0;

		for (Compra compraAtual : listadeCompra) {
			// Obtém o valor total da compra atual e adiciona ao total geral
			total += compraAtual.obterValorTotal();

		}

		return total;
	}

}
