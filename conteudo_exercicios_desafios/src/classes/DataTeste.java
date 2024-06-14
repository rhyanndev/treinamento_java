package classes;

public class DataTeste {
	
	// dia, mes e ano
	
	public int dia;
	public int mes;
	public int ano;
	
	
	// Definindo Padrão
	public DataTeste() {
		
		this.dia = 01;
		this.mes = 01;
		this.ano = 1970;
		
	}

	public DataTeste(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	// Esse tipo de método não funcionará em aplicações desktop, aplicação web, mobile, por que só funcina uma aplicação em terminal
	public void exibirData() {
		System.out.printf("Exibir data: \n"
				+ "dia: %s\n"
				+ "mes: %s\n"
				+ "ano: %s\n", dia, mes, ano);
		
	}
	
	//Melhor, mais flexível
	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	

}
