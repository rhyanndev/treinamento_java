package excecao.personalizadaB;

import java.util.Objects;

public class Aluno {

	public final String nome;
	public final double nota;
	public final boolean bomComportamente;
	
	
	public Aluno(String nome, double nota) {
		this(nome, nota, true);
	}	
	
	public Aluno(String nome, double nota, boolean bomComportamente) {
		this.nome = nome;
		this.nota = nota;
		this.bomComportamente = bomComportamente;
	}
	
	public String toString() {
		return nome + " tem nota " + nota;	
	}

	@Override
	public int hashCode() {
		return Objects.hash(bomComportamente, nome, nota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return bomComportamente == other.bomComportamente && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}
	
	
	
	
}


