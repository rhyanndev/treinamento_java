package generics;

import java.util.List;

public class ListaUtil {

	//Métodos que irão auxiliar nas ações com listas
	
	//A Lista pode ser qualquer coisa
	public static Object getUltimo1(List<?> lista) {
		return lista.get(lista.size() - 1);
	}
	
	public static <T> T getUltimo2(List<T> lista) {
		return lista.get(lista.size() - 1);
	}
	
	
	//É possível ter mais de um padrão Genérico!
	
//	public static <A, B, C> C teste(A paramA, B paramB) {
//		C teste = null;
//		return teste;
//	}
	
}
