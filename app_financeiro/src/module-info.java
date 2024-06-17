// O app_financeiro depende do app_calculo por meio do Build Path
//Tem que definir de forma explícita quais módulo será utilizados ou exportados

module app_financeiro {
	
	//Já vem importado por padrão
	requires java.base;
	
	requires app_calculo;
	
	//Requerer da API e não da implementação específica
	requires app_api;
	//Esse serviço que será utilzado da API:
	//Serviço que foi definido da interface Calculadora
	uses br.com.cod3r.app.Calculadora;	
	
}


