package java8features1.java8features1;

import java.util.Arrays;
import java.util.List;

public class RemoveAllDuplicateElements {
	public static void main(String[] args) {
		List<Integer> s2 = Arrays.asList(5,7,5,4,3,5,6,6,6);
		s2.stream().distinct().forEach(System.out::println);
		
		
		
 	}

}
