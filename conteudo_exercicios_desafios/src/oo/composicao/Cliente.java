package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	final String nome;
	final List<Compra> listadeCompra = new ArrayList<>();
	
	public Cliente(String nome) {
	
		this.nome = nome;
	}

	
	void adicionarCompra(Compra compra) 
	{
		this.listadeCompra.add(compra);
		
	}
	

	double obterValorTotal() {
		double total = 0;
		
		for (Compra compraAtual: listadeCompra) {
			
			total += compraAtual.obterValorTotal();
			
		}
		
		return total;
	}
	
	
	
	
	
}
