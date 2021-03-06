package br.com.luiz.stream.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		// Pega os elementos da list e multiplica por 10
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		//imprime o Array de Strings
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));
		
		//Cria uma sequ?ncia iniciando em 0 at? 10 elementos (2+2+2...)
		Stream<Integer> st3 = Stream.iterate(0 , x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		
		//Sequ?ncia de Fibonacci 10 elementos
		Stream<Long> st4 = Stream.iterate(new long[] {0L, 1L}, p -> new long[] {p[1], p[0] + p[1]}).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
	}

}
