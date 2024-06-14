package collections;

import java.util.Objects;

public class Usuario {
	
	String nome;

	public Usuario(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "Meu nome é " + this.nome + ".";
	}

	@Override
	public boolean equals(Object obj) {
		Usuario outroUsuario = (Usuario) obj;
		return this.nome.equals(outroUsuario.nome);
	}
	
	
}
