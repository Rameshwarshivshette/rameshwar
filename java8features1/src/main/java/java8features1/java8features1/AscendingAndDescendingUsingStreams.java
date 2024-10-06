package java8features1.java8features1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AscendingAndDescendingUsingStreams {
	public static void main(String[] args) {
		List<Integer> s = (List<Integer>) Arrays.asList(3,6,4,5,3,5,3,56,3,5,3);
	    List<Integer>s2 = s.stream().sorted().collect(Collectors.toList());
	    
		System.out.println(s2);
		
		   List<Integer>s3 = s.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		   
			System.out.println(s3);
			System.out.println(s3);

			
			
		
	}
	

}
