package array;

public class Usuario {

	String nome;
	String email;

	// Sobrescrita do método equals da classe Object
	@Override
	public boolean equals(Object objeto) {

		// Verifica se o objeto passado como parâmetro é uma instância de Usuario
		if (objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;

			//Verifica se os nomes e emails são iguais
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);

			// Retorna true se os nomes e emails forem iguais, caso contrário retorna false
			return nomeIgual && emailIgual;
		} else {
			return false;
		}

	}

}
