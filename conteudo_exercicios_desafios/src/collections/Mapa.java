package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		usuarios.put(1, "Roberto");
		usuarios.put(20, "Rafaela");
		usuarios.put(3, "Ricardo");
		usuarios.put(42, "Rodrigo");
		usuarios.put(5, "Rebeca");
		usuarios.put(6, "Rhyann");
		usuarios.put(7, "Rhayssa");
		
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		
		//pegando chave e valor ao mesmo tempo
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsKey(60));
		System.out.println(usuarios.containsValue("Rebeca"));
		
		System.out.println(usuarios.get(20));
		
		
		//percorrer os valores de um map, tem 3 formas (por chave, por valor e aos dois ao mesmo tempo)
		
		
		//Por chave
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro.getKey() + " ==> " + registro.getValue());
			
		}
		
		
	}

}
