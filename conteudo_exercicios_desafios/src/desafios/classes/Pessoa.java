package desafios.classes;

public class Pessoa {
		
	String nome;
	double peso;
    double pesoInicial;
	
	public Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
		this.pesoInicial = peso; 
	}
	
	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
	
	// Receber objeto da classe comida
	void comer(Comida comida) {		
		if(comida != null) {
			this.peso += comida.getPeso();
		}
		
	}
	
	
	
    public String apresentar() {
    	double pesoGanho = this.peso - this.pesoInicial;  // Calcula o peso ganho
        return String.format("%s almoçou e ganhou %.2f kg, ficando com: %.2f kg", nome, pesoGanho, peso);
    }
	
}
