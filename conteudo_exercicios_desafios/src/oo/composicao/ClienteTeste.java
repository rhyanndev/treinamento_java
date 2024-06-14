package oo.composicao;

public class ClienteTeste {

	public static void main(String[] args) {
		
		
		Compra compra1 = new Compra();
		
		compra1.adicionarItem("Lapis", 5., 35);
		compra1.adicionarItem(new Produto("Borracha", 2.50), 10);
		
		
		Compra compra2 = new Compra();
		
		compra2.adicionarItem("Apontador", 20, 15);
		compra2.adicionarItem(new Produto("Impressora", 500), 1);
		
		Cliente p1 = new Cliente("Rhyann Silva");
		
		//Método em cliente de adicionar compra (mais usual)
		p1.adicionarCompra(compra1);
		
		// Usando diretamente a lista de compra
		p1.listadeCompra.add(compra2);
		
		System.out.println(p1.obterValorTotal());
		
		
	
		

	}

}
