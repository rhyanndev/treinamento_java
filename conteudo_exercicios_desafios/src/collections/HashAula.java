package collections;

import java.util.HashSet;

public class HashAula {
	
	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Ana"));
		usuarios.add(new Usuario("Guilherme"));
		
		
		//com hashcode = true
		//sem hashcode = false
		//equals e hascode extermamente importantes
		
		boolean resultado = usuarios.contains(new Usuario("Guilherme")); 
		System.out.println(resultado);
	}

}
