package java8features1.java8features1;

import java.util.Arrays;
import java.util.List;

public class FindMaximumandMinimum {
	public static void main(String[] args) {
		List<Integer> s2 = Arrays.asList(2,3,6,3,5,3,53,4);
		
		int max= s2.stream().max(Integer::compareTo).orElse(null);
		int min= s2.stream().min(Integer::compareTo).orElse(null);
		System.out.println(max +"          "+min);
		
		
	}

}
