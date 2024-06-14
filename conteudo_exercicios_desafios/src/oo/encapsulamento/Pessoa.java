package oo.encapsulamento;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private int idade;

	public Pessoa(String nome, String sobrenome, int idade) {
		this.nome = nome;
		setSobrenome(sobrenome);
		setIdade(idade);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int novaIdade) {
		//negativo passa a ser positivo
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;			
		}
		
		
	}
	
	
	public String getNomeCompleto() {
		return "Olá eu sou o " + getNome() + " " + getSobrenome();
	}

	
	@Override
	public String toString() {
		return "Olá eu sou o " + getNome() + " e tenho " + getIdade() + " anos";
	}

}
