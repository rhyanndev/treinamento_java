package streams;

import java.util.Objects;

public class Aluno2 {

	final String nome;
	final double nota;
	final boolean bomComportamente;
	
	
	public Aluno2(String nome, double nota) {
		this(nome, nota, true);
	}	
	
	public Aluno2(String nome, double nota, boolean bomComportamente) {
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
		Aluno2 other = (Aluno2) obj;
		return bomComportamente == other.bomComportamente && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}
	
	
	
	
}


