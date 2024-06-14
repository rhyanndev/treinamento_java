package oo.encapsulamento.casa.b;

import oo.encapsulamento.casa.a.Ana;

public class Pedro extends Ana {
	
	void testeAcessos() {
		
		// segredo = "...";
		// facoDentroDeCasa = "..."; // default ou pacote
		// formaDeFalar
		// todosSabem
		
		// System.out.println(segredo);
		// System.out.println(facoDentroDeCasa);
		System.out.println(formaDeFalar); // via herança
		System.out.println(todosSabem);
		System.out.println(new Ana().todosSabem);
		
		
		
	}

}
