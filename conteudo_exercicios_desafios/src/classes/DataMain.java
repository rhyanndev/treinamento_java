package classes;

public class DataMain {
	
	public static void main(String[] args) {
		
		DataTeste data1 = new DataTeste(01,12,2024);
		
		
		data1.exibirData();
		
		// Mais recomendado
		String dataFormatada1 = data1.obterDataFormatada();
		System.out.println(data1. obterDataFormatada());
		System.out.println(dataFormatada1);
		
		
		DataTeste data2 = new DataTeste();
		System.out.println(data2.obterDataFormatada());
	}

}
