package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		// Diferença é o quando a fila está cheia!
		// Adiciona elementos na fila
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniela");
		fila.add("Everton");
		fila.offer("Fagner");
		fila.add("Gabriela");
		fila.offer("Helton");
		
		
		// Obter o próximo elemento da fila
		// Diferença é o quando a fila está vazia!
		System.out.println(fila.peek()); //retorna null
		System.out.println(fila.element());
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Lança exceção
		System.out.println(fila.element());
		
		//fila.size()
		//fila.clear();
		//fila.isEmpty();
		
		//1 elemento vai retornar ja sendo removido
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		//System.out.println(fila.remove());
		
		//fila.contains(...);
		
		
	}
	
}
