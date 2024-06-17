module app_calculo {

	exports br.com.cod3r.app.calculo;

	// Não vai deixar você ter dependência cíclica
	// requires app_financeiro;

	// requires app_logging;

	// Acessível para módulo de terceiros poderem utilizar os elementos
	requires transitive app_logging;

	// Permitindo acessos a módulos específicos
//	exports br.com.cod3r.app.calculo.interno 
//		to app_financeiro, app_logging;

	//Uso na classe 'Teste'
	exports br.com.cod3r.app.calculo.interno 
		to app_financeiro;
	
	//Abrindo explicitamente somente esse pacote
	//opens br.com.cod3r.app.calculo.interno;
	
	//Abrindo explicitamente somente esse pacote para determinado módulo
		//opens br.com.cod3r.app.calculo.interno to app_logging;
	
	
	opens br.com.cod3r.app.calculo to app_financeiro;
	
	requires app_api;
	provides br.com.cod3r.app.Calculadora
		with br.com.cod3r.app.calculo.CalculadoraImpl;
	
	//Além de requerer a API, o módulo app.calculo ele provê uma implementação
	//Para a interface Calculadora a partir da CalculadoraImpl
	//De tal forma que no financeiro não precia mais depender de app.calculo

}
