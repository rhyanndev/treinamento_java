package lambdas.interfacefuncional.java8;

//Antes do Java 8 já existia interfaces que tinham um único método
//Utilizar lambdas expressions dentro de interfaces que já vem do java, antes do java 8
//Thread -> Processo que pode ser executado paralelamente

public class Threads {

	public static void main(String[] args) {

		// Interface chamada Runnable
		
		Runnable trabalho1 = new Trabalho1();
		
		
		Runnable trabalho2 = new Runnable() {

			//Criação da classe anônima, classe sem nome
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Tarefa #02");
					
					//Em quantos milisegundos para que a thread pare
					try {
						Thread.sleep(1000);
						
					} catch (Exception e) {
						
					}
					
					
				}
				

			}

		};
		
		//Pode ser utilizado lambdas para implementar esses métodos
		//Runnable trabalho3 = () ->
		
		// Usando Method Reference, para não utilizar classes anônimas
		Runnable trabalho3 = Threads::trabalho3;
		
		Thread t1 = new Thread(trabalho1);
		Thread t2 = new Thread(trabalho2);
		Thread t3 = new Thread(trabalho3);
		
		//Iniciando o trabalho da Thread
		t1.start();
		t2.start();
		t3.start();
	}
	
	static void trabalho3() {
			for (int i = 0; i < 10; i++) {
				System.out.println("Tarefa #03");
				
				//Em quantos milisegundos para que a thread pare
				try {
					Thread.sleep(1000);
					
				} catch (Exception e) {
					
				}	
			}	
		
	}

}
