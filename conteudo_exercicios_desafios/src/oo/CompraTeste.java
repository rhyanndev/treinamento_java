package oo;

public class CompraTeste {

	public static void main(String[] args) {
		Compra compra1 = new Compra();
		compra1.cliente = "João Pedro";
		compra1.adicionarItem("Caneta", 20, 7.45);
		compra1.adicionarItem("Borracha", 12, 3.89);
		compra1.adicionarItem(new Item("Caderno", 3, 18.79));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obtervalorTotal());
		
		//Só para mostar a relação bidirecional!!
		double total = compra1.itens.get(0).compra.itens.get(1).compra.obtervalorTotal();
		System.out.println("O total é " + total);
	
		
	}
	
}
