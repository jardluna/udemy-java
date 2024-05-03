package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program {
	
	public static void main(String[] args) {
		
		//CRIANDO LISTA
		List<String> list = new ArrayList<>();
		
		//ADICIONAR ELEMENTO NA LISTA
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Bart");
		list.add("Anna");
		list.add("Matt");
		list.add("Gaby");
		list.add("Bel");
		
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("-------------------");
		
		//ADICIONAR SOBRECARGA DE ELEMENTO NA LISTA
		/*
		 * Novo elemento substitui o elemento anterior 
		 * na posição escolhida, e passa os proximos elementos
		 * para as posições sequintes.
		 */
		list.add(2, "Marcos");
		
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("-------------------");
		
		//MOSTRA QUANTAS POSIÇÕES A LISTA POSSUI
		System.out.println(list.size());
		System.out.println();
		
		//REMOVER ELEMENTO DA LISTA
		list.remove("Anna");
		
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("-------------------");
		
		//REMOVER ELEMENTO DA LISTA COM PREDICADO
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("-------------------");
		
		//ENCONTRAR A POSIÇÃO DE UM ELEMENTO
		/*
		 * Quando o IndexOf não encontra o elemento ele retorna -1
		 */
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Bob: " + list.indexOf("Marcos"));
		System.out.println("-------------------");
		
		//FILTRAR LISTA COM PREDICADO
		/*
		 * Retorna apenas os elementos filtrados. 
		 * Exemplo: Elementos que comecem com a letra A
		 */
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String x : result) {
			System.out.println(x);
		}
		System.out.println("-------------------");
		
		//RETORNA O PRIMEIRO ELEMENTO FILTRADO COM PREDICADO
		/*
		 * No caso do elemento não existir, retornará null
		 */
		String name = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
		
		System.out.println(name);
		System.out.println("-------------------");
	}
}


