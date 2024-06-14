package oo.interfaces;

public class FabricaDeCarros {

	public static void main(String[] args) {
		
		Ferrari ferrari = new Ferrari(400);
		
		ferrari.ligarTurbo();
		//ferrari.ligarAr();
		//ferrari.desligarAr();
	
		
		ferrari.acelerarCarro();
		System.out.println(ferrari.exibirVelocidadeCarro());
		ferrari.acelerarCarro();
		System.out.println(ferrari.exibirVelocidadeCarro());
		System.out.println(ferrari.exibirVelocidadeCarro());
		ferrari.acelerarCarro();
		System.out.println(ferrari.exibirVelocidadeCarro());
		ferrari.acelerarCarro();
		ferrari.desacelerarCarro();
		System.out.println(ferrari.exibirVelocidadeCarro());
	}

}
