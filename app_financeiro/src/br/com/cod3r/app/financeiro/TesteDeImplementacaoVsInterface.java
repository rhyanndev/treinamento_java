package br.com.cod3r.app.financeiro;

public class TesteDeImplementacaoVsInterface {

	public static void main(String[] args) {

		Calc c1 = new CalcImpl1();
		Calc c2 = new CalcImpl2();
		// Duas implementações diferentes
		System.out.println(c1.soma(1, 2, 3));
		System.out.println(c2.soma(1, 2, 3));

	}

}
