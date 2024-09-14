package streams;

import java.util.Arrays;
import java.util.List;


public class DesafioMap {
	
	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
	
		
		lista.stream()
		.map(l -> Integer.toBinaryString(l))
		.map(l -> new StringBuilder(l).reverse().toString())
		.map(l -> Integer.parseInt(l, 2))
		.forEach(System.out::println);
		
		
		
	
		
	}
}
