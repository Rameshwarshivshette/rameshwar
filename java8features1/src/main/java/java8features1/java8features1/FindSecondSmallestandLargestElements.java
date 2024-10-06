package java8features1.java8features1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FindSecondSmallestandLargestElements {
	public static void main(String[] args) {
		List<Integer> s4 = Arrays.asList(2,4,65,34,5,3,5,3,5);
		
		int secondMax =s4.stream().distinct().sorted().skip(1).findFirst().orElse(null);
		System.out.println(secondMax);
		
		
		Integer SeconMin=s4.stream().distinct().sorted((a, b) -> Integer.compare(b, a)).skip(1)
			      .findFirst()
			      .orElse(null);
		System.out.println(SeconMin);

	}
}
