package java8features1.java8features1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class SortingaStream {
	public static void main(String[] args) {
		List<Integer> number =Arrays.asList(2,4,3,5,3,5,3,4);
		
		number.stream().sorted().forEach(System.out::println);
 	}
	

}
