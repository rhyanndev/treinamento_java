package desafios.oo.heranca;

public class FabricaDeCarros {

	public static void main(String[] args) {
		
		Ferrari ferrari = new Ferrari();
		
		ferrari.acelerarCarro();
		ferrari.acelerarCarro();
		ferrari.desacelerarCarro();
		
		System.out.println(ferrari.exibirVelocidadeCarro());
	}

}
